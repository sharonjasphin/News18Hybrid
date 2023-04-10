package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This class contains Test Methods to Validate the LineOne Money Widget 
 */
public class DesktopHindiRevampVideoGalleryRhsMoneyWidgetTest extends DesktopCommonConfig {

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyRhsSportsReadMoreNavigation(serverType);
	}
}

