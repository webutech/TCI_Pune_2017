import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemo {

	public static void main(String[] args) throws Exception{
		File file=new File("E:/test.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("This is my first file");
		fw.close();
		
		

	}

}
