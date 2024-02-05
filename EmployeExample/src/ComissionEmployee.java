public class ComissionEmployee extends Employe1{

    private double commissionRate, grossSales;
    public ComissionEmployee(String firstName, String lastName, String SSN,double commissionRate,double grossSales) {
        super(firstName, lastName, SSN);
        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double earning() {
        return grossSales*commissionRate;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getCommissionRate()+"\n"+getGrossSales();
    }
}
