package Maven2;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo2 {
	WebDriver dr;
  @Test
  public void f() {
	  dr = new ChromeDriver();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		SoftAssert soft = new SoftAssert();
		
		String expectedtitle="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index1";
		//String actualtitle=dr.getTitle();
		soft.assertEquals(dr.getCurrentUrl(),expectedtitle,"URL mismatch");
		
		System.out.println("Login Success!!!");
		soft.assertAll();
  }
}
