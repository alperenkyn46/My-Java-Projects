import java.util.Random;

public class BasePlusCommisionEmployee extends ComissionEmployee{

    private double baseSalary;



    public BasePlusCommisionEmployee(String firstName, String lastName, String SSN, double commissionRate, double grossSales,double baseSalary) {
        super(firstName, lastName, SSN, commissionRate, grossSales);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int sesArttır(int sayi){
        int mevcutses=0;
        return mevcutses+sayi;
    }
    public int sesAzalt(int sayi){
        int a=0;
        return sesArttır(a)-sayi;
    }
    public boolean onoff(){
        Random r = new Random();

        boolean a=r.nextBoolean();
        boolean dek;
        if(a=true){
            dek=false;
        }
        else
            dek=true;
        return dek;
    }

    public int frekdek(int sayi){
        int saf = 0;
        if(sayi<120){
            saf=sayi;
        }
        return saf;
    }


    public static void main(String[] args) {


    }

    @Override
    public double earning() {
        return super.earning()+getBaseSalary();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getBaseSalary();
    }
}