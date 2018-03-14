package sharathText;
import java.util.*;
public class Fractorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number");
		n=s1.nextInt();
		for(a=1;a<=n;a++){
			b=b*a;
		}
System.out.println("Factorial is  "+ b);

	}

}
