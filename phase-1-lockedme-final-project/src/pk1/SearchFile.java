package pk1;

import java.io.File;
import java.util.Scanner;

import options.ReturnExitOptions;

public class SearchFile {
	public static void searchFiles() {
        
        System.out.println("Please enter the full file name to search."); 
		Scanner enterFile = new Scanner(System.in);
		String name = enterFile.nextLine();
				
		File directory = new File("src/pk1/locked-files/"); 
  
        String[] flist = directory.list(); //Followed tutorial from https://www.geeksforgeeks.org/java-program-to-search-for-a-file-in-a-directory/
        System.out.println(directory);
        int flag = 0; 
        if (flist == null) { 
            System.out.println("Empty directory."); 
            ReturnExitOptions.returnExitOptions();
        } 
        else { 
  
            // Linear search in the array 
            for (int i = 0; i < flist.length; i++) { 
                String filename = flist[i]; 
                if (filename.equalsIgnoreCase(name)) { 
                    System.out.println(filename + " File Found"); 
                    flag = 1; 
                    ReturnExitOptions.returnExitOptions();
                } 
            } 
        } 
  
        if (flag == 0) { 
            System.out.println("File Not Found"); 
            ReturnExitOptions.returnExitOptions();
        } 
        
    } 

}
