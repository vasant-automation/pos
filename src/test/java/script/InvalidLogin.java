package script;

import org.testng.Assert;
import org.testng.annotations.Test;



import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class InvalidLogin extends BaseTest{
	
	@Test(priority=2)
	public void TestInvalidLogin() {
		
		String un = Utility.getXLCellData(XL_PATH, "InvalidLogin", 1, 0);
		String pw = Utility.getXLCellData(XL_PATH, "InvalidLogin", 1, 1);
//		1. enter invalid un
		LoginPage LoginPage = new LoginPage(driver);
		test.info("enter username: "+un);
		LoginPage.setUserName(un);
		
//		2. enter invalid pw
		test.info("enter password: "+pw);
		LoginPage.setPassword(pw);
		
//		3. click on go button
		test.info("click on Go button");
		LoginPage.clickGoButton();
		
//		4. should display error msg
		test.info("Verify Error Message");
		LoginPage.verifyErrMsgIsDisplayed(wait);
		Assert.assertTrue(true);
	}

}
