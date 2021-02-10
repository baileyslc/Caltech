package explicit;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		System.out.println("Explicit Casting Example");
		double de=499.77777;
		System.out.println("double = "+de);
		int i=(int)de;
		System.out.println("integer = "+i);
		float fe=99.66f;
		System.out.println("float = "+fe);
		long le=(long)fe;
		System.out.println("long = "+le);
		
		char c='L';
		int ci=c;
		ci=77;
		c=(char) ci;
		System.out.println("char = "+c);
		System.out.println("char decimal = "+ci);
	}
}
