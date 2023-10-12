package flower.store;

public enum FlowerType {
    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");

    private String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
