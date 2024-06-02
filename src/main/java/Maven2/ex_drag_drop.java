package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_drag_drop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		Actions act = new Actions(dr);
		act.dragAndDrop(dr.findElement(By.xpath("//div[@id='div1']")), dr.findElement(By.xpath("//div[@id='div2']"))).perform();
		Thread.sleep(1000);
		
	}

}
