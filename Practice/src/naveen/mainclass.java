package naveen;

public class mainclass {
	public static void main(String[] args) {
		employee E1=new employee(1234,"naveen",25000);
		employee E2=new employee(3456,"kumar",50000);
		employee E3=new employee(9123,"raja",26000);
		solution sol=new solution();
		sol.findmaxsalary(E1,E2,E3);
		
	}
	

}
