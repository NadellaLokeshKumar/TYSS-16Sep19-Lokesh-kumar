
public class Person {
	String name;
	int age;
	Person(String pname, int page){
		name = pname;
		age = page;
	}
	public static void main(String[] args) {
		Person p = new Person("lokesh",23);
		System.out.println(p.name);
	}
}