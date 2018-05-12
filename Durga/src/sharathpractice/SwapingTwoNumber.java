package sharathpractice;

import java.util.Scanner;

public class SwapingTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		Scanner sca=new Scanner(System.in);
		System.out.println("enter first number");
		a=sca.nextInt();
		System.out.println("enter second number");
			b=sca.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a);
			System.out.println(b);
	}
}
