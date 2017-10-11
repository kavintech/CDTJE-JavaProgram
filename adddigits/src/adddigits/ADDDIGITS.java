package adddigits;

import java.util.Scanner;

public class ADDDIGITS {

	public static void main(String[] args) {

			int var1,result=0,reminder;
			
			System.out.println("Enter the Value:");
			Scanner scanner=new Scanner(System.in);
			var1=scanner.nextInt();
			
			while(var1>0)
			{
				reminder=var1%10;
				result=result+reminder;
				var1=var1/10;
			}
			
			System.out.println("Added Digits Result:"+result);
		}
	}


