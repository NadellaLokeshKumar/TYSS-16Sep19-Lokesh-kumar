package naveen;
import java.util.TreeSet;
public class run {
public static void main(String[] args) {
	Emp e1=new Emp(5000.00);
	Emp e2=new Emp(25000.00);
	Emp e3=new Emp(10000.00);
	TreeSet<Emp> t=new TreeSet<Emp>();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	for(Emp sal:t)
	{
		System.out.println(sal);
	}
}
}
