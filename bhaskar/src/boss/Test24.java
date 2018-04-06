package boss;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test24 
{
	public static void main(String[] args) throws Exception
	{
		// actions class methods using program 
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		//launch site
		dr.get("http://www.flipkart.com");
		//closing login page
		WebElement e=dr.findElement(By.xpath("//*[@class='mCRfo9']/descendant::*[3]"));
		Actions a=new Actions(dr);
		a.click(e).build().perform();
		//find textbox and entering data click enter
		WebElement e1=dr.findElement(By.name("q"));
		a.sendKeys(e1,"honor 7x").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		//double clicking on particular item
		WebElement e2=dr.findElement(By.xpath("//*[@class='ZvkppQ']"));
		a.doubleClick(e2).build().perform();
		Thread.sleep(2000);
		//right clicking on the particular element
		WebElement e3=dr.findElement(By.className("_2k0gmP"));
		a.contextClick(e3).build().perform();
		Thread.sleep(3000);
		// operating window menu using java robot 
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//mouse move-over to the particular element
		WebElement e4=dr.findElement(By.xpath("(//*[@class='_1QZ6fC'])[3]"));
		a.moveToElement(e4).build().perform();
		Thread.sleep(5000);
		//testing auto-complete text-box in 6th item in filp-kart site 
		WebElement e5=dr.findElement(By.name("q"));
		a.sendKeys(e5,"s").build().perform();
		for(int i=1;i<=6;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		dr.quit();

	}

}
