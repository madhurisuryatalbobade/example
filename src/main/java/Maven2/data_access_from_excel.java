package Maven2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class data_access_from_excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File f = new File("./data/orangehrm.xlsx");
		FileInputStream fis;
		WebDriver dr;
		
		dr = new ChromeDriver();
		
		try
		{
		fis= new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("username="+data+""+"password="+data1);
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys(data);
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys(data1);
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
