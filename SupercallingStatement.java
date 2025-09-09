package javaConcepts;

class Vehical{
	
	Vehical()
	{
		System.out.println("bike");
	}
	
	Vehical(int a)
	{
		System.out.println("motor");
	}
}

class Dist extends Vehical{
	
	Dist()
	{
		super(3);
		System.out.println("dhule");
	}
	
	Dist(char d)
	{
		System.out.println("nagar");
	}
}

public class SupercallingStatement {
	
	public static void main(String[] args) {
	
       Dist d= new Dist();
       Dist d1=new Dist('d');
       
	
    
       
	}
}
