
	public class BasicStringDemo 
	{
		public static void main(String arg[])
		{
			String str="kavin";
			System.out.println("Vijay".length());
			
			char name[]={'S','u','d','h','i','r'};
			String myString1=new String(name); 
			System.out.println("Using Char Array"+myString1);
			
			byte buff[]= {65,66,67,68};
			String myString2=new String(buff);
			System.out.println("Using Byte Array:"+myString2);
			
			String str1="Hello there";
			
			System.out.println(str1.toUpperCase());
			System.out.println(str1.toLowerCase());
			
			String record="E1001,Suresh,20000";
			String eachValue[]=record.split(",");
			
			System.out.println("Employee ID:"+eachValue[0]);
			System.out.println("Employee Name:"+eachValue[1]);
			System.out.println("Employee Salary:"+eachValue[2]);
		}
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
