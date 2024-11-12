package seleniumJavaConcepts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class textFileRead_characterByCharater {
	
	
	public static void main (String[]arg) throws IOException {
		
		FileReader textFile= new FileReader("./src/test/resources/testData_textFileRead.txt");
		
		int character;
		
		while((character=textFile.read()) !=-1 ) {
			System.out.print((char)character);
		}
		textFile.close();
	}

}
