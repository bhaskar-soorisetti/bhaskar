package boss;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test29dockyardapp 
{
	public static void main(String[] args) throws Exception
	{
		// application dockyard
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://hqwncrecruitment.com/navy04/PublicHomeM.aspx");
		dr.findElement(By.id("div16")).click();
		Thread.sleep(2000);
		// fill the regitrasation form
		dr.findElement(By.name("txtFirstName")).sendKeys("SATISH");
		dr.findElement(By.name("txtLastName")).sendKeys("KOLLI");
		dr.findElement(By.name("txtFHName")).sendKeys("SATYANARAYANA KOLLI");
		dr.findElement(By.name("txtMName")).sendKeys("RATNAM KOLLI");
		WebElement e= dr.findElement(By.name("cboDay"));
		Select s= new Select(e);
		s.selectByVisibleText("01");
		WebElement e1= dr.findElement(By.name("cboMonth"));
		Select s1= new Select(e1);
		s1.selectByVisibleText("JUL");
		WebElement e2= dr.findElement(By.name("cboYear"));
		Select s2= new Select(e2);
		s2.selectByVisibleText("1990");
		dr.findElement(By.id("rdMale")).click();
		WebElement e3= dr.findElement(By.name("ddlReligion"));
		Select s3= new Select(e3);
		s3.selectByVisibleText("HINDU");
		dr.findElement(By.id("rdmarried")).click();
		dr.findElement(By.id("rdNatYes")).click();
		WebElement e4= dr.findElement(By.name("ddlcat"));
		Select s4= new Select(e4);
		s4.selectByVisibleText("OBC");
		Thread.sleep(3000);
		dr.findElement(By.name("DAP")).click();
		dr.findElement(By.name("txtAddress")).sendKeys("D.NO.19-107, GORLIVANI COLONY");
		dr.findElement(By.name("txtCity")).sendKeys("PENDURTHI");
		dr.findElement(By.name("txtPost")).sendKeys("PENDURTHI");
		WebElement e5= dr.findElement(By.name("cbostate"));
		Select s5= new Select(e5);
		s5.selectByVisibleText("ANDHRA PRADESH");
		dr.findElement(By.name("txtDistrictT")).sendKeys("VISAKHAPATNAM");
		dr.findElement(By.name("txtTalukaT")).sendKeys("PENDURTHI");
		dr.findElement(By.name("txtPin")).sendKeys("531173");
		dr.findElement(By.name("btncopy")).click();
		dr.findElement(By.name("txtMobileNo")).sendKeys("8341304646");
		dr.findElement(By.name("txtEmailId")).sendKeys("tgrmahesh@gmail.com");
		dr.findElement(By.name("txtEmailIdConf")).sendKeys("tgrmahesh@gmail.com");
		dr.findElement(By.name("txtExUni1")).sendKeys("BOARD OF SECONDARY EDUCATION,AP");
		dr.findElement(By.name("txtExSubject1")).sendKeys("TELUGU,HINDI,ENGLISH,MATHS,SCIENCE,SOCIAL");
		WebElement e6= dr.findElement(By.name("cboExMonth1"));
		Select s6= new Select(e6);
		s6.selectByVisibleText("MAR");
		dr.findElement(By.name("txtExPassYear1")).sendKeys("2005");
		dr.findElement(By.name("txtExPercentage1")).sendKeys("58.83");
		dr.findElement(By.name("txtCertNo1")).sendKeys("658560");
		dr.findElement(By.name("txtExPassed2")).sendKeys("INTERMEDIATE");
		dr.findElement(By.name("txtExUni2")).sendKeys("BOARD OF INTERMEDIATE EDUCATION,AP");
		dr.findElement(By.name("txtExSubject2")).sendKeys("MATHS, PHYSICS, CHEMISTRY");
		WebElement e7= dr.findElement(By.name("cboExMonth2"));
		Select s7= new Select(e7);
		s7.selectByVisibleText("MAR");
		dr.findElement(By.name("txtExPassYear2")).sendKeys("2007");
		dr.findElement(By.name("txtExPercentage2")).sendKeys("78.2");
		dr.findElement(By.name("txtCertNo2")).sendKeys("G033284");
		dr.findElement(By.name("txtExPassed3")).sendKeys("BSC");
		dr.findElement(By.name("txtExUni3")).sendKeys("ANDHRA UNIVERSITY");
		dr.findElement(By.name("txtExSubject3")).sendKeys("MATHS,STATISTICS,COMPUTER SCIENCE");
		WebElement e8= dr.findElement(By.name("cboExMonth3"));
		Select s8= new Select(e8);
		s8.selectByVisibleText("MAR");
		dr.findElement(By.name("txtExPassYear3")).sendKeys("2011");
		dr.findElement(By.name("txtExPercentage3")).sendKeys("62.08");
		dr.findElement(By.name("txtCertNo3")).sendKeys("129505");
		dr.findElement(By.name("Q1")).click();
		dr.findElement(By.name("txtIdentityNo")).sendKeys("843093258218");
		Thread.sleep(30000);
		dr.findElement(By.name("btnSave1")).click();
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PRINTSCREEN);
		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("mspaint.exe");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_V);		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		String path="G:\\bhaskar\\sc22.png";
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
		r.keyRelease(KeyEvent.VK_ALT);
		
		
		
	}

}
