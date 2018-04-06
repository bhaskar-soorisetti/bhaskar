package boss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Javahashmap {

		public static void main(String[] args) throws Exception
		{
		 // testing hashmap
			HashMap<String,String> uid=new HashMap<String,String>();
			HashMap<String,String> pwd=new HashMap<String,String>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter limit for HashMap");
			int l=sc.nextInt();
			System.out.println("enter your test data");
			for(int i=0;i<l;i++)
			{
				System.out.println("enter mobile No and criteria");
				Thread.sleep(2000);
				uid.put(sc.nextLine(),sc.nextLine());
				System.out.println("enter password and criteria");
				pwd.put(sc.nextLine(),sc.nextLine());
			}
			//print data
			Iterator<Entry<String,String>> i=pwd.entrySet().iterator();
			for(Entry<String,String> e1:uid.entrySet())
			{
				Entry<String,String> e2=i.next();
				System.out.println(e1.getKey());
				System.out.println(e1.getValue());
				System.out.println(e2.getKey());
				System.out.println(e2.getValue());
			}
	}

}
