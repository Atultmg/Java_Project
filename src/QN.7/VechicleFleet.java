import java.util.ArrayList;

public class VechicleFleet {
    public static void main(String[] args) {

        ArrayList<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Bike("Bike A", 3));
        fleet.add(new Bike("Bike B", 5));
        fleet.add(new Bus("Bus A",   2));
        fleet.add(new Bus("Bus B",   4));

        System.out.println("=== Rental Fee Summary ===\n");

        for (Vehicle v : fleet) {
            System.out.println(v.name
                    + " | Days: " + v.days
                    + " | Fee: $" + v.calculateFee());
        }
    }
}