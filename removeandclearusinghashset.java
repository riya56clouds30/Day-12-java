import java.util.*;
class removeandclearusinghashset{
    public static void main(String args[]){
        HashSet<String> a=new HashSet<>();
        a.add("Hello");
        a.add("I am");
        a.add("Student");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}