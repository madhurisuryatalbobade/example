package Maven2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






public class parameter_demo {
	WebDriver dr;
	@Test
    @Parameters({"a","b"})
  
  public void f(String a, String b) {
	  
	  dr = new ChromeDriver();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys(a);
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys(b);
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		dr.close();
  }
}
