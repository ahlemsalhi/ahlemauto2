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

import java.util.List;


public class HUK {
    WebDriver driver = Hooks.driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("je rentre l'url de site HUK")
    public void je_rentre_l_url_de_site_huk() {
        String username = "flywheel";
        String password = "outgoing-birthday";
        driver.get("https://" + username + ":" + password + "@" + "hydrogenuk.flywheelstaging.com");
        System.out.println("bonjour");
    }

    @When("je rentre des identifiants valide")
    public void je_rentre_des_identifiants_valide() {

    }

    @Then("la page home s'affiche")
    public void la_page_home_s_affiche() {
        String Excpected_msg_home = "Join Hydrogen UK";
        String Actual_msg_home = driver.findElement(By.xpath("//span[text()='Join Hydrogen UK']")).getText();
        Assert.assertEquals(Excpected_msg_home, Actual_msg_home);
    }

    @When("je vérifie les menus horizontals")
    public void je_vérifie_les_menus_horizontals() {
        System.out.println("step3");
        List<WebElement> myElements = driver.findElements(By.xpath("//a[@href='https://hydrogenuk.flywheelstaging.com/']"));

        for (WebElement e : myElements) {
           String liste = e.getText();
            System.out.println(liste);
        }

    }
        @Then("je les trouve affichés d'une façon horizontale")
        public void je_les_trouve_affichés_d_une_façon_horizontale () {
            System.out.println("menus affichés horizontaleement");
        }
        @When("je survolle la souris sur le menu events")
        public void je_survolle_la_souris_sur_le_menu_events () {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            Actions action = new Actions(driver);
            WebElement event = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://hydrogenuk.flywheelstaging.com/events/']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", event);
            action.moveToElement(event).perform();
//a[text()='Events'][1]
            //a[@href='https://hydrogenuk.flywheelstaging.com/events/']
            }
        @Then("je pourrais afficher le sous menu Annual Conference")
        public void je_pourrais_afficher_le_sous_menu_annual_conference () {
        WebElement conf= driver.findElement(By.xpath("//a[text()='Annual Conference and Awards']"));
         Assert.assertTrue(conf.isDisplayed());
         String conff = conf.getText();
         System.out.println( "le"+" " + conff + " " + "est affiché"); 
        }
        @When("je survolle le sous menu annual conference")
        public void je_survolle_le_sous_menu_annual_conference () {



            WebElement annual_conf = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Annual Conference and Awards']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", annual_conf);
            action.moveToElement(annual_conf).perform();
                 }


    @Then("je pourrais afficher les options by tickets et exhebition et speakers et sponsors and partners et the uk hydrogen")
    public void je_pourrais_afficher_les_options_by_tickets_et_exhebition_et_speakers_et_sponsors_and_partners_et_the_uk_hydrogen() {


             WebElement bytickets =driver.findElement(By.xpath("//a[text()='Buy Tickets']"));
             Assert.assertTrue(bytickets.isDisplayed());

            WebElement exhibition =driver.findElement(By.xpath("//a[text()='Exhibition']"));
            Assert.assertTrue(exhibition.isDisplayed());

            WebElement Speakers =driver.findElement(By.xpath("//a[text()='Speakers']"));
            Assert.assertTrue(Speakers.isDisplayed());

            WebElement Sponsors_and_Partners =driver.findElement(By.xpath("//a[text()='Sponsors and Partners']"));
            Assert.assertTrue(Sponsors_and_Partners.isDisplayed());

            WebElement The_UK_Hydrogen_Awards_2024 =driver.findElement(By.xpath("//a[text()='The UK Hydrogen Awards 2024']"));
            Assert.assertTrue(The_UK_Hydrogen_Awards_2024.isDisplayed());

        }
        @When("je clique sur l'option uk hydrogen")
        public void je_clique_sur_l_option_uk_hydrogen () {

            driver.findElement(By.xpath("//a[text()='The UK Hydrogen Awards 2024']")).click();


        }
        @Then("la page UK hydrogen s'affiche")
        public void la_page_uk_hydrogen_s_affiche () {
  String Excpected_url= "https://hydrogenuk.flywheelstaging.com/annual-conference-and-awards/the-awards/";
  String Actual_url= driver.getCurrentUrl();
  Assert.assertEquals(Excpected_url,Actual_url);
        }

        @When("je clique sur le premier bouton nominate")
        public void je_clique_sur_le_premier_bouton_nominate () {
driver.findElement(By.xpath("//a[@href='#nominate'][1]")).click();
        }
        @Then("je serai redirigé vers le bas de la page")
        public void je_serai_redirigé_vers_le_bas_de_la_page () {

// Sélectionner l'élément bouton (adapté à votre propre sélecteur)
WebElement nominename = driver.findElement(By.xpath("//div[@class='nf-field-element'][1]"));
System.out.println("on est en bas de la page");


        }
        @When("je clique sur le bouton back to top")
        public void je_clique_sur_le_bouton_back_to_top () throws InterruptedException {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='We use cookies to optimize our website and our service.']")));
            driver.findElement(By.xpath("//button[text()='Accept']")).click();
            Thread.sleep(2);
           WebElement scrollup=driver.findElement(By.xpath("//span[text()='Scroll Up']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", scrollup);


        }
        @Then("je pourrais naviguer jusqu'à le haut de la page")
        public void je_pourrais_naviguer_jusqu_à_le_haut_de_la_page () {
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/section[1]/div/div/div/section/div/div[2]/div/div/div/a/img")));

        }
        @When("je scrolle to award catégorie")
        public void je_scrolle_to_award_catégorie () {
            // Sélectionner l'élément bouton par son ID (adapté à votre propre sélecteur)
            WebElement INFRASTRUCTURE = driver.findElement(By.xpath("//p[text()='Infrastructure Project']"));

// Faire défiler la page jusqu'à ce que le bouton soit visible
            js.executeScript("arguments[0].scrollIntoView(true);", INFRASTRUCTURE);
            System.out.println("j'ai scrollé jusqu'à award category ");


        }
        @Then("je pourrais visualiser les six award categories avec le bouton nominate")
        public void je_pourrais_visualiser_les_six_award_categories_avec_le_bouton_nominate () {
            WebElement INFRASTRUCTURE = driver.findElement(By.xpath("//p[text()='Infrastructure Project']"));
            WebElement INNOVATION = driver.findElement(By.xpath("//p[text()='Innovation project']"));
            WebElement hydrogenfortransport = driver.findElement(By.xpath("//p[text()='Hydrogen for Transport']"));
            WebElement futureleader = driver.findElement(By.xpath("//p[text()='Future Leader']"));
            WebElement industrual = driver.findElement(By.xpath("//p[text()='Industrial Application']"));
            WebElement greenproject = driver.findElement(By.xpath("//p[text()='Green Project']"));
            wait.until(ExpectedConditions.visibilityOfAllElements(INFRASTRUCTURE ,INNOVATION,hydrogenfortransport,futureleader,industrual,greenproject) );
        }
        @When("je clique sur le bouton nominate")
        public void je_clique_sur_le_bouton_nominate () throws InterruptedException {
        Thread.sleep(2);
            WebElement nominaate=driver.findElement(By.xpath("//span[text()='Nominate'][1]"));
            action.click(nominaate).perform();
        }
        @Then("je serai redirigé vers le nomination form")
        public void je_serai_redirigé_vers_le_nomination_form () {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Nomination Form']")));


        }
        @When("je scrolle en haut de la page jusqu'a FAQs")
        public void je_scrolle_en_haut_de_la_page_jusqu_a_fa_qs () throws InterruptedException {
          //  WebElement FAQ = driver.findElement(By.xpath("//h2[text()='FAQs']"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FAQ);
           // ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top - window.innerHeight / 2);", FAQ);
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", driver.findElement(By.xpath("//h2[text()='FAQs']")));
       //executor.executeScript("arguments[0].scrollIntoView(true);", FAQ);
            System.out.println("j'ai scrollé jusqu'a FAQ");
        }
        @Then("je serai capable de visualiser cinq FAQ questions dans l' accordion style avec les boutons Nominate et Register")
        public void je_serai_capable_de_visualiser_cinq_faq_questions_dans_l_accordion_style_avec_les_boutons_nominate_et_register
        () {
            WebElement question1 = driver.findElement(By.xpath("//a[text()='Who can nominate?']"));
            WebElement question2 = driver.findElement(By.xpath("//a[text()='How are the winners selected?']"));
            WebElement question3 = driver.findElement(By.xpath("//a[text()='Who can attend?']"));
            WebElement question4 = driver.findElement(By.xpath("//a[text()='Where are the winners announced?']"));
            WebElement question5 = driver.findElement(By.xpath("//a[text()='How to nominate?']"));
            WebElement question6 = driver.findElement(By.xpath("//a[text()='Submission Information']"));
            wait.until(ExpectedConditions.visibilityOfAllElements(question1,question2,question3,question4,question5,question6) );




        }
        @When("je clique sur chaque FAQ questions")
        public void je_clique_sur_chaque_faq_questions () throws InterruptedException {
        Thread.sleep(3000);
            WebElement question1 = driver.findElement(By.xpath("//a[text()='Who can nominate?']"));
            Thread.sleep(3000);
            action.click(question1).build().perform();
            WebElement question2 = driver.findElement(By.xpath("//a[text()='How are the winners selected?']"));
            Thread.sleep(3000);
            action.click(question2).build().perform();
            Thread.sleep(3000);
            WebElement question3 = driver.findElement(By.xpath("//a[text()='Who can attend?']"));
            Thread.sleep(3000);
            action.click(question3).build().perform();

            WebElement question4 = driver.findElement(By.xpath("//a[text()='Where are the winners announced?']"));
            Thread.sleep(3000);
            action.click(question4).build().perform();
            WebElement question5 = driver.findElement(By.xpath("//a[text()='How to nominate?']"));
            Thread.sleep(3000);
            action.click(question5).build().perform();
            WebElement question6 = driver.findElement(By.xpath("//a[text()='Submission Information']"));
            Thread.sleep(3000);
            action.click(question6).build().perform();

        }
        @Then("chaque question peut etre developpée le contenu s'affiche et tous les hyperlinks répondent bien")
        public void chaque_question_peut_etre_developpée_le_contenu_s_affiche_et_tous_les_hyperlinks_répondent_bien () {
  String Expmessage1="Any individual can nominate a company, person, or project which includes yourself, your company, or your own project.";
  String obtainedmessage1= driver.findElement(By.xpath("//p[text()='Any individual can nominate a company, person, or project which includes yourself, your company, or your own project.']")).getText();
   Assert.assertTrue(Expmessage1.contains(obtainedmessage1));
   System.out.println(obtainedmessage1);
   //message2
            String Expmessage2="Once the nominations close, our carefully selected judges will review the nominations and create a shortlist for each category. The judges have been chosen and will be revealed before the conference in 2024. The Hydrogen UK team are not part of the judging panel.";
            String obtainedmessage2= driver.findElement(By.xpath("//p[text()='Once the nominations close, our carefully selected judges will review the nominations and create a shortlist for each category. The judges have been chosen and will be revealed before the conference in 2024. The Hydrogen UK team are not part of the judging panel.']")).getText();
            Assert.assertTrue(Expmessage2.contains(obtainedmessage2));
            System.out.println(obtainedmessage2);

  //message3

            String Expmessage3="The winners will be announced at The UK Hydrogen Awards on the 11th of March 2024, which is taking place at the NCC in Birmingham as part of the Hydrogen UK Annual Conference.";
            String obtainedmessage3= driver.findElement(By.xpath("//p[text()='The winners will be announced at The UK Hydrogen Awards on the 11th of March 2024, which is taking place at the NCC in Birmingham as part of the Hydrogen UK Annual Conference.']")).getText();
            Assert.assertTrue(Expmessage3.contains(obtainedmessage3));
            System.out.println(obtainedmessage3);
    //message4
            String Expmessage4="Anyone, whether you are a nominee, member of Hydrogen UK, or a member of the hydrogen industry, we invite you to attend to celebrate the evening. ";
            String obtainedmessage4= driver.findElement(By.xpath("//p[text()='Anyone, whether you are a nominee, member of Hydrogen UK, or a member of the hydrogen industry, we invite you to attend to celebrate the evening. ']")).getText();
            Assert.assertTrue(obtainedmessage4.contains(Expmessage4));
            System.out.println(obtainedmessage4);
//message5
            String Expmessage5="the Nomination Form from the Nomination Criteria below";
            String obtainedmessage5= driver.findElement(By.xpath("//*[text()=' the Nomination Form from the Nomination Criteria below']")).getText();
            Assert.assertTrue(obtainedmessage5.contains(Expmessage5));
            System.out.println(obtainedmessage5);
            driver.findElement(By.xpath("//*[text()=' the Nomination Form from the Nomination Criteria below']")).click();

//lien

        }
        @Then("je pourrais naviguer à la fin de la page au Nomination Form")
        public void je_pourrais_naviguer_à_la_fin_de_la_page_au_nomination_form () {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Nomination Form']")));
        }
        @When("je Scrolle back up to the FAQs section et je clique sur le bouton registrer")
        public void je_scrolle_back_up_to_the_fa_qs_section_et_je_clique_sur_le_bouton_registrer () {
            WebElement registrer = driver.findElement(By.xpath("//span[text()='Register']"));
         //  js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='Register']")));
           // WebElement registrer = driver.findElement(By.xpath("//span[text()='Register']"));
           //action.click(registrer).build().perform();
// Faire défiler la page jusqu'à ce que le bouton soit visible
          //js.executeScript("arguments[0].scrollIntoView(true);", registrer);
            js.executeScript("arguments[0].click();", registrer);

            //   System.out.println("j'ai scrollé jusqu'à registrer ");
//registrer.click();
        }
        @Then("je pourrais naviguer au Buy Tickets page avec le lien correspondant")
        public void je_pourrais_naviguer_au_buy_tickets_page_avec_le_lien_correspondant () {

         //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Buy Tickets']")));

String expcurenturl= "https://hydrogenuk.flywheelstaging.com/annual-conference-and-awards/buy-tickets/";
      String curenturl=      driver.getCurrentUrl();
            System.out.println(expcurenturl);
            https://hydrogenuk.flywheelstaging.com/annual-conference-and-awards/buy-tickets/
Assert.assertEquals(curenturl,expcurenturl);

        }
        @When("je clique sur le back button du navigateur, et je scrolle jusqu'à Nomination Criteria' section")
        public void je_clique_sur_le_back_button_du_navigateur_et_je_scrolle_jusqu_à_nomination_criteria_section () throws InterruptedException {

        Thread.sleep(3000);
        driver.getCurrentUrl();
      driver.navigate().back();
        System.out.println("j'ai navigué en arriére page ");
            WebElement criteria = driver.findElement(By.xpath("//h2[text()='Nomination Criteria']"));
            js.executeScript("arguments[0].scrollIntoView(true);",criteria );
            System.out.println("click réussit");
        }
        @Then("j'afficherai six nomination criteria dans l'accordion format chaque criteria contient  plus et détails")
        public void j_afficherai_six_nomination_criteria_dans_l_accordion_format_chaque_criteria_contient_plus_et_détails
        () {
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Innovation Project']"))));
         WebElement innovation_project= driver.findElement(By.xpath("//a[text()='Innovation Project']"));
           // WebElement plus1= driver.findElement(By.xpath("//span[@class='elementor-accordion-icon-closed'][1]"));
           // plus1.click();

            WebElement infrastructure=       driver.findElement(By.xpath("//a[text()='Infrastructure Project']"));
            WebElement hydrogentransport=         driver.findElement(By.xpath("//a[text()='Hydrogen for Transport']"));
            WebElement futurehydrogen=   driver.findElement(By.xpath("//a[text()='Future Hydrogen Leader']"));
            WebElement dustrualapp=  driver.findElement(By.xpath("//a[text()='Industrial Application']"));
            WebElement greenproject=  driver.findElement(By.xpath("//a[text()='Green Project']"));





        }

        @When("je clique sur chaque  criteria")
        public void je_clique_sur_chaque_criteria () throws InterruptedException {
            WebElement infrastructure=driver.findElement(By.xpath("//a[text()='Infrastructure Project']"));
            infrastructure.click();
            WebElement hydrogentransport= driver.findElement(By.xpath("//a[text()='Hydrogen for Transport']"));
            hydrogentransport.click();
            WebElement futurehydrogen=   driver.findElement(By.xpath("//a[text()='Future Hydrogen Leader']"));
            futurehydrogen.click();
            Thread.sleep(3000);
            WebElement industrualapp=  driver.findElement(By.xpath("//a[text()='Industrial Application']"));
            industrualapp.click();
            WebElement greenproject=  driver.findElement(By.xpath("//a[text()='Green Project']"));
            greenproject.click();
            Thread.sleep(3000);
            System.out.println("click sur chaque crieteria réussit");
        }
        @Then("j'afficherai tous les details de chaque criteria chaque criteria contient a Nomination Form Download link et seuelement une seule criteria est affiché dans un seul temps")
        public void j_afficherai_tous_les_details_de_chaque_criteria_chaque_criteria_contient_a_nomination_form_download_link_et_seuelement_une_seule_criteria_est_affiché_dans_un_seul_temps
        () {
            WebElement innovation1=       driver.findElement(By.xpath("//a[text()='Innovation Project']"));
            innovation1.click();
        String excpected_message1="The Innovation Project award recognises a company or project that has made a significant contribution to innovation in the hydrogen sector over the past 12 months. The successful company or project will demonstrate cutting edge, first-of-a-kind technologies or applications that push the boundaries . The project can be in any area of the hydrogen value chain but must demonstrate how the innovation contributes to the scalability of the hydrogen sector";
     String obtained_message1=driver.findElement(By.xpath("//p[text()='The Innovation Project award recognises a company or project that has made a significant contribution to innovation in the hydrogen sector over the past 12 months. The successful company or project will demonstrate cutting edge, first-of-a-kind technologies or applications that push the boundaries . The project can be in any area of the hydrogen value chain but must demonstrate how the innovation contributes to the scalability of the hydrogen sector.']")).getText();
            Assert.assertTrue(excpected_message1.contains(obtained_message1));
          //  driver.findElement(By.xpath("//a[@href=\"https://hydrogenuk.flywheelstaging.com/wp-content/uploads/2023/08/Innovation-Project-Nomination-Form.docx\"]"));
            System.out.println("click ddddddétails réussit");

            WebElement infrastructure1= driver.findElement(By.xpath("//a[text()='Infrastructure Project']"));
            infrastructure1.click();
            String excpected_message2="The Infrastructure Project award recognises a project which has made a significant contribution to the development of hydrogen infrastructure in the UK. Infrastructure is a key part of the hydrogen value chain linking supply and demand, and the successful project will demonstrate how the developments delivered can benefit the wider sector.";
            String obtained_message2=driver.findElement(By.xpath("//p[text()='The Infrastructure Project award recognises a project which has made a significant contribution to the development of hydrogen infrastructure in the UK. Infrastructure is a key part of the hydrogen value chain linking supply and demand, and the successful project will demonstrate how the developments delivered can benefit the wider sector.']")).getText();
            Assert.assertTrue(excpected_message2.contains(obtained_message2));
            System.out.println("click détails réussit");
        }
        @When("je clique sur chaque Download hyperlink")
        public void je_clique_sur_chaque_download_hyperlink () {

        }
        @Then("les six Nomination forms de chaque category seront téléchargés sur le pc")
        public void les_six_nomination_forms_de_chaque_category_seront_téléchargés_sur_le_pc () {

        }
        @When("je scroll en dessous de la page jusquà Timeline<\\/p>")
        public void je_scroll_en_dessous_de_la_page_jusquà_timeline_p () {

        }
        @Then("une table affichera les dates et event details")
        public void une_table_affichera_les_dates_et_event_details () {

        }
        @When("je Scrolle de nouveau au Nomination Form area")
        public void je_scrolle_de_nouveau_au_nomination_form_area () {

        }
        @Then("un formulaire s'affiche avec deux bouttons 'Select files' et 'Submit your nomination'")
        public void un_formulaire_s_affiche_avec_deux_bouttons_select_files_et_submit_your_nomination () {

        }


    }

