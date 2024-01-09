package ATecommerce_project.Proj1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigationmenu {

	public WebDriver driver;

	public Navigationmenu(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	WebElement Menubutton;

	public void Menubutton() {
		// TODO Auto-generated method stub
		Menubutton.click();
	}
	@FindBy(xpath = "//li[10]//button[@aria-expanded='false']")
	WebElement scrolldown;

	

	@FindBy(xpath = "//button[@class=\"c-button-unstyled close-button-flyout menuCloseBtn\"]")
	WebElement Closemenubutton;

	public void Closemenubutton() {
		Closemenubutton.click();
	}

	

	@FindBy(xpath = "//li//a[@data-lid='hdr_td_topdeals']")
	WebElement TopDealsmeunbtn;

	public void TopDealsmeunbtn() {
		// TODO Auto-generated method stub
		TopDealsmeunbtn.click();
		driver.navigate().refresh();
		System.out.println("==== Navigated to Top deals menu ======");
	}

	@FindBy(xpath = "//div[@class='cn-header-deals']")
	WebElement TopDealheaderbtn;

	public void TopDealheaderbtn() {
		// TODO Auto-generated method stub
		TopDealheaderbtn.isDisplayed();
		System.out.println(TopDealheaderbtn.getText());
		System.out.println("Page navigated to Top dealsmenu");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(" Current URL " + currentUrl);
	}
	
	@FindBy(xpath = "//a[@data-lid=\"hdr_dotd\"]")
	WebElement Dealsofdaymeunbtn;

	public void Dealsofdaymeunbtn() {
		// TODO Auto-generated method stub
		Dealsofdaymeunbtn.click();
		driver.navigate().refresh();
	}
	
	@FindBy(xpath = "//a[@data-lid=\"hdr_finds\"]")
	WebElement Bestbuymenubtn;

	
	
	public void Bestbuymenubtn() {
		// TODO Auto-generated method stub
		Bestbuymenubtn.click();
		driver.navigate().refresh();
	}
	@FindBy(xpath = "//div//div//a[@title='BestBuy.com']")
	WebElement Bestbuyhomeretunbtn;

	
	
	public void Bestbuyhomeretunbtn() {
		// TODO Auto-generated method stub
		Bestbuyhomeretunbtn.click();
	}
	
	@FindBy(xpath = "//div[1]//div//footer//ul//li//div//a[@data-lid='ft_icon_visit_our_support_center']")
	WebElement scrolldown1;
	
	public void scrolldown1() {
		
	
WebElement findElement = driver.findElement(By.xpath("//div[1]//div//footer//ul//li//div//a[@data-lid='ft_icon_visit_our_support_center']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,250)", findElement);
js.executeScript("window.scrollBy(0,document.body.scrollHeight)", findElement);
	}
	

	public void explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

		wait.until(ExpectedConditions.visibilityOf(scrolldown1));
	}
}
