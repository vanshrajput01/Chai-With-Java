
import java.io.File;

// file handling in java

public class FileHandlingConcept{
    // create a file in java
    public static void main(String[] args) {
         File demoFile = new File("DemoFile.txt");



        // deleting file in java


            if(demoFile.delete()){
                System.out.println("File delete success fully!!");
            }else{
                System.out.println("getting Error in file deleting!!");
            }

            
        






    }


}
