package boss;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Test43platformtest {

		public static void main(String[] args) throws Exception
	{
		// program for compactbility testing
			
			Robot r=new Robot();
			if(System.getProperty("os.name").contains("Windows"))
			{
				Runtime.getRuntime().exec("notepad.exe");
				Thread.sleep(2000);
				StringSelection x= new StringSelection("hello hai this is bhaskar");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
			   r.keyPress(KeyEvent.VK_CONTROL);
		 	   r.keyPress(KeyEvent.VK_V);
			   Thread.sleep(2000);
			   r.keyRelease(KeyEvent.VK_V);
			   r.keyPress(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_CONTROL);
			   Thread.sleep(2000);
			   StringSelection y=new StringSelection("mynot");
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
			   r.keyPress(KeyEvent.VK_CONTROL);
			   r.keyPress(KeyEvent.VK_V);
			   r.keyRelease(KeyEvent.VK_V);
			   r.keyRelease(KeyEvent.VK_CONTROL);
			   Thread.sleep(2000);
			   r.keyPress(KeyEvent.VK_ENTER);
			   r.keyRelease(KeyEvent.VK_ENTER);
			   Thread.sleep(2000);
			   r.keyPress(KeyEvent.VK_ALT);
			   r.keyPress(KeyEvent.VK_F4);
			   r.keyRelease(KeyEvent.VK_F4);
			   r.keyRelease(KeyEvent.VK_ALT);
			}
			else if(System.getProperty("os.name").contains("Mac"))
			{
				Runtime.getRuntime().exec("notepad.exe");
				Thread.sleep(2000);
				StringSelection x= new StringSelection("hello hai this is bhaskar");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
			   r.keyPress(KeyEvent.VK_META);
		 	   r.keyPress(KeyEvent.VK_V);
			   Thread.sleep(2000);
			   r.keyRelease(KeyEvent.VK_V);
			   r.keyPress(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_META);
			   Thread.sleep(2000);
			   StringSelection y=new StringSelection("mynote");
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
			   r.keyPress(KeyEvent.VK_META);
			   r.keyPress(KeyEvent.VK_V);
			   r.keyRelease(KeyEvent.VK_V);
			   r.keyRelease(KeyEvent.VK_META);
			   Thread.sleep(2000);
			   r.keyPress(KeyEvent.VK_ENTER);
			   r.keyRelease(KeyEvent.VK_ENTER);
			   Thread.sleep(2000);
			   r.keyPress(KeyEvent.VK_ALT);
			   r.keyPress(KeyEvent.VK_F4);
			   r.keyRelease(KeyEvent.VK_F4);
			   r.keyRelease(KeyEvent.VK_ALT);
			}
			else if(System.getProperty("os.name").contains("Linux"))
			{
				Runtime.getRuntime().exec("notepad.exe");
				Thread.sleep(2000);
				StringSelection x= new StringSelection("hello hai this is bhaskar");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
			   r.keyPress(KeyEvent.VK_CONTROL);
		 	   r.keyPress(KeyEvent.VK_V);
			   Thread.sleep(2000);
			   r.keyRelease(KeyEvent.VK_V);
			   r.keyPress(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_S);
			   r.keyRelease(KeyEvent.VK_CONTROL);
			   Thread.sleep(2000);
			   StringSelection y=new StringSelection("mynote");
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
			   r.keyPress(KeyEvent.VK_CONTROL);
			   r.keyPress(KeyEvent.VK_V);
			   r.keyRelease(KeyEvent.VK_V);
			   r.keyRelease(KeyEvent.VK_CONTROL);
			   Thread.sleep(2000);
			   r.keyPress(KeyEvent.VK_ENTER);
			   r.keyRelease(KeyEvent.VK_ENTER);
			   Thread.sleep(2000);
			   r.keyPress(KeyEvent.VK_ALT);
			   r.keyPress(KeyEvent.VK_F4);
			   r.keyRelease(KeyEvent.VK_F4);
			   r.keyRelease(KeyEvent.VK_ALT);
			}
			else
			{
				System.exit(0);
			}

	}

}
