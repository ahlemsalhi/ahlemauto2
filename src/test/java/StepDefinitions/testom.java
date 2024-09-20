package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static StepDefinitions.Hooks.driver;



public class testom {
    WebDriver driver= Hooks.driver;
    @Given("je rentre lurl de meteroperators")
    public void je_rentre_lurl_de_meteroperators() throws InterruptedException {
        String username="flywheel";
        String password="squalid-badge";
    driver.get("https://"+username+":"+password+"@"+"meteroperators.flywheelstaging.com/?s=");

    }

    @When("je clique sur la barre de recherche en tappant le mot testtest")
    public void je_clique_sur_la_barre_de_recherche_en_tappant_le_mot_testtest() {
       WebElement loope= driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/ul/li[1]/a"));
       loope.click();
       WebElement searchbarre=driver.findElement(By.xpath("//input[@class='search-field']"));
       Assert.assertTrue(searchbarre.isDisplayed());
       searchbarre.sendKeys("testtest");



    }

    @When("je clique sur la loope")
    public void je_clique_sur_la_loope() {
        driver.findElement(By.xpath("//a[@class='header__search-toggle']")).click();
    }

    @Then("aucune resultat ne sera trouve")
    public void aucune_resultat_ne_sera_trouve() {
    String excpected_message="Nothing Found";
    String obtained_message=driver.findElement(By.xpath("//h1[text()='Nothing Found']")).getText();
   Assert.assertEquals(excpected_message,obtained_message);
    System.out.println(obtained_message +"secénario1 est validé");
    }

    @When("je rentre le mot test dans la barre de recherche")
    public void je_rentre_le_mot_test_dans_la_barre_de_recherche() {
        driver.findElement(By.xpath("//a[@class='header__search-toggle']")).click();
        WebElement searchbarre1=driver.findElement(By.xpath("//input[@class='search-field']"));
        searchbarre1.clear();
        searchbarre1.sendKeys("test");
    }

    @When("je clique sur le bouton entree")
    public void je_clique_sur_le_bouton_entree() {
        driver.findElement(By.xpath("//a[@class='header__search-toggle']")).click();
    }

    @Then("la liste contenant le mot test saffiche")
    public void la_liste_contenant_le_mot_test_saffiche() {
    String expresultattest =driver.findElement(By.xpath("//div[@class='entry-summary'][1]")).getText();
    System.out.println(expresultattest);
    Assert.assertTrue(expresultattest.contains("test"));
    }

    @When("je recherche avec autre mot de la liste")
    public void je_recherche_avec_autre_mot_de_la_liste() {

        WebElement loope= driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/ul/li[1]/a"));
        loope.click();
        WebElement searchbarre=driver.findElement(By.xpath("//input[@class='search-field']"));
        Assert.assertTrue(searchbarre.isDisplayed());
        searchbarre.clear();
        searchbarre.sendKeys("COVID-19");
    }

    @When("je clique sur la loupe")
    public void je_clique_sur_la_loupe() {
        WebElement loope= driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/ul/li[1]/a"));
        loope.click();
    }

    @Then("la liste contenant la recherche saisie saffiche")
    public void la_liste_contenant_la_recherche_saisie_saffiche() {
    String excpected_covid=driver.findElement(By.xpath("//div[@class='entry-summary'][1]")).getText();
 System.out.println(excpected_covid);
    Assert.assertTrue(excpected_covid.contains("COVID-19"));
    }

}
