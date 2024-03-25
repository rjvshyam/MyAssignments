package runnerPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basePOM.BaseClassLeads;
import pagesPOM.LoginPage;

public class TC002_DeleteLead extends BaseClassLeads{
	
@BeforeTest
public void setData() {
	filedata="POMdeleteLead";
}
@Test(dataProvider="getData")
public void deleteLead(String uName, String uPswd, String ph) throws InterruptedException {
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(uName).enterPassword(uPswd).clickLoginButton().clickCRMlink().clickLeadsForDelete()
	.clickFindLeadsTab().clickPhoneTab().enterPhoneNo(ph).clickFindLeadsButton().deleteLead()
	.verifyDeletionOfLead();
	
	
}

}
