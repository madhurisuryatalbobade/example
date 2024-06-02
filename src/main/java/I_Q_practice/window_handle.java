package I_Q_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Maven2.orange_hrm;

public class window_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr = new ChromeDriver();
		
		orange_hrm o = new orange_hrm(); 
		
		dr.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		String handle = dr.getWindowHandle();
		
	}

}
