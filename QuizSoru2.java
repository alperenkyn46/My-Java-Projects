import java.util.Random;


public class QuizSoru2 {
    public static int []sayilar= {1,5,4,3,7};

    public static void diziOlustur(int []dizi) {
        Random r=new Random();

        for(int i=0;i<dizi.length;i++) {
            dizi[i]=sayilar[r.nextInt(5)];
        }
    }
    public static void diziYazdir(int[]dizi) {
        for(int i=0;i<dizi.length;i++) {

            System.out.println(dizi[i]);
        }
    }

    public static void main(String[] args) {

        int []dizi1=new int[3];
        int []dizi2=new int[3];
        int []dizi3=new int[3];

        diziOlustur(dizi1);
        diziOlustur(dizi2);

        diziYazdir(dizi1);
        System.out.println("------------");
        diziYazdir(dizi2);

        for(int i=0;i<dizi3.length;i++) {
            dizi3[i]=dizi1[i]*dizi2[i];

        }

        for(int i=0;i<3;i++) {
            System.out.println(dizi1[i]+" "+dizi2[i]+" "+dizi3[i]);

        }

    }
}
