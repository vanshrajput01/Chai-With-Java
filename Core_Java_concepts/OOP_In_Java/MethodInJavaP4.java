// Create method to print_table;

public class Main{
    static void print_table(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*num);
            
        }

    }

    public static void main(String[] args){
        print_table(10);
    }
}