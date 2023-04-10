package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyCricketSectionValidation extends MobileCommonConfig {
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_cricketArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleBreadcrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_cricketArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_cricketArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleDetailedBoxValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_cricketArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_cricketArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleSocialMediaShareNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_cricketArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleFooterSocialMediaIconNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_cricketArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
//	@Test
	public void std_Article_Mweb_06_cricketArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleRelatedNewsNavigation(serverType);
	}
    
    /**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
    @Test
	public void std_Article_Mweb_07_cricketArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleReadMoreAndHeaderLinkNavigation(serverType);
	}
	
    /**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_cricketArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleTaboolaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyCricketArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_CricketArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyCricketArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileArticleConsumptionPage.verifyCricketArticleAboutTheAuthorNavigation(serverType);
	}
}
