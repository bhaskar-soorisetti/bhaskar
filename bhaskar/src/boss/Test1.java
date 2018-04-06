package boss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver","G:\\selenium\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://www.gmail.com");
	 Thread.sleep(5000);
	 driver.close();
	 
	}

}
