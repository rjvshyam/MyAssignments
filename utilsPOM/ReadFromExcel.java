package utilsPOM;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	
public static String [][] excelDataPOM(String filedata) throws IOException{
	XSSFWorkbook wbPOM = new XSSFWorkbook("./dataSheets/"+filedata+".xlsx");
	XSSFSheet sheetPOM =  wbPOM.getSheetAt(0);
	int lastRowNum = sheetPOM.getLastRowNum();
	short lastCellNum = sheetPOM.getRow(1).getLastCellNum();
	String [][] array = new String[lastRowNum][lastCellNum];
	for (int i=1; i<=lastRowNum; i++) {
		for (int j=0; j<lastCellNum; j++) {
			String stringCellValue = sheetPOM.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
	array[i-1][j]=stringCellValue;
		}
	}
	wbPOM.close();
	return array;
	
	
	
}
}
