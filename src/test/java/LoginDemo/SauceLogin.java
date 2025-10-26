package LoginDemo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLogin {
	static WebDriver driver;
	
	@Given ("User opens Saucedemo")
	public void User_opens_Saucedemo() {
		driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@When ("I enter Username as \"standard_user\" and Password as \"secret_sauce\"")
	public void enter_username_as_standard_user() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Logged in successfully");
		
	}

	@When("After adding to cart and order")
	public void  after_adding_to_cart_and_order() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Khushboo");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Khushboo");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500032");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		
	}
 @Then("I should get success message")
 public void get_success_message() {
	 if((driver.findElement(By.className("complete-header"))!=null)) {
			System.out.println("Order Completed");
		}
 }
	
	// when I'll be using data tables in feature file
//	@When ("I enter Username as {string} and Password as {string}")
//	public static void enter_username_and_password(String user, String pass)
//	{
//		driver.findElement(By.id("user-name")).sendKeys(user);
//		driver.findElement(By.id("password")).sendKeys(pass);
//		driver.findElement(By.id("login-button")).click();
//		
//		System.out.println("Logged in successfully");
//		
//	}
	// with locked user creds
//	@When("When I enter Username as \"locked_out_user\" and Password as \"secret_sauce\"")
//	public void enter_username_as_locked_user() {
//		driver.findElement(By.id("user-name")).sendKeys("locked_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//	}
//	@Then ("I should get error message")
//	public void error_message() {
//		System.out.println("will not get Logged In");
//	}
	
}
