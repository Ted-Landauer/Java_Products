import java.io.*;
import java.util.*;

public class GatherPhrases {
	protected ArrayList<String> phrases = new ArrayList<>();
	
	
	public ArrayList<String> ReadPhrases(File file)
	{
		
		BufferedReader br = null;
		
		try
		{
			
			FileReader fr = new FileReader(file);
		    br = new BufferedReader(fr);
		
		    String line;
		    while((line = br.readLine()) != null)
		    {
			    phrases.add(line);
			    
		    }
		    
		    if((line = br.readLine()) == null)
		    {
		    	System.out.println("File reading has finished and there are " + phrases.size() + " lines.");
		    	br.close();
		    	return phrases;
		    }
		    
		}
		
		catch (IOException e)
		{
		    e.printStackTrace();
		}
		
		finally
		{
		    try
		    {
		        br.close();
		    }
		    
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    }
		}
		return phrases;
		    		
	}
	
	public void HelloWorld()
	{
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args)
	{
		//File file = new File(args[0]);
		File file = new File("C:\\Users\\Gorden Freeman\\Desktop\\phrases.txt");
		GatherPhrases test = new GatherPhrases();
		
		test.HelloWorld();
		test.ReadPhrases(file);
	}
	
	
}
