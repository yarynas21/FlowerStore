package flower.store;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    @Override
    public String toString() {
        StringBuilder bucketStr = new StringBuilder();
        for (FlowerPack flowerPack : flowerPacks) {
            bucketStr.append(flowerPack.toString());
            bucketStr.append("\n");
        }
        bucketStr.append("Price:");
        bucketStr.append(this.getPrice());
        return bucketStr.toString();
    }

}

