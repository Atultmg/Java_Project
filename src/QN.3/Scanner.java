class Scanner extends ElectronicDevice {

    public Scanner() {
        super("Scanner");
    }

    @Override
    public void powerOn() {
        System.out.println(name + " is initializing... Ready to scan!");
    }
}