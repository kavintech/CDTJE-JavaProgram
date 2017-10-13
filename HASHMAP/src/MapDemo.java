
	public class MapDemo 
	{
		public static void main(String arg[])
		{
			HashMap<Integer,Employe> hashMap=new HashMap<Integer,Employe>();
			
			hashMap.put(1001,new Employee(1001,"Suresh",28000));
			hashMap.put(1002, new Employee(1002,"Vinod",23000));
			hashMap.put(1003, new Employee(1003,"Kiran",11000));
			
			//Retrieve all the keys
			
			Set<Integer> allKeys=hashMap.keySet();
			
			for(Integer empId:allKeys)
			{
				System.out.println(hashMap.get(empId));
			}
			
			
		}
}
