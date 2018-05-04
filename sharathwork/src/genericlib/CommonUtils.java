package genericlib;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author sharath
 *
 */
public class CommonUtils {
	/**\
	 * @param sheet
	 * @param rowNum
	 * @param cellNum
	 * @return data
	 * @throws Exception
	 */	
	public String getExcelData(String sheetName , int rowNum, int colNum)
			throws Throwable
	{
		String filePath = "./testData/sharathTestData (2).xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();		
		return data;
	}
	/**
	 * @return proObj
	 * @throws Exception
	 */
	public  Properties dataFromPropertyfile() throws Exception {
		FileInputStream fis=new FileInputStream("./testData/TestData.properties");
		Properties proObj=new Properties();
		proObj.load(fis);
		return proObj;	
	}

}
