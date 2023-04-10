package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


public class DesktopHindiRevampArticleFooterKnowledgeValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void knowledgeArticlefooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstKnowledgeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void knowledgeArticlefooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstKnowledgeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void knowledgeArticlefooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstKnowledgeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
	
	
}
