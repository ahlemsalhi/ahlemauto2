package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browsermanager {

    // Méthode statique pour obtenir une instance WebDriver
    public static WebDriver getDriver() {
        // Configurer le chemin du driver Chrome (assurez-vous que le chemin est correct)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Créer une nouvelle instance de ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Configurer les options du driver
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Retourner l'instance WebDriver
        return driver;
    }
}
