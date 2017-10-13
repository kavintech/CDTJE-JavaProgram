
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

			for(Object element:listItems)
			{
				if(element instanceof String)
				{
					String str=(String)element;
					System.out.println(str);
				}
				else if(element instanceof Integer)
				{
					Integer intr=(Integer)element;
					System.out.println(intr);
				}
				else {}
			}
		}
	
}
