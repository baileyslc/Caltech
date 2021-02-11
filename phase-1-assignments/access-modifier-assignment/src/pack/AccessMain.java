package pack;

public class AccessMain {
	public static void main(String[] args) {
		
		Main am=new Main();
		//am.x=100; -> private can't access
		am.printX();
		am.pr=500;
		System.out.println("protected int = "+am.pr);
		am.z=400;
		System.out.println("default int = "+am.z);
		am.k=300;
		System.out.println("public int = "+am.k);
		
	}
}
