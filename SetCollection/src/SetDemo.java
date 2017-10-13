import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo 
	{
		public static void main(String arg[])
		{
			HashSet hashSet=new HashSet();
			
			hashSet.add("kavin");
			hashSet.add("aslam");
			hashSet.add("sasi");
			hashSet.add("Kumar");
			hashSet.add("azar");
			
			System.out.println("Hashset Elements:"+hashSet);
			
			LinkedHashSet linkedSet=new LinkedHashSet();
			
			linkedSet.add("kavin");
			linkedSet.add("aslam");
			linkedSet.add("sasi");
			linkedSet.add("Kumar");
			linkedSet.add("azar");
			
			System.out.println("LinkedHashset Elements:"+linkedSet);
			
			TreeSet treeSet=new TreeSet();
			
			treeSet.add("kavin");
			treeSet.add("aslam");
			treeSet.add("sasi");
			treeSet.add("Kumar");
			
			System.out.println("Treeset Elements:"+treeSet);		
		}
	}
