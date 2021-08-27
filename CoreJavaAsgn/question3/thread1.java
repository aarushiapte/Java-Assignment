package CoreJavaAsgn.question3;

public class thread1 implements Runnable {

    @Override
    public void run(){
            processData();
    }

    public void processData(){
        System.out.println("Running thread " +Thread.currentThread().getName()+ "from the processData method..");
    }
 
}
