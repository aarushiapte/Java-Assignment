package CoreJavaAsgn.question3;

public class ques3 {

    public static void main(String[] args){

        System.out.println("FetchData Threads- using extends has been started");
        Thread t1 = new thread2("t1");
        t1.start();

        Thread t3 = new Thread(new thread1(), "t3");
        t3.start();
        
        System.out.println("Runnable Threads has been started");

        
        
    }
    
}
