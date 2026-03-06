import java.util.ArrayList;
public class Arraylistsalary {
    public static void main(String[] args) {
        ArrayList <Integer> s=new ArrayList<>();
        s.add(20000);
        s.add(10000);
        s.add(24530);
        s.add(54567);
        s.add(86699);
        System.out.println(s);
        s.set(2,55000);
        System.out.println(s);
    }
}
