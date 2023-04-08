package org.example.stepDefs;

import com.google.common.base.Predicates;
import com.google.common.cache.AbstractCache;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.net.URL;
import java.time.Instant;
import java.util.List;

import static io.ous.jtoml.impl.Token.TokenType.Key;
import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {
    P03_homePage P03_homePage= new  P03_homePage();
    SoftAssert softAssert =new SoftAssert();
    private WebElement[] results;





   @Given("user navigates to demo.nopcommerce.com")
    public void InavigateTheRightURL(){
        driver.get("https://demo.nopcommerce.com/search?q=");
        String url = driver.getCurrentUrl();
        softAssert.assertTrue(url.contains("https://demo.nopcommerce.com/search?q="));
        softAssert.assertAll();
    }
    @When("I enter in search bar the name of product as {string}")
    public void iEnterInSearchBarTheNameOfProductAs(String arg0) {
        P03_homePage.SelectTheNameOfProduct(arg0);
        Hooks.driver.findElement(By.xpath("//button['@class=button-1 search-box-button']")).sendKeys(Keys.ENTER);
        softAssert.assertEquals(P03_homePage.getTheNameOfProduct(),"","search successful");
        softAssert.assertAll();

    }






       @Then("number of search result")
                   public void ICheckNumberOfSearchResult(){
           P03_homePage.getNumberOfSearchResult();

    }


@Then("for loop")
    public void IiCheckForLoop(){
       P03_homePage.getForLoop();

}

    @Then("search should be successful")
    public void CheckSuccessful() {

  P03_homePage.getNumberOfSearchResult();
  P03_homePage.getForLoop();
    }


    @Then("click on the product in search result")
    public void clickOnTheProductInSearchResult() {

        P03_homePage.ClickProductName().click();

    }


    @Then("found product successfully")
    public void foundProductSuccessfully() {
       P03_homePage.getSkuName();

    }



//    @Then("click on the product in search result")
//    public void clickOnTheProductInSearchResult() {
//       Hooks.driver.findElement(By.xpath("//a['@href/sound-forge-pro-11-recurring']")).sendKeys(Keys.ENTER);
//    }
}

 