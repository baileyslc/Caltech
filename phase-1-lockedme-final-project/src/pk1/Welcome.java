package pk1;

import java.util.Scanner;

public class Welcome {
	
	public static void welcomeOptions() {
				
		Scanner enterNum = new Scanner(System.in); //creates object of the class
		 
		System.out.println("********* \n \n How can I help you today? \n Please type the number and hit enter of the action you would like to take. \n 1. View the list of files \n 2. Add a file \n 3. Delete a file \n 4. Search for a file \n 5. I'm done. Exit LockedMe."); //prompts the user for input
		 
		int i1 = enterNum.nextInt(); //allows user to read the option (https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
		
        switch (i1) { //switch statement to call feature
        
        case 1:
        	//call view list of files
        	List case1 = new List();		
    		List.listFiles();
        	break;
        	
        case 2:
        	//call add a file
        	AddFile case2 = new AddFile();
        	AddFile.addFiles();
        	break;
        	
        case 3:
        	//call delete a file
        	DeleteFile case3 = new DeleteFile();
        	DeleteFile.deleteFiles();
        	break;
        	
        case 4:
        	//call search for a file
        	SearchFile case4 = new SearchFile();
        	SearchFile.searchFiles();
        	break;
        	
        case 5:
        	
            System.out.println("Exited LockedMe. Have a great day!"); 
            System.exit(0); // Terminate
        	
        	break;
        	
        case 6:
        	//call return to Welcome Screen
        	break;

	 	default:
	        System.out.println("You did not enter a valid option. Please select an option.");
	        welcomeOptions();
	        return;
        }
       
	}

}
