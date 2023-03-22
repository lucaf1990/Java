package fileCreation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class Main {
	
	
	
	//WRITE
	public static void main(String[] args) {
		
	File f= new File("../test.txt");
	try {
		FileUtils.writeStringToFile(f, "TEST", "UTF-8");
		//FileUtils.writeStringToFile(f, "1234", false); // con false sovrascrive
		FileUtils.writeStringToFile(f, "1234", true); // con true aggiunge
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//READ
	try {
		String s= FileUtils.readFileToString(f, "UTF-8");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//DELETE
	FileUtils.deleteQuietly(f);
	
	//DELETE FOLDER
	//FileUtils.deleteDirectory("/test/");
	
	}
}
