import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

public class SearchTest {
    WebDriver driver;
    SearchP searchPage;


    public void setUp() {
        // Configurer le chemin du WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demos.mv.cs-cart.com/b6ebb44ed27b27c2/baby-and-children/");  // Remplacez par l'URL appropriée

        // Créer une instance de la page
        searchPage = new SearchP(driver);
        // Initialiser les éléments de la page
        PageFactory.initElements(driver, searchPage);
    }


    public void testSearch() {
        // Utiliser la méthode de la page pour interagir avec l'élément
        searchPage.setSearchTextBox("Selenium");
        // Ajoutez des assertions pour vérifier le comportement
    }


    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
