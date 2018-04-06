package boss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// program for screenshot
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.gmail.com");
		Thread.sleep(3000);
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		File dest=new File("G://selenium//screenshot1.png");
		FileUtils.copyFile(src,dest);
	}

}
