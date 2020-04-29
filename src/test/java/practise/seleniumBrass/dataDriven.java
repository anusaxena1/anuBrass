package practise.seleniumBrass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	@SuppressWarnings("deprecation")
	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		
	    FileInputStream fis =new FileInputStream("C:\\Users\\ANU SAXENA\\Documents\\demodata.xlsx"); 	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
			XSSFSheet sheet=workbook.getSheetAt(i);
			Iterator<Row> rows = sheet.iterator();
			Row firstrow = rows.next();
			Iterator<Cell> ce = firstrow.iterator();
			int k=0;
			int column = 0;
			while(ce.hasNext()) {
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
				{
					//desired Column
					column=k;
				}
				
				k++;
			}
			System.out.println(column);
			
			while(rows.hasNext()) {
				Row r=rows.next(); 
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
				{
					Iterator<Cell> cv = r.cellIterator();
					while(cv.hasNext())
					{
						Cell c= cv.next();
						if(c.getCellTypeEnum()==CellType.STRING)
						{
						a.add(c.getStringCellValue());
					     }
						
						else
						{
						a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						
							
						}
						}
					
				}
				
			}
			
			}
		}
		return a;
		
	}

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

}
	}
