package naveen;

public class solution {
	void findmaxsalary(employee a,employee b,employee c) {
		if(a.salary>b.salary && a.salary>c.salary) {
			System.out.println(a.salary+"is highest");
		}
			else if(b.salary>a.salary && b.salary>c.salary) {
				System.out.println(b.salary+"is highest");
			}
				else {
					System.out.println(c.salary+"is highest");
				}
	}
}
		
