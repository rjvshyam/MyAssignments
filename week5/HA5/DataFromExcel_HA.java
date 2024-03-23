package week5.HA5;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataFromExcel_HA {
//Step4->change to static
public static String [][] xlData() throws IOException {
XSSFWorkbook wb = new XSSFWorkbook("./dataSheet/Sel_Data.xlsx");
XSSFSheet sheet = wb.getSheet("Sheet1");
int lastRowNum = sheet.getLastRowNum();
short lastCellNum = sheet.getRow(1).getLastCellNum();
String stringCellValue = sheet.getRow(1).getCell(2).getStringCellValue();
System.out.println(stringCellValue);
//Step1
String [][] array = new String[lastRowNum][lastCellNum];
for (int i=1; i<=lastRowNum; i++) {
for (int j=0; j<lastCellNum; j++) {
String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
System.out.println(stringCellValue2);
//Step2
array[i-1][j]=stringCellValue2;
}
}
wb.close();
//Step3
return array;
}
}
