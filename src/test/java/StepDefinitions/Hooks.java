package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class Hooks {


    public static WebDriver driver;
    @Before
    public void before() {



        // Configurer WebDriverManager pour gérer le geckodriver
        WebDriverManager.firefoxdriver().setup();
   // Initialiser FirefoxDriver
        driver = new FirefoxDriver();

     /*   ChromeOptions optionsC = new ChromeOptions();

      //  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(optionsC);
        WebDriverManager.firefoxdriver().setup();*/


// Configure timeouts and maximize the window
        driver.manage().window().maximize();
    }

    @After
    public void after() {
      //  driver.quit();
    }

   // @DataProvider(name="Credentials")

   // public  Object[][] getData() {
    //    Object[][] data = new Object[3][2];

   /*     data[0][0] = "admin";
        data[0][1] = "admin123";
        data[1][0] = "admin1";
        data[1][1] = "admin123";
        data[2][0] = "admin2";
        data[2][1] = "admin";
return data;
    }*/







}