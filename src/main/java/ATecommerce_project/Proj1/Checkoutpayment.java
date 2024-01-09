package ATecommerce_project.Proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Checkoutpayment {
	public WebDriver driver;
	
	public Checkoutpayment(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-track='Checkout - Top']")
	WebElement Checkoutbtn;
	@FindBy(xpath="//div[@class='button-wrap ']")
	WebElement Clkguestacct;
	@FindBy(id="user.emailAddress")
	WebElement dummyemail;
	@FindBy(id="user.phone")
	WebElement dummypwd;
	@FindBy(id="text-updates")
	WebElement clkcheckbox;
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuepayment;
	
	public void Checkoutbtn() {
		// TODO Auto-generated method stub
		Checkoutbtn.click();
		System.out.println("=====checkout and payment======");
	}
	public void Clkguestacct() {
		// TODO Auto-generated method stub
		Clkguestacct.click();
	}
	public void dummyemail(CharSequence dummymail) {
		// TODO Auto-generated method stub
		dummyemail.sendKeys(dummymail);
	}
	public void dummypwd(CharSequence dummypswd) {
		// TODO Auto-generated method stub
		dummypwd.sendKeys(dummypswd);
	}
	public void clkcheckbox() {
		// TODO Auto-generated method stub
		clkcheckbox.click();
	}
	public void continuepayment() {
		// TODO Auto-generated method stub
		continuepayment.click();
		System.out.println("======= Order placed sucessfully ======");
	}
	
}
