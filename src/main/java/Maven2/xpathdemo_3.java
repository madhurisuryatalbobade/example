package Maven2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		
		dr = new ChromeDriver();
		dr.get("https://www.google.co.in/");
		
		//Thread.sleep(1000);
		//dr.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
		dr.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("madhuri");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		
		
		
		
	}

}
