
public class Ifelsedemo {

	public static void main(String[] args) {
		int number[]={50,99,55,4,33};
		int even=0,odd=0;
		for(int i=0;i<number.length;i++)
{
	if((number[i]%2)==0)
	{
		even +=1;
		
}
	else
	{
		odd +=1;
		
	}
		}
System.out.println("even number:"+even+"oddnumbers:"+odd);
	}

}
