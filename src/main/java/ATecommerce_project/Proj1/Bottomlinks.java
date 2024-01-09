package ATecommerce_project.Proj1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bottomlinks {
	public WebDriver driver;

	public Bottomlinks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class=\"main-marketing-wrapper flex justify-content-between mb-800\"]")
	WebElement weblinks; 

	public void webtable() {
		// TODO Auto-generated method stub
List<WebElement> findElements = driver.findElements(By.xpath("//div[@class=\"main-marketing-wrapper flex justify-content-between mb-800\"]"));
	for(WebElement getweblinks : findElements) {
		String attribute = getweblinks.getText();
		System.out.println(attribute);
	}
	}
	@FindBy(id="gh-search-input")
	WebElement searchbtn;
	@FindBy(xpath="//button[@aria-label='submit search']")
	WebElement searchclkbtn;
	@FindBy(xpath="//button[@data-sku-id=\"6565695\"]")
	WebElement Addtocartbtnclk;	
	@FindBy(xpath="//button[@data-track=\"Attach Modal: Continue shopping\"]")
	WebElement continueshopping;
	@FindBy(xpath="//button[@data-lid=\"ubr_app\"]")
	WebElement Appliancesbtn;	
	@FindBy(xpath="//button[@data-lid=\"ubr_app_ska\"]")
	WebElement smallappliences;
	@FindBy(xpath="//a[@data-lid=\"ubr_app_ska_fryers\"]")
	WebElement Airfrysbtn;
	@FindBy(id="soldout_facet-Exclude-Out-of-Stock-Items-0")
	WebElement Outofstockfilterbtn;
	@FindBy(id="currentoffers_facet-Price-Drop-4")
	WebElement pricedropcheckbox;
	@FindBy(xpath="//div//h4//a[text()='Sur La Table - Air Fry Toaster Oven - Pepper Black']")
	WebElement clickproducttoaddCart;
	@FindBy(xpath="//button[@data-sku-id='6540933']")
	WebElement Addsecondproduct;
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement gotocart;
	@FindBy(xpath="//ul//li[1]//div[@class='item-title']")
	WebElement firstproductdisplayed;
	@FindBy(xpath="//ul//li[2]//div[@class='item-title']")
	WebElement Secondproductdisplayed;
	
	
	
	public void searchbtn(CharSequence searchbar) {
		// TODO Auto-generated method stub
		searchbtn.sendKeys(searchbar);
	}
	public void searchclkbtn() {
		// TODO Auto-generated method stub
		searchclkbtn.click();
	}
	public void Addtocartbtnclk() {
		// TODO Auto-generated method stub
		Addtocartbtnclk.click();
	}
	public void continueshopping() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		continueshopping.click();
		System.out.println("One product added sucessfully ========================");
	}
	public void Appliancesbtn() {
		// TODO Auto-generated method stub
		Appliancesbtn.click();
	}
	public void smallappliences() {
		// TODO Auto-generated method stub
		smallappliences.click();
	}
	public void Airfrysbtn() {
		// TODO Auto-generated method stub
		Airfrysbtn.click();
	}
	public void Outofstockfilterbtn() {
		// TODO Auto-generated method stub
		Outofstockfilterbtn.click();
	}
	public void pricedropcheckbox() {
		// TODO Auto-generated method stub
		pricedropcheckbox.click();
	}
	public void clickproducttoaddCart() {
		// TODO Auto-generated method stub
		clickproducttoaddCart.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	public void gotocart() {
		// TODO Auto-generated method stub
		gotocart.click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		
		System.out.println("second product added sucessfully using Appliances =====");
	}
	public void firstproductdisplayed() {
		// TODO Auto-generated method stub
		firstproductdisplayed.isDisplayed();
		System.out.println("1. "+firstproductdisplayed.getText()+"=== is displayed on Cart ======");
	}
	public void Secondproductdisplayed() {
		// TODO Auto-generated method stub
		Secondproductdisplayed.isDisplayed();
		System.out.println("2.  "+Secondproductdisplayed.getText()+"=== is displayed on Cart ======");
System.out.println("===== Added two product to cart sucessfully ==========");
	}
	public void Addsecondproduct() {
		// TODO Auto-generated method stub
		Addsecondproduct.click();
	}
	public void scrolltoproduct() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", clickproducttoaddCart);
	}
	public void scrollup() {
		
		
		WebElement findElement = driver.findElement(By.id("gh-search-input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", findElement);
			}
	
}
