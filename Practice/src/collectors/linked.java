package collectors;
import java.util.LinkedList;
public class linked {
   public static void main(String[] args) {
	   LinkedList l2=new LinkedList();
	   l2.add(25);
	   l2.add("naveen");
	   l2.add(25.35);
	   for(Object obj:l2) {  //supermost class
		   System.out.println(obj);
	   }
   }
}
