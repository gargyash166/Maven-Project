package StepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;


import io.cucumber.java.en.When;


public class Signup {
	WebDriver driver;
	
	@Given("user is at signuppage")
	public void user_is_at_signuppage() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://automationexercise.com/login");
	}

	@When("user enter the name and email")
	public void user_enter_the_name_and_email() {
       driver.findElement(By.name("name")).sendKeys("Yash G ");
       driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Yash123456@gmail.com");

	}

	@And("click on signup Button")
	public void click_on_signup_button() {
     driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();

	}

	@Then("user navigated to the information page")
	public void user_navigated_to_the_information_page() {
	   String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
        String exp = "ENTER ACCOUNT INFORMATION";
        assertEquals(act, exp);
        
			   
	}
	
}
