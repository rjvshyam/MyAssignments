package week6.HA6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W3excel {
	
public static String [][] w3excelData() throws IOException{
XSSFWorkbook w3wb=new XSSFWorkbook("./w3dataSheet/w3Data.xlsx");
XSSFSheet w3sheet = w3wb.getSheetAt(0);
int w3rowCount = w3sheet.getLastRowNum();
int w3cellCount = w3sheet.getRow(1).getLastCellNum();
String cellValue = w3sheet.getRow(1).getCell(2).getStringCellValue();
System.out.println("Check cell value is :"+cellValue);
String [][] w3array=new String[w3rowCount][w3cellCount];
for (int i=1; i<=w3rowCount; i++) {
	for (int j=0; j<=w3cellCount; j++) {
String w3loopData = w3sheet.getRow(i).getCell(j).getStringCellValue();
System.out.println(w3loopData);

w3array[i-1][j]=w3loopData;
	}
}
w3wb.close();
	
return w3array;

}

}
