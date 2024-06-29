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


// How to get name of currently running thread


public class ThreadInJava{

    public static void main(String[] args){


        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }


}
