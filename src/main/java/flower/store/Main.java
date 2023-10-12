package flower.store;

import flower.filters.SearchFilter;

import java.util.List;

public class Main {
    private static final int ROSE_PRICE = 20;
    private static final int TULIP_PRICE = 15;
    private static final int ROSSES_PRICE = 10;
    private static final int HIGH_SEPALLENGTH = 100;
    private static final int LOW_SEPALLENGTH = 10;
    private static final int ROSE_AMOUNT = 5;
    private static final int TULIP_AMOUNT = 3;
    private static final double EXPENSIVE_THRESHOLD = 17.0;
    public static void main(String[] args) {
    
        Store flowerStore = new Store();
        
        Flower roseFlower = new Flower();
        roseFlower.setPrice(ROSE_PRICE);
        roseFlower.setSepalLength(HIGH_SEPALLENGTH);
        roseFlower.setFlowerType(FlowerType.ROSE);
        roseFlower.setColor(FlowerColor.RED);
        FlowerPack rosePack = new FlowerPack(roseFlower, ROSE_AMOUNT);

        Flower tulipFlower = new Flower();
        tulipFlower.setPrice(TULIP_PRICE);
        tulipFlower.setSepalLength(HIGH_SEPALLENGTH);
        tulipFlower.setFlowerType(FlowerType.TULIP);
        tulipFlower.setColor(FlowerColor.RED);
        FlowerPack tulipPack = new FlowerPack(tulipFlower, TULIP_AMOUNT);

        Flower rosessFlower = new Flower();
        rosessFlower.setPrice(ROSSES_PRICE);
        rosessFlower.setSepalLength(LOW_SEPALLENGTH);
        rosessFlower.setFlowerType(FlowerType.ROSE);
        rosessFlower.setColor(FlowerColor.RED);
        FlowerPack rosessPack = new FlowerPack(roseFlower, ROSE_AMOUNT);

        Flower tulipppFlower = new Flower();
        tulipppFlower.setPrice(TULIP_PRICE);
        tulipppFlower.setSepalLength(HIGH_SEPALLENGTH);
        tulipppFlower.setFlowerType(FlowerType.TULIP);
        tulipppFlower.setColor(FlowerColor.RED);
        FlowerPack tulipppPack = new FlowerPack(tulipFlower, TULIP_AMOUNT);

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
                if (item instanceof FlowerBucket) {
                    FlowerBucket bucket = (FlowerBucket) item;
                    return bucket.getPrice() > EXPENSIVE_THRESHOLD;
                }
                return false;
            }
        };

        List<Item> expensiveFlowers = flowerStore.search(expensiveFlowerFilter);
        System.out.println("Found " + expensiveFlowers.size()
               + " expensive flowers.");
        System.out.println(expensiveFlowers);
    }
}
