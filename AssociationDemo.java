import java.util.Scanner;
class SmartCard
{
  int emp_idn;
  public void MarkAttendance(Employee e)
  {
  emp_idn=e.getEmpId();
  System.out.println("Employee " +emp_idn+ " is marked present ");
  System.out.println(" ");	
  }
  public int getEmpIdn(Employee e)
  {
      return e.empid;
  }
 }
class Employee
{
    int empid;
    Employee()
    {
    System.out.println("Enter the Employee Id");
    Scanner sc=new Scanner(System.in);
    this.empid=sc.nextInt();
    }
    public int getEmpId()
    {
	return empid;
    }
    public void login(SmartCard sc)
    {
        int eid=sc.getEmpIdn(this);
	System.out.println("Login successful for Employee Id no. "+eid);  
	System.out.println(" ");	 
    }
}
public class AssociationDemo
{
   public static void main(String args[])
   {
   System.out.println("***Association between SmartCard and Employee***");
   System.out.println(" ");	
   Employee e=new Employee();
   System.out.println("New Employee is created");
   System.out.println(" ");	
   SmartCard scd=new SmartCard();
   scd.MarkAttendance(e);
   e.login(scd);
   }
}