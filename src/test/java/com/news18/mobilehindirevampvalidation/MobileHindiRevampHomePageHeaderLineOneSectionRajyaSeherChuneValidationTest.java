package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the line One Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampHomePageHeaderLineOneSectionRajyaSeherChuneValidationTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void verifyLineOneSectionRajyaSeherChune () {
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType);
	}
}
