package main;
import service.*;
import bean.Product;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
public class ProductMain{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String id;
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ProductService prod = new ProductService();
		
		do {
			System.out.println("Please choose your task");
			System.out.println("1.	Add Product \n.2.Display Product \n 3.Update Product \n 4.Delete Product  \n 5.Retrieve Product Price\n 6.Exit the Application");
			ch=sc.nextInt();
			Product p;
			int confirmation;
			switch(ch) {
			case 1: 
					SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");  
				    Date date = new Date();
				    id=formatter.format(date);
					System.out.println("Enter Name of Product");
					String name=sc.next();
					System.out.println("Enter price of Product");
					double price=sc.nextDouble();
				try {
					p=prod.addProduct(id,name,price);
					FileOutputStream fos = new FileOutputStream("product.ser");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(p);
					oos.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					p=prod.display(id);
					System.out.println("Product Id="+p.getPid());
					System.out.println("Product Name="+p.getPname());
					System.out.println("Product Price="+p.getPrice());
					break;
			case 2:System.out.println("Enter Id of Product");
					id=sc.next();
					
					if(prod.invalidId(id)) {
						p=prod.display(id);
						System.out.println("Product Id="+p.getPid());
						System.out.println("Product Name="+p.getPname());
						System.out.println("Product Price="+p.getPrice());
					}else {
						System.out.println("Invalid Product ID");
					}
					
					
					break;
			case 3:System.out.println("Enter Id of Product");
					id=sc.next();
					if(prod.invalidId(id)) {
						System.out.println("Enter Updataed Price");
						price=sc.nextInt();
						p=prod.updateProduct(id,price);
						System.out.println("Product Id="+p.getPid());
						System.out.println("Product Name="+p.getPname());
						System.out.println("Product Price="+p.getPrice());
					}else {
						System.out.println("Invalid Product ID");
					}
					break;
			case 4:System.out.println("Enter Id of Product");
					id=sc.next();
					if(prod.invalidId(id)) {
						
						if(prod.deleteProduct(id)) {
							System.out.println("Your product deleted succefully");
						}else {
							System.out.println("Your product not succefully");
						}
					}else {
						System.out.println("Invalid Product ID");
					}
					
					break;
			
			case 5:List<Product> listOfProduct= prod.displayAllProduct();
					for(Product i:listOfProduct) {
						System.out.println("Product Id="+i.getPid());
						System.out.println("Product Name="+i.getPname());
						System.out.println("Product Price="+i.getPrice());
					}
					break;
			case 6:flag=false;
					break;
			default:System.out.println("Please enter right choice");
			}
		}while(flag);

	}

}
