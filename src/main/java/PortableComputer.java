public abstract class PortableComputer extends ComputerImpl {
    Keyboard keyboard;
    Monitor display;

    public PortableComputer(String cpu, String ozu, String hdd, String keyboard, String display) {
        super(cpu, ozu, hdd);
        this.keyboard = new Keyboard();
        this.keyboard.setKeyboard(keyboard);
        this.display = new Monitor();
        this.display.setDisplay(display);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, клавиатура: %s, дисплей: %s",
                this.cpu, this.ozu, this.hdd, this.keyboard.getKeyboard(), this.display.getDisplay());
    }


}
