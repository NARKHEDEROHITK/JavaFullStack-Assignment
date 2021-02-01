package dao;
import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import resourse.DbResource;

public class ProductDao {
	PreparedStatement pstmt;
	ResultSet rs;
	
		public List<Product> displayAllProduct() {
			boolean flag;
			List<Product> listOfProduct = new ArrayList<>();
			try {
				Connection con = DbResource.getDbConnection(); 
				pstmt = con.prepareStatement("select * from product");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Product p = new Product();
					p.setPid(rs.getString(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getFloat(3));
					//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
//					p.setStoreDate(rs.getDate(4).toLocalDate());     // conveting SQL date to LocalDate format. 
					listOfProduct.add(p);
					flag=true;
					
				}
			} catch (Exception e) {
				
			}
			return listOfProduct;
		}

		public boolean insertProduct(Product p) {
			// TODO Auto-generated method stub
			boolean flag=false;
			try {
				
				Connection con = DbResource.getDbConnection();		
				pstmt = con.prepareStatement("insert into product values(?,?,?)");	
				pstmt.setString(1, p.getPid());
				pstmt.setString(2, p.getPname());
				pstmt.setDouble(3, p.getPrice());
				int res1 = pstmt.executeUpdate();
				if(res1>0) {
					flag=true;
				}
				
			} catch (Exception e) {
				flag=false;
			}
			if(flag) {
				return true;
			}
			else {
				return false;
			}
			
		}

		public boolean updateProduct(String id,double price , int value) {
			boolean flag=false;
			try {
				Connection con = DbResource.getDbConnection();	
				
				if(value==1) {
					pstmt = con.prepareStatement("update product set price=price+? where pid = ?");
					pstmt.setDouble(1,price);
				}
				else if(value==2){
					pstmt = con.prepareStatement("update product set price=price-? where pid = ?");
					pstmt.setDouble(1,price);
				}
				else if(value==3){
					pstmt = con.prepareStatement("update product set price=price+price*?/100 where pid = ?");
					pstmt.setDouble(1,price);
				}
				else if(value==4){
					pstmt = con.prepareStatement("update product set price=price-price*?/100 where pid = ?");
					pstmt.setDouble(1,price);
				}
				pstmt.setString(2, id);
				int res2 = pstmt.executeUpdate();
				if(res2>0) {
					flag=true;
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
			if (flag) {
				return true;
			} else {
				return false;
			}
		}

		public boolean deleteProduct(Product p) {
			boolean flag=false;
			try {
				Connection con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("delete from product where pid = ?");
				pstmt.setString(1, p.getPid());
				int res2 = pstmt.executeUpdate();
				if(res2>0) {
					flag=true;
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
			if (flag) {
				return true;
			} else {
				return false;
			}
		}

		public boolean invalidId(Product p) {
			boolean flag=false;
			try {
				Connection con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("select pid from product");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					if(rs.getString(1).equals(p.getPid())){
						flag=true;
					}
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			if(flag) {
				return true;
			}else {
				return false;
			}
		}

		public Product displaySingalProduct(String id) {
			Product p = new Product();
			try {
				Connection con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("select * from product where pid=?");
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					
					p.setPid(rs.getString(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getDouble(3));
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return p;
			
		}
}
