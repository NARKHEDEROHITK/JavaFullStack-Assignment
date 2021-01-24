
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class WordsPresent {

//	public static void main(String[] args) throws Exception{
//		FileInputStream fis = new FileInputStream("E:\\Employee.txt");
//		BufferedInputStream bis = new BufferedInputStream(fis);		
//		int ch,count=0;
//		
//		while((ch=bis.read()) != -1){ 
//				if(ch == 32)
//				{
//					count++;
//				}
//		}
//		 
//		fis.close();
//		
//		System.out.println("NO of Words present in file is="+count);
//	}
	
	public static void main(String[] args) throws Exception{
		String line;
		int  lenth=0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\Employee.txt"), Charset.forName("UTF-8")))) {
			while ((line = br.readLine()) != null) {
			    String[] words = line.split(" ");
			    // Now you have a String array containing each word in the current line
			    lenth=lenth+words.length;
			}
		}
		System.out.println("Number of Words present in file is="+lenth);
	}

}

