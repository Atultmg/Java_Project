public class ProductInventory {
    public static void main(String[] args) {

        Electronics[] inventory = {
                new Electronics("Laptop",      1200.0),
                new Electronics("Phone",        899.0),
                new Electronics("Headphones",   100.0),
                new Electronics("Tablet",       400.0)
        };

        System.out.println("=== Applying 10% Discount to All ===\n");

        for (Electronics e : inventory) {
            e.applyDiscount(10.0);
        }
    }
}