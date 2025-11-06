package Objectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver=new ChromeDriver();
	
	
	public void login1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Rule 1:create a separate java class
	// Rule 2:object creation

	@FindBy(name = "user_name")
	private WebElement usernameEdt;

	@FindBy(name = "user_password")
	private WebElement userpasswordEdt;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	// Rule 3:object initialisation
	// object encapulsation

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getUserpasswordEdt() {
		return userpasswordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	// rule 5:use utilisation ,provide action or business method to specify in
	// application

}
