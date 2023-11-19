import java.util.Random;
import java.util.Scanner;
public class QuizSoru4 {
    public static int[][] birlestirYazdirDizi(int[]dizi1,int[]dizi2,int[]dizi3){
        int dizi [][]=new int[3][3];
        dizi[0]=dizi1;
        dizi[1]=dizi2;
        dizi[2]=dizi3;

        for(int i=0;i<dizi.length;i++)
        {
            for(int j=0;j<dizi[i].length;j++)
            {

                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
        return dizi;}

    public static void kareAlYazdir(int [][]dizi) {
        int a=0;
        int b=2;

        for(int i=0;i<dizi.length;i++)
        {
            for(int j=0;j<dizi[i].length;j++)
            {
                if(dizi[i][i]==dizi[j][j])
                {
                    System.out.print(dizi[i][j]*dizi[i][j]+" ");
                }
                else if(dizi[i][j]==dizi[a][b])
                {
                    System.out.print(dizi[i][j]*dizi[i][j]+" ");
                    a++;
                    b--;
                }
                else
                    System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int [] dizi1= new int[3];
        int [] dizi2= new int[3];
        int [] dizi3= new int[3];
        int [][] sondizi= new int[3][3];
        int a;
        System.out.print("Lütfen birinci dizinin 3 elemanını giriniz: ");
        for(int i=0;i<3;i++)
        {
            dizi1[i]=input.nextInt();
        }
        System.out.print("Lütfen ikinci dizinin 3 elemanını giriniz: ");
        for(int i=0;i<3;i++)
        {
            dizi2[i]=input.nextInt();
        }
        System.out.print("Lütfen üçüncü dizinin 3 elemanını giriniz: ");
        for(int i=0;i<3;i++)
        {
            dizi3[i]=input.nextInt();
        }

        sondizi=birlestirYazdirDizi(dizi1,dizi2,dizi3);
        System.out.println("---------------");
        kareAlYazdir(sondizi);

    }
}
