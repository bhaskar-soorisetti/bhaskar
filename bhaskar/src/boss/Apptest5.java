package boss;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest5 {

	public static void main(String[] args) throws Exception
	{
		// program for  lock,unlock device and rotation of screen
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\""); 
		Thread.sleep(30000);
		URL u= new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "G35GLMC583101840");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "5.1");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//creating driver object
		AndroidDriver dr=new AndroidDriver(u,dc);
		Thread.sleep(5000);
		// lock and unlock device
		Thread.sleep(5000);
		dr.lockDevice();
		Thread.sleep(10000);
		if(dr.isLocked())
		 {
			dr.unlockDevice();
			Thread.sleep(10000);
		 }
		// preform screen rotations
		if(dr.getOrientation().name().equals("PORTRATI"))
		{
			dr.rotate(ScreenOrientation.LANDSCAPE);
		}
		else
		{
			dr.rotate(ScreenOrientation.PORTRAIT);
		}
		//close opened app
		dr.closeApp();
		//stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
