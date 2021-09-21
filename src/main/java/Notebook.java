public class Notebook extends PortableComputer {
    private Keyboard keyboard;
    private Monitor display;

    public String cpu() {
        return "intel i7";
    }

    public String ozu() {
        return "16ГБ";
    }

    public String hdd() {
        return "1ТБ";
    }

    public String toString() {
        this.keyboard = new Keyboard();
        keyboard.setKeyboard("QWERTY");
        this.display = new Monitor();
        display.setDisplay("OLED 4k");
        return cpu() + ", " + ozu() + ", " + hdd() + ", " + " Клавиатура:" + keyboard.getKeyboard()
                + ", Дисплей: " + display.getDisplay();
    }


}
