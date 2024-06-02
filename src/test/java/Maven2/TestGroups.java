package Maven2;

import org.testng.annotations.Test;

public class TestGroups {
  @Test(groups="smoke testing")
  public void method() {
	  System.out.println("Method is executing");
  }
  
  @Test
  public void method1() {
	  System.out.println("Method1 is executing");
  }
  
  @Test(groups="smoke testing")
  public void method2() {
	  System.out.println("Method2 is executing");
  }
  
  @Test(groups="smoke testing")
  public void method3() {
	  System.out.println("Method3 is executing");
  }
  
}
