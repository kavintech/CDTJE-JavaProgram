package array;

import java.util.Scanner;

public class Singledimension 
{
	int n,i;
	int productid[]=new int[10];
	Scanner g=new Scanner(System.in);
	void f1()
	{
		System.out.println("enter the value:\n");
		n=g.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter the array value:\n");
			productid[i]=g.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("result is:\n");
		}
		}
}
	
class Demo

{
	public void main(String[] args) 
	{
		Singledimension h=new Singledimension();
		h.f1();
	}
		

	
}



