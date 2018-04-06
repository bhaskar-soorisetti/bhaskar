package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test40{
	public static void main(String[] args) throws Exception
	{
		// sikuli program for automate youtube
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.youtube.com/");
		dr.manage().window().maximize();
		Thread.sleep(20000);
		//search for video link
		dr.findElement(By.name("search_query")).sendKeys("kalam sir speech",Keys.ENTER);
		Thread.sleep(10000);
		dr.findElement(By.partialLinkText("Dr. A P J Abdul Kalam's one of th")).click();
		Thread.sleep(10000);
		//search for video link
		
		
		
		
	}

}
