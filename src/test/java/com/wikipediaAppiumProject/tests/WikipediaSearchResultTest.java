package com.wikipediaAppiumProject.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikipediaSearchResultTest extends BaseTest {

    @Test
    public void verifyWikipediaSearch(){
        searchBar.doWikipediaSearch("Attack on Titan");
        String getTitle = searchBar.getSearchTitle();
        Assert.assertTrue(getTitle.contains("Attack on Titan"),"Title is not matching");
    }


}
