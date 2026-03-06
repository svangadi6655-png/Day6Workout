import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("abc");
        names.add("mno");
        names.add("pqr");
        names.add("xyz");
        names.add(0,"abcdf");
        System.out.println(names);
        System.out.println(names.get(2));
        names.set(1,"gadjhbhgfjy");
         System.out.println(names);
         System.out.println(names.remove(1));
        System.out.println(names);
        System.out.println(names.size());
         names.clear();
        System.out.println(names);

    }
}