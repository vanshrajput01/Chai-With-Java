


public class StringEx01{

    public static void main(String[] args) {
            String str = "Hello";
            String str01 =  "Cello";
            System.out.println("String method in java!!");
            // string Method
            // compareTo();
            System.out.println("Compare To method in java : " + str.compareTo(str01)); // that return positives index
            //startWith(); :- return boolean value
            System.out.println("Start with method in java : " + str01.startsWith("D")); // false
            //endWith();
            System.out.println("Ends with string method in java : "+str01.endsWith("o")); //true
            //toUpperCase()
            System.out.println("Compare To method in java : " + str.toUpperCase());  
            //toLowerCase()
            System.out.println("Compare To method in java : " + str.toLowerCase());  
            //concat();
            //Error :- str.concat(str01);
            str = str.concat(str01);

            System.out.println(str);
            System.out.println("Concat method in java : "+str.concat(str01));
            String concatString = str01.concat(str) ;
            System.out.println("another example of concat method in java : " + concatString);
      
    }
}

