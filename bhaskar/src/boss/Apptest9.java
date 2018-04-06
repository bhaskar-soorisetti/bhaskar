package boss;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest9 {

	public static void main(String[] args) throws Exception
	{
		// program for getting app package and activty and resetapp and launchapp and Remote operation and notification operation
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(20000);
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName","G35GLMC583101840");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","5.1");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//create android driver object
		AndroidDriver dr= new AndroidDriver(u,dc);
		Thread.sleep(10000);
		//get package and activity details of opened app
		String x= dr.getCurrentPackage();
		System.out.println(x);
		String y= dr.currentActivity();
		System.out.println(y);
		//send app to background for 10 seconds
		Duration d =Duration.of(10,ChronoUnit.SECONDS);
		dr.runAppInBackground(d);
		//launchapp and resetapp
		dr.findElement(By.xpath("//*[@text='8']")).click();
		Thread.sleep(10000);
		dr.resetApp();
		// getting remote url details 
		URL z=dr.getRemoteAddress();
		System.out.println("appium server url is:"+z.getPath());
		System.out.println("appium server url is:"+z.getPort());
		System.out.println("appium server url is:"+z.getProtocol());
		// getting time on connected device
		String a=dr.getDeviceTime();
		System.out.println(a);
		//close app
		dr.closeApp();
		//stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
		//dr.pressKeyCode(AndroidKeyCode.HOME);
		

	}

}
