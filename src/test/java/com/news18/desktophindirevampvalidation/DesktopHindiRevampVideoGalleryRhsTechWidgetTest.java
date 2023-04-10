package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsTechWidgetTest extends DesktopCommonConfig {

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Tech Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyTechVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyTechRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Tech Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyTechVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyTechRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Tech Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyTechVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyTechRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Tech Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyTechVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyTechRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Tech Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyTechVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyTechRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Tech Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyTechVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyTechRhsSportsReadMoreNavigation(serverType);
	}
}
