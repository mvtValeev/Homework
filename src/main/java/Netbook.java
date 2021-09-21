public class Netbook extends PortableComputer {
    private Keyboard keyboard;
    private Monitor display;

    public String cpu() {
        return "intel i3";
    }

    @Override
    public String ozu() {
        return "4ГБ";
    }

    @Override
    public String hdd() {
        return "128ГБ";
    }

    public String toString() {
        this.keyboard = new Keyboard();
        keyboard.setKeyboard("QWERTY");
        this.display = new Monitor();
        display.setDisplay("OLED 4k");
        return cpu() + ", " + ozu() + ", " + hdd() + " Клавиатура:" + keyboard.getKeyboard()
                + ", Дисплей: " + display.getDisplay();
    }

}
