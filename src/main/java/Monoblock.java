public class Monoblock extends TableComputer {
    Monitor display;

    public Monoblock(String cpu, String ozu, String hdd, String display) {
        super(cpu, ozu, hdd);
        this.display = new Monitor();
        this.display.setDisplay(display);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, дисплей: %s", this.cpu, this.ozu, this.hdd, this.display.getDisplay());
    }
}
