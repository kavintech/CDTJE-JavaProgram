
public class PRIMENUM {

	public static void main(String[] args) {
int var1;
		
		for(var1=2;var1<=100;var1++)
		{
		
		if(isPrime(var1))
			System.out.println("Prime Number:"+var1);
		}
		
	}
	
	public static boolean isPrime(int var1)
	{
		int count;
		boolean flag=true;
		for(count=2;count<=var1/2;count++)
		{
			if(var1%count==0)
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}


	}


