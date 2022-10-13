public class Netbook extends PortableComputer {
    public Netbook(String processor, String RAM, String harddrive, String display, String keyboard) {
        this.processor = processor;
        this.RAM = RAM;
        this.harddrive = harddrive;
        this.display = new Display(display);
        this.keyboard = new Keyboard(keyboard);
    }
}
