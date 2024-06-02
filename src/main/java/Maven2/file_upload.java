package Maven2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();
		//File f = new File("C:\\Users\\hp\\hey.txt");
		
		dr.get("https://html.com/input-type-file/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor j = (JavascriptExecutor)dr;
		j.executeScript("window.scrollBy(0,500)", "");
		
		dr.findElement(By.xpath("//input[@value='fileupload']")).sendKeys("C:\\Users\\hp\\hey.txt");
		//w.click();
		
		System.out.println("ok");
		//System.out.println(f.getAbsolutePath());
		//w.sendKeys(f.getAbsolutePath());
		
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@value='submit']")).click();
		Thread.sleep(1000);
		
		
	}

}
