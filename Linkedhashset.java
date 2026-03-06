import java.util.LinkedHashSet;
public class Linkedhashset{
public static void main(String[] args) {
    LinkedHashSet <String> hs=new LinkedHashSet<String>();
    hs.add("abc");
    hs.add("efg");
    hs.add("abc");
    hs.add("xyz");
    hs.add("bcd");
    hs.add("mno");
    System.out.println(hs);
    System.out.println(hs.contains("mno"));
    hs.remove("xyz");
    System.out.println(hs);
    System.out.println(hs.size());
    hs.clear();
 System.out.println(hs);
}
}