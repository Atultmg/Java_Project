abstract class StorageUnit {
    int id;
    double capacity;

    public StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Abstract method subclasses must implement
    public abstract String getUnitType();

    @Override
    public String toString() {
        return getUnitType() + " [ID=" + id + ", Capacity=" + capacity + "]";
    }
}
