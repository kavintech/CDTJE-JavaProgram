
public class UseCalculator implements Calculator 
	 
	{
	
	public int add(int v1, int v2) 
		{
			return v1+v2;
		}
		public int multiply(int v1, int v2) 
		{
			return v1*v2;
		}
		public void display() 
		{
			System.out.println("Addition Result:"+this.add(10,20));
			System.out.println("Multiplication Result:"+this.multiply(10, 10));
		}
		
		public static void main(String arg[])
		{
			UseCalculator useCalculator=new UseCalculator();
			useCalculator.display();
		}

	
}
