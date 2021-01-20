import java.text.Collator;
import java.util.Arrays;
public class SortingNames {
   public static void main(String args[]) {
      String names[]={"Akash" , "Ajay" , "Raj" , "ravi"};
      
      Arrays.sort(names, Collator.getInstance());
      for(String i:names) {
			System.out.println(i);
		}
		System.out.println("In decending order");
		for(int i = names.length-1; i>=0;i--) {
			System.out.println(names[i]);
		}
   }
}