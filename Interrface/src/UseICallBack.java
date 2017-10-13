
public class UseICallBack implements ICallBack   
{


	public int callBack(int v) 
	{
		System.out.println("Overriden Method from Interface");
		return v*v;
	}
	
	public static void main(String arg[])
	{
		UseICallBack useICallBack=new UseICallBack();
		
		System.out.println(useICallBack.callBack(100));
	}

}
