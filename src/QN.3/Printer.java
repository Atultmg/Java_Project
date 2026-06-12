class Printer extends ElectronicDevice {

    public Printer() {
        super("Printer");
    }

    @Override
    public void powerOn() {
        System.out.println(name + " is warming up... Ready to print!");
    }
}