package ATecommerce_project.Proj1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.baseclasse;

public class Test1 extends baseclasse {
	@Test
	public void Signup() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Sign_up sign = new Sign_up(driver);
		sign.link();
		Thread.sleep(9000);
		sign.countryname();
		sign.Accountbutton();
		sign.signupbutton();
		sign.CAdisplayed();
		String ss = sign.CAdisplayed.getText();
		System.out.println(ss);
		if (ss.equals("Create an account")) {
			try {
				sign.createAccount();
				sign.firstname(prop.getProperty("firstname"));
				sign.lastname(prop.getProperty("lastname"));
				sign.enteremail(prop.getProperty("enteremail"));
				sign.enterpwd(prop.getProperty("enterpwd"));
				sign.conformpwd(prop.getProperty("conformpwd"));
				sign.mobileno(prop.getProperty("mobileno"));
				sign.clickcreateAcct();

				WebElement elementclickable = elementclickable(5000, By.xpath("//div[@style='font-weight: normal;']"));
				System.out.println("The given details  " + elementclickable.getText());

				String s = elementclickable.getText();
				System.out.println(s);
				Thread.sleep(3000);
				sign.createAccount();
				sign.Enterloginemail(prop.getProperty("enteremail"));
				sign.Enterloginpwd(prop.getProperty("enterpwd"));
				sign.clickloginbtn();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Navigationmenu n = new Navigationmenu(driver);
			n.Bestbuyhomeretunbtn();
			n.Menubutton();
			Thread.sleep(5000);
			n.Closemenubutton();
			n.TopDealsmeunbtn();
			n.TopDealheaderbtn();
			driver.navigate().back();
			n.Dealsofdaymeunbtn();
			driver.navigate().back();
			n.Bestbuymenubtn();
			driver.navigate().back();
			n.explicitWait();
			n.scrolldown1();
			Bottomlinks links = new Bottomlinks(driver);
			links.webtable();
			links.scrollup();
			Thread.sleep(8000);
			links.searchbtn(prop.getProperty("search"));
			links.searchclkbtn();
			links.Addtocartbtnclk();
			Thread.sleep(5000);
			links.continueshopping();
			n.Menubutton();
			links.Appliancesbtn();
			links.smallappliences();
			links.Airfrysbtn();
			links.Outofstockfilterbtn();
			links.pricedropcheckbox();
			Thread.sleep(3000);
			links.clickproducttoaddCart();
			links.Addsecondproduct();
			Thread.sleep(3000);
			links.gotocart();
			links.firstproductdisplayed();
			links.Secondproductdisplayed();
			Checkoutpayment c = new Checkoutpayment(driver);
			c.Checkoutbtn();
			c.Clkguestacct();
			c.dummyemail(prop.getProperty("enteremail"));
			c.dummypwd(prop.getProperty("mobileno"));
			c.clkcheckbox();
			c.continuepayment();

		}

	}

}
