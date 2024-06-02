package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_multiple_screenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();
		
			
			dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			dr.manage().window().maximize();
			Thread.sleep(1000);
			mutliple_images.capture(dr, "image1.png");
			Thread.sleep(1000);
			dr.findElement(By.xpath("//input[@name='username']")).click();
			dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
					
			dr.findElement(By.xpath("//input[@type='password']")).click();
			dr.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
			
			dr.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			mutliple_images.capture(dr, "image2.png");
	}

}
