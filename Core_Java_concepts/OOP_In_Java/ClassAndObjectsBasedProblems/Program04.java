

class Book{
    String title;
    String author;
    double price;

    public void getDetails(){
        System.out.println("Book details is : " + " " + "book name : " + this.title + " " + "Author name : " + this.author+" " + "price of book: " + price);

    }

    public void applyDiscount(double percentage){
        this.price = ((this.price * percentage)/100);
        System.out.println("After apply discount final price " + this.price);

    }
    






}

public class Problem01{
    public static void main(String[] args) {
        Book obj10Book = new Book();
        obj10Book.title = "Success of life";
        obj10Book.author ="Mark";
        obj10Book.price = 100;
        obj10Book.getDetails(); 
        obj10Book.applyDiscount(8);
        obj10Book.getDetails(); 

    }

    
}
