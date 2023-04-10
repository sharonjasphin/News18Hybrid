package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsJobsWidgetTest extends DesktopCommonConfig{

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsRhsSportsReadMoreNavigation(serverType);
	}
}
