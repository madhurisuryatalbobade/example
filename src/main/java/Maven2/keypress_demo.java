package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class keypress_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		
		dr = new ChromeDriver();
		
		dr.get("https://the-internet.herokuapp.com/key_presses");
		dr.manage().window().maximize();
		
		Thread.sleep(1000);
		//Actions act = new Actions(dr);
		
		//WebElement e = dr.findElement(By.xpath("//input[@id='target']"));
		//act.click(e).sendKeys(Keys.ARROW_RIGHT).perform();    // either use actions class or direclty use dr.findelements
		
		dr.findElement(By.xpath("//input[@id='target']")).click();
		dr.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ARROW_RIGHT); //like this
		
		dr.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ARROW_DOWN);
		
		dr.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ENTER);
		
	}

}
