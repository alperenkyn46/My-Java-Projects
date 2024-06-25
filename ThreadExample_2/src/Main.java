import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        //sınıftan nesne üretmek
        Thread_1 thread1 = new Thread_1(new Random());
        Thread_2 thread2 = new Thread_2(new Random());
        //Thread nesneleri üretmek
        Thread thread1Obj = new Thread(thread1);
        thread1Obj.join();
        Thread thread2Obj = new Thread(thread2);
        thread2Obj.join();

        thread1Obj.start();
        thread2Obj.start();




    }
}