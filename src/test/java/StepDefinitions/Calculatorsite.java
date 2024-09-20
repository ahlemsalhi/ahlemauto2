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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import utils.ExcelUtilss;
//import io.cucumber.java.DataTable;
import java.io.IOException;
import java.util.List;
public class Calculatorsite {
    WebDriver driver = Hooks.driver;
    String hValue,dPay,iRate,eMPay,aMPay,Result;
    String URL="https://www.mortgagecalculator.org/";
    String InputSet;
    @Given("je rentre l'url de site de calculator")
    public void je_rentre_l_url_de_site_de_calculator() {
        driver.navigate().to(URL);
    }
    @Then("la page calculator s'affiche")
    public void la_page_calculator_s_affiche() {

    }
    @When("je rentre différents données")
    public void je_rentre_différents_données() throws IOException{

        String filePath = "C:/Users/asalhi/IdeaProjects/First_project/Excelfile/MC01.xlsx"; // Remplacez par le chemin de votre fichier Excel
        List<String[]> data = ExcelUtilss.readExcelData(filePath);

        for (String[] row : data) {
            hValue = row[0]; // Valeur de la maison
            dPay = row[1];   // Montant de l'acompte
            iRate = row[2];  // Taux d'intérêt
            eMPay = row[3];  // Montant attendu

            // Remise à zéro des champs avant chaque entrée
            driver.findElement(By.id("homeval")).clear();
            driver.findElement(By.id("downpayment")).clear();
            driver.findElement(By.id("intrstsrate")).clear();

            // Remplir les champs
            driver.findElement(By.id("homeval")).sendKeys(hValue);
            driver.findElement(By.id("downpayment")).sendKeys(dPay);
            driver.findElement(By.id("intrstsrate")).sendKeys(iRate);
            driver.findElement(By.name("cal")).click();

            // Récupérer le montant calculé
            aMPay = driver.findElement(By.xpath("/html/body/section/div/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
            System.out.println("Le montant attendu est : " + eMPay + ", le montant calculé est : " + aMPay);
            Assert.assertEquals(aMPay, eMPay);
        }
    }




        ///
 /*  InputSet="TD01";
   hValue="350000";
    dPay="75000";
     iRate="3,45";
     eMPay="$1,652.21";
    aMPay="";
    Result = "noResult";
 driver.findElement(By.id("homeval")).sendKeys(hValue);
driver.findElement(By.id("downpayment")).sendKeys(dPay);
driver.findElement(By.id("intrstsrate")).sendKeys(iRate);
driver.findElement(By.name("cal")).click();
aMPay= driver.findElement(By.xpath("/html/body/section/div/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
System.out.println("Le montant excepected est :"+aMPay);
Assert.assertEquals(aMPay,eMPay);*/



    @Then("je trouve le résultat est conforme à l'excpected")
    public void je_trouve_le_résultat_est_conforme_à_l_excpected() {

    }



}
