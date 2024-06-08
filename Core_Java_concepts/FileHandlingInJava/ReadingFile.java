
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// file handling in java

public class FileHandlingConcept{
    // create a file in java
    public static void main(String[] args) {
            File demoFile = new File("DemoFile.txt");


        // Readig file

        try {
            // file object pass karte ha
            Scanner sc = new Scanner(demoFile);
            while (sc.hasNextLine()) {
                 System.out.println(sc.nextLine()); 
                
                
            }
            sc.close();

            
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }





    }


}
