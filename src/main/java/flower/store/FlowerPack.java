package flower.store;


import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;
    }

    public double getPrice(){
        return flower.getPrice() * quantity;
    }
    @Override
    public String toString() {
        return flower.toString() + ", amount=" + quantity;
    }
}
