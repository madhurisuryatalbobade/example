package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_1 {
	
	public static void main(String[] args) {
		
		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://demo.guru99.com/test/newtours/");
		
		WebElement link_home = dr.findElement(By.xpath("//a[text()='Home']"));
		
		//    /html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]
		
		Actions a = new Actions(dr);
		
		Actions mouseover = (Actions) a.moveToElement(link_home).build();
		
		String bgcolor = link_home.getCssValue("background-color");
		
		System.out.println("Before hovor"+bgcolor);
		
		
		
		
		
		
	}

}
