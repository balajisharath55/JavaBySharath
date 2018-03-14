package sharathText;

import java.util.*;

public class Largest_Of_Three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,largest;
		Scanner s=new Scanner(System.in);
	System.out.println("enter any three number");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	largest=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(largest);
	}

}
