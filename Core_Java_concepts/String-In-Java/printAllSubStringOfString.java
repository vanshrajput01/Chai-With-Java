// print all substrig of string in java 

public class StringEx01{

    public static void main(String[] args) {
            //like string   
            String str = "Hello";
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j <= str.length(); j++) {
                    System.out.print(str.substring(i,j));
                    System.out.print(" ");
                    



                    
                }
                
            }


      
    }
}

