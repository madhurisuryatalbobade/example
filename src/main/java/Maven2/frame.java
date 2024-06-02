package Maven2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {
	
	public static void main(String[] args) {
		WebDriver dr;
		dr = new ChromeDriver();
		
		
	//To know the count of frames in webpage	
	dr.get("https://demo.automationtesting.in/Frames.html");
	dr.manage().window().maximize();
	
	dr.navigate().refresh();
	//By finding all the web elements using iframe tag
	List<WebElement> iframeElements = dr.findElements(By.tagName("iframe"));
	System.out.println("Total number of iframes are " + iframeElements.size());  //either use this
	
	JavascriptExecutor jse = (JavascriptExecutor) dr;
	Integer numberOfFrames = Integer.parseInt(jse.executeScript("return window.length").toString());// or this
	System.out.println("Number of iframes on the page are " + numberOfFrames);
	
	
	dr.switchTo().frame(0);
	
	dr.findElement(By.xpath("//input[@type='text']")).click();
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
	//To switch from current frame to immediate parent frame (frame inside frame concept)
	dr.switchTo().parentFrame();
	//To switch the control from any frame to main
	//dr.switchTo().defaultContent();
	

	WebElement ad = dr.findElement(By.xpath("//iframe[@id='aswift_0']"));
	dr.switchTo().frame(ad);
	ad.click();
	
	
	
	}
}
