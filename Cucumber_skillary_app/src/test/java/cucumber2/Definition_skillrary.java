package cucumber2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition_skillrary {
	WebDriver driver;
	@Given("To be in the login page")
	public void to_be_in_the_login_page() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demoapp.skillrary.com/login.php?type=login");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
	   Thread.sleep(2000);
	   driver.findElement(By.id("email")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
	   driver.findElement(By.id("password")).sendKeys(string);
	}
	@And("Click login button")
	public void click_login_button() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@class='login_Btn']")).click();
	}
	@Then("I should see the username {string}")
	public void i_should_see_the_username(String string) throws InterruptedException {
		Thread.sleep(2000);
	   String T=driver.getTitle();
	   Assert.assertEquals(string, T);
	}
	@And("Click on profile")
	public void click_on_profile() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='hidden-xs']")).click();
	}
	@And("Click on signout button")
	public void click_on_signout_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign out")).click();
	   	}


}
