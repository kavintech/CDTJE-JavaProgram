
public class SalariedEmployeee extends Employee 
	{	
		int salary;
		
		public SalariedEmployeee()
		{
			empId="E1001";
			empName="kavin";
			addr="karur";
			salary=3000;
		}
		
		public void display()
		{
			System.out.println("Employee ID:"+empId);
			System.out.println("Employee Name:"+empName);
			System.out.println("Employee Address:"+addr);
			System.out.println("Salary : "+salary);
		}
		
		public static void main(String arg[])
		{
			SalariedEmployeee salaryEmployee=new SalariedEmployeee();
			salaryEmployee.display();
		}



}
