package org.leaftaps.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.leaftap.wrapper.ProjectSpecificMethod;

public class ReadExcel extends ProjectSpecificMethod{

	public Object[][] readExcel(String fileName) throws IOException{
		XSSFWorkbook createLead = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet1 = createLead.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		XSSFRow row1 = sheet1.getRow(0);
		short colCount = row1.getLastCellNum();
		Object[][] data = new Object[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet1.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
			}
		}
		createLead.close();
		return data;
		
	}
	
}
