import java.util.Scanner;
import java.util.Random;
public class ArrayExamples {

    public static void displayArray(int[]array) {
        for(int j=0;j<array.length;j++) {
            System.out.println(j+"\t"+array[j]+" ");
        }	}

    public static int[] assignArray(int[] myArray) {
        int[] secondArray=new int[myArray.length];
        for(int i=0;i<myArray.length;i++) {
            secondArray[i]=myArray[i]*2;

        }
        return secondArray;
    }


    public static void transferArray(int[]myArray)
    {
        int sayac = 0;
        for(int i=0;i<myArray.length;i++)
        {
            if(myArray[i]%2==0) {
                sayac++;
            }
        }

        int[] evenArray=new int[sayac];

        int indexEven=0;


        for(int i=0;i<myArray.length;i++)
        {
            if(myArray[i]%2==0) {

                evenArray[indexEven]=myArray[i];
                indexEven++;

            }

        }
        displayArray(evenArray);
    }

    public static int facte(int x) {
        if(x==1) {
            return 1;
        }
        else
            return x*facte(x-1);

    }

    public static int factfor(int number) {
        int result=1;
        for(int i=1;i<=number;i++)
        {
            result=result*i;
        }
        return result;
    }
    public static void factArray(int[]myArray) {

        for (int i = 0; i < myArray.length; i++) {

            System.out.println(facte(myArray[i]));
        }
    }

    public static void main(String[] args) {
        
    }
}
