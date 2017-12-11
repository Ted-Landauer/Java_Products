import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// print out the name of the file to test what is in args 0
		//then use preset filenames and if statements to get the right lists populated
		//
		//seems the array lists are all growing at the same time
		//this needs to be fixed
		//also
		//make it remove something that has just been 
		//used from the list so we don't get duplicates
		
		//run on command line with
		//java -cp . <ClassName> <variables>
		ArrayList<String> phrases1 = new ArrayList<>();
		ArrayList<String> phrases2 = new ArrayList<>();
		ArrayList<String> phrases3 = new ArrayList<>();
		ArrayList<String> phrases4 = new ArrayList<>();
		ArrayList<String> phrases5 = new ArrayList<>();
		
		
		
		GatherPhrases gather = new GatherPhrases();
		PickPhrases pick = new PickPhrases();
		
		
		
		File folder = new File(args[0]);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        //System.out.println(file.getName());
		    	
		    	String fileName = file.getName();
		    	System.out.println("The name of the file being read in before the swich is " + file);
		    	
		    	
		    	switch (fileName) {
		    	    case "phrases_test1.txt":
		    	    	System.out.println("case 1");
		    	        //File file = new File(args[0]);
		    	        System.out.println("The name of the file being read in is " + file);
		    			
		    			phrases1 = gather.ReadPhrases(file);
		    			
		    			pick.PickPhrase(phrases1);
		    	        
		    	        
		    	    	break;
		    	    case "phrases_test2.txt":
		    	    	System.out.println("case 2");
		    	    	
                        System.out.println("The name of the file being read in is " + file);
		    			
		    			phrases2 = gather.ReadPhrases(file);
		    			
		    			pick.PickPhrase(phrases2);
		    			
		    	    	break;
		    	    case "phrases_test3.txt":
		    	    	System.out.println("case 3");
		    	    	
                        System.out.println("The name of the file being read in is " + file);
		    			
		    			phrases3 = gather.ReadPhrases(file);
		    			
		    			pick.PickPhrase(phrases3);
		    	    	
		    	    	break;
		    	    case "phrases_test4.txt":
		    	    	System.out.println("case 4");
		    	    	
                        System.out.println("The name of the file being read in is " + file);
		    			
		    			phrases4 = gather.ReadPhrases(file);
		    			
		    			pick.PickPhrase(phrases4);
		    	    	
		    	    	break;
		    	    case "phrases_test5.txt":
		    	    	System.out.println("case 5");
		    	    	
                        System.out.println("The name of the file being read in is " + file);
		    			
		    			phrases5 = gather.ReadPhrases(file);
		    			
		    			pick.PickPhrase(phrases5);
		    	    	
		    	    	break;
		    	    	
		    	    default:
		    	    	System.out.println("end of switch");
		    	}
		    	
		    }
		}
		
		
		
		//File file = new File("C:\\Users\\Gorden Freeman\\Desktop\\phrases.txt");
		
		
		
		
		//System.out.println("The name of the file being read in is " + file);
		
		//phrases = gather.ReadPhrases(file);
		
		//pick.PickPhrase(phrases);
		

	}

}
