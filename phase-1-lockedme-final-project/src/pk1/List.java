package pk1;

import java.io.File;

public class List {
	public static void listFiles() {
				
		File folder = new File("src/pk1/locked-files");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println(listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		}	
		 Welcome.welcomeOptions();
	}
}
