package boss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "G:\\selenium//chromedriver.exe");
	  ChromeDriver dr= new ChromeDriver();
	  //launch site
	  dr.get("http://www.google.com");
	  //find how many element in a tag store in list
	  List<WebElement> l=dr.findElements(By.tagName("a"));
	  //print size of elements
	  System.out.println(l.size());
	  //get attribute value like name, class and value etc
	  String x=dr.findElement(By.id("gs_htif0")).getAttribute("class");
	  System.out.println(x);
	  String y=dr.findElement(By.id("gs_htif0")).getCssValue("background");
	  System.out.println(y);
	  dr.close();
	}

}
