
public class TestC {
public static void main(String[] args) {
	Person.color = "black";
	Person.sleep();
	System.out.println("person color is "+Person.color);
	
	System.out.println("---------------------------");
	
	Person p = new Person();
	p.name = "lokesh";
	p.age = 23;
	System.out.println("person name is "+p.name);
	System.out.println("person age is "+p.age);
	p.eat();
	p.walk();
	System.out.println("---------------------------");
	Person p1 = new Person();
	p1.name = "naveen";
	p1.age = 24;
	System.out.println("person name is "+p1.name);
	System.out.println("person age is "+p1.age);
	p1.eat();
	p1.walk();
}
}
