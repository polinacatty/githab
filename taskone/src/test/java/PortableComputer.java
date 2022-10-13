public abstract class PortableComputer extends ComputerImpl {
    Keyboard keyboard;
    Display display;

    public PortableComputer() {
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", c монитором " + this.display.dis() + ", с клавиатурой " + this.keyboard.key();
    }
}
