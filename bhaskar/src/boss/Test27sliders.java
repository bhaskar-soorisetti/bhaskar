package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test27sliders {
public static void main(String[] args)throws Exception
	{
		//program for sliders horizental and vertical
	    System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
	    ChromeDriver dr=new ChromeDriver();
	    dr.get("https://jqueryui.com/slider/");
	    dr.switchTo().frame(0);
	    WebElement e=dr.findElement(By.xpath("//*[@id='slider']/child::*"));
	    int x1=e.getLocation().getX();
	    int y1=e.getLocation().getY();
	    Thread.sleep(2000);
	    Actions a= new Actions(dr);
	    a.dragAndDropBy(e,x1+300, y1).build().perform();
	    Thread.sleep(3000);
	    a.dragAndDropBy(e, x1-300, y1).build().perform();
	    Thread.sleep(2000);
	    dr.switchTo().defaultContent();
	    dr.findElement(By.linkText("Vertical slider")).click();
	    dr.switchTo().frame(0);
	    Thread.sleep(2000);
	    WebElement e1=dr.findElement(By.xpath("//*[@id='slider-vertical']/child::*[2]"));
	    Thread.sleep(2000);
	    int x2=e1.getLocation().getX();
	    int y2=e1.getLocation().getY();
	    a.dragAndDropBy(e1,x2,y2+50).build().perform();
	    Thread.sleep(2000);
	    a.dragAndDropBy(e1,x2,y2-300).build().perform();

	}

}
