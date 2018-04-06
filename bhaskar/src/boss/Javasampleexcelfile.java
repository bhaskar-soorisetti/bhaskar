package boss;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.*;

public class Javasampleexcelfile {
	public static void main(String[] args) throws Exception
	{
		//program for getting data using excel file
		//open excel file
		File f= new File("sample.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		// read excel file
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		for(int i=1;i<nour;i++)
		{
			int x= Integer.parseInt(rsh.getCell(0,i).getContents());
			int y= Integer.parseInt(rsh.getCell(1,i).getContents());
			int z= x+y;
			Number n = new Number(2,i,z);
			wsh.addCell(n);
		}
		//save and close excel
		wwb.write();
		wwb.close();
		rwb.close();

	}

}
