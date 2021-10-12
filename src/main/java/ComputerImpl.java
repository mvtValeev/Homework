
public abstract class ComputerImpl implements Computer {
    String cpu;
    String ozu;
    String hdd;

    public ComputerImpl(String cpu, String ozu, String hdd) {
        this.cpu = cpu;
        this.ozu = ozu;
        this.hdd = hdd;
    }


    public String toString() {
        return String.format("%s, %s, %s", this.cpu, this.ozu, this.hdd);
    }


    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on " + getClass().getSimpleName() + " " + this.toString();
    }

    public String turnOff() {
        return "Turn off " + getClass().getSimpleName() + " " + this.toString();
    }

    public String connect() {
        return "Connect to internet " + getClass().getSimpleName();
    }
}

