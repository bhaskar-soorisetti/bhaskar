package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test25loopautocomplete {
	public static void main(String[] args)throws Exception
	{
		// auto-complete text box for infinate loop element
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.google.com");
		//WebElement e=dr.findElement(By.xpath("//*[@class='mCRfo9']/descendant::*[3]"));
		Actions a=new Actions(dr);
		//a.click(e).build().perform();
		//find textbox and entering data click enter
		WebElement e1=dr.findElement(By.name("q"));
		a.sendKeys(e1,"s").build().perform();
		for(;;)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
			String x=e1.getAttribute("value");
			System.out.println(x);
			if(x.equalsIgnoreCase("samsung j7"))
			{
				break;
			}
		}
		a.sendKeys(Keys.ENTER).build().perform();

	}

}
