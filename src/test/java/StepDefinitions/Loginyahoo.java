package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.LoginPage;
public class Loginyahoo {

    WebDriver driver = Hooks.driver;
//WebDriver driver= null;


    public void je_me_connecte_à_yahoo() {
    driver.get("https://login.yahoo.com/?.intl=fr&.lang=fr-FR&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Ffr.mail.yahoo.com%2Fd&add=1");
 String username="@@@@.com";
 String Password="145266";
        LoginPage login = new LoginPage(driver);
        login.enterUsername(username);
        login.clicksuivant();
        login.enterPassword(Password);
        login.clicksuivant();




    }
}