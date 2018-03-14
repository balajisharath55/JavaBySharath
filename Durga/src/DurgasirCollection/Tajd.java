package DurgasirCollection;

public class Tajd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TakingDataFromExcel ta=new TakingDataFromExcel();
		for(int i=0;i<=4;i++){
			for(int j=0;j<=3;j++){
	ta.toInsertDatatoExcel("Sheet2",i,j,"nhdarath");
	}
		}
		System.out.println("done==================");
	}

}
