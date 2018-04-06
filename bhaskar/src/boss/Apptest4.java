package boss;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest4 {
	public static void main(String[] args) throws Exception
	{
		// program for whatapp messaging
		//get message from keyborad
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter message what you send:");
		String x=sc.nextLine();*/
		//start appium server using cmd prompt
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(30000);
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		//ARD details and app details
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "G35GLMC583101840");
		dc.setCapability("paltformName","android");
		dc.setCapability("platformVersion", "5.1");
		dc.setCapability("appPackage","com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.traditional.MessageLaunchActivity");
		// Android object creation
		AndroidDriver dr=new AndroidDriver(u,dc);
		//select message
		List<WebElement> msg = dr.findElementsByAndroidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\")");
		Thread.sleep(5000);
		System.out.println(msg.size());
		//for(int i=0;i>msg.size();i++)
		//{
			String x = msg.get(0).findElement(By.xpath("//*[@class='android.widget.TextView'][@index='4']")).getAttribute("text");
		    System.out.println(x);
		  
		//}
		//close app 
		dr.closeApp();
		//close appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		

	}

}
