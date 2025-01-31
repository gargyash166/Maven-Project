package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     
	  WebDriver driver;
	
	@FindBy(name="username")
	private WebElement usertextbox;
	@FindBy(name="password")
	private WebElement passfld;
	@FindBy(xpath="//button[.=' Login ']")
	private WebElement loginbtn;
	
    public LoginPage(WebDriver driver){
	   this.driver =driver;
		PageFactory.initElements(driver,this);

 
     }
	
	public void enterusername(String user) {
		
	  usertextbox.sendKeys(user);
	}
	public void enterpassword(String pass) {
		
		passfld.sendKeys(pass);
	}
	public void clicklogin() {
		
		loginbtn.click();
	}
	public void logintoapp(String user, String pass) {
		
		this.enterusername(user);
		this.enterpassword(pass);
		this.clicklogin();
		
		
		
	}
}














