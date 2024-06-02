package Maven2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		/*dr.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(1000);
		dr.findElement(By.tagName("select")).click();
		Select s= new Select(dr.findElement(By.tagName("select")));
		Thread.sleep(1000);
		s.selectByValue("AGO"); //error  Cannot locate option with value: India
		Thread.sleep(1000);
		//dr.close();*/
		
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement year = dr.findElement(By.xpath("//select[@id='year']"));
		year.click();
		Select s = new Select(year);
		
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("2021");
		Thread.sleep(1000);
		s.selectByVisibleText("2023");
		Thread.sleep(1000);
		//s.deselectByIndex(2);
		Thread.sleep(1000);
		//s.deselectByValue("2021");
		Thread.sleep(1000);
		s.deselectByVisibleText("2023");
		Thread.sleep(1000);
		
	}

}
