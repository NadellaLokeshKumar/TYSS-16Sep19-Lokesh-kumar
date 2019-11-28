package collectors;
import java.util.ArrayList;
public class generic {
  public static void main(String[] args) {
	  ArrayList<Integer> l1=new ArrayList<Integer>();
	  l1.add(12);
	  l1.add(35);
	  l1.add(25);
	  for(int obj:l1) {
		  System.out.println(obj);
	  }
  }
}
