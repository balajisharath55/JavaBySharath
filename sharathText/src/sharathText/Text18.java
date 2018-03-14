package sharathText;
import java.util.*;
public class Text18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,c,k,space=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		space=n-1;
		for(k=1;k<=n;k++){
			for(c=1;c<=space;c++)
				System.out.println(" ");
				space--;
				for(c=1;c<=2*k-1;c++)
					System.out.print("*");
					System.out.print(" ");			
		}
		space=1;
		for(k=1;k<=n-1;k++){
			for(c=1;c<=space;c++)
				System.out.print(" ");
				space--;
				for(c=1;c<=2*k-1;c++)
					System.out.print("*");
					System.out.print(" ");
			
		}
		
		

	}

}
