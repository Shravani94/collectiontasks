package TaskNo14;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] ags)
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("enter which model you want");
		System.out.println("enter 1 for Renault;enter 2 for mini;enter 3 for volvo");
		int model=sc.nextInt();
		
		try {
		switch(model)
		{
		case 1:System.out.println(" Your choosing renault");
		               Renault.renault();
		               break;
		case 2:System.out.println(" Your choosing mini");
		       MINI.mini();
		        break;
		case 3:System.out.println(" Your choosing volvo");
		Volvo.volvo();
		break;
		default:System.out.println("this model is not avialble please choose from available models");

		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	}

}
