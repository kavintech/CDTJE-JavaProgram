package palindrome;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
				int var1,reverse=0,temp;
				
				System.out.println("Enter the Value");
				Scanner scanner=new Scanner(System.in);
				var1=scanner.nextInt();
				temp=var1;
				while(var1>0)
				{
					reverse=(reverse*10)+(var1%10);
					var1/=10;
				}
				
				if(reverse==temp)
					System.out.println("Palindrome Number");
				else
					System.out.println("Not a Palindrome");
			}
		

}
