package implicit;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Casting Example");
		int x=500;
		System.out.println("integer = "+x);
		double d=x; 
		System.out.println("double = "+d);
				
		long l=x; 
		System.out.println("long = "+l);
				
		float f=l; 
		System.out.println("float = "+f);
		f=499.77777f;
		d=f; 
		System.out.println("decimal = "+d);
		
		char c='Z';
		System.out.println("c = "+c);
	}

}
