package boss;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Javaw2susinghashmap {


	public static void main(String[] args) throws Exception
	{
		// program for way2sms login using hashmap
		HashMap<String,String> uid=new HashMap<String,String>();
		HashMap<String,String> pwd=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit for HashMap");
		int l=sc.nextInt();
		System.out.println("enter your test data");
		for(int i=0;i<l;i++)
		{
			System.out.println("enter mobile No and criteria");
			Thread.sleep(2000);
			uid.put(sc.nextLine(),sc.nextLine());
			System.out.println("enter password and criteria");
			pwd.put(sc.nextLine(),sc.nextLine());
		}
		//create result file
		ExtentReports er=new ExtentReports("way2smsres.html");
		ExtentTest et=er.startTest("login test using hashmap");
		//data driven testing
		Iterator<Entry<String,String>> i=pwd.entrySet().iterator();
		for(Entry<String,String> e1:uid.entrySet())
		{
			Entry<String,String> e2=i.next();
			//launch site
			System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
			ChromeDriver dr=new ChromeDriver();
			dr.get("http://site24.way2sms.com/content/index.html");
			Thread.sleep(10000);
			dr.findElement(By.name("username")).sendKeys(e1.getKey());
			dr.findElement(By.name("password")).sendKeys(e2.getKey());
			dr.findElement(By.id("loginBTN")).click();
			Thread.sleep(10000);
			//validation
			try
			{
				if(e1.getKey().length()==0 && ExpectedConditions.alertIsPresent() !=null)
				{
				    et.log(LogStatus.PASS, "test passed for blank mobile number");
				}
				else if (e1.getKey().length()<10 && ExpectedConditions.alertIsPresent()!=null)
				{
					et.log(LogStatus.PASS,"test passed for wrong size mobile number");
				}
				else if(e2.getKey().length()== 0 && ExpectedConditions.alertIsPresent()!=null)
				{
					et.log(LogStatus.PASS,"test passed for blank password");
				}
				else if(e1.getValue().equalsIgnoreCase("invalid") && dr.findElement(By.xpath("//*[contains(text(),'registered yet')]")).isDisplayed())
				{
					et.log(LogStatus.PASS,"test passed for invalid mobile number");
				}
				else if(e1.getValue().equalsIgnoreCase("valid") && e2.getValue().equalsIgnoreCase("invalid") && dr.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).isDisplayed())
				{
					et.log(LogStatus.PASS,"test passed for invalid password");
				}
				else if(e1.getValue().equalsIgnoreCase("valid") && e2.getValue().equalsIgnoreCase("valid") && dr.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
				{
					et.log(LogStatus.PASS,"test passed for valid data ");
				}
				else
				{
					File src =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
					File dest= new File("way2sms.png");
					FileUtils.copyFile(src, dest);
					et.log(LogStatus.FAIL,"test failed for way2sms");
					et.log(LogStatus.FAIL,et.addScreenCapture("way2sms.png"));
				}
			}
			catch(Exception e)
			{
				et.log(LogStatus.ERROR," Exception arised ");
			}
			// close site
			dr.close();

		}
		er.endTest(et);
		er.flush();

	}

}
