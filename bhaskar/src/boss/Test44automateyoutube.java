package boss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test44automateyoutube {

	
	public static void main(String[] args) throws Exception
	{
		//program for automate using sikuli
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.youtube.com");
		dr.manage().window().maximize();
		Thread.sleep(10000);
		dr.findElement(By.name("search_query")).sendKeys("kalam sir speech",Keys.ENTER);
		Thread.sleep(10000);
		dr.findElement(By.partialLinkText("Dr. A P J Abdul Kalam in European Parliament")).click();
		Thread.sleep(10000);
		//sikuli code 
		Screen s = new Screen();
		if(s.exists("skipadd.png") != null)
		{
			s.click("skipadd.png");
		}
		Thread.sleep(5000);
		//move mouse pointer to video body to get Icons
		Location l = new Location(200,300);
		s.wheel(l,Button.LEFT,0);
		s.click("pause.png");
		Thread.sleep(5000);
		//click play icon
		s.wheel(l,Button.LEFT,0);
		s.click("play.png");
		Thread.sleep(5000);
		//move mouse to video
		s.wheel(l,Button.LEFT,0);
		//move mouse pointer to volume icon
		s.mouseMove("sound.png");
		//decrease volume
		Match e= s.find("sliderbutton.png");
		int x = e.getX();
		int y=e.getY();
		Location sl1= new Location(x-30,y);
		s.dragDrop(e,sl1);
		//incrase volume
		Location sl2=new Location(x+30,y);
		s.dragDrop(e,sl2);
		Thread.sleep(5000);
		// close browser window by using sikuli
		s.keyDown(Key.ALT);
		s.keyDown(Key.F4);
		s.keyUp(Key.F4);
		s.keyUp(Key.ALT);
		Thread.sleep(5000);
		
	}

}
