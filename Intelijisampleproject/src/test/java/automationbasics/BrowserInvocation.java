package automationbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://amc.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Famc.amazon.com%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_amcentral_us&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mons_redirect=sign_in");
        driver.findElement(By.id("username")).sendKeys("LearnMore");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.id("Login")).click();
        String actualResult = driver.findElement(By.id("error")).getText();
        String ExpectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator";
        if(actualResult.equals(ExpectedResult)){

            System.out.println("equal");
        }
        else{

            System.out.println("not equal");
        }




    }


}
