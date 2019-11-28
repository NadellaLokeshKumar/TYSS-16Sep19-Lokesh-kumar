package collectors;

public class runner {
public static void main(String[] args) {
     double[]salary= {1.2,3.4,5.6};
for(double x:salary) {
	System.out.println(x);  //enhanced for loop in double format
}
     int[] numbers= {25,50,75};
for(int y:numbers) {
	  System.out.println(y);  //enhanced for loop in integer format
  }
     String[] names={"naveen","lokesh","varun"};
for(String s:names) {
	  System.out.println(s);   //enhanced for loop in string format
  }
     int[] id= {1,2,3};
 for(int i=0;i<id.length;i++) {
	 System.out.println(id[i]);  //normal for loop
 }
}
}
