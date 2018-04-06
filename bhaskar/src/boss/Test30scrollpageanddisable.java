package boss;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30scrollpageanddisable 
{

		public static void main(String[] args)throws Exception
	{
		// program for scroll page
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://semantic-ui.com/elements/input.html");
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(2000);
		WebElement e=dr.findElement(By.xpath("//*[@class='ui input focus']/child::*"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(50,1000);");
		Thread.sleep(2000);
		js.executeScript("window.open('http://www.google.co.in','_blank');");
		ArrayList<String> a=new ArrayList<String>(dr.getWindowHandles());
		dr.switchTo().window(a.get(1));
		WebElement e1=dr.findElement(By.name("q"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('disabled',true);",e1);
		Thread.sleep(5000);
		js.executeScript("arguments[0].removeAttribute('disabled');", e1);
	}

}
