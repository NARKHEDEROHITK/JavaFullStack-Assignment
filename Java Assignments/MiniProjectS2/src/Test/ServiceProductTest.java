//package Test;
//import service.*;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import bean.Product;
//
//public class ServiceProductTest {
//	static ProductService ps;
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		ps = new ProductService();
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		ps=null;
//	}
//
//	//@Test
//	public void deleteProductTest() {
//		Product p = new Product();
//		p.setPid("26012021140301");
//		assertEquals(true,ps.deleteProduct(p));
//	}
//	
//	//@Test
//		public void addProductTest() {
//			Product p = new Product();
//			p.setPid("123");
//			p.setPname("Laptop1");
//			p.setPrice(66666);
//			assertEquals(false,ps.addProduct(p));
//		}
//		
//	//@Test
//		public void displayAllProductLowerNamesTest() {
//			assertEquals(6,ps.displayAllProductLowerNames().size());
//		}
//	//@Test
//	public void displayAllProductHigherPriceTest() {
//		assertEquals(6,ps.displayAllProductHigherPrice().size());
//	}
//	//@Test
//	public void displayAllProductLowerPriceTest() {
//		assertEquals(6,ps.displayAllProductLowerPrice().size());
//	}
//	//@Test
//	public void displayAllProductHigherNames() {
//		assertEquals(6,ps.displayAllProductHigherNames().size());
//	}
//	//@Test
//		public void invalidIdTest() {
//			Product p = new Product();
//			p.setPid("123");
//			assertEquals(true,ps.invalidId(p));
//		}
//	//@Test
//	public void displaySingalProductTest() {
//		Product p=ps.displaySingalProduct("123");
//		assertEquals("Laptop1",p.getPname());
//		assertEquals(66666,(int)p.getPrice());
//	}
//	@Test
//	public void updatePriceTest() {
//		
//		assertEquals(true,ps.updatePrice("123",6,2));
//	}
//
//}
