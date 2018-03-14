package DurgasirCollection;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flipkart{
	@Test(dataProvider="getData")
	public void buyProducts(String cata,String product){
		System.out.println("catagary==>   "+cata+"  productname==>"+product);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] objArr=new Object[7][2];
		objArr[0][0]="Mobile";
		objArr[0][1]="Iphone-6";
		
		objArr[1][0]="Mobile";
		objArr[1][1]="Iphone-7";
		
		objArr[2][0]="Mobile";
		objArr[2][1]="Iphone-8";
		
		objArr[3][0]="Mobile";
		objArr[3][1]="Iphone-X";
		
		objArr[4][0]="Electronics";
		objArr[4][1]="Tv";
		
		objArr[5][0]="Electronics";
		objArr[5][1]="Ac";
	
		objArr[6][0]="Electronics";
		objArr[6][1]="fan";
		
		return objArr;
		
	}
}

