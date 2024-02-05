import java.util.ArrayList;
import java.util.Random;

public class ArrayListEx {
    public static void main(String[] args) {


        ArrayList<String> colors= new ArrayList<>();

        colors.add("Sarı");
        colors.add("Kırmızı");
        colors.add("Siyah");

        for(String x:colors){
            System.out.print(x+" ");
        }

        String [] colors2= {"yellow","green","black","Purple","Blue"};
        ArrayList<String> colors3 = new ArrayList<>();
        Random r = new Random();
        int a = 0;

        for(int i=0; i<colors2.length;i++){

            colors3.add(colors2[r.nextInt(4)]);

        }
        for(String k:colors3){
            System.out.print(k+" ");
        }   // displayArray(colors3) olarakta gösterebiliriz

        isEqual(colors,"Sarı");


    }

    public static void displayArray(ArrayList<String> colors)
    {
        for(int i=0;i<colors.size();i++)
        {
            System.out.println(colors.get(i));
        }

    }

    public static void isEqual(ArrayList<String> colors,String searchedWord)
    {
        String d = null;
        for(String value: colors)
        {
            if(value==searchedWord){   // colors.get(i).equals(searchedWord) olarakta yapılabilirdi ama for döngüsü i li olması kaydıyla
                d="Yes";
                System.out.println(d);
                break;
            }
            else if(value!=searchedWord){
                d="No";
                System.out.println(d);
                break;
            }

        }

    }



}

