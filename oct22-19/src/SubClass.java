
public class SubClass extends SuperClass{
String s = "Sub Class Variable";

SubClass(){
	super();
	System.out.println("Sub Class Constructor");
}
void getSData() {
	System.out.println(s);
	System.out.println(this.s);
	System.out.println(super.s);
	super.SuperClassMethod();
}

}
