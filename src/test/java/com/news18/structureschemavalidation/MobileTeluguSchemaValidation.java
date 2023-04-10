package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */
public class MobileTeluguSchemaValidation extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */

//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 Telugu Photogallery page
	 * Url- https://telugu.news18.com/amp/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 Telugu Homepage 
	 * Url- https://telugu.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguhArticlePage() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate liveblog present in the News18 telugu home page 
	 * Url- https://telugu.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguLiveblogPage() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnLiveBlogArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author DanishR
	 * This method is used to validate video present in the News18 punjab home page 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnVideosSection();
		pages.mobileTeluguVideoSectionPage.clickvideoArticleLnk();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
