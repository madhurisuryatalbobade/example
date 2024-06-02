package Maven2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class assertDemo3 {
	WebDriver dr;
  @Test(description="Login with wrong credentials")
  public void f() {
	  	dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin1");
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(dr.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  dr= new ChromeDriver();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterMethod
  public void afterMethod() {
	  dr.close();
	  
  }

}
