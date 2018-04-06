package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {
public static void main(String[] args) throws Exception
{
		// program for disable and enable textbox
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.google.com");
		WebElement e1=dr.findElement(By.name("q"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].setAttribute('disabled',true);",e1);
		Thread.sleep(5000);
		js.executeScript("arguments[0].removeAttribute('disabled');", e1);
		

	}

}
