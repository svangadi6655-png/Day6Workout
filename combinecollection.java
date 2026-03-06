import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class combinecollection {
    public static void main(String[] args) {

        HashSet<Integer> h= new HashSet<>();
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        TreeSet<Integer> t= new TreeSet<>();

        int[] numbers = {10, 20, 30, 20, 40, 10};

        for (int num : numbers) {
            h.add(num);
            l.add(num);
            t.add(num);
        }

        System.out.println("HashSet: " + h);
        System.out.println("HashSet Size: " + h.size());

        System.out.println("LinkedHashSet: " + l);
        System.out.println("LinkedHashSet Size: " + l.size());

        System.out.println("TreeSet: " + t);
        System.out.println("treeset Size: " + t.size());
    }
}