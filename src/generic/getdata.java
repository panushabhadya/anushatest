package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getdata {
	static String value;
	public static String getdata(String path, String sheet, int row,int col)
	{
		try {
			
		
		FileInputStream f=new FileInputStream(path);
		 Workbook book= WorkbookFactory.create(f);
		 value=book.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		}
		catch(Exception e) {
			
		}
		return value;
		 
		
	}

}
