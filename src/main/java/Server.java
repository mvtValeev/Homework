public class Server extends ComputerImpl {
    public String cpu() {
        return "M1";
    }

    public String ozu() {
        return "8ГБ";
    }

    public String hdd() {
        return "64ГБ";
    }
    public String toString(){
        return cpu() + ", " + ozu() + ", " + hdd();
    }
}