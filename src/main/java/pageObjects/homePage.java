package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;
	@FindBy(css = "header a img[title='Your Store']")
	WebElement titleImg;

	@FindBy(css = "header a")
	WebElement titleImgLink;

	@FindBy(css = "div span[css='2']")
	WebElement phoneNo;	
	
	@FindBy(css = "li a i[class*='phone']")
	WebElement phoneLink;
	
	@FindBy(css = "div a i[css='3']")
	WebElement myAccLink;
	
	@FindBy(css = "div a i[css='3']")
	WebElement myAccText;
	

	@FindBy(css = "body nav[id='top']")
	List<WebElement> top_head_Section;

	@FindBy(css = "div input[name='search']")
	WebElement search_textbox;

	@FindBy(css = "div button[class*='light']")
	WebElement search_btn;

	@FindBy(css = "div button[class*='inverse']")
	WebElement cart_btn;

	@FindBy(css = "div nav[id='menu']")
	List<WebElement> header_Section;

	@FindBy(css = "ul.navbar-nav .dropdown:first-child")
	WebElement desktop_Link;

	@FindBy(css = "div a strong")
	WebElement currency_Symbol;

	@FindBy(css = "form[id='form-currency']")
	WebElement currency;

	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getImgTitle() {
		String logo = titleImg.getAttribute("title");
		System.out.println("Image title is " + logo);
		return logo;
	}
	
	public boolean check_Currency_Symbol()
	{
		if((currency_Symbol.getText()).equals("$"))
				{
				System.out.println("Currency symbol is present");
				return true;
				}
		else
			return false;
	}

}
