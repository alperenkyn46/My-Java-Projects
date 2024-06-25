public class CalTest {
    public static void main(String[] args) {
        CalculatorRunnable calcObj = new CalculatorRunnable(10000000000L);
        Thread threadObj = new Thread(calcObj);
        threadObj.setName("My Thread-1");
        threadObj.start();

        while (threadObj.isAlive()){
            System.out.println(threadObj.currentThread().getName()+"is active");

        }
        System.out.println("Thread's work is completed...");

    }
}
