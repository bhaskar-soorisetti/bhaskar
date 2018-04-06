package boss;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Javaway2smsusingexcelfile {

	public static void main(String[] args) throws Exception
	{
		// program for data driven testing using excel file
		//open excel file for reading
		File f = new File("way2smsresults.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int norw=rsh.getRows();// count of total used rows
		//open same excel file for writing
		WritableWorkbook wwb= Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		String x=null;
		//data driven testing 
		for(int i=1;i<norw;i++)
		{
			String a=rsh.getCell(0,i).getContents();
			String b=rsh.getCell(1,i).getContents();
			String c=rsh.getCell(2,i).getContents();
			String d=rsh.getCell(3,i).getContents();
			Label l =new Label(4,i,x);
			System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
			ChromeDriver dr=new ChromeDriver();
			dr.get("http://site24.way2sms.com/content/index.html");
			Thread.sleep(10000);
			dr.findElement(By.name("username")).sendKeys(a);
			dr.findElement(By.name("password")).sendKeys(c);
			dr.findElement(By.id("loginBTN")).click();
			Thread.sleep(5000);
			//validation
			try
			{
				if(a.length()==0 && ExpectedConditions.alertIsPresent() !=null)
				{
				    x= "test passed for blank mobile number";
					wsh.addCell(l);
				}
				else if (a.length()<10 && ExpectedConditions.alertIsPresent()!=null)
				{
					x= "test passed for wrong size mobile number";
					wsh.addCell(l);
				}
				else if(c.length()== 0 && ExpectedConditions.alertIsPresent()!=null)
				{
					x= "test passed for blank password";
					wsh.addCell(l);
				}
				else if(b.equalsIgnoreCase("invalid") && dr.findElement(By.xpath("//*[contains(text(),'registered yet')]")).isDisplayed())
				{
					x= "test passed for invalid mobile number";
					wsh.addCell(l);
				}
				else if(b.equalsIgnoreCase("valid") && d.equalsIgnoreCase("invalid") && dr.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).isDisplayed())
				{
					x= "test passed for invalid password";
					wsh.addCell(l);
				}
				else if(b.equalsIgnoreCase("valid") && d.equalsIgnoreCase("valid") && dr.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
				{
					x= "test passed for valid data ";
					wsh.addCell(l);
				}
				else
				{
					File src =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
					File dest= new File("way2sms.png");
					FileUtils.copyFile(src, dest);
					x="test failed for way2sms";
					wsh.addCell(l);
				}
			}
			catch(Exception e)
			{
				x= " Exception arised ";
				wsh.addCell(l);
			}
			// close site
			dr.close();
		}
		// save file and close
		wwb.write();
		wwb.close();
		rwb.close();
		
	}

}
