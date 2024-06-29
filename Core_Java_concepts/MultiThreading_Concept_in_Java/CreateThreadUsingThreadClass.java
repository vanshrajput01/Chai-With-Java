
// create thread using thread class in java



class MyThread extends Thread{

    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread run successfully!!");
        }

        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        

    }

}



public class ThreadInJava{
    public static void main(String[] args) {

        MyThread objMyThread = new MyThread();
        objMyThread.start();
        
    }

}
