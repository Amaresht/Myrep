package Module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
public void writeExel(String filename,String sheetname,String filepath,String[] dataToWrite ) throws IOException{
	Workbook work=null;
	File file=new File(filepath+"\\"+filename);
	FileInputStream input=new FileInputStream(file);
	String fileExtention=filename.substring(filename.indexOf("."));
	
	if(fileExtention.equals(".xlsx")){
		work=new XSSFWorkbook(input);
		
	}else if(fileExtention.equals(".xls")){
		work=new HSSFWorkbook(input);
	}
	Sheet sheet=work.getSheet(sheetname);
	int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	Row row=sheet.createRow(rowcount);
	Row newRow=sheet.createRow(rowcount+1);
	for(int i=0;i<row.getLastCellNum();i++){
		for(int j=0;j<row.getLastCellNum();j++){
			Cell cell=newRow.createCell(i);
			cell.setCellValue(dataToWrite[j]);
			
		}
	}
	input.close();
	FileOutputStream out= new FileOutputStream(file);
	work.write(out);
	out.close();
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String valueToWrite[]={"Zurich","dhgdhd"};
WriteData we =new WriteData();
String filepath="C:\\Users\\Deccansoft6\\Desktop";
we.writeExel("TestCase.xlsx", "Sheet1", filepath, valueToWrite);
}


}

