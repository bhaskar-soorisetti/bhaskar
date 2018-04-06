package boss;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://site24.way2sms.com//content/index.html");
		  Thread.sleep(5000);
		  String a=driver.getWindowHandle();
		  System.out.println(a);
		  driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();
		  Thread.sleep(10000);
		  ArrayList<String> b= new ArrayList<String>(driver.getWindowHandles());
		  for(int i=0;i<b.size();i++)
		  {
			  System.out.println(b.get(i));
		  }
		  driver.quit();

	}

}
