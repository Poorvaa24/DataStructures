package poorvatutorial;

import java.util.HashMap;

public class Hashmap {
	
public static void StringOccurances(char[] c)
{
	HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
	for(char ch : c)
	{
		if( charcount.containsKey(ch))
		{
			charcount.put(ch, charcount.get(ch)+1	);
			
		}
		else
		{
			charcount.put(ch, 1);
		}
	}
	System.out.println(charcount);
	
}
	
	
	public static void main(String[] args) {
		
	String s = "abababa";
	char[] c = s.toCharArray();
	StringOccurances(c);
		

	}

}
