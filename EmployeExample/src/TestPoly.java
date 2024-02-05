public class TestPoly {

    public static void main(String[] args) {

        SalariedEmployee salaryObj = new SalariedEmployee("Salary ","Salary"," SSN",50);
        HourlyEmployee hourlyObj = new HourlyEmployee("Hourly ","Hourly"," SSN",20,30);
        ComissionEmployee compObj = new ComissionEmployee("Comission ","Comission"," SSN",15,30);
        BasePlusCommisionEmployee baseObj = new BasePlusCommisionEmployee("Base ","Base"," SSN",15,30,100);

        Employe1 [] dizi = {salaryObj,hourlyObj,compObj,baseObj};

        //Employe1 [] emp = new Employe1[4];
        // emp[0] = salaryObj;               Yukarıdaki dizinin farklı bir şekilde yapılmış hali

        for( Employe1 value:dizi){
            System.out.println(value);

            System.out.println(value.earning());
            System.out.println("\n");
        }
    }
}
