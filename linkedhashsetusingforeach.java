import java.util.*;
public class linkedhashsetusingforeach {
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Rajesh");
        a.add("Students");
        //iterator
        for(String s: a)
        {
            System.out.print(s+" ");
        }

    }
    
}