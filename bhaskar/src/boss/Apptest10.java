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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class Apptest10 {

public static void main(String[] args) throws Exception
{
	//enter input using keyboard
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter mobile number:");
	String m=sc.nextLine();
	ExtentReports er=new ExtentReports("toastedmsgres.html",false);
	ExtentTest et=er.startTest("toasted msg display");
	//program for tosted messages 
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe  /k \"appium -a 0.0.0.0 -p 4723\"");
	Thread.sleep(20000);
	URL u = new URL("http://0.0.0.0:4723/wd/hub");
	Thread.sleep(10000);
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME, "");
	dc.setCapability("deviceName","G35GLMC583101840");
	dc.setCapability("platformName","android");
	dc.setCapability("platformVersion","5.1");
	dc.setCapability("appPackage", "com.android.contacts");
	dc.setCapability("appActivity","com.android.contacts.DialtactsActivity");
	//create android driver
	AndroidDriver dr=new AndroidDriver(u,dc);
	Thread.sleep(10000);
	//dailing mobile number
	String d= null;
	for(int i=0;i<m.length();i++)
	{
		char c =m.charAt(i);
		switch(c)
		{
		case '0':
			     d= "zero";
			     break;
		case '1':
				 d="one";
				 break;
		case '2':
				 d="two";
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
		default:
		et.log(LogStatus.PASS, "your not enter numebr please check");
		}
		dr.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/"+d+"']")).click();
		Thread.sleep(2000);
	}
	Thread.sleep(5000);
	// calling 
	dr.findElement(By.xpath("//*[@resource-id='com.android.contacts:id/dialBtnSub2']")).click();
	Thread.sleep(2000);
	//dr.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.contacts:id/dialBtnSub1\")").click();
	//Thread.sleep(10000);
	File f = dr.getScreenshotAs(OutputType.FILE);
	File s= new File("toastedmsg.png");
	FileUtils.copyFile(f,s);
	File tess= LoadLibs.extractTessResources("tessdata");
	ITesseract obj = new Tesseract();
	obj.setDatapath(tess.getAbsolutePath());
	String res=obj.doOCR(f);
    System.out.println(res);
	dr.findElement(By.xpath("//*[@content-desc='Speaker']")).click();
	Thread.sleep(20000);
	dr.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.dialer:id/floating_end_call_action_button\")").click();
	//close app
	dr.closeApp();
	//stop appium server
	Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	//results
	er.endTest(et);
	er.flush();
	}

}
