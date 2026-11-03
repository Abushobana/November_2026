package CucumberTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	    WebDriver driver;
	    
	@Given("user launches on the demowebshop login page in the browser")
	public void user_launches_on_the_demowebshop_login_page_in_the_browser() {
		
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
	}

	@When("user enter the invalid username in demowebshop in username field")
	public void user_enter_the_invalid_username_in_demowebshop_in_username_field() {

	     WebElement user = driver.findElement(By.id("Email"));
	     user.sendKeys("window12@gmail.com");
	
	}

	@When("user enter the invalid password in demowebshop in password field")
	public void user_enter_the_invalid_password_in_demowebshop_in_password_field() {
 
		  WebElement pass = driver.findElement(By.id("Password"));
		  pass.sendKeys("Window123");
	
	
	}

	@When("user click on the demowebshop page in login button")
	public void user_click_on_the_demowebshop_page_in_login_button() throws InterruptedException {

		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
	    login.click();
	    Thread.sleep(2000);
	
	}

	@Then("user should navigate to the demowebshop login error page")
	public void user_should_navigate_to_the_demowebshop_login_error_page() {
	    
		WebElement k = driver.findElement(By.xpath("//li[text()='No customer account found']"));
		Assert.assertTrue(k.isDisplayed());
		driver.quit();
	}

	
	
	
	
}
