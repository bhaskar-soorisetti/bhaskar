package boss;

import java.util.HashMap;
import java.util.Map.Entry;

public class Samplehashmap {
	public static void main (String[] args)
	{
		//progarm for hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//storing data to hashmap
		hm.put(1,"bhaskar");
		hm.put(2,"Aravind");
		//getting data from hashmap
		for(Entry<Integer,String> m:hm.entrySet())
		{
			System.out.println(m.getValue());
		}
	}

}
