import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiExample {

	public static void main(String[] args) throws Exception{
		FileInputStream file=new FileInputStream(new File("E:/data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet spreadSheet=workbook.getSheetAt(0);
		Iterator<Row> rowIterator=spreadSheet.iterator();
		while (rowIterator.hasNext()){
			Row row=rowIterator.next();
			Iterator<Cell> cellIterator=row.cellIterator();
			while(cellIterator.hasNext()){
				Cell cell=cellIterator.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(cell.getBooleanCellValue()+"\t\t");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue()+"\t\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
						System.out.println(cell.getNumericCellValue()+"\t\t");
						break;
				}
			}
			
			System.out.println(" ");
		}
		
		file.close();
		
		FileOutputStream out=new FileOutputStream(new File("E:/newData.xlsx"));
		workbook.write(out);
		out.close();
		

	}

}
