package boss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test19
{
	public static void main(String[] args) throws Exception
	{
		// program for navigation browser icons
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.google.com");
		Thread.sleep(3000);
		dr.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().forward();
		Thread.sleep(3000);
		dr.navigate().refresh();
		Thread.sleep(3000);
		dr.close();

	}

}
