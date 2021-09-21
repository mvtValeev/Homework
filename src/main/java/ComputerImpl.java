
public abstract class ComputerImpl implements Computer {
    public abstract String toString();

    public abstract String cpu();

    public abstract String ozu();

    public abstract String hdd();

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on " + getClass().getSimpleName() + " " + toString();
    }

    public String turnOff() {
        return "Turn off " + getClass().getSimpleName() + " " + toString();
    }

    public String connect() {
        return "Connect to internet " + getClass().getSimpleName();
    }
}

