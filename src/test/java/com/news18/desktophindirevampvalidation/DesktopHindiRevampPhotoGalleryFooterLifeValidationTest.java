package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampPhotoGalleryFooterLifeValidationTest extends DesktopCommonConfig {


	
	//=================================== Photo Article =====================================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void lifePhotoArticlefooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifePhotoArticlefooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifePhotoArticlefooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}


}
