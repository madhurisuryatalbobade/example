package Maven2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		dr.switchTo().alert().accept();  //simple alert
		dr.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(1000);
		dr.switchTo().alert().dismiss(); //confirm alert
		dr.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert rt = dr.switchTo().alert();// prompt alert
		Thread.sleep(1000);
		rt.sendKeys("user");
		Thread.sleep(1000);
		rt.accept();
		
		
	}

}
