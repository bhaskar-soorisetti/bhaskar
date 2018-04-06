package boss;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Apptest7 {

	public static void main(String[] args) throws Exception
	{
		// program for getting performance information like cpu , memory, network, battery informantion
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		Thread.sleep(30000);
		URL u= new URL("http://0.0.0.0:4723/wd/hub");
		Thread.sleep(10000);
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName","G35GLMC583101840");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","5.1");
		dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.traditional.MessageLaunchActivity");
		// create driver object
		AndroidDriver dr=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		List<String> pl =dr.getSupportedPerformanceDataTypes();
		for(int i=0;i<pl.size();i++)
		{
			System.out.println(pl.get(i));
		}
		List<List<Object>> ci=dr.getPerformanceData("com.android.mms","cpuinfo",10000);
		System.out.println("-------------cpuinfo--------------------");
		System.out.println();
		for(int i=0;i<ci.size();i++)
		{
			for(int j=0; j<ci.get(i).size();j++)
			{
				try
				{
					System.out.println(ci.get(i).get(j).toString()+"\t");
				}
				catch(Exception e)
				{
					System.out.print("0");
				}
			}
		}
		System.out.println("");
		List<List<Object>> ni=dr.getPerformanceData("com.android.mms","networkinfo",10000);
		System.out.println("-------------networkinfo--------------------");
		System.out.println();
		for(int i=0;i<ni.size();i++)
		{
			for(int j=0; j<ni.get(i).size();j++)
			{
				try
				{
					System.out.println(ni.get(i).get(j).toString()+"\t");
				}
				catch(Exception e)
				{
					System.out.print("0");
				}
			}
		}
		System.out.println("");
		List<List<Object>> mi=dr.getPerformanceData("com.android.mms","memoryinfo",10000);
		System.out.println("-------------memoryinfo--------------------");
		System.out.println();
		for(int i=0;i<mi.size();i++)
		{
			for(int j=0; j<mi.get(i).size();j++)
			{
				try
				{
					System.out.println(mi.get(i).get(j).toString()+"\t");
				}
				catch(Exception e)
				{
					System.out.print("0");
				}
			}
		}
		System.out.println("");
		List<List<Object>> bi=dr.getPerformanceData("com.android.mms","batteryinfo",10000);
		System.out.println("-------------batteryinfo--------------------");
		System.out.println();
		for(int i=0;i<bi.size();i++)
		{
			for(int j=0; j<bi.get(i).size();j++)
			{
				try
				{
					System.out.print(bi.get(i).get(j).toString()+"\t");
				}
				catch(Exception e)
				{
					System.out.print("0");
				}
			}
		}
		System.out.println();
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
