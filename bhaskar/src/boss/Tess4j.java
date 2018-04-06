package boss;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class Tess4j {

	public static void main(String[] args) throws Exception
	{
		//toasted messages display
		File f= new File("toastedmsg.png");
		File tess=LoadLibs.extractTessResources("tessdata");
		ITesseract obj=new Tesseract();
		obj.setDatapath(tess.getAbsolutePath());
		String res=obj.doOCR(f);
		System.out.print(res);
		

	}

}
