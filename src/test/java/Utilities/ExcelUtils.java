package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Object[][] Utils(String path,String sheet) throws IOException {
		
		Object [][] data= null;
		
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet(sheet);
		
		int rowc= sh.getLastRowNum();
		int colc= sh.getRow(0).getLastCellNum();
		data =  new Object [rowc][colc];
		
		
		for (int i=1;i<=rowc;i++) {
			Row row= sh.getRow(i);
			for (int j=0;j<colc;j++) {
				data [i-1][j]=row.getCell(j).toString();
				
			}
			
		}
		wb.close();
		
		return data;
		
	}


}
