package TaskNo14;

import java.util.HashMap;
import java.util.Scanner;

public class Volvo {
	private static int v1=13;
	private static int v2=15;
	private static int v3=10;
	public static void volvo()
	{
		HashMap<String,Integer>VolvoList=new HashMap<String,Integer>();
		VolvoList.put("Volvo v40",v1);
		VolvoList.put(" Volvo v90",v2);
		VolvoList.put("Volvo xc90",v3);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for:Volvo v40;enter 2 for Volvo v90;enter 3 for Volvo xc90 ");
		int series=sc.nextInt();
		try {
		switch(series)
		{
		case 1:System.out.println("Your choose to buy Volvo v40");
		                       v1=v1-1;
		                       VolvoList.replace("Volvo v40",v1);
		                       System.out.println("count of remaining is :"+VolvoList.get("Volvo v40"));
		                       break;
		                       
		case 2:System.out.println("Your choose to buy Volvo v90");
                               v2=v2-1;
                               VolvoList.replace(" Volvo v90",v2);
                               System.out.println("count of remaining is :"+VolvoList.get(" Volvo v90"));
                               break;
        
		case 3:System.out.println("Your choose to buy Volvo xc90");
                              v3=v3-1;
                              VolvoList.replace("Volvo xc90",v3);
                              System.out.println("count of remaining is :"+VolvoList.get("Volvo xc90"));
                              break;
		default:System.out.println("this model is not available");
        
		}
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
	

}
}

