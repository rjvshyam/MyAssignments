package week5.day2;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
//step4
//retain static keyword will have common reference/data
public static String[][] excelData() throws IOException {
	
XSSFWorkbook wb = new XSSFWorkbook("./dataSheet/Sel_Create.xlsx");

XSSFSheet sheet = wb.getSheetAt(0);//(or)XSSFSheet sheet = wb.getSheet("Sheet1");

int rowCount = sheet.getLastRowNum();//int physicalRowsCount = sheet.getPhysicalNumberOfRows();

short cellCount = sheet.getRow(1).getLastCellNum();

String stringCellValue = sheet.getRow(1).getCell(3).getStringCellValue();
//step1
String [][] data=new String[rowCount][cellCount];
for (int i = 1; i <= rowCount; i++) {
for (int j = 0; j < cellCount; j++) {
	String dataval = sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println(dataval);
//step2
data[i-1][j]=dataval;
}
}
wb.close();
//step3
return data;
}
}