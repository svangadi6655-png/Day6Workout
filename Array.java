import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
     ArrayList <Integer> n=new ArrayList<>();
     n.add(10); 
     n.add(20);        
     n.add(30);        
     n.add(40);        
     n.add(50);        
     n.add(60);  
     int sum=0;      
    System.out.println(n);
    for(int i=0;i<n.size();i++){
sum+=(n.get(i));
    }
    //for(int mark:names){
    //   System.out.println(mark);
    //}
    //for(int name:names){
    //    sum=sum+name;
    //}
    //double avr=(double)sum/marks.size();
    System.out.println("Average marks: "+sum/n.size());

    }
}
