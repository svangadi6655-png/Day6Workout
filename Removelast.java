import java.util.LinkedList;
public class Removelast{
    public static void main(String[] args) {
        LinkedList <String> s=new LinkedList<>();
        s.addFirst("Alice");
        s.addLast("bob");
        s.addFirst("john");
        s.addLast("sanjay");
        s.addFirst("radha");
        System.out.println(s);
        s.removeLast();
        System.out.println(s);
    }
}
