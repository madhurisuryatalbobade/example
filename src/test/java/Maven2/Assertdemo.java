package Maven2;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertdemo {
	WebDriver dr;
  @Test
  public void f() {
	  
	  dr = new ChromeDriver();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String expectedtitle="OrangeHRM_demo";
		String actualtitle=dr.getTitle();
		assertEquals(actualtitle, expectedtitle);
		
		
  }
}
