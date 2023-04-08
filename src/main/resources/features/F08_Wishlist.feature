@smoke
  Feature:Wishlist Feature
    Scenario:click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop
      Given I click on wishlist button
      Then Wish List Message Text
      Then VerifyThatTheSuccessMessageWithGreenBackgroundColorIsDisplayed


    Scenario:
        Given I click on wishlist button
         Then wait until this success message with green color to disappear use explicity wait
        Then ClickOnWishlistTabTopPage
        And  get Qty value WishList
        And Check The Quantity