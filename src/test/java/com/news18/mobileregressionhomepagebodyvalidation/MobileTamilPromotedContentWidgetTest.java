package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilPromotedContentWidgetTest extends MobileCommonConfig {

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
