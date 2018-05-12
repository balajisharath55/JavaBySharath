package sharathpractice;

import java.util.Scanner;

public class Prime1To1000 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,b,con=0;	
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		System.out.println("prime numbers up to"+ b);
		for(i=1;i<=b;i++){
		int	count = 0;
			
		for(j=i;j>=1;j--){
		if(i%j==0)	{
			count=count+1;
		}
		}
		if(count==2){
			System.out.println(i);
			con++;
		}		
		
		}}
}
