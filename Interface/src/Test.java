import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Square kare = new Square();
        Triangle ucgen = new Triangle();
        Circle daire = new Circle();


        Test nesne = new Test();

        Shphere cember = new Shphere();
        Cube kup = new Cube();
        Tetrahedron koni = new Tetrahedron(3);

        // int [] dizis={kare.shape(), ucgen.shape(), daire.shape(), cember.shape(), kup.shape(), koni.shape()};

        Shape [] dizi={kare,ucgen,daire,cember,kup,koni};

        for(Shape value:dizi){
            if(value instanceof TwoDimensionalShape){
                System.out.println(value.toString()+"\n");
                System.out.println(value.getArea()+"\n");

            }
            else if(value instanceof ThreeDimensionalShape){
                System.out.println(value.toString()+"\n");
                System.out.println(value.getArea()+"\n");
                System.out.println(value.getWolume());
            }
        }

    }
}

