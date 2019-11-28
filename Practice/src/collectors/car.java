package collectors;

public class car {
	//@override
	 public String toString() {
		 return "car@naveen143";
	 }
  public static void main(String[] args) {
	  car c1=new car();
	  System.out.println(c1);//internally/implicitly calls toString()
	  System.out.println(c1.toString()); // externally/explicitly calls toString()
  }
}
