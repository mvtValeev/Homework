public class Desktop extends TableComputer {
    String videokarta;

    public Desktop(String cpu, String ozu, String hdd, String videokarta){
        super(cpu, ozu, hdd);
        this.videokarta = videokarta;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, видеокарта: %s", this.cpu, this.ozu, this.hdd, this.videokarta);}

}
