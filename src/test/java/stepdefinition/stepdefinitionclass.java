package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class stepdefinitionclass {

	WebDriver driver = hooksclass.driver;
	
	@Given("User navigates to elearning application")
	public void user_navigates_to_elearning_application() {
		System.out.println("User is navigating to elearning website");
		driver.get("http://elearningm1.upskills.in/index.php");
	}

	@When("User clicks on Sign up button")
	public void user_clicks_on_Sign_up_button() {
		System.out.println("User clicks on Sign up button in elearning website");
		driver.findElement(By.partialLinkText("Sign")).click();
	}

	@When("User enters the valid user details and click on Register")
	public void user_enters_the_valid_user_details() {
		driver.findElement(By.name("firstname")).sendKeys("test_user");
		driver.findElement(By.name("lastname")).sendKeys("test10");
		driver.findElement(By.name("email")).sendKeys("test_user@gmail.com");
		driver.findElement(By.id("username")).sendKeys("test_user_11");
		driver.findElement(By.id("pass1")).sendKeys("123456789");
		driver.findElement(By.id("pass2")).sendKeys("123456789");
		driver.findElement(By.name("submit")).click();
	}

	@Then("Sign up done successfully")
	public void sign_up_done_successfully() throws InterruptedException {
		  
	      WebElement message = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']//p"));
		    if( message.getText().contains("Your personal settings have been registered."))
		    {
		    	System.out.println("User is registered Successfully");
		    }
		    Thread.sleep(500);
		 //   driver.quit();
		
	}
	
	
	@When("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
		System.out.println("User enters valid credentials");
		driver.findElement(By.id("login")).sendKeys("test_user_11") ;
	    driver.findElement(By.id("password")).sendKeys("123456789") ;
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		System.out.println("User clicks on Login button");
		driver.findElement(By.name("submitAuth")).click();
	}

	@Then("User is successfully logged into elearning website")
	public void user_is_successfully_logged_into_elearning_website() {
		System.out.println("User is successfully logged in");
	}


	@Then("User clicks on Inbox and compose an email")
	public void user_clicks_on_Inbox_and_compose_an_email() throws InterruptedException {
		driver.findElement(By.linkText("Inbox")).click();
	     driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	     driver.findElement(By.xpath("//div[@class='form-group ']/label")).click();
	     driver.findElement(By.xpath("//div[@class='col-sm-8']/span/span/span/ul/li/input")).sendKeys("div");
	     
	     // Delay is added, because searching user takes sometime
	     Thread.sleep(1000);

	     List<WebElement> values = driver.findElements(By.xpath("//li[contains(@class,'select2-results__option')]"));
	     for (int i=0; i<values.size();i++)
	     {
	    	 String text = values.get(i).getText();
	    	 System.out.println("Text is " +text);
	    	 if(text.contains("jha"))
	    	 {
	    		 values.get(i).click();
	    		 break;
	    	 }
	     }
	     
		  
	     
	     driver.findElement(By.name("title")).sendKeys("Test Email");
	     
	     
	}

	@Then("User click on Send Message button")
	public void user_click_on_Send_Message_button() {
		System.out.println("User clicks on Send Message button");
		driver.findElement(By.name("compose")).click();
		
	}

	@Then("User is able to send message successfully.")
	public void user_is_able_to_send_message_successfully() throws InterruptedException {
	    WebElement message = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	    if( message.getText().contains("The message has been sent"))
	    {
	    	System.out.println("Message has been sent Successfully");
	    }
	    
	    Thread.sleep(500);
	  //  driver.quit();
	
	}




}
