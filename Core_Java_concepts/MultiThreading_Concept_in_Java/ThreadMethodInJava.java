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


// How to set or change name of currently running thread;


public class ThreadInJava{

    public static void main(String[] args){

        

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("MainThread");
        System.out.println(t.getName());


    }


}


// Sleep method 
public class ThreadInJava{

    public static void main(String[] args){

        try {

            Thread.sleep(2000);
            System.out.println("Program run SucessFully!!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        




    }


}
