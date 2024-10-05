package seleniumConcepts;

import java.io.BufferedReader;
import java.io.FileReader;

public class textFileRead_LineByLine {

	public static void main (String[]arg) throws Exception{
		FileReader textFile1= new FileReader("./src/test/resources/testData_textFileRead.txt");
		BufferedReader textFileLine= new BufferedReader(textFile1);
		
		String line;
		
		while((line=textFileLine.readLine()) !=null) {
			
			System.out.println(line);
		}
		
	}}


