package pk1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	public static void deleteFiles() {
			System.out.println("Please enter the full file name you would like to delete."); 
			Scanner enterFile = new Scanner(System.in);
			String name = enterFile.nextLine();
					
            File deleteFile = new File("src/pk1/locked-files/" + name);
            if(deleteFile.delete())
                System.out.println(name + " deleted");
            else
                System.out.println("File could not be deleted because the file doesn't exist.");
            
            Welcome.welcomeOptions();
	}
	
	
}
