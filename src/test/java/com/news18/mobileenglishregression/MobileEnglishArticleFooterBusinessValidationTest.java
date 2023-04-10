package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mongodb.connection.Server;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileEnglishArticleFooterBusinessValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void article_Consumption_17_businessArticlefooterFirstLayerValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyFooterFirstLayerSection();
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void article_Consumption_17_businessArticlefooterLastLayerValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyfooterLastLayerSection();
	}
	
	
}