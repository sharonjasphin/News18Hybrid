package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsAutoWidgetTest extends DesktopCommonConfig{


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoRhsSportsArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoRhsSportsReadMoreNavigation(serverType);
	}
	
}
