package staticvariable;

public class Static 
{
	static int var1;
	int var2; //instance variable
	
	public StaticVariable()
	{
		var1++;
		var2++;
	}
	
	public static void main(String arg[])
	{
		StaticVariableDemo obj1=new staticvariable();
		StaticVariableDemo obj2=new StaticVariable();
		StaticVariableDemo obj3=new StaticVariable();
		
		System.out.println("Variable 1:"+obj3.var1);
		System.out.println("Variable 2:"+obj3.var2);
		
	}
}













