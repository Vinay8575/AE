package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Account_Info_Page;
import pageObjects.HomePage;
import pageObjects.MyAccount_Page;
import pageObjects.Signup_Login_page;
import testBase.BaseClass;

public class TC_001_SignupTest extends BaseClass
{
	Select drp;
	
    @Test(groups= {"regression"})
   public void testsignup()
    {
    	logger.debug("Application logs...");
    	logger.info("********verfiying theTC_001_SignupTest********");
    	try
    	{
    	HomePage hp=new HomePage(driver);
    	hp.clicksignup_login();
    	
    	Signup_Login_page sp=new Signup_Login_page(driver);
    	sp.setsignupname(RandomString());
    	sp.setsignupemail(RandomString()+"@gmail.com");
    	sp.clicksignup();
    	
    	Account_Info_Page ap=new Account_Info_Page(driver);
    	ap.clicktitle();
    	ap.setpassword(RandomAlphaNumeric());
    	ap.drp_dayy().click();
    	
    	drp=new Select(ap.drp_dayy());
    	drp.selectByVisibleText("6");
    	
    	drp=new Select(ap.drp_monthss());
    	drp.selectByVisibleText("March");
    	
    	drp=new Select(ap.drp_yearss());
    	drp.selectByVisibleText("1994");
    	
    	ap.clicknewspaper();
    	ap.setfirstname(RandomString());
    	ap.setlastname(RandomString());
    	ap.setcompanyname(RandomString());
    	ap.setaddress1(RandomString());
    	ap.setaddress2(RandomString());
    	
    	drp=new Select(ap.setcountryy());
    	drp.selectByVisibleText("India");
    	
    	ap.setstate(RandomString());
    	ap.setcity(RandomString());
    	ap.setzipcode(Randomnumber());
    	ap.setmobilenumber(Randomnumber());
    	ap.click_CreateAccount();
    	
    	String text=ap.verifymessage();
    	Assert.assertEquals(text, "Congratulations! Your new account has been successfully created!");
    	ap.click_continue();
    	
    	MyAccount_Page mp=new MyAccount_Page(driver);
    	mp.click_logout();
    	
    	}
    	catch(Exception e)
    	{
    		logger.error("test failed");
    		logger.debug("debug logs");
    		Assert.fail();
    	}
    	
    	
    }
}
