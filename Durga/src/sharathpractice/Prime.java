package sharathpractice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b,i;
Scanner sca=new Scanner(System.in);
System.out.println("enter the number :");
b=sca.nextInt();
for(i=2;i<b;i++) {
	if(b%i==0) {
		System.out.println("it is not prime");
		break;
	}
	
}
if(b==i) {
	System.out.println("it is prime");
}
	}
}


