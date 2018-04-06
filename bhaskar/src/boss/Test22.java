package boss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test22
{
	public static void main(String[] args) 
	{
		// PROGRAM OF MULTIPLE SELECTION OF DROP-DOWN
	    System.setProperty("webdriver.chrome.driver", "G://selenium//chromedriver.exe");
	    ChromeDriver dr= new ChromeDriver();
	    dr.get("file:///G:/selenium/multipleselection.html");
	    WebElement e=dr.findElement(By.name("cars"));
	    Select s=new Select(e);
	    if(s.isMultiple())
	    {
	    	System.out.println("multiple select");
	    	Actions a=new Actions(dr);
	    	a.keyDown(Keys.CONTROL).build().perform();
	    	a.click(s.getOptions().get(2)).build().perform();
	    	a.click(s.getOptions().get(3)).build().perform();
	    	a.keyUp(Keys.CONTROL).build().perform();
	    	List<WebElement> l=s.getAllSelectedOptions();
	    	for(int i=0;i<l.size();i++ )
	    	{
	    		System.out.println(l.get(i).getText());
	    	}
	    	String x=s.getFirstSelectedOption().getText();
	    	System.out.println(x);
	    }
	    else
	    {
	    	System.out.println("single select");
	    }
	 

	}

}
