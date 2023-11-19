
import java.util.Random;
import java.util.Scanner;
public class BirlestirMatris {

    public static void diziOlustur(int []dizi1,int []dizi2,int[]anadizi) {
        Random r=new Random();
        for(int i=0;i<3;i++) {
            dizi1[i]=anadizi[r.nextInt(5)];
            dizi2[i]=anadizi[r.nextInt(5)];
        }
    }

    public static int[][] birlestirDizi(int[]dizi1,int[]dizi2) {
        int sondizi[][]=new int[3][3];


        for(int i=0;i<3;i++)
        {
            sondizi[i][0]=dizi1[i];
            sondizi[i][1]=dizi2[i];
            sondizi[i][2]=(dizi1[i]*dizi2[i]);
        }
        return sondizi;
    }

    public static void yazdirMatris(int[][]dizi) {
        for(int i=0;i<dizi.length;i++)
        {
            for(int j=0;j<dizi[i].length;j++)
            {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int []dizi= {1,5,4,3,7};
        int []dizi1=new int[3];
        int []dizi2=new int[3];
        diziOlustur(dizi1,dizi2,dizi);
        int [][]sondizi=birlestirDizi(dizi1,dizi2);


        yazdirMatris(sondizi);
    }

}
