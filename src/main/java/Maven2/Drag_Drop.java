package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("https://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor j = (JavascriptExecutor)dr;
		j.executeScript("window.scrollBy(0,350)", ""); // it is used to scroll window
		dr.switchTo().frame(0);
		Actions act = new Actions(dr);
		act.dragAndDrop(dr.findElement(By.xpath("//div[@id='draggable']")),dr.findElement(By.xpath("//div[@id='droppable']"))).perform();
		
		//WebElement w1 = dr.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement w2 = dr.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(1000);
		//act.clickAndHold(w1).release(w2).perform();
		Thread.sleep(1000);
		dr.close();
		
		
		//u can use either drag and drop or create webelements and use clickandHold method
		
	}

}
