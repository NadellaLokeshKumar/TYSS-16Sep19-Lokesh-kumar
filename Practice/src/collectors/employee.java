package collectors;

public class employee<T>
{
  T salary;
  employee(T salary)
  {
	  this.salary=salary;
  }
   public String toString() 
   {
	   return "salary"+salary;
   }
  public static void main(String[] args)
  {
   employee<Double> e1=new employee<Double>(25.25);
	  System.out.println(e1);
  }
}
