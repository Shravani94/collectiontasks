package Arthmetic;
import accessmodifiers.publicaccess;

public class ScopeOfAccessModifiers extends publicaccess {
	public static void main(String[] args)
	{
		publicaccess pc2=new publicaccess();
		pc2.add();
		//pc2.sub();
		//we can not access private in other class of same package as well as in different package
		//pc2.mul();
		//pc2.div();
		//we can not access default members in different package
	}

}
