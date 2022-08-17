package taskNo19;

import java.util.Scanner;

public class ArrayOfInteger {
	int size=10;
	
	
	public void arrayCreationWithInteger()
	{
		
		int size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		 size=sc.nextInt();
		 int array []=new int[size];
		 int array1 []=new int[size];
		 
		
		 for(int i=0;i<size;i++)
		{
			System.out.println("enter the Array index"+i);
			array[i]=sc.nextInt();
			
		}
		System.out.println("array is created");
		System.out.println("After removing dupliacte elements");
		 for (int i = 0; i < array.length; i++) {     
	            for (int j = i+1; j < array.length; j++) {     
	               if(array[i] < array[j]) {    
	                  int  tem = array[i];    
	                   array[i] = array[j];    
	                   array[j] = tem;    
	               }     
	            }     
	        }    
	/*	for(int j=0;j<array.length;j++ )
		{
			int count=0;
			for(int k=0;k<array.length;k++)
			{
				if(array[j]==array[k])
				{
					count++;
				}
			}
			if(count<2)
			{
				 array1[j]=  array[j];
				System.out.println(array1[j]);
			}
			
			
		}*/  
		  
		    int i, j = 0;   
		    for (i = 0; i <size - 1; i++)  
		    {   
		        if (array [i] != array[i + 1])  
		            array1[j++] = array[i];  
		    }  
		    array1[j++] = array[ size - 1];  
		  
		    for (i = 0; i < j; i++)  
		    {  
		        array[i] = array1[i]; 
		        System.out.println(array[i]);
		        }     
		          
   
}
}
