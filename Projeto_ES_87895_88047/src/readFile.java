
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readFile  {

	File file;
	XSSFWorkbook workbook;
	FileInputStream filei;
	XSSFSheet sheet;
	
	
	public static void main(String[] args) {
		
	}
	
	public readFile (File file) throws IOException {
		this.file = file;
		
		this.filei = new FileInputStream(file);
		
		this.workbook = new XSSFWorkbook(filei);
		
		this.sheet = workbook.getSheetAt(0);
		
	}
	
	public void closeWorkBook() throws IOException {
		workbook.close();
	}

	public File getFile() {
		return file;
	}

	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	public FileInputStream getFilei() {
		return filei;
	}

	public XSSFSheet getSheet() {
		return sheet;
	}
	
	public String getCell(int x, int y) {
		return this.sheet.getRow(x).getCell(y).toString();
	}
	
	public int getCellInt(int x, int y) {
		return (int)(this.sheet.getRow(x).getCell(y).getNumericCellValue());
	}
}
