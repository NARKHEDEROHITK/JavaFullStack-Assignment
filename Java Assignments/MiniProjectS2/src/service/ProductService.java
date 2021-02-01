package service;
import java.io.*;
import dao.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import bean.*;
public class ProductService{

	
	List<Product> listOfProduct = new ArrayList<>();
	ProductDao pd=new ProductDao();
	public boolean addProduct(Product p){
		if(p.getPrice() < 500) {
			return false;
		}
	
		if(pd.insertProduct(p)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean deleteProduct(Product p) {
		if(pd.deleteProduct(p)) {
			System.out.println("cursor comes here");
			return true;
		}else {
			return false;
		}	
	}

	public List<Product> displayAllProductLowerNames() {
		List<Product> l=pd.displayAllProduct();
		l.forEach(p->p.setPrice(p.getPrice()*120/100));
		Collections.sort(l,(p1,p2)->(p1.getPname().compareTo(p2.getPname())));
		return l;
	}
	
	public List<Product> displayAllProductHigherPrice() {
		List<Product> l=pd.displayAllProduct();
		l.forEach(p->p.setPrice(p.getPrice()*120/100));
		Collections.sort(l,(p1,p2)->(int)(p1.getPrice()-p2.getPrice()));
		Collections.reverse(l);
		return l;
	}
	
	public List<Product> displayAllProductLowerPrice() {
		List<Product> l=pd.displayAllProduct();
		l.forEach(p->p.setPrice(p.getPrice()*120/100));
		Collections.sort(l,(p1,p2)->(int)(p1.getPrice()-p2.getPrice()));
		return l;
	}
	
	public List<Product> displayAllProductHigherNames() {
		List<Product> l=pd.displayAllProduct();
		l.forEach(p->p.setPrice(p.getPrice()*120/100));
		Collections.sort(l,(p1,p2)->p1.getPname().compareTo(p2.getPname()));
		Collections.reverse(l);
		return l;	
	}
	
	public boolean invalidId(Product p) {
		if(pd.invalidId(p)) {
			return true;
		}
		else {
			return false;
		}
	}


	public Product displaySingalProduct(String id) {
		return pd.displaySingalProduct(id);
	}

	public boolean updatePrice(String id,double price,int value) {
		if(pd.updateProduct(id,price,value)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
}
