package javaConcepts;

public class MathClass {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		System.out.println(Math.addExact(a, b));
		System.out.println(Math.subtractExact(a, b));
		System.out.println(Math.multiplyExact(a, b));
		
		long c=2;
		long d=4;
		System.out.println(Math.addExact(c, d));
		System.out.println(Math.multiplyExact(c,d));
		
		int e=-34;
	
		System.out.println(Math.abs(e));
		System.out.println(Math.max(a,b));
		System.out.println(Math.min(a, b));
	
	
	
	}
}
