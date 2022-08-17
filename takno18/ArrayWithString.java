package takno18;
import java.util.Scanner;

import java.util.Arrays;

public class ArrayWithString {
	
		public void arrayCreation()
		{
			 int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array size");
			n=sc.nextInt();
			String array[]=new String[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter string of index : "+i);
				array[i]=sc.next();
			}
			System.out.println("Arrar is created");
			System.out.println("elements of ayyar is");
			System.out.print("[");
			for(int j=0;j<array.length;j++)
			{
				System.out.print(""+array[j]+" ");
			}
			System.out.println("]");
			Arrays.sort(array);
			for(int k=0;k<array.length;k++)
			{
				if(k<n/2)
				{
					System.out.print(array[k].toUpperCase()+" ");
				}
				else
				{
					System.out.print(array[k].toLowerCase()+" ");
				}
			}
		
		}
	
	

}
