public class Main {

    public static void main(String[] args) {
        ComputerImpl desktop = new Desktop("intel i5", "16gb", "ssd 256gb", "PCI");
        ComputerImpl laptop = new Laptop("AMD RYZEN", "8gb", "ssd 512gb", "asus vz249he", "logitech corded keyboard");
        ComputerImpl monoblock = new Monoblock("intel i3", "8gb", "ssd 256gb", "dell e2417h");
        ComputerImpl netbook = new Netbook("intel core i5", "16gb", "ssd 128gb", "samsung s24d300h", "a4tech kv-300h");
        ComputerImpl nettop = new Nettop("intel i3", "8gb", "ssd 256gb");
        ComputerImpl server = new Server("intel i7", "16gb", "ssd 1tb");
        ComputerImpl[] computer = new ComputerImpl[]{desktop, laptop, monoblock, netbook, nettop, server};

        for (ComputerImpl i: computer) {
            System.out.println(i.turnOn());
            System.out.println(i.connect());
            System.out.println(i.turnOff());
        }

    }
}
