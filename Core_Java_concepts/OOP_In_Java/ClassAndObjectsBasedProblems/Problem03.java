class Rectangle{
    double length;
    double width;

    public void area(){
        double area = this.length * this.width;
        System.out.println("Area of Rectangle is : " + area);
    }

    public void perimeter(){
        double perimeter = (this.length + this.width) * 2;
        System.out.println("perimeter of Rectangle is : " + perimeter);
    }

    public void displayDimensions(){
        System.out.println("length : " + this.length + " " + "Width : " + this.width);
    } 






}

public class Problem01{
    public static void main(String[] args) {
        Rectangle obj10Rectangle = new Rectangle();
        obj10Rectangle.length = 10;
        obj10Rectangle.width  = 5;
        obj10Rectangle.displayDimensions();
        obj10Rectangle.perimeter();
        obj10Rectangle.area();

    }

    
}
