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

public class amazon {
    WebDriver driver = Hooks.driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;




    @Given("j'accede à la page d'accueil d'amazon")
    public void j_accede_à_la_page_d_accueil_d_amazon() {
driver.get("https://www.amazon.fr/");
    }
    @When("je rentre des identifiants valides du site")
    public void je_rentre_des_identifiants_valides_du_site() {
 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
        driver.findElement(By.id("ap_email")).sendKeys("salhiahlemm@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Ahlemlima123@@");
        driver.findElement(By.id("signInSubmit")).click();






    }
    @When("je cherche un produit spécifique")
    public void je_cherche_un_produit_spécifique() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Security Key C NFC - U2F und FIDO2");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();

    }
    @When("j'ajoute le produit au panier")
    public void j_ajoute_le_produit_au_panier() {
      // WebElement Produit=  driver.findElement(By.xpath("//*[@id=\"CardInstance43bAnC1UepiR9rghXzDLDw\"]/div[1]/div/div[2]/div[2]/div[1]/div/div/div[1]/a/span/span[2]"));
      // action.moveToElement(Produit).click(Produit).build().perform();
        driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();

    }
    @Then("il sera ajouté avec succés")
    public void il_sera_ajouté_avec_succés() {
       String actualtexte=  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div[3]/div[5]/div/div/div[1]/div/strong")).getText();
 String expectedtext=  "Article ajouté" ;
 Assert.assertEquals(actualtexte,expectedtext);
 System.out.println("produit ajouté avec succés ");
    }
    @When("j'accéde au panier")
    public void j_accéde_au_panier() throws InterruptedException {
        Thread.sleep(4000);
      WebElement panier=  driver.findElement(By.xpath("//a[@href=\"https://www.amazon.fr/gp/cart/view.html?ref_=abn_tools_cart_nf\"]"));
              action.click(panier).build().perform();
        System.out.println("j'ai accedé au panier ");
    }
    @When("je vérifie les détails du produit dans le panier")
    public void je_vérifie_les_détails_du_produit_dans_le_panier() throws InterruptedException {
        Thread.sleep(4000);
        String produit = driver.findElement(By.xpath("//span[text()='Security Key C NFC - U2F und FIDO2'][1]")).getText();
        String expproduit = "Security Key C NFC - U2F und FIDO2";
        Assert.assertTrue(expproduit.contains(produit));
        System.out.println("j'ai vérifié les détails ");
    }

    @Then("il sera vérifié avec succés\"")
    public void il_sera_vérifié_avec_succés() {
        System.out.println("produit vérifié avec succés ");
    }


    @When("je procéde au paiement")
    public void je_procéde_au_paiement() {
       driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        System.out.println("j'ai procedé au paiement ");
    }
    @Then("l'interface de paiement s'ouvre")
    public void l_interface_de_paiement_s_ouvre() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div/div[3]/h1")) );
    }
    @When("je rentre les informations de livraison")
    public void je_rentre_les_informations_de_livraison() {

    }
    @When("je selectionne un mode de payement valide")
    public void je_selectionne_un_mode_de_payement_valide() {

    }
    @When("je confirme le payement")
    public void je_confirme_le_payement() {

    }
    @Then("le produit sera payé avec succés")
    public void le_produit_sera_payé_avec_succés() {

    }




}
