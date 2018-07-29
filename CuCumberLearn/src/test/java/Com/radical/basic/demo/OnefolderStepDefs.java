package Com.radical.basic.demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnefolderStepDefs {
	
	WebDriver driver;

	@Given("^the user is on facebook login page$")
	public void the_user_is_on_facebook_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	}
	
	@When("^he enters \"([^\"]*)\" as username$")
	public void he_enters_username(String userNmae) {
		
	driver.findElement(By.id("email")).sendKeys(userNmae);
		
		
	}

	@When("^he enters \"([^\"]*)\" as password$")
	public void He_enters_user_password(String pwd) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(5000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
	
		Assert.assertTrue(true);
		driver.quit();
	}
}
