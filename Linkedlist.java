import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<String>();
        names.addFirst("abc");
        names.addFirst("efg");
        names.addLast("xyz");
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.removeFirst();
       System.out.println(names);
       names.removeLast();
        System.out.println(names);
    }
}
