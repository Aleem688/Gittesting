package utility.generic.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityClass {

	 public static Map<String, String> readTestData(String filePath) throws IOException {
	        FileInputStream fis = new FileInputStream(new File(filePath));
	       Workbook workbook = new XSSFWorkbook(fis);
	        
	  //  Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheetAt(0);
	
	        Map<String, String> testData = new HashMap<>();
	        for (Row row : sheet) {
	            String key = row.getCell(0).getStringCellValue();
	            String value = row.getCell(1).getStringCellValue();
	            testData.put(key, value);
	        }
	        workbook.close();
	        return testData;
	    }
	
	
	

}
