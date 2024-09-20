import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchP {
    WebDriver driver;

    // Déclaration de l'élément avec l'annotation @FindBy
    @FindBy(name = "hint_q")
    private WebElement text_search;

    // Constructeur de la classe
    public SearchP(WebDriver driver) {
        this.driver = driver;  // Correction de 'This' à 'this'
        // Initialiser les éléments de la page
        PageFactory.initElements(driver, this);
    }

    // Méthode pour interagir avec l'élément de recherche
    public void setSearchTextBox(String arg) {
        text_search.sendKeys(arg);
    }
}
