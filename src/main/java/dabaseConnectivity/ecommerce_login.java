package dabaseConnectivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ecommerce_login extends CoonectMySQL{
	@BeforeTest
	public void setup()
	{
		WebDriver dr;
		dr = new ChromeDriver();
		
	}

	public void login()
	{
		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("https://awesomeqa.com/ui/index.php?route=account/login");
		
		while(testdb.rs.next())
		{
			//String f_name = rs.getString("f_name");
			//String l_name = rs.getString("l_name");
			String username = rs.getString("user_name");
			String password = rs.getString("password");
			
			//System.out.println(f_name+"\t"+l_name+"\t"+username+"\t"+password);
		
		
		
		WebElement email = dr.findElement(By.id("input-email"));
		email.sendKeys(username);
		
		WebElement pass = dr.findElement(By.id("input-password"));
		pass.sendKeys(password);
		
		WebElement log =dr.findElement(By.xpath("//input[@type='submit']"));
		log.click();
		
		}
	}

}
