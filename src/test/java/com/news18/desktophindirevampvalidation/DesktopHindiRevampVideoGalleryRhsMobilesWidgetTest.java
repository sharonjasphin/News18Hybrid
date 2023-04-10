package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsMobilesWidgetTest extends DesktopCommonConfig{
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMobilesVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMobilesRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMobilesVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMobilesRhsEntertainmentArticleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMobilesVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMobilesRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMobilesVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMobilesRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMobilesVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMobilesRhsSportsArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMobilesVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMobilesRhsSportsReadMoreNavigation(serverType);
	}
}


