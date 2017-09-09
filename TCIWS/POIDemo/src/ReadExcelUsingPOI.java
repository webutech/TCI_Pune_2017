import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUsingPOI {

	public static void main(String[] args) {
		try{
			FileInputStream input=new FileInputStream(new File("E:/data.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet spreadSheet=workbook.getSheetAt(0);
			Iterator<Row> rowIterator=spreadSheet.iterator();
			while(rowIterator.hasNext()){
				Row row=rowIterator.next();
				
				//For Each row, iterate through each column
				Iterator<Cell> cellIterator=row.cellIterator();
				while(cellIterator.hasNext()){
					Cell cell=cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.println(cell.getBooleanCellValue()+"\t\t");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.println(cell.getNumericCellValue()+"\t\t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.println(cell.getStringCellValue()+"\t\t");
						break;

					}
				}
				System.out.println(" ");
			}
			input.close();
			FileOutputStream out=new FileOutputStream(new File("E:/testdata.xlsx"));
			workbook.write(out);
			out.close();
		}
		catch(Exception ex){
			System.out.println("error is : "+ex.getMessage());
		}
	}

}
