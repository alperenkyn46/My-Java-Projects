public class Triangle extends TwoDimensionalShape{


    int shape=3;

    @Override
    public double getArea() {
        return ((shape*shape)/2);
    }

    @Override
    public double getWolume() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" Üçgendir Alanı Hacmi:";
    }
}