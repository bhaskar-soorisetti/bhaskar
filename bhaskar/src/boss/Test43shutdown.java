package boss;

public class Test43shutdown {

	public static void main(String[] args) throws Exception
	{
		// program for shutdown system
		if(System.getProperty("os.name").contains("Windows"))
		{
			Runtime.getRuntime().exec("shutdown -f -s");
		}
		else if(System.getProperty("os.name").contains("Mac"))
		{
			Runtime.getRuntime().exec("sudo shutdown -h now");
		}
		else if(System.getProperty("os.name").contains("Linux"))
		{
			Runtime.getRuntime().exec("shutdown -h now");
		}
		else
		{
			System.exit(0);
		}

	}

}
