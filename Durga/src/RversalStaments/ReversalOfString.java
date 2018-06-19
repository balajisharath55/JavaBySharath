package RversalStaments;

import java.util.Scanner;

public class ReversalOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev,str;
		Scanner sca=new Scanner(System.in);
		System.out.println("enter words");
		str=sca.nextLine();
		rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
System.out.println(rev);
	}

}
