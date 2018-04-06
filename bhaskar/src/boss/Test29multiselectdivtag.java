package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test29multiselectdivtag {
	public static void main(String[] args) throws Exception
	{
		// Program for multiselect drop-down using div tag
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		//launch site
		dr.get("https://semantic-ui.com/modules/dropdown.html");
		//select items in multiselect dropdown
		WebElement e=dr.findElement(By.xpath("(//*[contains(@class,'fluid dropdown')])[1]"));
		Actions a=new Actions(dr);
		a.click(e).build().perform();
		a.sendKeys("a").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("c").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("r").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("u").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		//deselect items in multiselect dropdown
		//dr.findElement(By.xpath("(//*[contains(@class,'fluid dropdown')])[1]/child::*[5]/child::*")).click();
		JavascriptExecutor js=(JavascriptExecutor)dr;
		//js.executeScript("alert('unselect multiple selected items');");
		for(int i=6;i>=3;i--)
		{
			WebElement e1=dr.findElement(By.xpath("(//*[contains(@class,'fluid dropdown')])[1]/child::*["+i+"]/child::*"));
			js.executeScript("arguments[0].style.border='2px dotted blue';", e1);
			dr.findElement(By.xpath("(//*[contains(@class,'fluid dropdown')])[1]/child::*["+i+"]/child::*")).click();
			Thread.sleep(2000);
		}
		

	}

}
