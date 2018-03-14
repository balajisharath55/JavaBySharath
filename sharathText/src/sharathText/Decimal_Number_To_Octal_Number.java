package sharathText;
import java.util.*;
public class Decimal_Number_To_Octal_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter decimal number");
int num=s.nextInt();
String OctalString=Integer.toOctalString(num);
System.out.println("method 1: Decimal to octal : "+OctalString);

	}

}
