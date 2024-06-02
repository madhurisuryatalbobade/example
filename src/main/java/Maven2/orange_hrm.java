package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_hrm {
	
	WebDriver dr = new ChromeDriver();
	
	public void login() throws InterruptedException
	{
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	public void dashboard()
	{
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/p")).click();
		
		
	}
	
	public void admin() throws InterruptedException
	{
		Thread.sleep(1000);
		dr.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).click();
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("Dawn  Martin");
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).click();
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("madhuri");

		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).click();//password
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Madhuri@93");
		
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).click(); 
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Madhuri@93"); //confirm pass
		
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).click();
		
		dr.findElement(By.xpath("//div[text()='Admin']")).click();
		
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
		
		dr.findElement(By.xpath("//div[text()='Enabled']")).click();
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	}
	
	public void my_info() throws InterruptedException
	{
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).click();
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("madhu");
		
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']")).click();
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']")).sendKeys("subhu");
		
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).click();
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("madhu");
	
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
		dr.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")).click();
		dr.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("kkkk");
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
		
	}

	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		dr.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(1000);
		
		
		dr.findElement(By.linkText("Logout")).click();
		
	}
}
