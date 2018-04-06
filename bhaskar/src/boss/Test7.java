package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G://selenium\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		// launch mercury tours webpage
		dr.get("http://newtours.demoaut.com/");
        Thread.sleep(5000);
		// click on register page
        dr.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		// filling the form
		dr.findElement(By.name("firstName")).sendKeys("bhaskar");
		dr.findElement(By.name("lastName")).sendKeys("soorisetti");
		dr.findElement(By.name("phone")).sendKeys("9059565703");
		dr.findElement(By.name("userName")).sendKeys("soorisetti.bhaskar@gmail.com");
		dr.findElement(By.name("address1")).sendKeys("b c colony");
		dr.findElement(By.name("address2")).sendKeys("pendurthi");
		dr.findElement(By.name("city")).sendKeys("visakhapatnam");
		dr.findElement(By.name("state")).sendKeys("andhra pradesh");
		dr.findElement(By.name("postalCode")).sendKeys("531173");
		// this useful for further purpose it is dropdown list
		WebElement e= dr.findElement(By.name("country"));
		Select s= new Select(e);
		s.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		dr.findElement(By.name("email")).sendKeys("bhaskars");
		dr.findElement(By.name("password")).sendKeys("bhaskar9");
		dr.findElement(By.name("confirmPassword")).sendKeys("bhaskar9");
		dr.findElement(By.name("register")).click();
		
	}

}
