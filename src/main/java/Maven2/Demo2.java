package Maven2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@id='user-name']")).click();
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		dr.findElement(By.xpath("//input[@id='password']")).click();
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		dr.findElement(By.xpath("//input[@id='login-button']")).click();
		
		dr.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
	
	}

}
