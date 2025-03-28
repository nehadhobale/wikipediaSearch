package com.wikipediaAppiumProject.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchBarPages {

     AppiumDriver driver;

    public SearchBarPages(AppiumDriver driver) {
        this.driver = driver;
    }
    //Locators for SearchBar
    private By searchBar = By.xpath("//android.widget.TextView[@text='Search Wikipedia']");
    private By sendText = By.xpath("//android.widget.AutoCompleteTextView[@resource-id='org.wikipedia.alpha:id/search_src_text']");
    private By selectText = By.xpath("//android.widget.TextView[@resource-id='org.wikipedia.alpha:id/page_list_item_description' and @text='Japanese manga series and franchise']");
    private By getSearchTitle = By.xpath("//android.widget.TextView[@text='Attack on Titan'][1]");



    public void doWikipediaSearch(String searchText){
        driver.findElement(searchBar).click();
        driver.findElement(sendText).sendKeys(searchText);
        driver.findElement(selectText).click();
    }

    public String getSearchTitle(){
         return driver.findElement(getSearchTitle).getText();
    }
}
