package exception.java;
public class ae {
  static void div() throws Exception {
	  for(int i=0;i<=5;i++) {
 System.out.println(i);
 Thread.sleep(2000);
	  }
 }
 public static void main(String[] args) {
	System.out.println("start");
 try {
		div();
	}
 
	catch(Exception e) {
		System.out.println("invalid exception");
		System.out.println("end");
 }
 }
}
