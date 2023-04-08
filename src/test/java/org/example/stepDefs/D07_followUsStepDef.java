package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class D07_followUsStepDef {
    P03_homePage P03_homePage= new  P03_homePage();

@Given("open facebook link")
    public void OpenFaceBookLink(){
P03_homePage.SelectFacebookLink();
}

    @Then("verify that current url is equal facebook link")
    public void verifyThatCurrentUrlIsEqualFacebookLink() {
P03_homePage.VerifyURLForFacebook();

    }

    @Given("open Twitter link")
    public void openTwitterLink() {
    P03_homePage.SelectTwitterLink();
        
    }

    @Then("verify that current url is equal Twitter link")
    public void verifyThatCurrentUrlIsEqualTwitterLink() {
    P03_homePage.VerifyURLForTwitter();

    }


    @Given("open Rss link")
    public void openRssLink() {
    P03_homePage.SelectRssLink();
    }

    @Then("verify that current url is equal Rss link")
    public void verifyThatCurrentUrlIsEqualRssLink() {
P03_homePage.VerifyURLForRss();
    }

    @Given("open Youtube link")
    public void openYoutubeLink() {
    P03_homePage.SelectYoutubeLink();

    }

    @Then("verify that current url is equal Youtube link")
    public void verifyThatCurrentUrlIsEqualYoutubeLink() {
    P03_homePage.VerifyURLForYoutube();
    }

}
