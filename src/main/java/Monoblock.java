public class Monoblock extends TableComputer {
    private Monitor display;
    public String cpu() {
        return "M1";
    }
    public String ozu() {
        return "8ГБ";
    }
    public String hdd() {
        return "64ГБ";
    }
    public String toString() {
        this.display = new Monitor();
        display.setDisplay("OLED 4k");
        return cpu() + ", " + ozu() + ", " + hdd() + ", Дисплей: " + display.getDisplay();}
}
