package StepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FullS {
WebDriver driver;
	
	

@Given("user naviagte to the signup page")
public void user_naviagate_to_the_signup_page() {
	driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://automationexercise.com/login");
	 
}

@When("user input the (.*)and(.*)$")
public void user_input_the_fullname_and_emailid(String name , String mail) {
	 driver.findElement(By.name("name")).sendKeys(name);
     driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(mail);

}

@When("click on button")
public void click_on_button(){
    driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();

}

@Then("user should naviagte to the information page with valid data")
public void user_should_naviagte_to_the_information_page_with_valid_data() {
	String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
    String exp = "ENTER ACCOUNT INFORMATION";
    assertEquals(act, exp);
}
}



