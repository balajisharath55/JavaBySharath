package sharathText;
import java.util.*;
public class Gcd_Of_Two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,gcd=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Eter first number:- ");
		n1=s.nextInt();
		System.out.print("Eter second number:- ");
		n2=s.nextInt();
		for(int i=1;i<=n1&&i<=n2;i++){
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		System.out.print(gcd);

	}

}
