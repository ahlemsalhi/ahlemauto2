package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class courbe {

    WebDriver driver = Hooks.driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("je suis connectée à microstategy web en renseignant des données valides")
    public void je_suis_connectée_à_microstategy_web_en_renseignant_des_données_valides() {
        driver.get("https://express.microstrategy.com/MicroStrategyLibrary/app/69D4DA35264BAA98CC2BF68356064C35/4802DE4C4C18F434C75BFA84EC8A5E4B/K53--K46/edit?isNew=true");
        driver.findElement(By.id("signInName")).sendKeys("ahlem.salhi@talan.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("password")).sendKeys("Mohamed21100@@");
        driver.findElement(By.id("next")).click();
///

    }

    @When("j'importe des nouveaux données du fichier excel")
    public void j_importe_des_nouveaux_données_du_fichier_excel() throws InterruptedException{
        Thread.sleep(2000);
        String filePath = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "Barcelona Airbnb Data From Kaggle.xlsx";
        try {

            Thread.sleep(2000);
            // Trouver l'élément input de type file
            WebElement fileInput = driver.findElement(By.xpath("//span[text()='Fichier sur un disque']"));

            // Cliquer sur l'élément input de type file pour ouvrir la boîte de dialogue de fichier
            fileInput.click();
            Thread.sleep(2000);
            // Copier le chemin du fichier dans le presse-papier
            StringSelection selection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
            Thread.sleep(2000);
            // Simuler Ctrl + V et Enter pour coller le chemin et valider
            Robot robot = new Robot();

            // Pause pour attendre la boîte de dialogue de fichier (peut être ajusté)
            Thread.sleep(2000);

            // Simuler Ctrl + V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Simuler la frappe de la touche "Enter"
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Pause pour visualiser l'importation (facultatif)
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermer le navigateur
            System.out.println("j'ai importé le fichier");


        }
        driver.findElement(By.xpath("//div[text()='Enregistrer'][1]")).click();
    }

    @Then("les données sont bien importées")
    public void les_données_sont_bien_importées() {
        System.out.println("j'ai importé le fichier");
    }

    @When("je drag and drop le prix vers la case vertical")
    public void je_drag_and_drop_le_prix_vers_la_case_vertical() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='City']")));
       WebElement sourceElement= driver.findElement(By.xpath("//span[text()='Price']"));
        WebElement targetElement =driver.findElement(By.xpath("//div[text()='Lignes']"));
        action.clickAndHold(sourceElement).moveToElement(targetElement).release(targetElement).build().perform();


        WebElement changer =driver.findElement(By.xpath("//div[@class='hover-btn hover-menu-btn mouse-left']"));
       // action.click(changer).perform();
       js.executeScript("arguments[0].click();",changer );

   //action.click(changer).build().perform();
      Thread.sleep(1000);
        //WebElement vis=driver.findElement(By.xpath("//div[text()='Changer de visualisation...']"));
      //  js.executeScript("arguments[0].click();",vis );
              Thread.sleep(1000);
       // driver.findElement(By.xpath("//div[@class='category Bar']")).click();
      Thread.sleep(1000);
    //  WebElement verticalbar=  driver.findElement(By.xpath("//div[@class='item ic-VerticalBarChart active']"));
   //     js.executeScript("arguments[0].click();",verticalbar );
    }
    @Then("le prix sera glissé avec succés")
    public void le_prix_sera_glissé_avec_succés() {

    }
    @When("je drag and drop le room type vers horizontal")
    public void je_drag_and_drop_le_room_type_vers_horizontal() {

    }
    @Then("le room type sera glissé avec succés")
    public void le_room_type_sera_glissé_avec_succés() {

    }
    @When("je vérifie le prix des rooms en fonction de leurs type")
    public void je_vérifie_le_prix_des_rooms_en_fonction_de_leurs_type() {

    }
    @Then("les prix de entire home ,private ,share room sont vérifiés")
    public void les_prix_de_entire_home_private_share_room_sont_vérifiés() {


    }


}
