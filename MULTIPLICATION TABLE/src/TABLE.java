import java.util.Scanner;

public class TABLE {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("multiplication table of"+a+" is");
		{
			for(b=1;b<=10;b++)
				System.out.println(a+"*"+b+" = "+(a*b));
				
		

	}

}
}