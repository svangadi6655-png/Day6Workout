import java.util.ArrayList;
public class Arraylistexample{
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("98");
        names.add("58");
        names.add("32");
        names.add("67");
        names.add("95");
       System.out.println(names);
       int res=0;
       for(int i=0;i<names.size();i++){
      res +=Integer.parseInt(names.get(i));
       }
       res=res/names.size();
       System.out.println("Average Marks: "+res);
    }
}