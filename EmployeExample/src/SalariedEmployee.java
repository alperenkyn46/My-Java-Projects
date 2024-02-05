public class SalariedEmployee extends Employe1{

    private double weeklySalary;


    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        setWeeklySalary(weeklySalary);
    }

    @Override
    public double earning() {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getWeeklySalary();
    }
}
