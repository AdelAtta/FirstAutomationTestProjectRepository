package org.example.pages;

import org.openqa.selenium.By;

public class HomePagePO {
    public By SelectCurrency = By.id("customerCurrency");
    public By showTheCurrency = By.xpath("//div[@class='product']");

    public By EnterNameOfProductInSearchBarField = By.id("small-searchterms");
    public By ClickONSearchButton = By.xpath("//button[@class=button-1 search-box-button]");

    public By NumberOfSearchResult = By.className("item-box");

    public By ClickOnProductForLoop = By.className("product-title");
    public By ClickOnProductName =By.cssSelector("h2 a");

    public By SkuName = By.cssSelector("div span[class='value']");

    public By SelectedCategory = By.linkText("Computers");
    public By SelectedSubCategoryNotebook = By.cssSelector("ul[class='top-menu mobile'] a[href='/notebooks']");
    public By SelectTheNoteBook = By.cssSelector("ul[class='top-menu notmobile'] a[href='/notebooks']");
    public By DeskTopHeader = By.cssSelector("div[class=\"page-title\"] h1");
    public By ClickOnWishlistButton = By.cssSelector("div[data-productid='18'] button[class='button-2 add-to-wishlist-button']");

    public By SuccessMessage = By.cssSelector("div[id='bar-notification'] div[class='bar-notification success']");
    public By WishListButtonTopPage = By.className("ico-wishlist");
    public  By quantityValue = By.cssSelector("td[class='quantity'] input");

   public By ClickOnFaceBookLink = By.className("facebook");
    public By ClickOnTwitterLink = By.className("twitter");
    public By ClickOnRssLink = By.className("rss");
    public By ClickOnYoutubeLink = By.className("youtube");
    public  By BarNotification=By.cssSelector("div[id='bar-notification'] div[class='bar-notification success']");

    public  By FirstHomeSlider =By.xpath("//div[@id='nivo-slider']/a/img[contains(@src,'_banner_01')]");
    public  By SecondHomeSlider =By.xpath("//div[@id='nivo-slider']/a/img[contains(@src,'_banner_02')]");
    public By ImageBanner =By.id("nivo-slider");
}