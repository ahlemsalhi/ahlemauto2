package StepDefinitions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class BaseClass {
    WebDriver driver = Hooks.driver;

    @Given("je rentre l'url de site de yahoo")
    public void je_rentre_l_url_de_site_de_yahoo() {
        driver.get("https://login.yahoo.com/?.intl=fr&.lang=fr-FR&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Ffr.mail.yahoo.com%2Fd&add=1");
    }
    @Then("la page yahoo s'affiche")
    public void la_page_yahoo_s_affiche() {
        String curentURL= driver.getCurrentUrl();
        String ExcpectedURL="https://login.yahoo.com/?.intl=fr&.lang=fr-FR&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Ffr.mail.yahoo.com%2Fd&add=1";
        Assert.assertEquals(curentURL,ExcpectedURL);
    }

    @When("je rentre différents données  user1 password1")
    /*  @Test(ddataProvider="Credentials")*/

    @ParameterizedTest
    @CsvSource({
            "user1,password1",
            "user2,password2"
    })


    public void je_rentre_différents_données_user1_password1(String usernamee,String Passwordd) {

        driver.findElement(By.id("login-username")).sendKeys(usernamee);
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.id("login-passwd")).sendKeys(Passwordd);
        driver.findElement(By.id("login-signin")).click();

    }
    @Then("le test passe")
    public void le_test_passe() {

    }

}
