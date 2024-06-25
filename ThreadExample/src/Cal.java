public class Cal {
    public static void main(String[] args) throws InterruptedException {
        CalculatorRunnable calcObj = new CalculatorRunnable(10000000000L);
        Thread threadObj = new Thread(calcObj);
        threadObj.start();
        threadObj.join();
        System.exit(0);
    }
}
