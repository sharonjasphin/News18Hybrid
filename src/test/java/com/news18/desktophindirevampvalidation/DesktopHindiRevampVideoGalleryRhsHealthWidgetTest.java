package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsHealthWidgetTest extends DesktopCommonConfig{

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthRhsSportsReadMoreNavigation(serverType);
	}
}

