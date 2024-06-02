package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator_methods {
	
	WebDriver dr= new ChromeDriver();

	public void addition() throws InterruptedException
	{
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
		dr.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("calculator");
		dr.findElement(By.xpath("//input[@class='gNO89b']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//div[text()='9']")).click();
		dr.findElement(By.xpath("//div[text()='+']")).click();
		dr.findElement(By.xpath("//div[text()='6']")).click();
		dr.findElement(By.xpath("//div[text()='=']")).click();
		Thread.sleep(1000);
	}
	
	public void sub() throws InterruptedException
	{
		dr.findElement(By.xpath("//div[text()='AC']")).click();
		dr.findElement(By.xpath("//div[text()='9']")).click();
		dr.findElement(By.xpath("//div[text()='−']")).click();
		dr.findElement(By.xpath("//div[text()='6']")).click();
		dr.findElement(By.xpath("//div[text()='=']")).click();
		Thread.sleep(1000);
	}
	
	public void division()
	{
		dr.findElement(By.xpath("//div[text()='AC']")).click();
		dr.findElement(By.xpath("//div[text()='9']")).click();
		dr.findElement(By.xpath("//div[text()='÷']")).click();
		dr.findElement(By.xpath("//div[text()='3']")).click();
		dr.findElement(By.xpath("//div[text()='=']")).click();
	}
}
