import java.util.Scanner;

public class PRIMENO {

	public static void main(String[] args) 
			{
				int a,b=0,c;
				
				System.out.println("Enter the Value:");
				Scanner scanner=new Scanner(System.in);
				a=scanner.nextInt();
				
				for(c=2;c<=a/2;c++)
				{
					if(a%c==0)
					{
						b=1;
						break;
					}
				}
				
				if(b==0)
						System.out.println("Prime Number");
				else
						System.out.println("Not a Prime");
			}
		

}
