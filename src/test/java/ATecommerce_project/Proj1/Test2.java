package ATecommerce_project.Proj1;

import org.testng.annotations.Test;

import Baseclass.baseclasse;

public class Test2 extends baseclasse {
    @Test
	public void TestNavigate() throws InterruptedException {
		// TODO Auto-generated method stub
    	Sign_up sign = new Sign_up(driver);
    	sign.countryname();
    	Navigationmenu n = new Navigationmenu(driver);
    	n.explicitWait();
		Checkoutpayment c = new Checkoutpayment(driver);
		c.Checkoutbtn();
		c.Clkguestacct();
		c.dummyemail(prop.getProperty("enteremail"));
		c.dummypwd(prop.getProperty("enterpwd"));
		c.clkcheckbox();
		c.continuepayment();
		
	}}
	

