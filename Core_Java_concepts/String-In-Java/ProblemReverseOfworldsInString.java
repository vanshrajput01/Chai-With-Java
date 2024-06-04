// input :- I am an the Educator
// outout= :- I ma na eht rotacudE


import java.util.ArrayList;

// 

public class StringEx01{


    public static void main(String[] args) {
            ArrayList<Integer> indexArr = new ArrayList<Integer>();
            //like string  
            int j = 0; 
            String str = "I am an the Educator";
            StringBuilder strBuilder = new StringBuilder(str);

            // System.out.println(arrString);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    indexArr.add(i);
                    
                }

            }
            int tempIndex = indexArr.size();

            
            
            for (int i = 0; i <= tempIndex; i++) {
                if(i >= tempIndex){
                    StringBuilder strReverseBuilder = new StringBuilder(strBuilder.substring(j, str.length()));
                    System.out.print(strReverseBuilder.reverse());

                }else{
                    StringBuilder strReverseBuilder = new StringBuilder(strBuilder.substring(j ,indexArr.get(i)));
                    System.out.print(strReverseBuilder.reverse()+ " ");
                    j = indexArr.get(i)+1;
                }


                
            }

            
            
            

    }
}

