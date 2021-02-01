package service;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import bean.*;
public class ProductService{

	
	List<Product> listOfProduct = new ArrayList<>();

	public Product addProduct(String id,String name,double price) throws IOException {
		Product p = new Product();
		p.setPid(id);
		p.setPname(name);
		p.setPrice(price);
		
		listOfProduct.add(p);
		return p;
		
	}
	Product j;
	public Product display(String id) {	
		for(Product i:listOfProduct) {
			if(i.getPid().equals(id)){
				j=i;
				
			}
		}
		return j;	
	}
	public Product updateProduct(String id,double price) {
		for(Product i:listOfProduct) {
			if(i.getPid().equals(id)){
				i.setPrice(price);
				j=i;
				
			}
		}
		return j;
	}
	public boolean deleteProduct(String id) {
		
		boolean flag=false;
		for(Product i:listOfProduct) {
			if(i.getPid().equals(id)){
				j=i;
				flag=true;
			}
			
		}
		
		if(flag) {
			listOfProduct.remove(j);
			return true;
		}else {
			return false;
		}
	}
	public List<Product> displayAllProduct() {
		
		return listOfProduct;
	}
	public boolean invalidId(String id) {
		boolean flag=false;
		for(Product i:listOfProduct) {
			if(i.getPid().equals(id)){
				flag=true;
			}
		}
		
		if(flag) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
