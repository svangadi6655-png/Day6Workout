import java.util.ArrayList;
public class Arraylistcheck {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        names.add("shilpa");
        names.add("shivu");
        names.add("prema");
        names.add("rahul");
        names.add("vijay");
        System.out.println(names.contains("rahul"));
    }
}
