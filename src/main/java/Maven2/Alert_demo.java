package Maven2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(1000);
		Alert rt = dr.switchTo().alert();
		rt.accept();
		Thread.sleep(1000);
		dr.close();
		
		
		
	}

}
