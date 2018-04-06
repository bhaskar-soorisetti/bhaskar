package boss;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest3 {
	public static void main(String[] args) throws Exception
	{
		// program for calling using mobile app
		// get number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mobile number:");
		String x= sc.nextLine();
		// start appium server using command prompt
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \" appium -a 0.0.0.0 -p 4723 \"");
		Thread.sleep(30000);
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "G35GLMC583101840");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","5.1");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity", "com.android.contacts.DialtactsActivity");
		// create object for android android
		AndroidDriver dr=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		String d=null;
		for(int i=0;i<x.length();i++)
		{
			char c = x.charAt(i);
		    switch(c)
		    {
		    case '1':
		    	d="one";
		    	break;
		    case '2':
		    	d="two";
		    	System.out.println(d);
		    	break;
		    case '3':
		    	d="three";
		    	break;
		    case '4':
		    	d="four";
		    	break;
		    case '5':
		    	d="five";
		    	break;
		    case '6':
		    	d="six";
		    	break;
		    case '7':
		    	d="seven";
		    	break;
		    case '8':
		    	d="eight";
		    	break;
		    case '9':
		    	d="nine";
		    	break;
		    case '0':
		    	d="zero";
		    	break;
		    default:
		    	System.out.println("not a number");
		    }
		    dr.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/"+d+"']")).click();
		}
		//dr.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys(x);
		Thread.sleep(10000);
		//dr.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.contacts:id/dialBtnSub1\")").click();
		//Thread.sleep(10000);
		//dr.findElement(By.xpath("//*[@content-desc='Speaker']")).click();
		//Thread.sleep(20000);
		//dr.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.dialer:id/floating_end_call_action_button\")").click();
		dr.closeApp();
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
	}

}
