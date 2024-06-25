import java.io.*;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (true){
            showMenu();
            System.out.println("> >");
            int option = input.nextInt();

            switch (option){
                case 1:
                    addBook(input);
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    System.out.println("Enter Title Of The Book That You Want To Search ");
                    String searchTerm = input.next();
                    search(searchTerm);
                    break;
                case 4:
                    System.out.println("Enter Title Of The Book That You Want To Delete ");
                    String deleteTerm = input.next();
                    delete(deleteTerm);
                    break;
            }

        }


    }

    public static void showMenu() throws IOException{
        System.out.println("Add:1, List:2, Search:3, Delete:4, Update:5, Exit:6");
    }
    public static void addBook(Scanner input) throws IOException {
        String title,author,category,price,publicationYear;
        System.out.println("Title Of The Book: ");
        title=input.next();
        System.out.println("Author Of The Book: ");
        author=input.next();
        System.out.println("Category Of The Book: ");
        category=input.next();
        System.out.println("Price Of The Book: ");
        price=input.next();
        System.out.println("Publication Year Of The Book: ");
        publicationYear=input.next();
        writeFile(title,author,category,price,publicationYear);
    }
    public static void writeFile(String title,String author,String category,String price,String publicationYear) throws IOException {
        File dosya = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta1\\src\\myFile");
        FileWriter dosyaYazıcı = new FileWriter(dosya,true);
        BufferedWriter bWriter = new BufferedWriter(dosyaYazıcı);
        bWriter.write(title+"\t"+author+"\t"+category+"\t"+price+"\t"+publicationYear+"\n");
        bWriter.close();
    }
    public static void readFile() throws IOException {
        String path = "C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta1\\src\\myFile";
        File dosya = new File(path);
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader bReader = new BufferedReader(dosyaOkuyucu);
        String line = bReader.readLine();
        boolean isExist = false;
        StringBuilder sBuilder = new StringBuilder();
        while (line!=null){
            sBuilder.append(line+"\n");
            line=bReader.readLine();
            isExist=true;
        }
        bReader.close();
        if (isExist=true){
            System.out.println(sBuilder.toString());
        }
    }

    public static void search(String searchTerm) throws IOException{
        String path = "C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta1\\src\\myFile";
        File dosya = new File(path);
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader bReader = new BufferedReader(dosyaOkuyucu);
        String line = bReader.readLine();
        boolean isExist = false;
        while (line!=null){
            String [] parts = line.split("\t");
            if (parts[0].equalsIgnoreCase(searchTerm)){
                System.out.println(line);
                isExist=true;
            }
            else {
                System.out.println("Kitap Bulunumadı...");
            }
            line = bReader.readLine();

        }
        bReader.close();
    }
    public static void delete(String deleteTerm) throws IOException{
        String path = "C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta1\\src\\myFile";
        File dosya = new File(path);
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader bReader = new BufferedReader(dosyaOkuyucu);
        String line = bReader.readLine();
        StringBuilder sBuilder = new StringBuilder();
        while (line!=null){
            String[] parts = line.split("\t");
            if (!parts[0].equalsIgnoreCase(deleteTerm)){
                System.out.println("eşlenme");
                sBuilder.append(line);
            }

            line=bReader.readLine();
        }
        System.out.println(sBuilder.toString()+"sbuildertostring");
        bReader.close();
        FileWriter fWriter = new FileWriter(dosya,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(sBuilder.toString());
        bWriter.close();

    }

}