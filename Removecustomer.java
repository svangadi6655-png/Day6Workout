import java.util.LinkedList;
public class Removecustomer{
    public static void main(String[] args) {
        LinkedList <String> s=new LinkedList<>();
        s.addFirst("shilpa");
        s.addLast("shivu");
        s.addFirst("vijay");
        s.addLast("ajay");
        System.out.println(s);
        s.removeFirst();
        System.out.println(s);
    }
}
