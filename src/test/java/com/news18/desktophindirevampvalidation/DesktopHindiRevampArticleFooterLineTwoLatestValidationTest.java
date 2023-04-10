package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleFooterLineTwoLatestValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void LatestSectionArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void LatestSectionArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void LatestSectionArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}

}
