package boss;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest11 {
	public static void main(String[] args) throws Exception
	{
		//change context view 
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(20000);
		URL u = new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName","G35GLMC583101840");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","5.1");
		dc.setCapability("appPackage","com.bsb.hike");
		dc.setCapability("appActivity","com.bsb.hike.ui.HomeActivity");
		//create android driver object
		AndroidDriver dr= new AndroidDriver(u,dc);
		Thread.sleep(20000);
		if(dr.isKeyboardShown())
		{
		   dr.hideKeyboard();
		}
		dr.findElement(By.xpath("//*[@resource-id='com.bsb.hike:id/phone_number']")).sendKeys("9059565703");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(10000);
		try
		{
		 if(dr.findElement(By.xpath("//*[@resource-id='com.bsb.hike:id/name_next_btn']")).isDisplayed())
		 {
		  dr.findElement(By.xpath("//*[@resource-id='com.bsb.hike:id/name_next_btn']")).click();
		  Thread.sleep(10000);
		  dr.findElement(By.xpath("//*[@resource-id='com.bsb.hike:id/hikeid_edit_text']")).sendKeys("bhaskars");
		  Thread.sleep(5000);
		  dr.findElement(By.xpath("//*[@resource-id='com.bsb.hike:id/hike_id_prompt_btn']")).click();
		  Thread.sleep(20000);
		 }
		}
		catch(Exception e)
		{
			System.out.println("exception arised");
		}
		Thread.sleep(20000);
		dr.findElement(By.xpath("//*[@text='SKIP']")).click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	
		

	}

}
