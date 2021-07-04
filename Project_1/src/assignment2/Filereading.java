package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereading {
public static void main(String[] args) throws Exception {
	File file = new File("../Project_1/src/assignment2/samplefile.txt");
	FileReader read = new FileReader (file);
	BufferedReader buffer = new BufferedReader(read);
	String line;
	while((line = buffer.readLine()) != null) {
		
		System.out.println(line);
	}
	
}
}
