package javaConcepts;

public class Constructor1 {
	
	Constructor1()
	{
		System.out.println("This is Construtor 1");
	}
	
	Constructor1(int a)
	{
		System.out.println("This is Constructor 2");
	}
	Constructor1(String b)
	{
		System.out.println("This Constructor 3");
	}
	
	
	public static void main(String[]args) {
		
//		Constructor1 c1=new Constructor1();
//		Constructor1 c2=new Constructor1(3);
//		Constructor1 c3=new Constructor1("Testing");
		
		//or
		
		new Constructor1();
		new Constructor1(0);
		new Constructor1("test");
	}

}
