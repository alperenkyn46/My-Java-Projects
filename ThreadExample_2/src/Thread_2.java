import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Thread_2 implements Runnable {


    private  Random rnd;

    public Thread_2(Random rnd) throws IOException {
        this.rnd = rnd;
    }

    @Override
    public void run() {

        Random rnd = new Random();
        int a = rnd.nextInt(50);
        int b = rnd.nextInt(50);

        int sonuc = a-b;
        String message = a+"-"+b+"="+sonuc;

        System.out.println(a+"-"+b+"="+sonuc);
        try {
            File myFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta6_1\\src\\myFile");
            FileWriter fWriter = new FileWriter(myFile,true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.append(message+"\n");
            bWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
