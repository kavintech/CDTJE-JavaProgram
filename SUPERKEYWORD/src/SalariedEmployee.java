
public class SalariedEmployee extends Employee 
	{	
		int salary;
		
		public SalariedEmployee()
		{
			salary=3000;
		}
		
		public SalariedEmployee(String empId,String empName,String addr,int salary)
		{
			super(empId,empName,addr);
			this.salary=salary;
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
			SalariedEmployee salaryEmployee=new SalariedEmployee();
			salaryEmployee.display();
			
			SalariedEmployee salaryEmployee2=new SalariedEmployee("s1182","kavin","karur",10000);
			salaryEmployee2.display();
		}
	}

