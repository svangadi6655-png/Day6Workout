import java.util.HashSet;
public class StudentID {
    public static void main(String[] args) {
        HashSet <Integer> h=new HashSet<>();
        h.add(101);
        h.add(102);
        h.add(103);
        h.add(101);
        h.add(104);
        h.add(102);
        System.out.println(h);
    }
}
