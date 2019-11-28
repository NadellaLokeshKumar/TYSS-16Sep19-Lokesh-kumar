
public class TestE {
	public static void main(String[] args) {
		Student.cname = "LBRCE";
		Student S1 = new Student();
		S1.usn = 155;
		S1.name = "lokesh";
		System.out.println("college name is "+Student.cname);
		System.out.println("name is "+S1.name);
		System.out.println("ID is "+S1.usn);
	}
}
