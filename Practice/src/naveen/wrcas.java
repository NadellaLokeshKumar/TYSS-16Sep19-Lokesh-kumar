package naveen;

public class wrcas {
public static void main(String[] args) {
	System.out.println("*******************");
	Object o1;
	o1=(Object)new Integer(25);
	System.out.println(o1);
	System.out.println("******************");
	Object o2=30;
	Object o3=50;
	int x=((Integer)o2).intValue()+((Integer)o3).intValue();
	int y=(Integer)o2+(Integer)o3;
	System.out.println(x);
	System.out.println(y);
}
}
