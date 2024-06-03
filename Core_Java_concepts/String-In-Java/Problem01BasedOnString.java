// Example of string builder in java
import java.util.Scanner;
public class StringBuilderInJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        StringBuilder updatedStr = new StringBuilder(); 
        

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String chUpper =  Character.toString(ch).toUpperCase();
            char chUpperchar = chUpper.charAt(0);
            int chAsciiValue = (int)ch;
            int chUpperAsciiValue = (int)chUpperchar;
            if (chAsciiValue == chUpperAsciiValue){
                updatedStr.append( chUpper.toLowerCase());
               


            }else{
                updatedStr.append(chUpper);
            }




            

            
        }
        System.out.println(str);
        System.out.println(updatedStr);

        
        

        
           
       }

       

      

        


        





    }

    
