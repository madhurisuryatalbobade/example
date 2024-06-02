package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_value_methods {
	
	public static void main(String[] args) {
		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		WebElement txthighlight = dr.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("arguments[0].setAttribute('style','background:yellow')", txthighlight);
		
		WebElement login = dr.findElement(By.name("login"));
		
		String color = login.getCssValue("background-color");
		String fontsize = login.getCssValue("font-size");
		String width = login.getCssValue("width");
		String family = login.getCssValue("font-family");
		
		System.out.println(color);
		System.out.println(fontsize);
		System.out.println(width);
		System.out.println(family);
		
	}

}
