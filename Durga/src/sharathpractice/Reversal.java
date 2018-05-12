package sharathpractice;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number ,b,temp=0;
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sca.nextInt();
		while(number>0){
b=number%10;
temp=temp*10+b;
number=number/10;
	}
		System.out.println("number is  "+temp);
	}

}
