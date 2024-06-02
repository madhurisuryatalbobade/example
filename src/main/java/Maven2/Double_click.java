package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("https://demo.guru99.com/test/simple_context_menu.html");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act = new Actions(dr);
		act.doubleClick(dr.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		Thread.sleep(1000);
		
		dr.switchTo().alert().accept();
	}

}
