package DurgasirCollection;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TakingDataFromExcel {
	public String toInsertDatatoExcel(String sheet,int rowNum,int cellNum,String intsertdata) throws Exception{
		FileInputStream fis=new FileInputStream("./gop/new.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);	
		Row row=sh.createRow(rowNum);
	Cell cell=row.createCell(cellNum);
			cell.setCellValue(intsertdata);
			FileOutputStream fos=new FileOutputStream("./gop/new.xlsx");
			wb.write(fos);
			wb.close();
		
		return intsertdata;
		
		
		
	}
	public static void main (String[] args) throws Throwable{
		TakingDataFromExcel ta=new TakingDataFromExcel();
		for(int i=0;i<=4;i++){
			for(int j=0;j<=4;j++){
	ta.toInsertDatatoExcel("Sheet2",i,j,"barath");
	}
		}
		System.out.println("done==================");
	}
	
}
