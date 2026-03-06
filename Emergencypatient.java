import java.util.LinkedList;
public class Emergencypatient{
    public static void main(String[] args) {
        LinkedList <String> s=new LinkedList<>();
        s.addFirst("Alice");
        s.addLast("bob");
        s.addFirst("john");
        s.addLast("sanjay");
        System.out.println(s);
        s.addFirst("radha");
        System.out.println(s);
    }
}
