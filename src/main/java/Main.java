public class Main {
    public static void main(String[] args) {
        Desktop dt = new Desktop();
        Monoblock mb = new Monoblock();
        Netbook nb = new Netbook();
        Nettop nt = new Nettop();
        Notebook nbook = new Notebook();
        Server serv = new Server();
        Object[] classes = new Object[]{dt, mb, nb, nt, nbook, serv};
        for (Object aClass : classes) {
            System.out.println(((ComputerImpl) aClass).turnOn());
            System.out.println(((ComputerImpl) aClass).connect());
            System.out.println(((ComputerImpl) aClass).turnOff());
        }
    }
}
