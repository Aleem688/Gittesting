package practice;
import java.util.HashMap;

import com.hra.GenericUtility.ExcelUtility;

public class HashmapPractice {

	public static void main(String[] args) throws Throwable {
		
		ExcelUtility elib=new ExcelUtility();
		HashMap<String, String> data = elib.getMultipleDataFromExcel("Individual", 0, 1);
		System.out.println(data);
		
	}

}
