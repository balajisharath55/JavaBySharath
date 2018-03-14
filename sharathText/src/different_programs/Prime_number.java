package different_programs;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,con=0;
		System.out.println("prime numbers up to 1000");	
		for(i=1;i<=1000;i++){
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
		
		}
		System.out.println("total no.of prime numbers is "+con);
			}	}


