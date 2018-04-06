package boss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.gmail.com");
		String a= dr.getCurrentUrl();
		Thread.sleep(5000);
		if(a.contains("https"))
		{
		        System.out.println("secured");
		}
		else
		{
			System.out.println("not secured");
		}
		dr.close();
	}

}
