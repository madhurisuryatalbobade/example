package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		Actions act = new Actions(dr);
		act.contextClick(dr.findElement(By.xpath("//span[text()='right click me']"))).perform();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(1000);
		dr.switchTo().alert().accept();
		dr.close();
	}

}
