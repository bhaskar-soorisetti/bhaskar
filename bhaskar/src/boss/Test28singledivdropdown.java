package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test28singledivdropdown {

public static void main(String[] args) throws Exception
	{
		// program for single select using div tag
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.gmail.com");
		dr.findElement(By.xpath("//*[text()='More options']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[text()='Create account']")).click();
		Thread.sleep(2000);
		// fill the regitrasation form
		dr.findElement(By.name("FirstName")).sendKeys("boss");
		dr.findElement(By.name("LastName")).sendKeys("boss");
		dr.findElement(By.name("GmailAddress")).sendKeys("batch2361");
		dr.findElement(By.name("Passwd")).sendKeys("bhaskar9");
		dr.findElement(By.name("PasswdAgain")).sendKeys("bhaskar9");
		WebElement e=dr.findElement(By.xpath("//*[@title='Birthday']"));
		Actions a=new Actions(dr);
		a.click(e).build().perform();
		Thread.sleep(2000);
		a.sendKeys("ja").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		dr.findElement(By.name("BirthDay")).sendKeys("07");
		dr.findElement(By.name("BirthYear")).sendKeys("1990");
		WebElement e1=dr.findElement(By.xpath("//*[@title='Gender']"));
		a.click(e1).build().perform();
		Thread.sleep(2000);
		a.sendKeys("m").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		dr.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9999999999");
		dr.findElement(By.name("RecoveryEmailAddress")).sendKeys("soorisetti.bhaskar@gmail.com");
		dr.findElement(By.name("submitbutton")).click();
		for(int i=1;i<=18;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
		}
		dr.findElement(By.name("iagreebutton")).click();
	}

}
