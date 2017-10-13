
public class This 
	{
		int var1;
		
		public This(int var1)
		{
			this.var1=var1;
		}
		
		public void display()
		{
			System.out.println("var1:"+var1); 
		}
		
		public static void main(String arg[])
		{
			This obj=new This(100);
			obj.display();
		}
	
}
