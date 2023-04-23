package My_Maven_Package;
// I created a regular java class and soon I used @Test and had to import test ng annotations

// That that java file ---need to configure:
//r click on that java file--run as--select run configure test
//---select only regression from groups drop down--apply--run
// nned to learn how to add from pom xml??
import org.testng.annotations.Test;

public class TestingTestNG {

	@Test(groups="Regression")
	public void loginTest1() 
	{
		
		System.out.println("Login Test");
	}
	@Test(groups= {"Regression", "BVT"})
	public void loginTest2() 
	{
		
		System.out.println("Login Test");
	}
	@Test(groups="bvt")
	public void loginTest3() 
	{
		
		System.out.println("Login Test");
	}
	@Test(groups="Regression")
	public void loginTest4() 
	{
		
		System.out.println("Login Test");
	}

}
