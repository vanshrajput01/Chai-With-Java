// Substring related problem
import java.util.*;
public class StringBuilderInJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        int counter = 0;
        String str = sc.nextLine();
        StringBuilder objBuilder = new StringBuilder(str);
        ArrayList <String> arrStr1 = new ArrayList<String>();
        ArrayList <String> arrStr2 = new ArrayList<String>();
        String reverseStr = objBuilder.reverse() + "";
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                arrStr1.add(str.substring(i, j));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                arrStr2.add(reverseStr.substring(i, j));
                
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                String strArr1 = arrStr1.get(i);
                String strArr2 = arrStr2.get(j);
                if(strArr1.equals(strArr2)){
                    counter++;
                }


                



        


                
            }
           

            
        }


        // System.out.println(arrStr1);
        System.out.println(counter);




        
        


        
    }

        


        
}

    
