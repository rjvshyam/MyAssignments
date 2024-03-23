package week6.day1;

import org.testng.annotations.Test;

public class TestNG_Attributes {
	/*//by default priority index starts at 0
	@Test(priority = -1)//(priority = 1)
	public void editLead() {
		System.out.println("editLead");
	}
	@Test(priority = 3)
	public void createLead() {
		System.out.println("createLead");
	}
	@Test//this one will run first since by default priority is 0
	public void deleteLead() {
		System.out.println("deleteLead");
	}*/
	//by default enabled = true
		@Test
		public void editLead2() {
			System.out.println("editLead2");
		}
		@Test(priority=-1,enabled=false)//it will skip this
		public void createLead2() {
			System.out.println("createLead2");
		}
		@Test
		public void deleteLead2() {
			System.out.println("deleteLead2");
		}

}
