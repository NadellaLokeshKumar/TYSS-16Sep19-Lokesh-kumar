
public class Employee {
String name;
int eid;
public Employee(String empname,int empid) {
	name = empname;
	eid = empid;
}

void printDetails() {
	System.out.println("Emlpoyee name is "+name);
	System.out.println("Emlpoyee id is "+eid);
}
public static void main(String[] args) {
	Employee e1 = new Employee("rashmika",143);
	
	Employee e2 = new Employee("manasi",111);

	Employee e3 = new Employee("chicha",69);
	
	e1.printDetails();
	e2.printDetails();
	e3.printDetails();

}
}
