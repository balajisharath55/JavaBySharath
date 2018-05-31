package sharatprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {
	//first method to RemoveDuplicatesInString
	public String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

	public static void main(String[] args) {
RemoveDuplicatesInString re=new RemoveDuplicatesInString();

System.out.println(re.removeDuplicates("sharathbarath"));
		/*second  method to RemoveDuplicatesInString
		 * 
		 *  String string = "sharath";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());*/

    }

}
