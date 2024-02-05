import java.util.Scanner;
import java.util.Random;
public class Odev1 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        Random r = new Random();
        Random rr = new Random();
        int a=0;
        int b=0;
        int sonuc=0;
        int dogru=0;
        int cevap=0;
        int sayac=10;

        a=r.nextInt(10);
        b=rr.nextInt(10);
        cevap=a*b;
        System.out.print("How much is "+a+" Times "+b+" ? ");

        for(int i=0;i<sayac;i++)
        {
            sonuc=input.nextInt();

            if(cevap==sonuc) {
                dogru++;
                System.out.println("Very Good");

                a=r.nextInt(10);
                b=rr.nextInt(10);
                cevap=a*b;
                System.out.print("How much is "+a+" Times "+b+" ? ");
            }
            else if(cevap!=sonuc){
                System.out.println("Please Try Again...");
                System.out.print("How much is "+a+" Times "+b+" ? ");
                i--;
            }
            else if(dogru==10) {

                System.out.println(dogru+" question answered correctly, your program is ended...");
                break;
            }
        }
        System.out.println();
        System.out.println("\n"+dogru+" question answered correctly, your program is ended...");
    }

}
