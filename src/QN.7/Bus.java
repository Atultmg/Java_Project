class Bus extends Vehicle {

    public Bus(String name, int days) {
        super(name, days);
    }

    @Override
    public double calculateFee() {
        return days * 50.0;
    }
}
