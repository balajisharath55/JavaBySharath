package sharathText;
import java.util.*;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=s.nextInt();
		for(i=2;i<no;i++){
			if(no%i==0){
				System.out.println("Not prime");
			break;
			}
		}
	 if(no==i){
			System.out.println("prime");
	 }
		}

	}


