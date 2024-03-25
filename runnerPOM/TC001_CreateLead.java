package runnerPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basePOM.BaseClassLeads;
import pagesPOM.LoginPage;

public class TC001_CreateLead extends BaseClassLeads{

@BeforeTest
public void setData() {
filedata="POMcreateLead";
}
@Test(dataProvider="getData")
public void loginCreateLead(String uName, String uPswd, String cName, String fName, String lName, String phNo) {
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(uName).enterPassword(uPswd).clickLoginButton().clickCRMlink().clickLeadsForCreate()
	.clickCreateLeadTab().enterCompanyName(cName).enterFirstName(fName).enterLastName(lName)
	.enterPhNo(phNo).clickCreateLeadButton().viewLead();
	
	
}

}
