package StepDefinitions;
import java.util.List;
import java.util.ArrayList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import StepDefinitions.Hooks;

public class assuré {
    WebDriver driver = Hooks.driver;

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Given("je suis connecté au portail mutuelle generale")
    public void je_suis_connecté_au_portail_mutuelle_generale() {


        driver.get("https://lamutuellegenerale--pscint.sandbox.my.site.com/eBIA/s/login/?ec=302&inst=G5&startURL=%2FeBIA");

      //  driver.findElement(By.xpath("//*[@id=\"choiceList\"]/cr-radio-button[1]/div/div[2]/div[1]")).click();
    //  driver.findElement(By.xpath("//*[@id=\"actionButton\"]")).click();
     WebElement accepter= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Tout accepter']")));
   //  WebElement accepter= wait.until(expectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Tout accepter']")));
        accepter.click();


    }
    @When("je renseigne mon mail")
    public void je_renseigne_mon_mail() {
        driver.findElement(By.xpath("//input[@name='loginEmail']")).sendKeys("mutuelleahlemauto@yahoo.com");
        driver.findElement(By.xpath("//button[@data-id=\"buttonRecevoirCode\"]")).click();


    }
    @Then("je reçois un mail contenant un code")
    public void je_reçois_un_mail_contenant_un_code() throws InterruptedException {
// Exécuter du JavaScript pour ouvrir un nouvel onglet

        js.executeScript("window.open('about:blank', '_blank');");

        // Obtenir la liste des onglets ouverts

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Passer au nouvel onglet (deuxième onglet)
        driver.switchTo().window(tabs.get(1));

        // Accéder à une page dans le nouvel onglet
        driver.get("https://mail.yahoo.com/d/folders/1");

        // Effectuer des actions dans le nouvel onglet
        WebElement champs= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        champs.sendKeys("mutuelleahlemauto@yahoo.com");
        // System.out.println("Titre de la page dans le nouvel onglet : " + element.getText());
        driver.findElement(By.id("login-signin")).click();

        WebElement paswd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
        paswd.sendKeys("Talantalan12345@@@@");
        WebElement connecter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-signin")));
         connecter.click();
Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[2]/a/div/span/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div[3]/div/div[1]/ul/li[2]/a/div/div[1]/div[3]/span\n")).click();
      Thread.sleep(2000);
        WebElement code=   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/ul/li/div/div[2]/div[1]/div[2]/div/div/div/div/div[5]/table/tbody/tr/td/table[5]/tbody/tr/td/center/br"));
        code.getText();
        System.out.println("Le code est :"+code.getText());

    }
    @When("je renseigne le code")
    public void je_renseigne_le_code() {

        // Passer de nouveau au premier onglet
        // driver.switchTo().window(tabs.get(0));

        // Effectuer des actions dans l'onglet d'origine si nécessaire
        // WebElement originalElement = driver.findElement(By.tagName("h1"));
        // System.out.println("Titre de la page dans l'onglet d'origine : " + originalElement.getText());


    }
    @Then("la rubrique mes informations s'affihce")
    public void la_rubrique_mes_informations_s_affihce() {

    }
    @When("je renseigne toutes les informations demandées")
    public void je_renseigne_toutes_les_informations_demandées() {

    }
    @Then("un spinner s'affiche et on est transitionné vers la rubrique couverture")
    public void un_spinner_s_affiche_et_on_est_transitionné_vers_la_rubrique_couverture() {

    }
    @When("on remplir toutes les inforamtions demandées pour l'enfant ou le conjoint à adhérer")
    public void on_remplir_toutes_les_inforamtions_demandées_pour_l_enfant_ou_le_conjoint_à_adhérer() {

    }
    @When("je clique sur suivant")
    public void je_clique_sur_suivant() {

    }
    @Then("les informations sont bien saisies")
    public void les_informations_sont_bien_saisies() {

    }
    @When("on Switche le toggle  vers \"Mon ayant droit est rattaché au régime \"Alsace-Mosell\"")
    public void on_switche_le_toggle_vers_mon_ayant_droit_est_rattaché_au_régime_alsace_mosell() {

    }
    @When("on ajoute une piéce justificative")
    public void on_ajoute_une_piéce_justificative() {

    }
    @Then("le Toggle est switché et le document est chargé avec succés")
    public void le_toggle_est_switché_et_le_document_est_chargé_avec_succés() {

    }
    @When("on clique sur suivant")
    public void on_clique_sur_suivant() {

    }
    @Then("on trouve la télétransmission est activée par défaut")
    public void on_trouve_la_télétransmission_est_activée_par_défaut() {

    }
    @Then("On est redirigé vers la rubrique mes coordonnées")
    public void on_est_redirigé_vers_la_rubrique_mes_coordonnées() {

    }
    @When("on renseigne une adresse de contact ,un numéro pour vous joindre")
    public void on_renseigne_une_adresse_de_contact_un_numéro_pour_vous_joindre() {

    }
    @Then("on serait redirigé  vers rubrique mon compte")
    public void on_serait_redirigé_vers_rubrique_mon_compte() {

    }
    @When("on renseigne les données bancaires BIC et IBAN ,")
    public void on_renseigne_les_données_bancaires_bic_et_iban() {

    }
    @When("je charge une relevée d'identité")
    public void je_charge_une_relevée_d_identité() {

    }
    @Then("on sera redirigé vers la rubrique mon récapitulatif")
    public void on_sera_redirigé_vers_la_rubrique_mon_récapitulatif() {

    }
    @When("je vérifie les données saisies au niveau de l'onglet mon récap")
    public void je_vérifie_les_données_saisies_au_niveau_de_l_onglet_mon_récap() {

    }
    @Then("toutes les données saisies sont remontées correctement")
    public void toutes_les_données_saisies_sont_remontées_correctement() {

    }



}
