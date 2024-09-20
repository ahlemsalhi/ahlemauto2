package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {

WebDriver  driver;

    By txt_username = By.id("login-username");
    By btn_suivant = By.id("login-signin");
    By txt_password= By.id("login-passwd");

public LoginPage (WebDriver driver)
{
this.driver=driver;
}
    public void enterUsername(String username)
    {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String Password)
    {
        driver.findElement(txt_password).sendKeys(Password);
    }
    public void clicksuivant()
    {
        driver.findElement(btn_suivant).click();
    }

    public void Validlogin(String username,String Password)
    {
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(btn_suivant).click();
        driver.findElement(txt_password).sendKeys(Password);
        driver.findElement(btn_suivant).click();
    }
}
