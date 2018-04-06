package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test23
{
	public static void main(String[] args) throws InterruptedException
	{
		// program for mouse move over using co-ordinates 
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.flipkart.com");
		Thread.sleep(5000); 
		WebElement e=dr.findElement(By.xpath("//*[@class='mCRfo9']/descendant::*[3]"));
		Actions a= new Actions(dr);
		a.click(e).build().perform();
		WebElement e1=dr.findElement(By.xpath("(//*[@class='_1QZ6fC'])[3]"));
		int x=e1.getLocation().getX();
		System.out.println(x);
		int y=e1.getLocation().getY();
		System.out.println(y+" "+x);
		a.moveByOffset(x,y).build().perform();
		
		
	}

}
