public class Cube extends ThreeDimensionalShape{


    int shape = 3;

    @Override
    public double getArea() {
        return 4*shape*shape;
    }

    @Override
    public double getWolume() {
        return shape*shape*shape;
    }

    public String toString() {
        return super.toString()+" KÜptür Alanı Hacmi:";
    }

}