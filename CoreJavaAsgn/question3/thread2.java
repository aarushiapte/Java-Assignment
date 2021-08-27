package CoreJavaAsgn.question3;

public class thread2 extends Thread{

    public thread2(String name) {
        super(name);
        fetchData();
    }

    public void fetchData(){

        try{

            System.out.println("Running thread " +Thread.currentThread().getName()+ "from the fetchData method..");
            for(int i=0; i<3; i++){
                Thread.sleep(5000);
            }
            System.out.println("Timeout of 10000ms completed..");
            
        }

        catch (InterruptedException e){
            System.out.println("Exception occured.");
        }
        
    }
    
}
