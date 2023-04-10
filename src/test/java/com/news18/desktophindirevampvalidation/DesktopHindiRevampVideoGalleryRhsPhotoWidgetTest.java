package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsPhotoWidgetTest extends DesktopCommonConfig{

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoRhsEntertainmentArticleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoRhsSportsArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoRhsSportsReadMoreNavigation(serverType);
	}
	
}
