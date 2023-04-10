package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsLifeWidgetTest extends DesktopCommonConfig {
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeRhsSportsReadMoreNavigation(serverType);
	}
}

