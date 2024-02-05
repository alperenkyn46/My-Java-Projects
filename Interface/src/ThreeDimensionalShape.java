public abstract class ThreeDimensionalShape implements Shape{


    @Override
    public String  toString() {

        return "Şekil Üç Boyutludur ";
    }

    @Override
    public abstract double getArea();



    @Override
    public abstract double getWolume();
}