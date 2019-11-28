package naveen;

public class Emp implements Comparable<Emp> 
{
	public Double salary;
	public Emp(double salary) {
		this.salary=salary;
		}
	//@ override
    public String toString() {
    	return "salary"+salary;
    }
    //@override
    public int compareTo(Emp obj) {
  return this.salary.compareTo(obj.salary);   	
    }
}
