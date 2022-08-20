
// abstract class
abstract class mobile {
public static void playmusic()
{
	System.out.println("play music in spotify");
	}
//abstract method
 abstract public void  call();

}
 class calling extends mobile{
	public void call()
	{
		System.out.println("call mother");
	}
	public static void main(String[] args)
	{
		calling c1=new calling();
		c1.call();
		playmusic();
	}
}
	
