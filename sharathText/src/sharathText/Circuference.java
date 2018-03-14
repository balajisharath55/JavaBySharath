package sharathText;
import java.util.*;
public class Circuference {

	public static void main(String[] args) {
		double circuference,r;
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		System.out.println("eanter radius of circle");
		 r=s1.nextInt();
		 
		 circuference=Math.PI*r*2;
		
		 System.out.println("circuference of circle ="+circuference);

	}

}
