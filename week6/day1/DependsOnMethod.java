package week6.day1;

import org.testng.annotations.Test;

public class DependsOnMethod {
	//@Test(dependsOnMethods={packagename.classname.methodname})
	@Test(dependsOnMethods="login")
	public void homepage() {
		System.out.println("homepage");
	}
	@Test(dependsOnMethods="homepage")
	public void leads() {
		System.out.println("leads");
	}
	@Test
	public void login() {
		System.out.println("login");
	}

}
