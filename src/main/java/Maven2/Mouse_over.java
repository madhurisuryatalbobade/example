package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("https://www.amazon.com/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//a[@id='nav-link-accountList']"))).perform();
		Thread.sleep(1000);
		act.moveToElement(dr.findElement(By.xpath("//a[@id='icp-nav-flyout']"))).perform();
		
		
	}

}
