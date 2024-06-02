package Maven2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 {
  @Test
  public void f() {
	  System.out.println("Test method is executing");  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod is executing");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod is executing");  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass is executing");  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClassis executing");  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest is executing");  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest is executing");  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite is executing");  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite is executing");  
  }
  @Test
  public void f2() {
	  System.out.println("Test2 method is executing");  
  }

}
