
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// file handling in java

public class FileHandlingConcept{
    // create a file in java
    public static void main(String[] args) {

    // writing craeted file

        try {
            FileWriter demoFileWriter = new FileWriter("DemoFile.txt");
            demoFileWriter.write("This is demo file \n I am crearing This file using file handling in java");
            System.out.println("ile write SuccessFully!!");
            demoFileWriter.close();
            
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }


}
