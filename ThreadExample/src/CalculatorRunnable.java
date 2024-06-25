public class CalculatorRunnable implements Runnable{

    private long value;
    public CalculatorRunnable(Long value){
        this.value=value;
    }
    @Override
    public void run()
    {
        long value2=System.currentTimeMillis();
        long value3 = 0;


        long sum = 0;
        for (long i=0;i<value;i++)
        {
            sum+=value;

        }
        value3=System.currentTimeMillis();
        System.out.println("Sum: "+sum);
        //System.out.println("System.currentTimeMillis: "+(value3-value2));
        System.out.println("Elapsed Time: "+(value3-value2)+"For Thread: "+Thread.currentThread().getName());

    }

    public static void main(String[] args) {

    }

}
