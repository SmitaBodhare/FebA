package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgprac {

	@BeforeClass
	public void beforetest() {
		System.out.println("Before class");
	}
	
	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test(priority=2,invocationCount =3)
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=2,dependsOnMethods={"Test4","Test1"})
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test(timeOut=2000)
	public void Test3() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test 3");
	}
	
	@Test(priority=1)
	public void Test4() {
		System.out.println("Test 4");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	
}
