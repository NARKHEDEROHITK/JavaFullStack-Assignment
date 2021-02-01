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
		Product returnProduct;
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ProductService prod = new ProductService();
		Product p =new Product();
		
		do {
			System.out.println("Please choose your task");
			System.out.println("\n1.Add Product \n2.Display single Product \n3.Update Product price \n4.Delete Product  \n5.Retrieve Product all Product\n6.Exit the Application");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
					SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");  
				    Date date = new Date();
				    id=formatter.format(date);
					System.out.println("Enter Name of Product");
					String name=sc.next();
					System.out.println("Enter price of Product");
					double price=sc.nextDouble();
					p.setPid(id);
					p.setPname(name);
					p.setPrice(price);
				
					if(prod.addProduct(p)) {
						System.out.println("Your product added Succesfully");
						System.out.println("");
						System.out.println("Product Id="+id);
						System.out.println("Product Name="+name);
						System.out.println("Product Price="+price);
						System.out.println("");
					}else {
						System.out.println("Please enter product price is greater than 500");
					}
					break;
			case 2:System.out.println("Enter Id of Product");
					id=sc.next();
					p.setPid(id);
					if(prod.invalidId(p)) {
						returnProduct=prod.displaySingalProduct(id);
						System.out.println("Product Id="+returnProduct.getPid());
						System.out.println("Product Name="+returnProduct.getPname());
						System.out.println("Product Price="+returnProduct.getPrice());
						System.out.println("");
					}else {
						System.out.println("Invalid Product ID");
						System.out.println("");
					}	
					break;
			case 3:System.out.println("Enter Id of Product");
					id=sc.next();
					p.setPid(id);
					if(prod.invalidId(p)) {
						System.out.println("Enter Your choice \n1.Increase Price by Value \n2.Decrease Price by value \n3.Increase Price by % \n4.Decrease Price by %");
						int choice=sc.nextInt();
						if(choice > 0 && choice <5) {
							System.out.println("Enter amount or % = ");
							double amount=sc.nextDouble();
							if(amount < 0 ) {
								System.out.println("Please Enter Valid amount");
								break;
							}
							if(prod.updatePrice(id,amount,choice)) {
								returnProduct=prod.displaySingalProduct(id);
								System.out.println("Product Id="+returnProduct.getPid());
								System.out.println("Product Name="+returnProduct.getPname());
								System.out.println("Product Price="+returnProduct.getPrice());
								System.out.println("");
							}else if(prod.updatePrice(id,amount,choice)) {
								returnProduct=prod.displaySingalProduct(id);
								System.out.println("Product Id="+returnProduct.getPid());
								System.out.println("Product Name="+returnProduct.getPname());
								System.out.println("Product Price="+returnProduct.getPrice());
								System.out.println("");
							}
							else if(prod.updatePrice(id,amount,choice)) {
								returnProduct=prod.displaySingalProduct(id);
								System.out.println("Product Id="+returnProduct.getPid());
								System.out.println("Product Name="+returnProduct.getPname());
								System.out.println("Product Price="+returnProduct.getPrice());
								System.out.println("");
							}
							else if(prod.updatePrice(id,amount,choice)) {
								returnProduct=prod.displaySingalProduct(id);
								System.out.println("Product Id="+returnProduct.getPid());
								System.out.println("Product Name="+returnProduct.getPname());
								System.out.println("Product Price="+returnProduct.getPrice());
								System.out.println("");
							}
						}else {
							System.out.println("Enter Right choice");
							System.out.println("");
						}
						
			
						}
					else {
						System.out.println("Invaliad Id");
						System.out.println("");
					}
						break;
						

			case 4:System.out.println("Enter Id of Product");
					id=sc.next();
					p.setPid(id);
					if(prod.invalidId(p)) {
						
						if(prod.deleteProduct(p)) {
							System.out.println("Product ID: "+id+" deleted succefully");
							System.out.println("");
						}else {
							System.out.println("Your product not succefully");
						}
					}else {
						System.out.println("Invalid Product ID");
						System.out.println("");
					}
					
					break;
			
			case 5:System.out.println("Enter Your choice \n1.Lower Price \n2.Higher Price \n3.Names Product in ASC \n4.Names Product in DESC");
					int choice=sc.nextInt();
					switch (choice) {
					case 1:prod.displayAllProductLowerPrice().stream().forEach((pl)->{System.out.println("Product Id="+pl.getPid()); System.out.println("Product Name="+pl.getPname()); System.out.println("Product Price="+pl.getPrice()); System.out.println("");});	
						break;
					case 2:prod.displayAllProductHigherPrice().stream().forEach((pl)->{System.out.println("Product Id="+pl.getPid()); System.out.println("Product Name="+pl.getPname()); System.out.println("Product Price="+pl.getPrice()); System.out.println("");});			
						break;
					case 3:prod.displayAllProductLowerNames().stream().forEach((pl)->{System.out.println("Product Id="+pl.getPid()); System.out.println("Product Name="+pl.getPname()); System.out.println("Product Price="+pl.getPrice()); System.out.println("");});	
						break;
					case 4:prod.displayAllProductHigherNames().stream().forEach((pl)->{System.out.println("Product Id="+pl.getPid()); System.out.println("Product Name="+pl.getPname()); System.out.println("Product Price="+pl.getPrice()); System.out.println("");});			
						break;

					default:System.out.println("Please enter right choice");
						break;
					}
					break;
			case 6:flag=false;
					break;
			default:System.out.println("Please enter right choice");
			}
		}while(flag);

	}

}
