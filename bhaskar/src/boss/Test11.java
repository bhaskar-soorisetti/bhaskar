package boss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test11
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.gmail.com");
		dr.switchTo().activeElement().sendKeys("hai");

	}

}
