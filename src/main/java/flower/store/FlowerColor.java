package flower.store;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}