package sharathText;
import java.util.*;
public class Years_Divided_into_Mouths_And_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a2=new Scanner(System.in);
		System.out.println("enter no.of days");
		int num=a2.nextInt();
		int days=num%30;
		int month=num/30;
		System.out.println(num+"day ="+month+"month and "+days+"days");
		

	}

}
