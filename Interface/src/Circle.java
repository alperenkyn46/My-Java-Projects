public class Circle extends TwoDimensionalShape{


    double pi=3.14;

    int shape = 3;

    @Override
    public double getArea() {
        return pi*shape*shape;
    }

    @Override
    public double getWolume() {
        return 0;
    }

    public String toString() {
        return super.toString()+" Dairedir Alanı Hacmi:";
    }
}
