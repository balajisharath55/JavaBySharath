package sharathText;
import java.util.*;
public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int counter;
		Random rNum=new Random();
		System.out.println("Random number");
		System.out.println("****************");
		for(counter=1;counter<=10;counter++)
			System.out.println(rNum.nextInt(10));

	}

}
