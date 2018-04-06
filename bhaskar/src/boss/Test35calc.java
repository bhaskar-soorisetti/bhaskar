package boss;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Test35calc {

	public static void main(String[] args) throws Exception
	{
		// program for open calculator 
		//launch calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(2000);
		//Enter input
		StringSelection x=new StringSelection("1990");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		Thread.sleep(2000);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//click on add symbol
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(2000);
		//enter input 2
		StringSelection y = new StringSelection("2017");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		//click "=" button
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(2000);
		//get output and dispaly
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String z=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		Thread.sleep(2000);
		System.out.println(z);
		//close window
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
	}

}
