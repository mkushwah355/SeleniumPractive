package selenium_Read_JDBC_ExternalFiles;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 class excelRead {

	public static void main(String[] args) throws Exception {
		
		File excelFile= new File("./src/test/resources/Book1_TestData.xlsx"); //System.out.println(excelFile.exists());
		FileInputStream fis= new  FileInputStream(excelFile);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("testdata");		//System.out.println(sheet.getPhysicalNumberOfRows());//System.out.println(sheet.getLastRowNum());
		
		int noOfRow= sheet.getPhysicalNumberOfRows();
		int noOfCol= sheet.getRow(0).getLastCellNum();
		
		for (int i = 1; i < noOfRow; i++) {
			for (int j = 0; j < noOfCol; j++) {
				
				DataFormatter df= new DataFormatter();
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));			
			}
		}
		
		workbook.close();
		fis.close();		

	}

}
