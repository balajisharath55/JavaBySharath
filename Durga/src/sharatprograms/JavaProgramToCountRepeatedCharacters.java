package sharatprograms;

public class JavaProgramToCountRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Char;
		int count;
String a[]= {"dog","sharat","cat","jirafy","cat","get"};
int n=a.length;
for (Char = 'a'; Char <= 'z'; Char++) {
	 count = 0;
for(int i=0;i<n;i++) {
	
	for(int j=0;j<a[i].length();j++) {
		if (a[i].charAt(j) == Char) {
	        count++;
	    }
	}
	
	
	}
if(count>1)
	System.out.println("Number of occurences of " + Char + " is " + count);


}}
}

                 