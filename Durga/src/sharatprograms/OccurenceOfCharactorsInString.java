package sharatprograms;


public class OccurenceOfCharactorsInString {

public static void main(String args[]) {
    char Char;
    int count,countSpace = 0,countDot = 0;
    String a = "Hi my name is Rahul.";
    a = a.toLowerCase();
    for (Char = 'a'; Char <= 'z'; Char++) {
        count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == Char) {
                count++;
            }
        }
        System.out.println("Number of occurences of " + Char + " is " + count);
    }
    for (int j = 0; j < a.length(); j++) {
        switch (a.charAt(j)) {
        case ' ': countSpace++; break;
        case '.': countDot++; break;
        }
}
    System.out.println("occurences of Space" +countSpace);
    System.out.println("occurences of Dot " + countDot);

}
}