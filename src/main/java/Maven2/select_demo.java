package Maven2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class select_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(1000);
		//if only one select then use tagname and if multiple select then use xpath
		Select s = new Select(dr.findElement(By.xpath("//select[@id='course']")));
		Thread.sleep(1000);
		
		s.selectByValue("java");
		Thread.sleep(1000);
		//dr.close();
		
		
		
	}

}
