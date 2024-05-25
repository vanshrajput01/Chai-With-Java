// Continue Statement in Java

public class ContinueStatementInJava{
    public static void main(String[] args){
        System.out.println("Print 1 to 50 but not print multiple 5");
        for(int i = 0;i<=50;i++){
            if (i % 5 == 0) {
                continue;
                
            }
            System.out.println(i);

        }



    }
}