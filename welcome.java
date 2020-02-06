//Creating method in same class (public class) in which main method exists.
 
import java.util.*;
 
class HelloWorld
{
    public void dispMessage()
    {
        System.out.println("Hello World.");
    }
     
    //Main method
    public static void main(String s[])
    {
        //creat object of HelloWorld Class
        HelloWorld obj=new HelloWorld();
        obj.dispMessage();
    }
}
