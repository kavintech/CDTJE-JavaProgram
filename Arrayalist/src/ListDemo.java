
	import java.util.*;
	public class ListDemo 
	{
		public static void main(String arg[])
		{
			ArrayList listItems=new ArrayList();
			listItems.add("kavin");
			listItems.add("aslam");
			listItems.add("sasi");

			listItems.add(100);
			listItems.add(200);

		
			System.out.println("Size of ArrayList:"+listItems.size()); 
			Object element=listItems.get(2);
			String myElement=(String)element;
			System.out.println("Element in 2nd Index:"+myElement);
			System.out.println(listItems);
		}
	}

