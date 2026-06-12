// The 'Vehicle Fleet' (Inheritance & ArrayList)
class Bike extends Vehicle {

    public Bike(String name, int days) {
        super(name, days);
    }

    @Override
    public double calculateFee() {
        return days * 10.0;
    }
}