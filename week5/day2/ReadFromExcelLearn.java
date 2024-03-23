package week5.day2;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelLearn {

public static void main(String[] args) throws IOException {
	
//1. set path for workbook
XSSFWorkbook wb = new XSSFWorkbook("./dataSheet/Sel_Data.xlsx");
//2. get into the sheet using index or sheet name
XSSFSheet sheet = wb.getSheetAt(0);//(or)XSSFSheet sheet = wb.getSheet("Sheet1");
//3. get into row value
int rowCount = sheet.getLastRowNum();//int physicalRowsCount = sheet.getPhysicalNumberOfRows();
System.out.println("No. of rows :"+rowCount);//excluding header value
//4. get into cell value
short cellCount = sheet.getRow(1).getLastCellNum();
System.out.println("No. of cells :"+cellCount);
//to get specific value
String stringCellValue = sheet.getRow(1).getCell(3).getStringCellValue();
System.out.println("Cell value :"+stringCellValue);
//5. get all cell values
for (int i = 1; i <= rowCount; i++) {
for (int j = 0; j < cellCount; j++) {
	String data = sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println(data);
}
}
//6. close workbook
wb.close();

}
}
