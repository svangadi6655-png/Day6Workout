import java.util.LinkedHashSet;
public class Book{
public static void main(String[] args) {
    LinkedHashSet <String> hs=new LinkedHashSet<String>();
    hs.add("physics");
    hs.add("chemistry");
    hs.add("biology");
    hs.add("mathematics");
    hs.add("biology");
    hs.add("english");
    System.out.println(hs);
    }
}