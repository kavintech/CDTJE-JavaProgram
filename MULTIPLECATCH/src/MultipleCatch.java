import java.util.Scanner;

public class MultipleCatch 
	{
		public static void main(String arg[])
		{
			int arr[]= {2,3,0},var1=60,result,index;
					
			try
			{
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the Index Value:");
				index=scanner.nextInt();
				
				result=var1/arr[index];
				System.out.println("Result:"+result);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException Occured:"+ae);
			}
			catch(ArrayIndexOutOfBoundsException ae1)
			{
				System.out.println("ArrayIndexOutOfBounds "+ae1);
			}
			catch(Exception exce) 
			{
				System.out.println("Exception Arised:"+exce);
			}
			
			System.out.println("After the Program");
			
		}
	}


