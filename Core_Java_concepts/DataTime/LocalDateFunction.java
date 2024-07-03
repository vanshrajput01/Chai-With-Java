
import java.time.LocalDate;



public class LocalDateClass{
    public static void main(String[] args) {
        
        LocalDate objDate = LocalDate.now();
        System.out.println(objDate);

        // How to create Local date 

        LocalDate objDate1 = LocalDate.of(2012,8,20);
        System.out.println(objDate1);
        
    }
}
