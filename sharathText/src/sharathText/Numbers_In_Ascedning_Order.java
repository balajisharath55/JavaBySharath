package sharathText;
import java.util.*;
public class Numbers_In_Ascedning_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp = 0;
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("Enter no.of numbers");
n=s.nextInt();
int a[]=new int[n];
System.out.println(" enter all the elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();	
}
for(int j=0;j<n;j++){
	System.out.println(a[j]);
	for(int k=0;k<n;k++){

		if(a[j]>a[k]){
			temp=a[j];
			a[j]=a[k];
			a[k]=temp;
			
		}
	}
}
System.out.println("Element in Ascedning order");
for(int b=0;b<n;b++){
	System.out.println(a[b]+"  ");

}

	}

}
