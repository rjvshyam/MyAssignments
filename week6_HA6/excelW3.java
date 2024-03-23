package week6_HA6;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelW3 {
	
public static String [][] dataW3() throws IOException {
XSSFWorkbook wbW3 = new XSSFWorkbook("./dataSheets/w3school.xlsx");
XSSFSheet sheetW3 = wbW3.getSheetAt(0);
int rowcountW3 = sheetW3.getLastRowNum();
short cellcountW3 = sheetW3.getRow(1).getLastCellNum();
String [][] arrayW3 = new String[rowcountW3][cellcountW3];
for (int i=1; i<=rowcountW3; i++) {
	for (int j=0; j<cellcountW3; j++) {
		String loopdataW3 = sheetW3.getRow(i).getCell(j).getStringCellValue();
		System.out.println(loopdataW3);
arrayW3[i-1][j]=loopdataW3;
	}
}
wbW3.close();	
return arrayW3;

}
}