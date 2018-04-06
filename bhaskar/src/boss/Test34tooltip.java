package boss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34tooltip {

	public static void main(String[] args)
	{
		// program for finding tooltip
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.flipkart.com");
		String x=dr.findElement(By.name("q")).getAttribute("title");
		System.out.println(x);
		List<WebElement> l=dr.findElements(By.xpath("//*"));
		System.out.println(l.size());
		int c=0;
		for(int i=0;i<l.size();i++)
		{
			try
			{
			  if(l.get(i).getAttribute("title")!=null)
			    {
				   c = c+1;
			    }
					
			 }
			catch(Exception ex)
			{
				continue;
			}
		}
		System.out.println(c);

	}

}
