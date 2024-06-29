// Thread Methods in java

// run() Method in java


class UserThread extends Thread{

    public void run(){
        System.out.println("Thread run successFully!!");
    }
}

public class ThreadInJava{

    public static void main(String[] args){

        UserThread objUserThread = new UserThread();

        Thread objThread = new Thread(objUserThread);

        objThread.start();






    }


}
