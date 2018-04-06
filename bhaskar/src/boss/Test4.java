package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://site24.way2sms.com//content/index.html");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();
	  Thread.sleep(5000);
	  driver.quit();

	}

}
