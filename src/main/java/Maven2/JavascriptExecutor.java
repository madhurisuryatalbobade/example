package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
		dr = new ChromeDriver();

		dr.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		
		WebElement txt = dr.findElement(By.id("email"));
		((org.openqa.selenium.JavascriptExecutor) js).executeScript("arguments[0].setAttribute('value','madhurisuryatal@gmail.com')",txt);
		
		Object ob = ((org.openqa.selenium.JavascriptExecutor) js).executeScript("return arguments[0].setAttribute('value')",txt);
		String s1 = (String)ob;
		System.out.println(s1);
		
		WebElement pass = dr.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Madhuri@93')",pass);
		
		WebElement login = dr.findElement(By.name("login"));
		((org.openqa.selenium.JavascriptExecutor) js).executeScript("arguments[0].click()",login);
		
		WebElement home = dr.findElement(By.xpath("//a[@aria-label='Home']"));
		js.executeScript("arguments[0].click()",home);
		
		js.executeScript("arguments[0].scrollIntoView(false)",home);
		
		js.executeScript("arguments[0].scrollIntoView(true)",home);
		
	}

}
