package sharathText;
import java.util.*;
public class Revrsal_Of_String {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String st;
		String Rvs = "";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String");
	
	
	st=s.nextLine();

	for(int loop=st.length()-1;loop>=0;loop--){
		Rvs= Rvs+st.charAt(loop);

	}
	System.out.print(Rvs);

	}

}
