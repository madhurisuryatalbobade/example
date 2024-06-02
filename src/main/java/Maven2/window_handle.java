package Maven2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		String parent = dr.getWindowHandle();
		System.out.println();
		
		dr.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//a[text()='  Like us On Facebook ']")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//a[text()='  Follow us On Linkedin ']")).click();
		
		
		Thread.sleep(5000);
		
		Set<String>window = dr.getWindowHandles();
		List<String>l=new ArrayList<String>(window);
		System.out.println(l.size());
		
		//System.out.println(window);
		for(int i=l.size()-1;i>=0;i--)   //	for(int i =0;i<l.size();i++)
		{
			dr.switchTo().window(l.get(i));
			System.out.println(dr.switchTo().window(l.get(i)).getTitle());
			Thread.sleep(5000);
			dr.close();
		}
		
		
		Thread.sleep(1000);
		dr.switchTo().window(parent);
		//dr.close();
		
		
	}
}
