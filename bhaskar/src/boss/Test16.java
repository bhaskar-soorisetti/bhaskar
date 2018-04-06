package boss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 
{
  public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("file:///G:/selenium/Ex11.html");
		List<WebElement> l=dr.findElements(By.tagName("iframe"));
		dr.switchTo().frame(l.size()-1);
		List<WebElement> l1=dr.findElements(By.xpath("//input[@type='radio']"));
		l1.get(0).click();

	}

}
