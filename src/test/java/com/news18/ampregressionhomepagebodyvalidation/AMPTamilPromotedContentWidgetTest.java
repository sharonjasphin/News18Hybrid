package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilPromotedContentWidgetTest extends MobileCommonConfig {

	@Test
	public void promotedContentArticleNavigation()
	{
		pages.mobileOutbrainValidation.verifyPromotedContentArticleNavigation();
	}
	
	@Test
	public void promotedContentImageNavigation()
	{
		pages.mobileOutbrainValidation.verifyPromotedContentImageNavigation();
	}
}
