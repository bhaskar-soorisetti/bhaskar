package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test26draganddrop {

	public static void main(String[] args)
	{
		// program for drag and drop items
		System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://jqueryui.com/droppable/");
		dr.switchTo().frame(0);
		//drag and drop operation
		WebElement e=dr.findElement(By.id("draggable"));
		WebElement e1=dr.findElement(By.id("droppable"));
		Actions a=new Actions(dr);
		a.dragAndDrop(e,e1).build().perform();

	}

}
