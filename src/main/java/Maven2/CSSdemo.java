package Maven2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class CSSdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		
		dr.findElement(By.cssSelector("input#email")).click();
		dr.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		dr.findElement(By.cssSelector("input#pass")).click();
		dr.findElement(By.cssSelector("input#pass")).sendKeys("abc");
		dr.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}

}
