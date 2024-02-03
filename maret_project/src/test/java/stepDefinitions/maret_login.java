package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class maret_login {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("I am on the Signup page")
	public void i_am_on_the_signup_page() 
	{
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://maret.1clx.in/register");
	    driver.manage().window().maximize();
	}

	@When("I enter a FirstName {string}")
	public void i_enter_a_first_name(String string) throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstname']"));
		fname.sendKeys(string);
		
	}
	@When("I enter a Last Name {string}")
	public void i_enter_a_last_name(String string) throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastname']"));
		lname.sendKeys(string);	
		
	}
	@When("I enter the DOB")
	public void i_enter_the_dob() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
		dob.sendKeys("12/12/1997");
		
	}
	@When("I am able to pick the gender")
	public void i_am_able_to_pick_the_gender() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]"));
		gender.click();
		
	}
	@When("I enter the Citizenship")
	public void i_enter_the_citizenship() throws InterruptedException 
	{
		Thread.sleep(2000);
		Select Countrycity = new Select(driver.findElement(By.xpath("//select[@id='countryselect']")));
		Countrycity.selectByVisibleText("India");
	    
	}

	@When("I enter the Current Location")
	public void i_enter_the_current_location() throws InterruptedException 
	{
		Thread.sleep(2000);
		Select Countrylocation = new Select(driver.findElement(By.xpath("//select[@id='current_location']")));
		Countrylocation.selectByVisibleText("India");
		
	}

	@When("I enter the Mobile Number {string}")
	public void i_enter_the_mobile_number(String string) throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		mobile.sendKeys(string);	
	   
		
	}

	@When("I enter the Valid Email {string}")
	public void i_enter_the_valid_email(String string) throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(string);	
	    
		
	}

	@When("I am able to enter the create account button")
	public void i_am_able_to_enter_the_create_account_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement createbutton = driver.findElement(By.xpath("//button[@name='register']"));
		createbutton.click();
		
	}
	@Then("I should be redirected to the dashboard page")
	public void i_should_be_redirected_to_the_dashboard_page() 
	{
		
	  
	}


}
