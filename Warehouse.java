public class Warehouse {
    public static void main(String[] args) {
        ColdBox box = new ColdBox(101, 50.0, 4);
        System.out.println(box);
        box.adjustTemp(-18);
        System.out.println(box);

        StorageUnit unit = box;

        String rr = box.getUnitType();

        System.out.println(rr);

        Refrigerated fridge = box;
        System.out.println(fridge.getCurrentTemp());
    }
}
