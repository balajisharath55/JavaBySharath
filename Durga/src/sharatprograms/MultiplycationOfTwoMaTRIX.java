package sharatprograms;

public class MultiplycationOfTwoMaTRIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[][]= {{1,2},{1,3},{1,4}};
		int m2[][]= {{1,3,4},{1,4,5}};
		int r[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<2;k++) {
					sum=sum+m1[i][k]*m2[k][j];
				}
				r[i][j]=sum;
				sum=0;
			}
		}
		for(int i = 0; i < 3; i++)  
        {  
            for(int j = 0; j < 3; j++)  
            {  
                System.out.print(r[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
		
		
		
		

	}

}
