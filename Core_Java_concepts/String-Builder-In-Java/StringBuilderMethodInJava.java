// Example of string builder in java
public class StringBuilderInJava{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        // String builder methods in java
        // append  :- add value into string 

        str.append("World");
        System.out.println(str);
        // index Of
        

        System.out.println(str.indexOf("W"));
        // setCharAt()

        str.setCharAt(5, 'w');
        System.out.println(str);

        // insert(index,ch)

        str.insert(5," ");
        System.out.println(str);
        str.append('M');
        System.out.println(str.indexOf("M"));


        // deleteCharAt(idx)
        str.deleteCharAt(11);
        System.out.println(str);

        System.out.println(str);

        // reverse
        System.out.println(str.reverse());
        System.out.println(str);

        // delete(i,j)
        str.delete(1,6);
        System.out.println(str);



    }

    
}
