package Maven2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr;
		dr= new ChromeDriver();
		
		dr.get("https://qavbox.github.io/demo/webtable/");
		dr.manage().window().maximize();
		WebElement main = dr.findElement(By.xpath("//table[@id='table02']"));
		
		List<WebElement>tr = main.findElements(By.tagName("tr"));
		System.out.println(tr.size());
		for(int i=0; i<tr.size();i++)
		{
			WebElement row = tr.get(i);
			System.out.println();
			List<WebElement>th = row.findElements(By.tagName("th"));
			for(int j=0; j<th.size();j++)
			{
				WebElement head = th.get(j);
				String text = head.getText();
				System.out.printf(text," \t");
				
			}
			List<WebElement>td = row.findElements(By.tagName("td"));
			for(int j=0; j<td.size();j++)
			{
				
				WebElement data = td.get(j);
				String text = data.getText();
				System.out.printf(text," \t");
			}
		}
			
}
}

