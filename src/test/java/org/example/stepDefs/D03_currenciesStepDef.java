package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {
    P03_homePage  P03_homePage= new  P03_homePage();
    private List<WebElement> listofItems;



    @Given("I select the EURO from dropdown list")
    public void iselectEUROcurrency(){
       P03_homePage.SelectCurrencyFromDropDownMenu("Euro");
        Assert.assertEquals(P03_homePage.getSelectedCurrency(),"Euro");
    }


@When("I check the Euro on products prices")
    public void icheckthecurrencyonproducts(){
P03_homePage.CheckEurosymbolOnProductsPrices();

}

}


