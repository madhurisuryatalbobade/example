package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interview_questions_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		
		orange_hrm o = new orange_hrm(); 
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		/*
		 // example to have another way to send data other than send keys is JavascriptExecutor
		 
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("document.getElementByName('username').value='Admin';"); //javascript error: document.getElementByName is not a function
		
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");*/  
		
		o.login();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
		
		Select s = new Select(dr.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")));
		
		s.selectByVisibleText("Indian");
		
		
		
	}

}
