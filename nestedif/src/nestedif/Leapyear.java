package nestedif;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		int Year;
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		Year=sc.nextInt();
		if(Year%100==0)
		{
			if(Year%400==0)
			
			System.out.println("leap year");
			
		
		else
		
			System.out.println("not leap year");
		}
		else
		{
if(Year%4==0)

	System.out.println("leap year");

else

	System.out.println("not a lerap year");

	
}
}

	


	}


