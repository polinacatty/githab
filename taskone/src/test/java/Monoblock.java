public class Monoblock extends DesktopComputer {
    public Monoblock(String processor, String RAM, String harddrive, String display) {
        this.processor = processor;
        this.RAM = RAM;
        this.harddrive = harddrive;
        this.display = new Display(display);
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", с монитором " + this.display.dis();
    }
}
