package selenium_Read_JDBC_ExternalFiles;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class excelRead_Feed2DArrToTestCase {
	
	@Test(dataProvider = "driveTest")
	public void test(String username, String password) {
		
		System.out.println(username+" "+ password);
	}	
	
	@DataProvider(name="driveTest")
	public static String[][] getData() throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/Book1_TestData.xlsx");

		XSSFWorkbook path = new XSSFWorkbook(file);
		XSSFSheet sheet = path.getSheet("sheet1");

		int noOfRows = sheet.getPhysicalNumberOfRows();//4
		int noOfColumns = sheet.getRow(0).getLastCellNum();//2		

		String[][] data = new String[noOfRows - 1][noOfColumns];
		
		for (int i = 1; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {

				DataFormatter df = new DataFormatter();
				data[i - 1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		/*for (String[] a : data) {
			System.out.println(Arrays.toString(a));
		}*/
		return data;
	}

	public static void main(String[] arg) throws IOException {
		getData();

	}

}
