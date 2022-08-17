package TaskNo14;
import java.util.Scanner;

import java.util.HashMap;
public class Renault {
	private static int tu=10;
	
	private static int si=11;
	public static void renault()
	{
		HashMap<String,Integer>renaultList=new HashMap<String,Integer>();
		renaultList.put("renault turingo",tu);
		
		renaultList.put("renault secnic",si);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for:renault turigo;enter 2 for renault secnic;enter 3 ");
		int series=sc.nextInt();
		try {
			
		switch(series)
		{
		case 1:System.out.println("Your choose to buy renault turingo");
		                       tu=tu-1;
		                       renaultList.replace("renault turingo",tu);
		                       System.out.println("count of remaining is :"+renaultList.get("renault turingo"));
		                       break;
		                       
		
		case 2:System.out.println("Your choose to buy  renault turingo");
                              si=si-1;
                              renaultList.replace("renault secnic",si);
                              System.out.println("count of remaining is :"+renaultList.get("renault turingo"));
                              break;
		default:System.out.println(" this model is not available");
        
		}
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
	

}
}
