package Maven2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_data_access_5_record {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("./data/orangehrm.xlsx");
		FileInputStream fs = new FileInputStream(f);
		
		XSSFWorkbook b = new XSSFWorkbook(fs);
		XSSFSheet s = b.getSheetAt(0);
		int i,j;
		String data, data1;
		
		for(i=0;i<5;i++)
		{
			String dat="", data11="";
			dat = s.getRow(i).getCell(0).getStringCellValue();
			data11 = s.getRow(i).getCell(1).getStringCellValue();
				
			System.out.println("username="+dat+"\t"+"password="+data11);
		}
	}

}
