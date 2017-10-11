import java.util.Scanner;

public class PRIMENO {

	public static void main(String[] args) 
			{
				int var1,flag=0,count;
				
				System.out.println("Enter the Value:");
				Scanner scanner=new Scanner(System.in);
				var1=scanner.nextInt();
				
				for(count=2;count<=var1/2;count++)
				{
					if(var1%count==0)
					{
						flag=1;
						break;
					}
				}
				
				if(flag==0)
						System.out.println("Prime Number");
				else
						System.out.println("Not a Prime");
			}
		

}
