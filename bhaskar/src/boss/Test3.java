package boss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G://selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http:\\www.gmail.com");
		String a = driver.getPageSource();
		Thread.sleep(3000);
		driver.close();
		System.out.println(a);
		
	}

}
