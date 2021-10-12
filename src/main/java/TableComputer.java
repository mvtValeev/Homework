public abstract class TableComputer extends ComputerImpl {
    public TableComputer(String cpu, String ozu, String hdd){
        super(cpu, ozu, hdd);
    }

    @Override
    public String toString() {
        return " Настольный компьютер";
    }


}
