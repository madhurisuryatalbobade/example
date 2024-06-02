package Maven2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class mutliple_images {


		public static void capture(WebDriver dr, String filename) 
		{
			TakesScreenshot src = (TakesScreenshot)dr;
			File t = src.getScreenshotAs(OutputType.FILE);
			
			try 
			{
				FileHandler.copy(t, new File("./images/"+filename+""));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("image capture");
			
		}	
	

}
