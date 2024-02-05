public class Tetrahedron extends ThreeDimensionalShape {

    int shape=3;

    public Tetrahedron(int shape) {
        this.shape = shape;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3)*shape*shape;
    }

    @Override
    public double getWolume() {
        return (shape*shape*shape)/(6*Math.sqrt(2));
    }

    public String toString() {
        return super.toString()+" Konidir Alanı Hacmi:";
    }
}
