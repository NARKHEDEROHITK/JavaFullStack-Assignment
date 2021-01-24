

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FirstLetterUpperCase {
	
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("E:\\Employee.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);		// connect to buffer 
		FileOutputStream fos = new FileOutputStream("sentencecapital.txt");
		BufferedOutputStream bos  = new BufferedOutputStream(fos);
		int ch;
		int flag=0;
		while((ch=bis.read()) != -1){//'a' or '@' EOF in java -1 is consider as EOF 
			
			if(flag==1) {
				if(ch==32) {
					bos.write(Character.toUpperCase(ch));
				}else {
					flag=0;
					bos.write(Character.toUpperCase(ch));
				}
			}
			else {
				bos.write(Character.toLowerCase(ch));
			}
			if(ch=='.') {
				flag=1;
				
			}
			
			
		}
		bos.flush(); 
		fis.close();
		fos.close();
		System.out.println("File Capitalize...");
	}

}
