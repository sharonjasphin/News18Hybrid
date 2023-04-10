package com.news18.izootoValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 **This test Class contains scripts to verify the Izooto.js, present in various pages
 * of Desktop Bengali
 */

public class DesktopBengaliIzootoTest extends DesktopCommonConfig {
	
	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 HomePage for Bengali Language URL which is fetching from Property File
	 * URL - https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate the Izooto present in News18 HomePage for Bengali Language
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyHomePageIzooto() throws InterruptedException 
	{
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}

	
	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to first Article excluding LiveBlog Article Links in News18 HomePage and 
	 * validate the Izooto present in HomePage Article 
	 * Consumption Page
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyArticleIzooto() throws InterruptedException 
	{
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();   // Click on First Article excluding LiveBlog Article
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}
	
	
	
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate Photos section and Click on the first PhotoGallery Article in News18 PhotoGallery Page 
	 * and validate the Izooto present in PhotoGallery Article 
	 * Consumption Page
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyPhotoGalleryIzooto() throws InterruptedException 
	{
		pages.desktopBengaliLandingPage.clickOnPhotoSection();  							// Click on Photos Section 
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();	// Click on First PhotoGallery Article
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}

}
