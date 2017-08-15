package yahooStepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class YahooLoigin_Test_StepDef {


   private WebDriver driver=null;



    @Given("^user_opens_yahoo_login_page$")
    public void user_opens_yahoo_login_page()
    {
        FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://uk.yahoo.com");

    }

    @Then("^User enter loginid&")
    public void user_enter_loginid(){
        driver.findElement(By.id("login-username")).sendKeys("test@yahoo.com");
    }

@Then("^user enter password&")
    public void user_enter_password(){
        driver.findElement(By.id("login-passwd")).sendKeys("test123");
}

@And("^And then user click on login button$")
    public void user_click_login_button(){
        driver.findElement(By.id("login-signin")).click();
}
@And("^close the browser$")
    public void close_the_browser(){
        driver.quit();
}
}
