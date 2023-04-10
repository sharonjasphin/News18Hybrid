package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryRhsAjabGajabWidgetTest extends DesktopCommonConfig{

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoGalleryRHSEntertainmentTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabRhsEntertainmentTitleNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoGalleryRHSEntertainmentArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabRhsEntertainmentArticleNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Entertainment present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoGalleryRHSEntertainmentReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabRhsEntertainmentReadMoreNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoGalleryRHSSportsTitleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabRhsSportsTitleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoGalleryRHSSportsArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabRhsSportsArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate RHS Sports present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoGalleryRHSSportsReadMoreValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabRhsSportsReadMoreNavigation(serverType);
	}
	
}
