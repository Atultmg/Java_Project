// The 'Smart Warehouse' (Inheritance & Interfaces)
class ColdBox extends StorageUnit implements Refrigerated {
    private int temperature;

    public ColdBox(int id, double capacity, int initialTemp) {
        super(id, capacity);
        this.temperature = initialTemp;
    }

    @Override
    public void adjustTemp(int t) {
        this.temperature = t;
        System.out.println("Temperature adjusted to " + t + "°C");
    }

    @Override
    public int getCurrentTemp() {
        return temperature;
    }

    @Override
    public String getUnitType() {
        return "ColdBox";
    }

    @Override
    public String toString() {
        return super.toString() + ", Temp=" + temperature + "°C";
    }
}