package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		WebElement login = dr.findElement(By.name("login"));
		
		boolean display = login.isDisplayed();
		System.out.println(display);
		System.out.println(login.isDisplayed());
		
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		System.out.println(login.isEnabled());
		
		WebElement new_acc = dr.findElement(By.xpath("//a[text()='Create new account']"));
		new_acc.click();
		
		Thread.sleep(1000);
		
		WebElement gender = dr.findElement(By.xpath("(//input[@type='radio'])[3]"));
		gender.click();
		
		boolean selected = gender.isSelected();
		System.out.println(selected);
		System.out.println(gender.isSelected());
	}

}
