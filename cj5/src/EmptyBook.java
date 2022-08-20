

// dynamic polymorphism
class EmptyBook {
	public void disply()
	{
		System.out.println("book is empty");
	}

}
class NoteBook extends EmptyBook{
	public void disply()
	{
		System.out.println("book is written");
	}
}
class dynamic
{
	public static void main(String [] args) {
		EmptyBook e1=new NoteBook();
		e1.disply();
		NoteBook n1=new NoteBook();
		n1.disply();
		
	}
}