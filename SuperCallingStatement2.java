package javaConcepts;

class Alpha{
	
	Alpha(int a)
	{
		System.out.println("alpha 1");
	}
	
	Alpha(char b)
	{
		System.out.println("alpha 2");
	}
	
	Alpha(float c)
	{
		System.out.println("alpha 3");
	}
}

class Beta extends Alpha{
	
	Beta()
	{
		super(3);
		System.out.println("beta 1");
	}
	Beta(String d)
	{
		super(0.4f);
		System.out.println("beta 2");
	}

}
public class SuperCallingStatement2 {
	
	public static void main(String[] args) {
		
		Beta b= new Beta();
		Beta b1=new Beta("test");
		
	}
}
