package boss;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17
{
	public static void main(String[] args) throws InterruptedException
	{
		// manipulation of window position
		  System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		  ChromeDriver dr=new ChromeDriver();
		  dr.get("http://google.com");
		  dr.manage().window().maximize();
		  Thread.sleep(3000);
		  //get width and height of window
		  int w=dr.manage().window().getSize().getWidth();
		  int h=dr.manage().window().getSize().getHeight();
		  System.out.println(w+" "+h);
		  Thread.sleep(2000);
		  //change width and height of window
		  Dimension d=new Dimension(100,200);
		  dr.manage().window().setSize(d);
		  Thread.sleep(3000);
		  //get x and y coordinates
		  int x=dr.manage().window().getPosition().getX();
		  int y=dr.manage().window().getPosition().getY();
		  System.out.println(x+" "+y);
		  Thread.sleep(3000);
		  //change position of browser window on desktop
		  Point p=new Point(500,600);
		  dr.manage().window().setPosition(p);
		  Thread.sleep(2000);
		  //close
		  dr.close();

	}

}
