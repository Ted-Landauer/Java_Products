import java.util.*;


public class PickPhrases {

	
	public void PickPhrase(ArrayList<String> list)
	{
		Random rand = new Random();
		
		int number = rand.nextInt(list.size());
		
		System.out.println("Your random phrase is...");
		System.out.println(list.get(number) + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
