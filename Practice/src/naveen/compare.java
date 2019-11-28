package naveen;
import java.util.TreeSet;
public class compare {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(20);
		t.add(50);
		t.add(30);
		t.add(50);
		t.add(40);
		for(int x:t) {
			System.out.println(x);
		}
	}

}
