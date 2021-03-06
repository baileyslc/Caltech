package options;

import java.util.Scanner;

import pk1.List;

public class Welcome {
	
	public static void welcomeOptions() {
				
		Scanner enterNum = new Scanner(System.in); //creates object of the class
		 
		System.out.println("********* \n \n How can I help you today? \n Please type the number and hit enter of the action you would like to take. \n 1. View the list of files \n 2. Add, Delete, or Search for a File \n 3. I'm done. Exit LockedMe."); //prompts the user for input
		 
		int i1 = enterNum.nextInt(); //allows user to read the option (https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
		
        switch (i1) { //switch statement to call feature
        
        case 1:
        	//call view list of files		
    		List.listFiles();
        	break;
        	
        case 2:
        	//call add a file
        	FileUpdateOptions.fileUpdateOptions();
        	break;
        	
        case 3:
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
