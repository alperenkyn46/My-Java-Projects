public class Square extends TwoDimensionalShape{


    int shape = 3;

    @Override
    public double getArea() {
        return shape*shape;
    }

    @Override
    public double getWolume() {
        return 0;
    }


    public String toString() {
        return super.toString()+" Karedir Alanı Hacmi:";
    }
}