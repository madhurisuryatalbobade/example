package Maven2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_data_config {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public excel_data_config(String path)
	{
		try
		{
			File src = new File(path);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public String getdata(int sheetno, int row, int col)
	{
		sheet = wb.getSheetAt(sheetno);
		String s = sheet.getRow(row).getCell(col).getStringCellValue();
		return s;
		
	}

	

}
