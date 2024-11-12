package seleniumJavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead_2DArray {

	public static void main(String[] args) throws Exception {

		File excelFile = new File("./src/test/resources/Book1_TestData.xlsx"); //System.out.println(excelFile.exists());
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); //System.out.println(sheet.getPhysicalNumberOfRows());//System.out.println(sheet.getLastRowNum());

		int noOfRow = sheet.getPhysicalNumberOfRows();
		int noOfCol = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRow][noOfCol];
		for (int i = 0; i < noOfRow; i++) {
			for (int j = 0; j < noOfCol; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));

			}
			workbook.close();
			fis.close();
			for (String[] datarr : data) {
				System.out.println(Arrays.toString(datarr));
			}

		}

		
	}
}
