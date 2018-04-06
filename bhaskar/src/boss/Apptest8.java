package boss;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest8 {

	public static void main(String[] args) throws Exception
	{
		// program for google maps 
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(20000);
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "G35GLMC583101840");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion", "5.1");
		dc.setCapability("locationServicesEnabled",true);
		dc.setCapability("locationServiceAuthorized",true);
		dc.setCapability("appPackage","com.google.android.apps.maps");
		dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
		// create driver object to launch app
		AndroidDriver dr=new AndroidDriver(u,dc);
		Thread.sleep(15000);
		dr.findElement(By.xpath("//*[@text='Accept & continue']")).click();
		Thread.sleep(5000);
		//set location to visakhapatnam
		Location l = new Location(17.686815,83.218483,500);
		dr.setLocation(l);
		Thread.sleep(20000);
		//search for address
		dr.findElement(By.xpath("//*[@content-desc='Search']")).sendKeys("araku, andhra pradesh");
		Thread.sleep(10000);
		if(dr.isKeyboardShown())
		{
			dr.hideKeyboard();
		}
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@text='Araku'][@index='0']")).click();
		Thread.sleep(15000);
		//close app
		dr.closeApp();
		//stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
