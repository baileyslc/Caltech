package options;

import java.util.Scanner;

public class ReturnExitOptions extends Welcome {
	
	public static void returnExitOptions() {
		Scanner enterNum = new Scanner(System.in); //creates object of the class
		System.out.println("********* \n \n 1. Return me to the Welcome Screen. \n 2. I'm done. Exit LockedMe.");
		
int i1 = enterNum.nextInt(); //allows user to read the option (https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
		
        switch (i1) { //switch statement to call feature
                     	
        case 1:
        	//call return to Welcome Screen
       	 	welcomeOptions();
       	 	break;
        	
        case 2:
        	System.out.println("Exited LockedMe. Have a great day!"); 
            System.exit(0); // Terminate
        	break;

	 	default:
	        System.out.println("You did not enter a valid option. Please select an option.");
	        welcomeOptions();
	        return;
        }
       
	}

}
