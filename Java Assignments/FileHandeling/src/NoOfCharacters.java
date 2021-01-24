
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class NoOfCharacters {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("E:\\Employee.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);		
		int ch,count=0;
		while((ch=bis.read()) != -1){ 	
				count++;
		}
		 
		fis.close();
		
		System.out.println("NO of character present in file is="+count);
	}

}

