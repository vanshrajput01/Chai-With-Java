// create thread usind Runnable interface in java


class UserThread implements Runnable{

    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("Thread run successFully!!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    


}



public class ThreadInJava{
    public static void main(String[] args) {

       UserThread objUserThread =  new UserThread();

       Thread objThread = new Thread(objUserThread);

       objThread.start();

        
        
        
    }

}
