package Maven2;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements_ebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		dr.get("https://www.ebay.com/");
		
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		Thread.sleep(1000);
		List<WebElement> l = (List<WebElement>) dr.findElement(By.tagName("a"));
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		System.out.println("Total links="+l.size());
	}

}
