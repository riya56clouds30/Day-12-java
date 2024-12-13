import java.util.*;
class removeandclearusinglinkedlist{
    public static void main(String args[]){
        LinkedList<String> a=new LinkedList<>();
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