abstract class ElectronicDevice {
    String name;

    public ElectronicDevice(String name) {
        this.name = name;
    }

    public abstract void powerOn();
}