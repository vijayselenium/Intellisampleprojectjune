package stepdefinitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class salesforceLoginValidationSteps {

    WebDriver driver ; // null

    @Given("user launch the browser and navigate to the url")
     public void launchURL(){
        driver = new EdgeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
    }

    @When("user enters the username {string} and password {string}")
    public void enterUserNamePassword(String  username, String password){

        driver.findElement(By.id("username")).sendKeys();
        driver.findElement(By.id("password")).sendKeys();
   }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {

        driver.findElement(By.id("Login")).sendKeys();
        
    }

    @Then("validate the error message")
    public void validateTheErrorMessage() {

        String actualResult = driver.findElement(By.id("error")).getText();
        String ExpectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator";
        if(actualResult.equals(ExpectedResult)){

            System.out.println("equal");
        }
        else{

            System.out.println("not equal");
        }

    }

    @Then("user should navigate to the home page")
    public void userShouldNavigateToTheHomePage() {
    }
}