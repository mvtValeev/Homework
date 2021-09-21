public class Desktop extends TableComputer {
    public String cpu() {
        return "Apple A13";
    }

    public String ozu() {
        return "4ГБ";
    }

    public String hdd() {
        return "64ГБ";
    }

    public String videokarta() {
        return "GEOFORCE 3060";
    }
    public String toString() {
        return cpu() + ", " + ozu() + ", " + hdd() + ", " + videokarta();}

}
