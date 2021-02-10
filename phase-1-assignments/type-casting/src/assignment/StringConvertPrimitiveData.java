package assignment;

public class StringConvertPrimitiveData {
	
	public static void main(String[] args) {
		
		String s="900";
		
		int x=Integer.parseInt(s);
		System.out.println("integer = "+x);
		
		s="88.79";
		float f=Float.parseFloat(s);
		System.out.println("float = "+f);
		
		s="9";
		byte b=Byte.parseByte(s);
		System.out.println("byte = "+b);
		
		s="99";
		short sh=Short.parseShort(s);
		System.out.println("short = "+sh);
		
		s="990909";
		long l=Long.parseLong(s);
		System.out.println("long = "+l);
		
		s="900";
		double d=Double.parseDouble(s);
		System.out.println("double = "+d);

	}	

}
