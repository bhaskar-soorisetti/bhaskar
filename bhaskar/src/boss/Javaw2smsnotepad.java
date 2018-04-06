package boss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Javaw2smsnotepad 
{

	public static void main(String[] args) throws Exception
	{
		// program for data driven testing using notepad
		//open data file in read mode
		File f1=new File("way2smstestdat.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//open result file for writing
		File f2=new File("way2smsres.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		// data driven from notepad
		String l=null;
		while((l=br.readLine())!= null)
		{
		String [] x = l.split(",");
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(10000);
		dr.findElement(By.name("username")).sendKeys(x[0]);
		dr.findElement(By.name("password")).sendKeys(x[2]);
		dr.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		//validation
		try
		{
			if(x[0].length()==0 && ExpectedConditions.alertIsPresent() !=null)
			{
			    bw.write("test passed for blank mobile number");
			    bw.newLine();
				
			}
			else if (x[0].length()<10 && ExpectedConditions.alertIsPresent()!=null)
			{
				bw.write("test passed for wrong size mobile number");
				bw.newLine();
			}
			else if(x[2].length()== 0 && ExpectedConditions.alertIsPresent()!=null)
			{
				bw.write( "test passed for blank password");
				bw.newLine();
			}
			else if(x[1].equalsIgnoreCase("invalid") && dr.findElement(By.xpath("//*[contains(text(),'registered yet')]")).isDisplayed())
			{
				bw.write( "test passed for invalid mobile number");
				bw.newLine();
			}
			else if(x[1].equalsIgnoreCase("valid") && x[3].equalsIgnoreCase("invalid") && dr.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).isDisplayed())
			{
				bw.write("test passed for invalid password");
				bw.newLine();
			}
			else if(x[1].equalsIgnoreCase("valid") && x[3].equalsIgnoreCase("valid") && dr.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
			{
				bw.write( "test passed for valid data ");
				bw.newLine();
			}
			else
			{
				File src =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
				File dest= new File("way2sms.png");
				FileUtils.copyFile(src, dest);
				bw.write("test failed for way2sms please check way2sms.png");
				bw.newLine();
			}
		}
		catch(Exception e)
		{
		bw.write( " Exception arised ");
			bw.newLine();
		}
		// close site
		dr.close();
	}
		// close files 
		br.close();
		fr.close();
		bw.close();
		fw.close();

	}

}
