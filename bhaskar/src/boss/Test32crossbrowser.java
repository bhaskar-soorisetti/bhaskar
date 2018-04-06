package boss;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test32crossbrowser
{
	public static void main(String[] args) throws Exception
	{
		// program for cross browser checking
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name:");
		String x=sc.nextLine();
		WebDriver dr=null;
		if(x.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
			dr=new ChromeDriver();
		}
		else if(x.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "G://selenium//softwares//geckodriver.exe");
			dr=new FirefoxDriver();
		}
		else if(x.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","G://selenium//iedriverserver.exe");
			dr=new InternetExplorerDriver();
		}
		else if(x.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver","G://selenium//operadriver_win64//operadriver.exe");
			dr=new OperaDriver();
		}
		else
		{
			System.out.println("unknown browser");
			System.exit(0);
		}
		dr.get("http://www.google.com");
		Thread.sleep(2000);
		//find how many element in a tag store in list
		  List<WebElement> l=dr.findElements(By.tagName("a"));
		  //print size of elements
		  System.out.println(l.size());
		  //get attribute value like name, class and value etc
		  String z=dr.findElement(By.id("gs_htif0")).getAttribute("class");
		  System.out.println(z);
		  String y=dr.findElement(By.id("gs_htif0")).getCssValue("background");
		  System.out.println(y);

		dr.quit();

	}

}
