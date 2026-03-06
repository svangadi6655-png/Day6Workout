import java.util.ArrayList;
public class Products {
    public static void main(String[] args) {
        ArrayList <String> pn=new ArrayList<>();
        pn.add("Laptop");
        pn.add("Mouse");
        pn.add("Keyboard");
        pn.add("Monitor");
        pn.add("Headphones");
        for(String productname:pn){
            System.out.println(productname);
        }
    }
}
