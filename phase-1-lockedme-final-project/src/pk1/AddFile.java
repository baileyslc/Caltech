package pk1;

import java.util.Scanner;

import options.ReturnExitOptions;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class AddFile {
	public static void addFiles() {
		try {
			System.out.println("Please enter the file name."); 
			Scanner enterFile = new Scanner(System.in);
			String name = enterFile.nextLine();
					
            File addFile = new File("src/pk1/locked-files/" + name);
            if(addFile.createNewFile())
                System.out.println(name + "created");
            else
                System.out.println("File not created. Duplicate file with that name.");
        }
        catch(IOException io) {
            io.printStackTrace();
        }
	
		ReturnExitOptions.returnExitOptions();
	
}
	 
}
