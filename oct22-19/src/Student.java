
public class Student {
	String name;
	int id;
	String branch;
	String bg;
	int marks;
	Student(String name, int id, String branch, String bg, int marks){
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.bg = bg;
		this.marks = marks;
	}
	void display() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("branch: "+branch);
		System.out.println("blood group: "+bg);
		System.out.println("marks: "+marks);
		System.out.println("******************");
	}
	public static void main(String[] args) {

		Student s1 = new Student("lokesh",123, "EEE", "B+", 456);
		Student s2 = new Student("naveen",456, "CSE", "A+", 741);
		Student s3 = new Student("vishnu",789, "ECE", "O+", 963);
		Student s4 = new Student("sagar",321, "MECH", "AB+", 456);
		Student s5 = new Student("karthik",654, "IT", "B+", 753);
		Student s6 = new Student("akhil",987, "CIVIL", "A+", 951);
		Student s7 = new Student("ashish",147, "EEE", "B-", 984);
		Student s8 = new Student("praneeth",258, "CSE", "A-", 964);
		Student s9 = new Student("pavan",369, "ECE", "O-", 452);
		Student s10 = new Student("kiran",963, "MECH", "AB-", 654);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
		s8.display();
		s9.display();
		s10.display();
	}
}
