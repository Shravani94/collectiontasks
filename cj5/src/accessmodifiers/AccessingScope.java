package accessmodifiers;

public class AccessingScope {
	public static void main(String[] args)
	{
	publicaccess pc1=new publicaccess();
	pc1.add();
	//pc1.sub();
	//we can not access private method in any another class
	pc1.mul();
	pc1.div();
	}
	
	

}
