package sharatprograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Morse Code = Here comes dots
		String str1="Eleven plus two";
		String str2="Twelve plus one";
		str1.replaceAll(" ", "\\s");
		str2.replaceAll(" ", "\\s");
		Boolean status=true;
		if(str1.length()!=str2.length()) {
			status=false;
		}
		else {
			char[] array1=str1.toLowerCase().toCharArray();
			char[] array2=str2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			status=Arrays.equals(array1, array1);
		}
		if(status) {
			System.out.println(str1+" and "+str2+" are anagrams");
		}
		else {
			System.out.println(str1+" and "+str2+" are not anagrams");
		}
	}

}
