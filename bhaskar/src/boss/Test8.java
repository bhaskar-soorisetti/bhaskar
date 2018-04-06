package boss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test8 
{

  public static void main(String[] args) throws InterruptedException, AWTException
  {
     //program for gmail login and attachfiles
	  System.setProperty("webdriver.chrome.driver","G://selenium practice\\chromedriver.exe");
     WebDriver dr=new ChromeDriver();
     //launch gmail site
     dr.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
     Thread.sleep(5000);
     //do login
     dr.findElement(By.name("identifier")).sendKeys("soorisetti.bhaskar");
     dr.findElement(By.className("CwaK9")).click();
     Thread.sleep(10000);
     dr.findElement(By.xpath("//*[@id='password']/descendant::input")).sendKeys("bhaskar9");
     Thread.sleep(5000);
     dr.findElement(By.xpath("//*[@id='passwordNext']")).click();
     Thread.sleep(5000);
     //sending mails
     dr.findElement(By.xpath("//*[text()='COMPOSE']")).click();
     Thread.sleep(5000);
     dr.findElement(By.name("to")).sendKeys("prem8706.pk@gmail.com");
     dr.findElement(By.name("subjectbox")).sendKeys("chargeman2017 applications");
     Actions a=new Actions(dr);
     WebElement e=dr.findElement(By.name("subjectbox"));
     a.click(e).build().perform();
     a.sendKeys(Keys.TAB).build().perform();
     a.sendKeys("hi ra\n this is bhaskar\n sending your applications\n pleaase find below attachments").build().perform();
     dr.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
     Thread.sleep(2000);
     String f1="G:\\iball\\PREM CHARGEMAN MEC.pdf";
     String f2="G:\\iball\\PREM CHARGEMAN AMU.pdf";
     StringSelection x=new StringSelection(f1);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(5000);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(10000);
     //second file sending
     dr.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
     Thread.sleep(2000);
     StringSelection y=new StringSelection(f2);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(5000);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(5000);
     dr.findElement(By.xpath("//*[text()='Send']")).click();
     Thread.sleep(5000);
     String msg=dr.findElement(By.xpath("//*[@role='alert']/descendant::*[3]")).getText();
     System.out.println(msg);
     dr.findElement(By.xpath("(//*[contains(@title,'Google Account')])/child::*")).click();
     Thread.sleep(2000);
     dr.findElement(By.xpath("//*[text()='Sign out']")).click();
     Thread.sleep(3000);
     dr.close();

     
     
  }

}
