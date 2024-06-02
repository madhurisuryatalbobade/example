package Maven2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver dr;
		 dr = new ChromeDriver();

		 dr.get("https://www.makemytrip.com/");
		 
		 dr.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		 dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 dr.findElement(By.xpath("//input[@data-cy='fromCity']")).click();
		 dr.findElement(By.xpath("//p[text()='Pune, India']")).click();
		 
	
		 dr.findElement(By.xpath("//input[@data-cy='toCity']")).click();
		 dr.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*WebElement stop = dr.findElement(By.xpath("//p[text()='Non stop']"));
		 
		  String bodyText = stop.getText();

		 // count occurrences of the string
		 int count = 0;

		 // search for the String within the text
		 while (bodyText.contains("Non stop")){

		     // when match is found, increment the count
		     count++;

		     // continue searching from where you left off
		     bodyText = bodyText.substring(bodyText.indexOf("Non stop") + "Non stop".length());
		 }
		 System.out.println(count);*/
		 
	}

}
