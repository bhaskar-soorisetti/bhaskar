package boss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test21
{
	public static void main(String[] args)
	{
		//program for dropdown count and display
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.mercurytravels.co.in/");
		// count of dropdown on page
		List<WebElement> l=dr.findElements(By.tagName("select"));
		System.out.println(l.size());
		// finding count of visible dropdowns
		int count=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				count=count+1;
			}
		}
		System.out.println(count);
		// find how many element in dropdown
		WebElement e=dr.findElement(By.name("nights"));
		Select s=new Select(e);
		System.out.println(s.getOptions().size());
		//print all element in dropdown
		List<WebElement> l1=s.getOptions();
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
		}
		
		dr.close();
	}

}
