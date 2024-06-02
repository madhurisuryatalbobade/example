package Maven2;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class data_para_test {
	WebDriver dr;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  dr = new ChromeDriver();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys(n);
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys(s);
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		dr.close();
  }	
}
 
