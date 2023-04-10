package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsCareerWidgetTest extends DesktopCommonConfig{

	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerRhsSportsReadMoreNavigation(serverType);
	}
}
