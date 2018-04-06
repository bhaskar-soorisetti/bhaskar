package boss;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "G:\\selenium//chromedriver.exe");
	 ChromeDriver dr=new ChromeDriver();
	 dr.get("http://site24.way2sms.com/content/index.html");
	 dr.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
	 ArrayList<String> a = new ArrayList<String>(dr.getWindowHandles());
	 dr.switchTo().window(a.get(1));
	 dr.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
	 Thread.sleep(2000);
	 dr.close();
	 dr.switchTo().window(a.get(0));
	 Thread.sleep(2000);
	 dr.close();
	 

	}

}
