package boss;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test42robotcontext {

	public static void main(String[] args) throws Exception
	{
		// program for open site and give right click and open new window on browser
		//taking properties file to program
		File f = new File("data.properties");
		FileInputStream fis =new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		System.setProperty(p.getProperty("cd"),p.getProperty("cdp"));
		ChromeDriver dr=new ChromeDriver();
		dr.get(p.getProperty("filpkart"));
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@class='mCRfo9']/descendant::*[3]")).click();
		Thread.sleep(5000);
		WebElement e =dr.findElement(By.xpath("//*[@id='container']/descendant::*[12]"));
		Actions a = new Actions(dr);
		a.contextClick(e).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		dr.quit();
		
		

	}

}
