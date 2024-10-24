





//this code is not working. Need to do more research on this.


/*package seleniumConcepts;

import java.io.BufferedReader;
import java.io.FileReader;

public class textReadFile_Compare2TextFile {
	
		public static void main(String[]arg) throws Exception{
			
			FileReader File1Path= new FileReader("./src/test/resources/testData1_textFileRead.txt");
			BufferedReader File1= new BufferedReader(File1Path);
			FileReader File2Path= new FileReader("./src/test/resources/testData2_textFileCompare.txt");
			BufferedReader File2= new BufferedReader(File2Path);
			
			
			String File1Content;
			String File2Content;
			
			int lineNum=1;
			boolean areEqual= true;
			
			while((File1Content=File1.readLine()) !=null && (File2Content=File2.readLine()) !=null) {
				
				
				if(!File1Content.equals(File2Content)) {
					areEqual=false;
					System.out.println("Files are NOT matching");
					
				}
				lineNum++;
				if(areEqual) {
					System.out.println("Files are matching");
				}
				
				break;
				
			}
			File1Path.close();
			File2Path.close();
		}

}
*/