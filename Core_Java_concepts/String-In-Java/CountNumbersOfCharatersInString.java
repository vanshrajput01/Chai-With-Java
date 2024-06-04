// input = aaaabbbcce
// output :- a4b3c2e1

public class StringEx01{


    public static void main(String[] args) {
        String str = "aaaabbbcce";
        char charOfSting = str.charAt(0);
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(charOfSting);
        for (int i = 0; i < str.length(); i++){
            if(charOfSting != str.charAt(i)){
                charOfSting = str.charAt(i);
                strBuilder.append(charOfSting);

            }
            
        }
        int counter = 0;

        for (int i = 0; i < strBuilder.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(strBuilder.charAt(i) == str.charAt(j)){
                    counter++;

                    
                }


                
            }
            System.out.print(strBuilder.charAt(i));
            System.out.print(counter);
            counter = 0;
            
        }




            
            
            

    }
}

