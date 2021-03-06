package options;

import java.util.Scanner;

import pk1.AddFile;
import pk1.DeleteFile;
import pk1.SearchFile;

public class FileUpdateOptions extends Welcome  {
	
	public static void fileUpdateOptions() {
		
		Scanner enterNum = new Scanner(System.in); //creates object of the class
		 
		System.out.println("********* \n \n 1. Add a File \n 2. Delete a File \n 3. Search for a File"); //prompts the user for input
		 
		int i1 = enterNum.nextInt(); //allows user to read the option (https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
		
        switch (i1) { //switch statement to call feature
                     	
        case 1:
        	//call add a file
        	AddFile.addFiles();
        	break;
        	
        case 2:
        	//call delete a file
        	DeleteFile.deleteFiles();
        	break;
        	
        case 3:
        	//call search for a file
        	SearchFile.searchFiles();
        	break;
        
	 	default:
	        System.out.println("You did not enter a valid option. Please select an option.");
	        welcomeOptions();
	        return;
        }
       
	}
}

