import java.util.Random;
public class QuizEx {

    public static int getMinimum(int []dizi1)
    {
        int min=dizi1[0];
        for(int i=1;i<dizi1.length;i++)
        {
            if(min>dizi1[i])
                min=dizi1[i];
        }
        return min;
    }
    public static int getMaximum(int []dizi1)
    {
        int max=dizi1[0];
        for(int i=1;i<dizi1.length;i++)
        {
            if(max<dizi1[i])
                max=dizi1[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int [] dizi={1,3,5,7,9};
        Random r = new Random();
        int a=1;
        int [] sonuc = new int[3];
        int [] sonuc2 = new int[3];
        int[] sonucdizi=new int[6];
        for(int i=0;i<3;i++)
        {
            int b=dizi[r.nextInt(5)];
            System.out.println(a+" x "+b+" = "+(a*b));
            sonuc[i]=a*b;

        }
        int x=1;

        int min=getMinimum(sonuc);
        for(int j=0;j<3;j++)
        {
            System.out.println(min+" x "+(min*x)+" = "+(min*(min*x)));

            sonuc2[j]=min*(min*x);
            x++;
        }

        for(int i=0;i<3;i++){
            sonucdizi[i]=sonuc[i];
            sonucdizi[i+3]=sonuc2[i];
        }
        int max=getMaximum(sonucdizi);
        System.out.print("Sayılarımız: ");
        for(int i=0;i<3;i++){
            System.out.print(" "+sonuc[i]+" "+sonuc2[i]);

        }
        System.out.println();
        System.out.println("En Küçük Değer: "+getMinimum(sonucdizi));
        System.out.println("En Büyük Değer: "+getMaximum(sonucdizi));
    }

}
