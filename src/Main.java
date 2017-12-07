import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> phrases = new ArrayList<>();
		
		
		GatherPhrases gather = new GatherPhrases();
		PickPhrases pick = new PickPhrases();
		
		File file = new File(args[0]);
		
		phrases = gather.ReadPhrases(file);
		
		pick.PickPhrase(phrases);
		

	}

}
