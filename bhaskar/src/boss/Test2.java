package boss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G://selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		String a=driver.getTitle();
		Thread.sleep(5000);
		driver.close();
		System.out.println(a);
		
	}

}
