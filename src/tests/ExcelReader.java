package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow red; 
	XSSFCell celija;
	
	public ExcelReader(File file) throws IOException {
		this.file = file;
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
	}
	
	public String returnStringDataFromExcel(String sheetName, int row, int column) {
		sheet = wb.getSheet(sheetName);
		red = sheet.getRow(row -1);
		celija = red.getCell(column - 1);
		
		return celija.getStringCellValue();
	}
	
	public double returnDoubleDataFromExcel(String sheetName, int row, int column) {
		sheet = wb.getSheet(sheetName);
		red = sheet.getRow(row -1);
		celija = red.getCell(column - 1);
		
		return celija.getNumericCellValue();
	}
	
	
	

}