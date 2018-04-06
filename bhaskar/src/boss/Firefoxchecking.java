package boss;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Firefoxchecking 
{
	public static void main(String[] args)
	{
		// firefox checking
		//DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("firefox_binary","C:\\Program Files(x86)\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.firefox.marionette", "G:\\selenium\\geckodriver.exe");
		FirefoxDriver dr= new FirefoxDriver();
		dr.get("http://www.google.com");

	}

}
