package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test38angularjs {
	public static void main(String[] args) throws Exception
	{
		//program for handling angularjs elements in webpage
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.w3schools.com/angular/tryit.asp?filename=try_ng_default");
		Thread.sleep(10000);
		dr.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		//fill textbox 
		dr.findElement(By.xpath("//*[@ng-model='name']")).sendKeys("kalam");
		Thread.sleep(5000);
		String x= dr.findElement(By.xpath("//*[@class='ng-binding']")).getText();
		System.out.println(x);
		dr.switchTo().defaultContent();
		dr.close();

	}

}
