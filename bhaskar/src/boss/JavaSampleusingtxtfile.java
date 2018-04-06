package boss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaSampleusingtxtfile {

	
	public static void main(String[] args) throws Exception
	{
		//program for using Sample txt file data
		//read data from file
		File f1=new File("sample.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//write data file
		File f2=new File("sampleres.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String l=null;
		Pattern p =Pattern.compile("[0-9]+");
		while((l=br.readLine())!=null)
		{
			Matcher m=p.matcher(l);
			while(m.find())
			{
				bw.write(m.group());
				bw.newLine();
			}
		}
		//close files
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

}
