import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExample {

	public static void main(String[] args) {
		try{
		XSSFWorkbook workBook=new XSSFWorkbook();
		FileOutputStream out=new FileOutputStream(new File("E:/Xceldemo.xlsx"));
		XSSFSheet spreadSheet=workBook.createSheet("TCITrainingReport");
		workBook.write(out);
		out.close();
		}
		catch(Exception ex){
			System.out.println("error is "+ex.getMessage());
		}

		System.out.println("Excel file is created");
	}

}
