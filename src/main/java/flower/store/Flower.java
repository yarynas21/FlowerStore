package flower.store;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }
    @Override
    public String toString() {
        return flowerType + "{" + "sepalLength=" + sepalLength + ", color="
                + color + ", price=" + price + '}';
    }
}

