package javaConcepts;

//This calling statement is used for constructor chaining.
class Testing{
	
	Testing()
	{
		System.out.println("Constructor 1");
	}
	
	Testing(int a)
	{
		this();
		System.out.println("Constructor 2");
	}
	Testing(char b)
	{
		this(3);
		System.out.println("Constructor 3");
	}
	Testing(float c)
	{
		this('f');
		System.out.println("Constructor 4");
	}
}
public class ThisCallingStatement {

	public static void main(String[] args) {
		
		Testing c=new Testing(0.04f);
		
	
	}
}
