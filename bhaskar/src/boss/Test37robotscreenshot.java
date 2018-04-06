package boss;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test37robotscreenshot {
	public static void main(String[] args) throws Exception
	{
		// program for screenshot
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PRINTSCREEN);
		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("mspaint.exe");
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_V);		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		String path="G:\\prasad\\sc1.png";
		StringSelection p=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(p,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);*/
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://hqwncrecruitment.com/navy04/");
		Thread.sleep(3000);
		dr.findElement(By.name("txtuserid")).sendKeys("9210514");
		dr.findElement(By.name("txtpass")).sendKeys("MNX7YU");
		dr.findElement(By.name("btnlogin")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[text()='Upload Documents']")).click();
		dr.findElement(By.name("fuPhoto")).click();
		Thread.sleep(3000);
		String f1="G:\\bhaskar\\photo.jpg";
		String f2="G:\\bhaskar\\sign.jpg";
		String f3="G:\\bhaskar\\10.jpg";
		String f4="G:\\bhaskar\\OBC.jpg";
		String f5="G:\\bhaskar\\degree.jpg";
		/*StringSelection s1=new StringSelection(f1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);*/
		Robot r = new Robot();
		/*r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		dr.findElement(By.name("btnUpload")).click();
		Thread.sleep(10000);*/
		dr.findElement(By.name("fuSign")).click();
		Thread.sleep(3000);
		
		StringSelection s2=new StringSelection(f2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		dr.findElement(By.name("fuDOBCerti")).click();
		Thread.sleep(3000);
		StringSelection s3=new StringSelection(f3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s3,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		dr.findElement(By.name("btnUpDOBCerti")).click();
		Thread.sleep(25000);
		dr.findElement(By.name("fuCasteCerti")).click();
		Thread.sleep(3000);
		StringSelection s4=new StringSelection(f4);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s4,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		dr.findElement(By.name("btnUpCasteCerti")).click();
		Thread.sleep(25000);
		dr.findElement(By.name("fuSSCCerti")).click();
		Thread.sleep(3000);
		StringSelection s5=new StringSelection(f3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s5,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		dr.findElement(By.name("btnUpSSCCerti")).click();
		Thread.sleep(25000);
		dr.findElement(By.name("fuEQCerti")).click();
		Thread.sleep(3000);
		StringSelection s6=new StringSelection(f5);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s6,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		dr.findElement(By.name("btnUpEQCerti")).click();
		Thread.sleep(25000);
		dr.findElement(By.name("btnSubmit")).click();
		Thread.sleep(5000);
		
		

	}

}
