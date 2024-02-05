public class HourlyEmployee extends Employe1{
    private double wage,hours;

    public HourlyEmployee(String firstName, String lastName, String SSN,double wage,double hours) {
        super(firstName, lastName, SSN);
        setHours(wage);
        setWage(hours);
    }
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earning() {
        return hours>40?wage*hours:40*wage;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getWage()+"\n"+getHours();
    }
}

