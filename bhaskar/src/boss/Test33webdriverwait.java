package boss;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test33webdriverwait
{
	public static void main(String[] args) throws Exception
	{
		// program for webdriverwait methods
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.google.com");
		WebDriverWait w=new WebDriverWait(dr,100);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("q")));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.open('http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx','_blank');");
		ArrayList<String> a=new ArrayList<String>(dr.getWindowHandles());
		dr.switchTo().window(a.get(1));
		dr.findElement(By.linkText("7")).click();
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		Thread.sleep(2000);
		js.executeScript("window.open('http://www.gmail.com','_blank');");
		dr.switchTo().window(a.get(2));
		Wait<WebDriver> w1=new FluentWait<WebDriver>(dr).withTimeout(100,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		Thread.sleep(2000);
		dr.quit();

	}

}
