package ArrayToArraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCraetion {
	String[] arr= {"aaa","bbb","ccc","ddd","eee"};
	public void firstConversion()
	{
		ArrayCraetion a1=new ArrayCraetion();
		ArrayList<String> list=new ArrayList<String>();
		  for (int i = 0; i < arr.length; i++)
	            list.add((arr[i]));
	        System.out.println(list);
		
	}
	public void secondConversion()
	{
		List<String>list2= Arrays.asList(arr);
		System.out.println(list2);
		
	}
	public void thirdConversion()
	{
		 List<String> list1 = new ArrayList<String>();
	        Collections.addAll(list1, arr);
	      System.out.println(list1);
		
	}
	
}
