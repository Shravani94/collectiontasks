package binding;

final public class finalkeyword {
	final public int a=10;
	//a=20;we can not re initialize
	final public void show()
	{

		System.out.println("final method");
		
	}
	

}
/*class keyword extends finalkeyword
{
	
}*/
//we can not inherit final class 
class finalmethod
{
	final public void move()
	{
		System.out.println("move south");
		
	}
}

class mainclass1 extends finalmethod
{
	/*public void move()
	{
		System.out.println("move north");
	}*/
	//we can not override final method just we can use it
	public static void main(String[] args)
	{
		finalmethod f1=new finalmethod();
		f1.move();
	}
}