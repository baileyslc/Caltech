package packOther;

import pack.Main;

public class AccessMainPackExtendProtected extends Main{
	
	public static void main(String[] args) {
		
		AccessMainPackExtendProtected mp=new AccessMainPackExtendProtected();
		System.out.println("protected int = "+mp.pr);
		//System.out.println("protected int = "+mp.z); - default not visible here

	}

}
