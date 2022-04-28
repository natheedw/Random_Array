import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class c2a2q1_2022_EthanEdwards {

	public static void main(String[] args) {
		
		// create one array for the letters, and then a second array for the "random" version of this array.
		String [] wordbox = {"A", "B", "C", "D","E","F","a","b","c","d","e","f"};
		String [] ranwordbox = new String [10];

		
		// similar to the first array, create this one to contain the numbers, and then a "random" version of the array.
		String [] numbox = {"0.5", "1", "1.5", "2", "2.5", "3"};
		String [] rannumbox = new String [10];
		
		// create another array to check against the random version. this must be an array list as will be described below.
		ArrayList<String> wordsCheck = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","a","b","c","d","e","f"));
		
		
		
		//create a for loop to generate a random index up to 10 for both arrays.
			for (int i = 0; i < 10; i++) {
				ranwordbox[i] = wordbox[new Random().nextInt(wordbox.length)];
				rannumbox[i] = numbox[new Random().nextInt(numbox.length)];
		// if statement to remove last comma from output
					if (i == 0)
						System.out.print(ranwordbox[i] + rannumbox[i] );
		
					else 
						System.out.print("," + ranwordbox[i] + rannumbox[i]  );
		}
	 		{
	 			System.out.println(" ");
	 		}
	 		/* a final array list is created, simply to change the random version of the letter array to an array list.
	 		this is done because you cannot remove elements from an array from an array list. both must be array lists. */
	 		ArrayList<String> ranwordboxlist = new ArrayList<>(Arrays.asList(ranwordbox));
	 
	 		wordsCheck.removeAll(ranwordboxlist);
	 	{
	 		/*final formatting. this is to remove the brackets on the output of the unused letters.
	 		 this is done by converting the array list to a string and then removing the brackets. */
	 		
	 			String formattedoutput = wordsCheck.toString();
	 			formattedoutput = formattedoutput.substring(1 ,formattedoutput.length() -1);
	 		
	 				System.out.print("Letters not used: " + formattedoutput);
	 	}
	 	
	 		
		
		
		
		
		
		
		
		
	}
}

		
			
	

		
		
		
		
	
		
		
			
	
			
				
				
				
					
						


				
			
					
					
	

			
		
	
		

	


