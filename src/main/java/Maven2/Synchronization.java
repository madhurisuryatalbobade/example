package Maven2;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr  = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //Implicite wait
		
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(20));//WebDriverWait of Explicite wait
		
		WebElement wb = dr.findElement(By.xpath("//input[@name='username']"));
		wait.until(ExpectedConditions.visibilityOf(wb));
		
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		
		//WebDriverWait wait1 = new WebDriverWait(dr, Duration.ofSeconds(20)); //WebDriverWait of Explicite wait
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));//WebDriverWait of Explicite wait
		
		FluentWait<WebDriver> w = new FluentWait<>(dr).withTimeout			//FluentWait of Explicite wait
				(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
