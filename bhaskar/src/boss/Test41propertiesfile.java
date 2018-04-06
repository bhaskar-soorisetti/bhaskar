package boss;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test41propertiesfile {

	public static void main(String[] args) throws Exception
	{
		// using properties file in the program
		//properties file laoding to program
		File f=new File("data.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		System.setProperty(p.getProperty("cd"), p.getProperty("cdp"));
		ChromeDriver dr=new ChromeDriver();
		dr.get(p.getProperty("google"));
		Thread.sleep(10000);
		dr.close();

	}

}
