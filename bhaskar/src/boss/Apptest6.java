package boss;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest6 {

	public static void main(String[] args) throws Exception
	{
		//program for open calculator and doing some operations using keyboard
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(30000);
		URL u =new URL("http://0.0.0.0:4723/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "G35GLMC583101840" );
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion", "5.1");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//create Driver object for android driver
		AndroidDriver dr=new AndroidDriver(u,dc);
		Thread.sleep(5000);
		//goto home screen in device
		dr.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(10000);
		
		//dr.switchTo().frame(dr.findElement(By.xpath("//*[@class='android.widget.ImageView'][@index='2']")));
		//Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@class='android.widget.ImageView'][@index='2']")).click();
		Thread.sleep(5000);
		//open gallery app
		dr.findElement(By.xpath("//*[@text='Gallery'][@index='2']")).click();
		Thread.sleep(10000);
		dr.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(5000);
		//open messaging app
		dr.findElement(By.xpath("//*[@text='Contacts'][@index='2']")).click();
		Thread.sleep(10000);
		dr.pressKeyCode(AndroidKeyCode.BACK);
		if(dr.isKeyboardShown())
		{
			dr.hideKeyboard();
		}
		Thread.sleep(5000);
		dr.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(5000);
		//Activate calculator
		dr.launchApp();
		//close App
		dr.closeApp();
		//stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		

	}

}
