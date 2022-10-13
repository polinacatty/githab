public class Laptop extends PortableComputer {
    public Laptop(String processor, String RAM, String harddrive, String display, String keyboard) {
        this.processor = processor;
        this.RAM = RAM;
        this.harddrive = harddrive;
        this.display = new Display(display);
        this.keyboard = new Keyboard(keyboard);
    }
}
