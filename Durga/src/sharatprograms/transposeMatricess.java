package sharatprograms;

public class transposeMatricess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=2,column=3;
int[][] matrix= {{2,4,5},{7,9,5}};
display(matrix);
int [][] transpose=new int[column][row];
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++){
		transpose[j][i]=matrix[i][j];
	}
}
display(transpose);
	}
public static void display(int[][] matrix) {
System.out.println(" matrices is: ");
for(int[] row:matrix) {
	for(int column:row) {
		System.out.print(column+" ");
	}
	System.out.println( );
}
	}

}
