package com.myTroc.step_definitions;

import com.myTroc.pages.JeProposePage;
import com.myTroc.pages.MonProfilPage;
import com.myTroc.pages.MyTrocPage;
import com.myTroc.utilities.BrowserUtilities;
import com.myTroc.utilities.ConfigurationReader;
import com.myTroc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyTroc_StepDefinitions {

    MyTrocPage mytroc = new MyTrocPage();
    JeProposePage jeProposePage = new JeProposePage();
    MonProfilPage monProfilPage = new MonProfilPage();


    @Given("Utilisation visite la page d'accueil de MyTroc.fr")
    public void utilisation_visite_la_page_d_accueil_de_my_troc_fr() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
    }

    @And("Utilisateur clique sur le lien Se connecter")
    public void utilisateur_clique_sur_le_lien() {
        mytroc.loginButton.click();
    }

    @And("Utilisateur se connecte et accède à son compte")
    public void utilisateur_se_connecte_et_accède_à_son_compte() {
        mytroc.email.sendKeys(ConfigurationReader.getProperty("email"));
        mytroc.passe.sendKeys(ConfigurationReader.getProperty("passe"));
        //mytroc.boutonConnexion.click();
        mytroc.boutonConnexion.click();
    }

    @Given("Utilisateur clique sur le lien Je Propose Tab")
    public void utilisateur_clique_sur_le_lien_je_propose_tab() {
        //BrowserUtilities.waitFor(3);
        //jeProposePage.jeProposeLink.click();
        Driver.getDriver().get("https://mytroc.fr/ajouter-un-troc");
    }
    @Given("Utilisateur clique sur la case Bon")
    public void utilisateur_clique_sur_la_case_bon() {

    }
    @Given("Utilisateur choisit une catégorie pour le bon")
    public void utilisateur_choisit_une_catégorie_pour_le_bon() {

    }
    @Given("Utilisateur saisit un titre concernant le bon")
    public void utilisateur_saisit_un_titre_concernant_le_bon() {

    }
    @Given("Utilisateur saisit une description concernant le bon")
    public void utilisateur_saisit_une_description_concernant_le_bon() {

    }
    @Given("Utilisateur saisit un nombre de noisettes supérieur à zéro")
    public void utilisateur_saisit_un_nombre_de_noisettes_supérieur_à_zéro() {

    }
    @Given("Utilisateur clique sur Ajouter")
    public void utilisateur_clique_sur_ajouter() {

    }
    @Given("Utilisateur clique sur le lien Mon Profil")
    public void utilisateur_clique_sur_le_lien_mon_profil() {

    }
    @Given("Utilisateur clique sur le bouton \"es Trocs")
    public void utilisateur_clique_sur_le_bouton_es_trocs() {

    }
    @Then("Utilisateur voit ses trocs dans la liste")
    public void utilisateur_voit_ses_trocs_dans_la_liste() {

    }



}
