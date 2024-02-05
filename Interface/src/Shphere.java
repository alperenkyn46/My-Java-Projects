public class Shphere extends ThreeDimensionalShape{


    int shape = 3;
    double pi=3.14;
    @Override
    public double getArea() {
        return 4*pi*shape*shape;
    }

    @Override
    public double getWolume() {
        return (4*pi*shape*shape*shape)/3;
    }

    @Override
    public String toString() {
        return super.toString()+" Çemberdir Ve Alanıyla  Hacmi:";
    }

}
