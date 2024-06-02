package Maven2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		try {
			TakesScreenshot src = (TakesScreenshot)dr;
			File t = src.getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(t, new File("./images/Screenshot.png")); //to store file use this filehandler or
			
			File dest = new File("./images/Screenshot1.png"); 
			FileUtils.copyFile(t, dest); // use this file utils
			
			
			System.out.println("image capture");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
