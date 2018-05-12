package sharathpractice;

import java.util.Scanner;

public class AmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number ,b,c,temp=0;

		Scanner sca=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sca.nextInt();
		c=number;
		while(number>0){
b=number%10;
temp=temp+b*b*b;
number=number/10;
	}
		if(temp==c) {
			System.out.println("it is Amstrong number");
		}
		else {
			System.out.println("it is not Amstrong number");
		}
	}

}
