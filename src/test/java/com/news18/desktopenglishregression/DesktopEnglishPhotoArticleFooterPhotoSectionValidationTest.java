package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mongodb.connection.Server;
import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopEnglishPhotoArticleFooterPhotoSectionValidationTest extends DesktopCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void photo_Consumption_13_photoArticlefooterFirstLayerValidation () {
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer("live");
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photo_Consumption_13_photoArticlefooterLiveTvValidation () {
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopLandingPage.verifyLiveTvIcon();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photo_Consumption_13_photoArticlefooterLastLayerValidation () {
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection("live");
	}
	
	
	
}