package flower.store;

import flower.filters.SearchFilter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store flowerStore = new Store();
        
        Flower roseFlower = new Flower();
        roseFlower.setPrice(20);
        roseFlower.setSepalLength(100);
        roseFlower.setFlowerType(FlowerType.ROSE);
        roseFlower.setColor(FlowerColor.RED);
        FlowerPack rosePack = new FlowerPack(roseFlower, 5);

        Flower tulipFlower = new Flower();
        tulipFlower.setPrice(15);
        tulipFlower.setSepalLength(100);
        tulipFlower.setFlowerType(FlowerType.TULIP);
        tulipFlower.setColor(FlowerColor.RED);
        FlowerPack tulipPack = new FlowerPack(tulipFlower, 3);

        Flower rosessFlower = new Flower();
        rosessFlower.setPrice(10);
        rosessFlower.setSepalLength(10);
        rosessFlower.setFlowerType(FlowerType.ROSE);
        rosessFlower.setColor(FlowerColor.RED);
        FlowerPack rosessPack = new FlowerPack(roseFlower, 3);

        Flower tulipppFlower = new Flower();
        tulipppFlower.setPrice(15);
        tulipppFlower.setSepalLength(10);
        tulipppFlower.setFlowerType(FlowerType.TULIP);
        tulipppFlower.setColor(FlowerColor.RED);
        FlowerPack tulipppPack = new FlowerPack(tulipFlower, 3);

        FlowerBucket flowerBucketOnee = new FlowerBucket();
        flowerBucketOnee.add(rosessPack);
        flowerBucketOnee.add(tulipppPack);

        flowerStore.addItem(flowerBucketOnee);
        FlowerBucket flowerBucketOne = new FlowerBucket();
        flowerBucketOne.add(rosePack);
        flowerBucketOne.add(tulipPack);

        flowerStore.addItem(flowerBucketOne);

        SearchFilter expensiveFlowerFilter = new SearchFilter() {
            @Override
            public boolean match(Item item) {
                if(item instanceof FlowerBucket) {
                    FlowerBucket bucket = (FlowerBucket) item;
                    return bucket.getPrice() > 17;
                }
                return false;
            }
        };

        List<Item> expensiveFlowers = flowerStore.search(expensiveFlowerFilter);
        System.out.println("Found " + expensiveFlowers.size() + " expensive flowers.");
        System.out.println(expensiveFlowers);
    }
}
