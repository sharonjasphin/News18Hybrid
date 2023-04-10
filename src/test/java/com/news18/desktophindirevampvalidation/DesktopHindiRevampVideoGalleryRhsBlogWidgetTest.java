package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsBlogWidgetTest extends DesktopCommonConfig{
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogRhsSportsArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogRhsSportsReadMoreNavigation(serverType);
	}
}
