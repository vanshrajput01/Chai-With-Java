// String methods in java


public class StringEx01{

    public static void main(String[] args) {
            String str = "Hello";
            System.out.println("String method in java!!");
            // string Method
            // chatAt(1); 
            System.out.println("CharAt method example: " + str.charAt(1)); //e
            // indexOf();
            System.out.println("indexOf String method in java : "+str.indexOf('o'));
            // contains(); return boolean value 
            System.out.println("Contains method in java : "+str.contains("ll"));
            System.out.println("Contains method in java : "+str.contains("LL"));        
    }
}

