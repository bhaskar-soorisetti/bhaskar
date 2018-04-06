package boss;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test39handlesslcerti {
	public static void main(String[] args) throws Exception
	{
		// Program for handling ssl certificates in browser for chrome and firefox
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		System.setProperty("webdriver.chrome.driver","G://selenium//chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.google.co.in");
		Thread.sleep(5000);
		dr.close();
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fp = pi.getProfile("default");
		fp.setAcceptUntrustedCertificates(true);
		fp.setAcceptUntrustedCertificates(false);
		System.setProperty("webdriver.firefox.marionette","g://selenium//softwaress//geckodriver.exe");
		FirefoxDriver dr1=new FirefoxDriver();
		dr1.get("http://www.google.co.in");
		Thread.sleep(5000);
		dr1.close();
		
		
		

	}

}
