package sharathText;
import java.util.*;
public class Reversal_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();
		while(n>0){
			i=n%10;
			n=n/10;
			temp=temp*10+i;
		}
		System.out.println(temp);
		

	}

}
