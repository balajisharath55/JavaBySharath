package DurgasirCollection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.rowset.internal.Row;

public class ToReadMultiData {

	public static void main(String[] args) throws Exception {
		FileInputStream inp=new FileInputStream("C:\\Users\\admin\\Desktop\\new.xlsx");
	Workbook wb=WorkbookFactory.create(inp);
	Sheet sh=wb.getSheet("Sheet1");
Iterator<org.apache.poi.ss.usermodel.Row> getro=sh.iterator();
while(getro.hasNext()){
//list.add(getro.next().getCell(0).getStringCellValue());
System.out.println(getro.next().getCell(0).getStringCellValue());
System.out.println(getro.next().getCell(1).getStringCellValue());

}
	}

}
