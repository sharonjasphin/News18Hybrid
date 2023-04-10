package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampArticleFooterPodcastValidationTest extends MobileCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void podcastSectionArticleVerifyFooterFirstLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPodcastSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyFooterFirstLayerSection(); 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Live Tv Section
	 */
	@Test
	public void podcastSectionArticleVerifyFooterLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPodcastSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLiveTvSection(); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void podcastSectionArticleVerifyFooterLastLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPodcastSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLastLayerSection(); 
	}



	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void podcastSectionArticleVerifyFooterStickySection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPodcastSectionFirstArticle();
		pages.mobileHindiLandingPage.verifyStickySection();	}

}
