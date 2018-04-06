package boss;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest1 {
	public static void main(String[] args) throws Exception
	{
		// app testing
		// giving input to keyboard
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input 1:");
		String x=sc.nextLine();
		System.out.println("enter input 2:");
		String y=sc.nextLine();
		//start appium server(CLI based)
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(20000);
		URL u= new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		//provide details of ARD and app testing 
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "G35GLMC583101840");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion", "5.1");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//create driver object to launch appin ARD
		AndroidDriver dr=new AndroidDriver(u,dc);
		Thread.sleep(5000);
		//operate elements in app screen calculator
		for (int i=0;i<x.length();i++)
		{
			char d=x.charAt(i);
			dr.findElement(By.xpath("//*[@text='"+ d +"']")).click();
		}
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@text='+']")).click();
		Thread.sleep(2000);
		for (int i=0;i<y.length();i++)
		{
			char d=y.charAt(i);
			dr.findElement(By.xpath("//*[@text='"+ d +"']")).click();
		}
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@text='=']")).click();
		Thread.sleep(2000);
		String act=dr.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
		//convert inputs and outputs to integers
		int z= Integer.parseInt(act);
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		if(z==a+b)
		{
			System.out.println("addition test passed");
			File f=dr.getScreenshotAs(OutputType.FILE);
			File s=new File("g://selenium//bhaskar//appsceen.png");
			FileUtils.copyFile(f, s);
		}
		else
		{
			System.out.println("addition test failed");
			File f=dr.getScreenshotAs(OutputType.FILE);
			File s=new File("g://selenium//bhaskar//appsceen.png");
			FileUtils.copyFile(f, s);			
		}
				//close app
		dr.closeApp();
		//stop appium server and command prompt
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		

	}

}
