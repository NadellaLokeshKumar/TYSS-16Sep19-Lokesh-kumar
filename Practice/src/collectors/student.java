package collectors;

public class student {
String name;
int id;
  student(String name,int id){
	  this.name=name;
	  this.id=id;
  }
      public String toString() {
    	  return "kumar"+2345;
      }
	  public static void main(String[] args) {
		student s=new student("naveen",1234);
		System.out.println(s);
  }
}
