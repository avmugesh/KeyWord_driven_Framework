package excelutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	
	public static void setExcelPath() throws IOException{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Ganesh\\workspace\\kwd\\src\\main\\java\\DataEngine\\Data.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("TestSteps");
	}
	
	public static String celldata(int rownum,int cellnum){
	
		String methodname = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		
		return methodname;
	}
	
	
}
