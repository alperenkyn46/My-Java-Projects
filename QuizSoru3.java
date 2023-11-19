import java.util.Scanner;

public class QuizSoru3 {
    public static int fact(int x) {
        if(x==1) {
            return 1;
        }
        else
            return x*fact(x-1);

    }
    public static void main(String[] args) {
        int b;
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz: ");
        a=input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        b=input.nextInt();
        double sonuc = 0;
        double f=0;
        for(int i=1;i<(b-1);i++)
        {

            sonuc=sonuc+fact(i)/a;
            a++;
        }

        System.out.println(sonuc);
    }
}
