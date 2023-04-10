package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsAstrologyWidgetTest extends DesktopCommonConfig{


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyRhsSportsReadMoreNavigation(serverType);
	}
	
	
}
