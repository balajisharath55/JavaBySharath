package sharatprograms;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,54,89,5,8,55,53,12};
int n=a.length;
int big=a[0];
int second =a[1];
for(int i=1;i<n;i++) {
	
	if(big<a[i]) {
		big=a[i];		
		if(second<a[i]&&second<big) {
			second=a[i];
		}
	}
}

System.out.println(big);

System.out.println(second);
	}

}
