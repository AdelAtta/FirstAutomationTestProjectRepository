package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;

public class D08_WishlistStepDef {
   P03_homePage P03_homePage= new  P03_homePage();

   @Given("I click on wishlist button")
   public void IClickOnWishListButton(){
      P03_homePage.ClickkOnWishlistButton();
   }
   @Then("Wish List Message Text")
   public void wishListMessageText() {
      P03_homePage.getWishListMessageText();

   }


   @Then("VerifyThatTheSuccessMessageWithGreenBackgroundColorIsDisplayed")
   public void verifythatthesuccessmessagewithgreenbackgroundcolorisdisplayed() {
      P03_homePage.VerifyThatTheSuccessMessageWithGreenBackgroundColorIsDisplayed();
   }

   @Then("wait until this success message with green color to disappear use explicity wait")
   public void waitUntilThisSuccessMessageWithGreenColorToDisappearUseExplicityWait() {
      P03_homePage.WaitUntilThisSuccessMessageWithGreenColorToDisappear();
   }

   @Then("ClickOnWishlistTabTopPage")
   public void clickonwishlisttabtoppage() {
      P03_homePage.ClickOnWishlistTabTopPage();
   }



   @And("get Qty value WishList")
   public void getQtyValueWishlist() {

      P03_homePage.getQtyValueWishList();
   }


   @And("Check The Quantity")
   public void checkTheQuantity() {
      P03_homePage.CheckTheQuantity();
   }




}
