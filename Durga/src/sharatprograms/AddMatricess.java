package sharatprograms;

public class AddMatricess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=2,columns=3;
int[][] firstMatrix= {{2,4,5},{7,9,5}};
int[][] secondmatrix= {{3,9,4},{3,23,14}};
int [][] sum=new int[rows][columns];
for(int i=0;i<rows;i++) {
	for(int j=0;j<columns;j++){
		sum[i][j]=firstMatrix[i][j]+secondmatrix[i][j];
	}
}
System.out.println("sum of two matrices is: ");
for(int[]row:sum) {
	for(int column:row) {
		System.out.print(column+" ");
	}
	System.out.println( );
}
	}

}
