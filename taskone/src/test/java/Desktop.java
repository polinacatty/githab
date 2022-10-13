public class Desktop extends DesktopComputer {
    String videocard;

    public Desktop(String processor, String RAM, String harddrive, String videocard) {
        this.processor = processor;
        this.RAM = RAM;
        this.harddrive = harddrive;
        this.videocard = videocard;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", c видеокартой " + this.videocard;
    }
}

