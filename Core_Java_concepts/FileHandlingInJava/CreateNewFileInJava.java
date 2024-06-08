
import java.io.File;
import java.io.IOException;

// file handling in java

public class FileHandlingConcept{
    // create a file in java
    public static void main(String[] args) {
            // Create File Object 
            File demoFile = new File("DemoFile.txt");
    
    try{
        demoFile.createNewFile();

    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
    }


}
