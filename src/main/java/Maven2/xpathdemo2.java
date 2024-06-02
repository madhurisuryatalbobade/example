package Maven2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dr;
		WebDriverManager.chromedriver().setup();
		
		dr = new ChromeDriver();
		dr.get("https://demo.guru99.com/test/accessing-link.html");
		Thread.sleep(1000);
		
		dr.findElement(By.partialLinkText("go")).click();
		Thread.sleep(1000);
		dr.navigate().back();
		dr.findElement(By.partialLinkText("click")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
	}
	

}
