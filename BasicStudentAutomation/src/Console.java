import java.io.IOException;
import java.util.Scanner;
import java.io.*;

//Hocam Bir değer girdikten sonra tekrardan menüyü getirtmeye zamanım yetmedi.

public class Console  {
    static int dersNo;
    static String dersAd;
    static int ogrenciNo;
    static String ogrenciAd;
    static String ogrenciSoyad;
    static int yil;
    static int not;
    static File dersFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\dersFile");
    static File ogrenciFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\ogrenciFile");
    static File notFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\notFile");

    static Exception myException = new Exception("Hatalı Giriş Yaptınız!!");

    public static void Fonk() throws Exception{
        Scanner input = new Scanner(System.in);

        String menu = "Yeni Ders:1  Yeni Öğrenci:2  ListeleDers:3  ListeleÖğrenci:4  EkleNot:5  ListeleNot:6  Cıkış:0";
        String cizgi = "------------------------------------------------------------------------------------";
        while (true){
            System.out.println(menu+"\n"+cizgi);
            int option = input.nextInt();


            switch (option){
                case 1:
                    yeniDers(input);
                    writeFileDers(dersNo,dersAd);
                    break;

                case 2:
                    yeniOgrenci(input);
                    writeFileOgrenci();
                    break;
                case 3:
                    listeleDers();
                    break;

                case 4:
                    listeleOgrenci();
                    break;

                case 5:
                    ekleNot(input);
                    break;

                case 6:
                    listeleNot(input);
                    break;


            }

        }

    }
    public static void main(String[] args) throws Exception {


    }
    public static void yeniDers(Scanner input) throws IOException {


        System.out.println("Ders Kodunu Giriniz:");
        dersNo=input.nextInt();
        System.out.println("Ders Adını Giriniz:");
        dersAd=input.next();

    }
    public static void yeniOgrenci(Scanner input) throws IOException{
        System.out.println("Ogrenci Numaranısını Giriniz:");
        ogrenciNo=input.nextInt();
        System.out.println("Öğrenci Adını Giriniz:");
        ogrenciAd=input.next();
        System.out.println("Ogrenci Soyadını Giriniz:");
        ogrenciSoyad=input.next();
    }
    public static void ekleNot(Scanner input) throws Exception {
        FileReader fReader = new FileReader(ogrenciFile);
        BufferedReader bReader = new BufferedReader(fReader);
        String line = bReader.readLine();
        boolean bool = false;

        FileReader fReader1 = new FileReader(dersFile);
        BufferedReader bReader1 = new BufferedReader(fReader);
        String line1 = bReader.readLine();

        File notFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\notFile");
        FileWriter dosyaYazıcı = new FileWriter(notFile,true);
        BufferedWriter bWriter = new BufferedWriter(dosyaYazıcı);

        System.out.println("Ogrenci Numarasını Giriniz: ");
        ogrenciNo=input.nextInt();
        System.out.println("Ders Numarasını Giriniz: ");
        dersNo=input.nextInt();
        System.out.println("Öğretim Yılını Giriniz: ");
        yil=input.nextInt();
        System.out.println("Ogrencinin Ders Notunu Giriniz: ");
        not=input.nextInt();

        bWriter.write(ogrenciNo+" "+dersNo+" "+yil+" "+not+"\n");

        bWriter.close();

    }
    public static void listeleDers() throws IOException {
        FileReader fReader = new FileReader(dersFile);
        BufferedReader bReader= new BufferedReader(fReader);
        String line = bReader.readLine();

        while (line!=null){
            System.out.println(line);
            line=bReader.readLine();
        }






    }
    public static void listeleOgrenci() throws IOException {
        FileReader fReader = new FileReader(ogrenciFile);
        BufferedReader bReader= new BufferedReader(fReader);
        String line = bReader.readLine();
        boolean isExist = false;

        while (line!=null){
            System.out.println(line+"\n");
            line = bReader.readLine();

        }



    }
    public static void listeleNot(Scanner input)throws IOException{
        System.out.println("Öğrenci Numaranızı Giriniz: ");
        ogrenciNo=input.nextInt();
        FileReader fReader = new FileReader(ogrenciFile);
        BufferedReader bReader= new BufferedReader(fReader);
        String line = bReader.readLine();

        FileReader fReader1 = new FileReader(notFile);
        BufferedReader bReader1= new BufferedReader(fReader1);
        String line1 = bReader1.readLine();


        while (line!=null){
            if (line.contains(String.valueOf(ogrenciNo)) && line1.contains(String.valueOf(ogrenciNo))){
                System.out.println(line+"\n"+line1);

            }
            line=bReader.readLine();
            line1= bReader1.readLine();
        }


    }

    public static void writeFileDers(int dersNo,String dersAd) throws IOException {

        File myFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\dersFile");
        FileWriter dosyaYazıcı = new FileWriter(dersFile,true);
        BufferedWriter bWriter = new BufferedWriter(dosyaYazıcı);
        bWriter.write(+dersNo+"\t"+dersAd+"\n");
        bWriter.close();
    }
    public static void writeFileOgrenci() throws IOException {

        File myFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\ogrenciFile");
        FileWriter dosyaYazıcı = new FileWriter(myFile,true);
        BufferedWriter bWriter = new BufferedWriter(dosyaYazıcı);
        bWriter.write(ogrenciAd+"\t"+ogrenciSoyad+"\t"+ogrenciNo+"\n");
        bWriter.close();
    }
}
