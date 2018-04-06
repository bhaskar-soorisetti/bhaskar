package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "G:\\selenium//chromedriver.exe");
	 ChromeDriver dr=new ChromeDriver();
	 //launch site
	 dr.get("http://site21.way2sms.com/content/index.html");
	 // click register button
	 dr.findElement(By.xpath("//*[@class='leftpart fl']/child::*[4]")).click();
	 //fill form
	 dr.findElement(By.xpath("//*[@class='gend']/child::*[3]")).click();
	 dr.findElement(By.name("name")).sendKeys("boss");
	 dr.findElement(By.name("dob")).sendKeys("12121997");
	 dr.findElement(By.name("email")).sendKeys("s.bhaskar@gmail.com",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	 dr.findElement(By.name("cemail")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	 //selection of city we use this
	 WebElement e=dr.findElement(By.name("city"));
	 Select s= new Select(e);
	 s.selectByVisibleText("Visakhapatnam");
	 dr.findElement(By.name("mno1")).sendKeys("9032501718");
	 dr.findElement(By.xpath("//*[@id='terms']/child::*")).click();
	 dr.findElement(By.xpath("//*[@class='regi']/descendant::input[8]")).click();
	 Thread.sleep(3000);
	 //we are not automate captch that why we click ok button for alert
	 dr.switchTo().alert().accept();
	 Thread.sleep(2000);
	 //close site
	 dr.close();
	}

}
