public class Manager extends Employee{
    private int numOfEmploye;

    public Manager(String name, String department, double salary) {
        super(name, department, salary);
    }


    public int getNumOfEmploye() {
        return numOfEmploye;
    }

    public void setNumOfEmploye(int numOfEmploye) {
        this.numOfEmploye = numOfEmploye;
    }

    @Override
    public void showsInfo() {
        super.showsInfo();
    }
}
