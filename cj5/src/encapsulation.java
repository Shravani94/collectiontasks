 import java.util.Scanner;
class encapsulation {
	private long mobileno;
	public void sendotp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mobile number");
		this.mobileno=sc.nextLong();
		int count=0;
		while(mobileno>0)
		{
			count++;
			mobileno=mobileno/10;
		}
		if(count==10)
		{
			System.out.println("otp sent");
		}
		else
		{
			System.out.println("enter valid mobileno");
		}
		
	}
	public static void main(String[] args)
	{
	encapsulation e1=new encapsulation();
	e1.sendotp();
	}

}
