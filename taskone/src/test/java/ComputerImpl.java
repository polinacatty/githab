public abstract class ComputerImpl implements Computer {
    String maker;
    String model;
    String processor;
    String RAM;
    String harddrive;

    public String turnOn() {
        String var10000 = this.getClass().getSimpleName();
        return "Turn on " + var10000 + " " + this.toString();
    }

    public String turnOff() {
        String var10000 = this.getClass().getSimpleName();
        return "Turn off " + var10000 + " " + this.toString();
    }

    public String connect() {
        String var10000 = this.getClass().getSimpleName();
        return "Connect to internet " + var10000 + " " + this.toString();
    }

    public String toString() {
        return "с процессором " + this.processor + ", c ОЗУ " + this.RAM + ", c жестким диском " + this.harddrive;
    }
}
