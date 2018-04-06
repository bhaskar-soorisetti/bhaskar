package boss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args) throws InterruptedException
	{
		//program for cookie
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		//delete all existing cookie for browser
		dr.manage().deleteAllCookies();
		Thread.sleep(3000);
		dr.get("http://www.facebook.com");
		Thread.sleep(3000);
		//cookies testing
		if(dr.manage().getCookies().size()!=0)
		{
			System.out.println("cookies were loaded");
		}
		else
		{
			System.out.println("cookies were not loaded");
		}
        dr.close();
	}

}
