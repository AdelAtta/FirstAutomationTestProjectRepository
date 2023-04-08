package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;

public class D05_hoverCategoriesStepDef {
    P03_homePage P03_homePage= new  P03_homePage();

@Given("start hover on computer category")
    public void CheckHoverTheElement(){
    P03_homePage.HoverOnTheSelectedCategory();

}


    @Then("select the sub category notebooks")
    public void selectTheSubCategoryNotebooks() {
       P03_homePage.SelectTextFromSubCategory();
    }

    @Then("text of the page title after selected sub category")
    public void textOfThePageTitleAfterSelectedSubCategory() {
        P03_homePage.SelectTheNoteBook();
    }

    @And("Desk top Header")
    public void deskTopHeader() {
    P03_homePage.getDesktopHeader();
    }
}
