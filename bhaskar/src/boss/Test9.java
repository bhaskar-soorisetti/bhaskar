package boss;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9 {
   public static void main(String[] args) throws Exception
    {
     System.setProperty("webdriver.chrome.driver","G://selenium practice//chromedriver.exe");
     WebDriver dr= new ChromeDriver();
     dr.get("http://site24.way2sms.com/content/index.html");
     dr.findElement(By.name("username")).sendKeys("9059565703");
     dr.findElement(By.name("password")).sendKeys("5703");
     dr.findElement(By.id("loginBTN")).click();
     Thread.sleep(5000);
     dr.findElement(By.xpath("//*[text()='Send SMS']")).click();
     Thread.sleep(5000);
     dr.switchTo().frame("frame");
     dr.findElement(By.name("mobile")).sendKeys("9059565703");
     dr.findElement(By.name("message")).sendKeys("hai bhaskar");
     WebElement e=dr.findElement(By.xpath("//*[@id='smsCats']"));
     Actions s=new Actions(dr);
     s.click(e).build().perform();
     dr.findElement(By.name("Send")).click();
     dr.switchTo().defaultContent();
     Thread.sleep(5000);
     try
     {
    	 
         if(dr.findElement(By.xpath("//*[text()='Install Chrome Plugin']")).isDisplayed())
       {
    	 dr.findElement(By.xpath("//*[text()='Install Chrome Plugin']")).click();
    	 Thread.sleep(5000);
    	 Robot r= new Robot();
    	 r.keyPress(KeyEvent.VK_TAB);
    	 r.keyRelease(KeyEvent.VK_TAB);
    	 r.keyPress(KeyEvent.VK_TAB);
    	 r.keyRelease(KeyEvent.VK_TAB);
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 r.keyRelease(KeyEvent.VK_ENTER);
    	 
       }
     }
     catch(Exception ex)
     {
    	 
     }
     // get message and display
     dr.switchTo().frame("frame");
     String x=dr.findElement(By.xpath("(//*[contains(@class,'ssm')])[6]/following-sibling::*")).getText();
     System.out.println(x);
     dr.switchTo().defaultContent();
     //close site
     dr.close();
    }     
  }


