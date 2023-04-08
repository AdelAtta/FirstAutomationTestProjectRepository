package org.example.pages;
import javafx.scene.control.Slider;
import org.example.stepDefs.D05_hoverCategoriesStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
    HomePagePO HomePagePO=new HomePagePO();





    public void SelectCurrencyFromDropDownMenu ( String currency){
        Select CurrencyFromDropDownMenu = new Select(Hooks.driver.findElement(HomePagePO.SelectCurrency));
        CurrencyFromDropDownMenu.selectByVisibleText(currency);
    }
    public String getSelectedCurrency(){
        Select CurrencyFromDropDownMenu = new Select(Hooks.driver.findElement(HomePagePO.SelectCurrency));
        return  CurrencyFromDropDownMenu.getFirstSelectedOption().getText();

    }
    public void CheckEurosymbolOnProductsPrices(){
        List<WebElement> products = driver.findElements(HomePagePO.showTheCurrency);
        for (int i = 0; i < products.size(); i++) {
            String productText = products.get(i).getText();
            Assert.assertTrue(productText.contains("€"), "The Euro symbol (€) is not shown on product " + (i + 1));
        }
    }


public void SelectTheNameOfProduct( String arg0){
    Hooks.driver.findElement(HomePagePO.EnterNameOfProductInSearchBarField).sendKeys(arg0);
}
public String getTheNameOfProduct(){
        String Name=Hooks.driver.findElement(HomePagePO.EnterNameOfProductInSearchBarField).getAttribute("value");
        return Name;

}

 public int getNumberOfSearchResult(){

  int size = Hooks.driver.findElements(HomePagePO.NumberOfSearchResult).size();
     System.out.println(size);
  return size;
}

public void  getForLoop(){
List <WebElement> searchElements = Hooks.driver.findElements(HomePagePO.ClickOnProductForLoop);
        int searchElementSize = searchElements.size();
for (int i = 0; i <searchElementSize;i++){
    WebElement searchElement = searchElements.get(i);
    Assert.assertTrue(searchElement.getText().toLowerCase().contains(getTheNameOfProduct()));
}
    }

public WebElement ClickProductName(){
     return     Hooks.driver.findElement(HomePagePO.ClickOnProductName);

}

public void getSkuName(){

    Assert.assertTrue(Hooks.driver.findElement(HomePagePO.SkuName).getText().contains(getTheNameOfProduct()));
}

public void HoverOnTheSelectedCategory() {
    Actions actions=new Actions(Hooks.driver);
    actions.moveToElement(driver.findElement(HomePagePO.SelectedCategory)).perform();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }




    public  String SelectTextFromSubCategory(){
    return    Hooks.driver.findElement(HomePagePO.SelectedSubCategoryNotebook).getText();

    }
    public void SelectTheNoteBook(){
        Hooks.driver.findElement(HomePagePO.SelectTheNoteBook).click();

    }
    public  String getDesktopHeader(){
        return Hooks.driver.findElement(HomePagePO.DeskTopHeader).getText().trim().toLowerCase();
    }

    public void clickonfirsthomesliderisiphone(){
        String link = Hooks.driver.findElement(HomePagePO.FirstHomeSlider).getAttribute("src");
        while(!(link.contains("01"))){
            link = Hooks.driver.findElement(HomePagePO.FirstHomeSlider).getAttribute("src");
        }
        if(link.contains("01")){
            Hooks.driver.findElement(HomePagePO.ImageBanner).click();
            System.out.println("link = " +link);
        }
    }


    public void getTheRightURLForIphone() {

        Assert.assertEquals("https://demo.nopcommerce.com/", "https://demo.nopcommerce.com/iphone-6");
    }

    public void SelectSamsungFromHomeSlider(){

String link = Hooks.driver.findElement(HomePagePO.SecondHomeSlider).getAttribute("src");
while(!(link.contains("02"))){
    link = Hooks.driver.findElement(HomePagePO.SecondHomeSlider).getAttribute("src");
}
if(link.contains("02")){
    Hooks.driver.findElement(HomePagePO.ImageBanner).click();
    System.out.println(link+ "link = ");
}
    }

    public void CheckWhenSelectSamsungMobileDirectedMeToTherRightURLPage (){
        Assert.assertEquals("https://demo.nopcommerce.com/","https://demo.nopcommerce.com/nokia-lumia-1020" );

    }
    public void SelectFacebookLink(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement facebook_icon = Hooks.driver.findElement(HomePagePO.ClickOnFaceBookLink);
        facebook_icon.click();
    }

        public void VerifyURLForFacebook() {
            driver.get("https://www.facebook.com/nopCommerce");
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "https://www.facebook.com/nopCommerce");
        }


    public void SelectTwitterLink(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement facebook_icon = Hooks.driver.findElement(HomePagePO.ClickOnTwitterLink);
        facebook_icon.click();
    }

    public void VerifyURLForTwitter() {
        driver.get("https://twitter.com/nopCommerce");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://twitter.com/nopCommerce");
    }

    public void SelectRssLink(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement facebook_icon = Hooks.driver.findElement(HomePagePO.ClickOnRssLink);
        facebook_icon.click();
    }
    public void VerifyURLForRss() {

        driver.get("https://demo.nopcommerce.com/news/rss/1");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://demo.nopcommerce.com/new-online-store-is-open");

    }
    public void SelectYoutubeLink(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement facebook_icon = Hooks.driver.findElement(HomePagePO.ClickOnYoutubeLink);
        facebook_icon.click();
    }
    public void VerifyURLForYoutube() {
        driver.get("https://www.youtube.com/user/nopCommerce");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.youtube.com/user/nopCommerce");
    }

    public void ClickkOnWishlistButton(){

        WebElement wishlistButton = Hooks.driver.findElement(HomePagePO.ClickOnWishlistButton);
        wishlistButton.click();
    }

    public  Boolean getWishListMessageText(){
        WebElement wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(25))
                .until(ExpectedConditions.visibilityOfElementLocated(HomePagePO.BarNotification));
        return true;

    }
public String VerifyThatTheSuccessMessageWithGreenBackgroundColorIsDisplayed(){
    WebElement successMessage = Hooks.driver.findElement(HomePagePO.BarNotification);
    String actualColor = successMessage.getCssValue("background-color");
    return  Color.fromString(actualColor).asHex();
}
public void CheckWishlistMessage(){
        Assert.assertTrue(getWishListMessageText());
        Assert.assertTrue(Color.fromString("#44b07a").asHex().equals(VerifyThatTheSuccessMessageWithGreenBackgroundColorIsDisplayed()));
}
public void WaitUntilThisSuccessMessageWithGreenColorToDisappear() {
    WebElement successMessage = Hooks.driver.findElement(HomePagePO.SuccessMessage);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.invisibilityOf(successMessage));

}

    public void ClickOnWishlistTabTopPage(){
        Hooks.driver.findElement(HomePagePO.WishListButtonTopPage).click();
    }

public String getQtyValueWishList() {
    WebElement quantity = Hooks.driver.findElement(HomePagePO.quantityValue);
    String quantityNumber = quantity.getAttribute("value");
    return quantityNumber ;

}
public void CheckTheQuantity() {
        Assert.assertEquals(getQtyValueWishList(),"1");
}




}




