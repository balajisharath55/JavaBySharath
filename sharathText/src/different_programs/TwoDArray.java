package different_programs;

import java.util.Scanner;

public class TwoDArray {
public static void main(String args[]) {
	
	int n, temp;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements ");
    n = s.nextInt();
   int f[]=new int[n];
   f[0]=0;
   f[1]=1; 
    for(int i=2;i<n;i++) {
    	f[i]=f[i-1]+f[i-2];
    	
    }
    for(int i=0;i<n;i++) {
    	System.out.print(f[i]+ " ");
    	
    }
    
    
}
}