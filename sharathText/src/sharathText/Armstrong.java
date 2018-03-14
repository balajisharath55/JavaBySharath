package sharathText;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b,temp=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number");
		n=s1.nextInt();
		b=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			temp=temp+a*a*a;
		}
		if (temp==b)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
		

	}

}
