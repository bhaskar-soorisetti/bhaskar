package boss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("file:///G:/selenium/ex5.html");
		List<WebElement> l=dr.findElements(By.tagName("table"));
		System.out.println(l.size());
		List<WebElement> l1=l.get(1).findElements(By.tagName("tr"));
		System.out.println(l1.size());
		List<WebElement> l2=l1.get(3).findElements(By.tagName("td"));
		System.out.println(l2.size());
		List<WebElement> l3=l2.get(3).findElements(By.tagName("select"));
		System.out.println(l3.size());
		dr.close();
		

	}

}
