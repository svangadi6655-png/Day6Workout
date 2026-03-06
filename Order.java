import java.util.ArrayList;
public class Order {
    public static void main(String[] args) {
        ArrayList <String> or=new ArrayList<>();
        or.add("order101");
        or.add("order102");
        or.add("order103");
        or.add("order104");
        or.add("order105");
        or.add("order106");
       System.out.println(or);
       or.remove("order102");
      System.out.println("After removing order:" +or);
    }
}
