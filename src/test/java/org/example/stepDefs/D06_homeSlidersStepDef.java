package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {

    P03_homePage P03_homePage= new  P03_homePage();
@Given("click on first home slider is Samsung Galaxy S22 Ultra")
    public void ClickOnFirstSliderSamsung(){
    P03_homePage.SelectSamsungFromHomeSlider();
}

    @When("Check when select samsung mobile directed me to the right URL page")
    public void checkWhenSelectSamsungMobileDirectedMeToTheRightURLPage() {
P03_homePage.getTheRightURLForIphone();

    }


    @Given("click on first home slider is iphone")
    public void clickOnFirstHomeSliderIsIphone() {
    P03_homePage.clickonfirsthomesliderisiphone();

    }

    @When("Check when select iphone mobile directed me to the right URL page")
    public void checkWhenSelectIphoneMobileDirectedMeToTheRightURLPage() {
    P03_homePage.CheckWhenSelectSamsungMobileDirectedMeToTherRightURLPage();
    }
}
