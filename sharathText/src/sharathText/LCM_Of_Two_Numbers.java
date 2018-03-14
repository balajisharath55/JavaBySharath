package sharathText;
import java.util.*;
public class LCM_Of_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,lcm;
		Scanner s=new Scanner(System.in);
		System.out.print("Eter first number:- ");
		n1=s.nextInt();
		System.out.print("Eter second number:- ");
		n2=s.nextInt();
		lcm=(n1>n2)?n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0){
				System.out.print(lcm);
				break;
			}
			lcm++;
		}}}