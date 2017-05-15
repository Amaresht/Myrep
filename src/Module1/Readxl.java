package Module1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxl {
		
           void readExcel(String filePath, String fileName, String Sheetname) throws IOException{
		   File file = new File(filePath+"\\"+fileName);
		   FileInputStream input = new FileInputStream(file);
		   Workbook work = null;
		   
		   String fileExtension = fileName.substring(fileName.indexOf("."));
		   if(fileExtension.equals(".xlsx")){
		    work = new XSSFWorkbook(input);
		    
		   }
		   else if(fileExtension.equals(".xls")){
		    work = new HSSFWorkbook(input);
		   }
		   
		   Sheet sheet = work.getSheet(Sheetname);
		   int rowcount  = sheet.getLastRowNum()-sheet.getFirstRowNum();
		   for(int i = 0;i<rowcount;i++){
		    Row row = sheet.getRow(i);
		    for(int j=0;j<row.getLastCellNum();j++){
		     System.out.print(row.getCell(j).getStringCellValue()+"||");
		    }
		    System.out.println();
		   }
		 }
		 public static void main(String[] args) throws IOException {
		  Readxl re = new Readxl();
		  String filePath = "C:\\Users\\Deccansoft6\\Desktop";
		  re.readExcel(filePath, "Test.xlsx", "Sheet1");

		 }

	
	}


