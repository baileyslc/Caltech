package packOther;

import pack.Main;

public class AccessMainPack {
	
	public static void main(String[] args) {
		
		Main am=new Main();
		//am.x=100; -> private can't access
		am.printX();
		//am.pr=500; -> protected not visible here
		//System.out.println("protected int = "+am.pr);
		//am.z=400; -> default not visible here
		//System.out.println("default int = "+am.z);
		am.k=300;
		System.out.println("public int = "+am.k);
	}
	
}
