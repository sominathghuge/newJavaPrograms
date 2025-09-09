package javaConcepts;

class A{
	
	void alpha()
	{
		System.out.println("alpha from superclass");
	}
	void beta()
	{
		System.out.println("beta from superclass");
	}
}
class B{
	
	void alpha()
	{
		System.out.println("alpha from subclass");
	}
	void beta()
	{
		System.out.println("beta from subclass");
	}
}
public class SuperKeyword {
	
	public static void main(String[] args) {
		
		B b=new B();
		b.alpha();
		b.beta();
	
		
	}
}
