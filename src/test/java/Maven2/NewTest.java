package Maven2;

import org.testng.annotations.Test;

public class NewTest 
{
  @Test(priority=3)
  public void f() 
  {
	  System.out.println("First Test");
  }
  @Test(priority = 2, description="This is for login")
  public void f2() 
  {
	  System.out.println("Second Test");
  }
  @Test(priority=1)
  public void f3()
  {
	  System.out.println("Third Test");
  }
}
