package Maven2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@name='password']")).click();
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		dr.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
	}
}