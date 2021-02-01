//package Test;
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
//import dao.ProductDao;
//import service.ProductService;
//
//public class ProductDaoTest {
//	static ProductDao pd;
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		pd = new ProductDao();
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		pd=null;
//	}
//
//
//	//@Test
//	public void testDisplayAllProduct() {
//		assertEquals(6,pd.displayAllProduct().size());
//	}
//
//	//@Test
//	public void testInsertProduct() {
//		Product p = new Product();
//		p.setPid("1234");
//		p.setPname("Laptop2");
//		p.setPrice(5555);
//		assertEquals(false,pd.insertProduct(p));
//	}
//
//	//@Test
//	public void testDeleteProduct() {
//		Product p = new Product();
//		p.setPid("123");
//		assertEquals(true,pd.deleteProduct(p));
//	}
//
//	//@Test
//	public void testInvalidId() {
//		Product p = new Product();
//		p.setPid("1234");
//		assertEquals(true,pd.invalidId(p));
//	}
//
//	@Test
//	public void testDisplaySingalProduct() {
//		Product p=pd.displaySingalProduct("1234");
//		assertEquals("Laptop2",p.getPname());
//		
//	}
//
//}
