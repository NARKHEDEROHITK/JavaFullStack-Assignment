
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LowerCase {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("E:\\Employee.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);		// connect to buffer 
		FileOutputStream fos = new FileOutputStream("lowercase.txt");
		BufferedOutputStream bos  = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read()) != -1){//'a' or '@' EOF in java -1 is consider as EOF 
			
				bos.write(Character.toLowerCase(ch));
		}
		bos.flush(); 
		fis.close();
		fos.close();
		System.out.println("File converted in to lowercase...");
	}

}