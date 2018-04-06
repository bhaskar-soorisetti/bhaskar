package boss;

import java.util.ArrayList;
import java.util.Scanner;

public class Javaarraysample {

	
	public static void main(String[] args) 
	{
		// program for sample array
		//create static array
		int x[]=new int[5];
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 5 numbers:");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("enter dynamic array limit:");
		int l=sc.nextInt();
		System.out.println("enter"+l+" numbers:");
		for(int i=0;i<l;i++)
		{
			a.add(sc.nextInt());
		}
		//sorting for static array
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(x[j]>x[j+1])
				{
				   int temp = x[j];
				   x[j]=x[j+1];
				   x[j+1]=temp;
				}
			}
		}
		//sorting for dynamic array
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(a.get(j)<a.get(j+1))
				{
					int temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1, temp);
					
				}
			}
		}
		//display static array
		System.out.println("sorting order for static array");
		System.out.println();
		for(int i=0;i<5;i++)
		{
			System.out.print(x[i]+"\t");
		}
		//display dynamic array
		System.out.println();
		System.out.println("sorting order for dynamic array");
		System.out.println();
		for(int i=0;i<l;i++)
		{
			System.out.print(a.get(i)+"\t");
		}
	}
		

	}

