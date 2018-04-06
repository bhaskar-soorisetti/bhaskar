package boss;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Javaddtusingarray {

	
	public static void main(String[] args) throws Exception
	{
		//dynamic array testing for gmail
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a limit");
		int l=sc.nextInt();
		ArrayList<String> a=new ArrayList<String>();
		System.out.println("enter "+l+" values");
		for(int i=0;i<l;i++)
		{
			a.add(sc.nextLine());
		}
		//Create results file
		ExtentReports er=new ExtentReports("googleres.html",false);
		ExtentTest et=er.startTest("searched multple words");
		for(int i=0;i<l;i++)
		{
			System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
			ChromeDriver dr =new ChromeDriver();
			dr.get("http://www.google.com");
			Thread.sleep(5000);
			dr.findElement(By.name("q")).sendKeys(a.get(i),Keys.ENTER);
			Thread.sleep(5000);
			//validation
		int f=0;
		while(2>1)
		{
			String t=dr.getTitle();
			if(!(t.contains(a.get(i))))
					{
				       f=1;
					}
			//goto next page
			try
			{
				if(dr.findElement(By.xpath("//*[text()='Next']")).isDisplayed())
				{
					dr.findElement(By.xpath("//*[text()='Next']")).click();
					Thread.sleep(5000);
				}
			}
			catch(Exception e)
			{
				break;
			}
		}
		if(f==0)
		{
			et.log(LogStatus.PASS,a.get(i) + " Test passed");
				
		}
		else
		{
			et.log(LogStatus.FAIL,a.get(i) + " Test Failed");
		}
			
			// close site
		dr.close();
	}
		//save reports
		er.endTest(et);
		er.flush();

	}

}
