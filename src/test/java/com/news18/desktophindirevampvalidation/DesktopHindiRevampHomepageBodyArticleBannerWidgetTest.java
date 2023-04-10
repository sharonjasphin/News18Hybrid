package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyArticleBannerWidgetTest extends DesktopCommonConfig {

	@Test
	public void articleBannerNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyArticleBannerNavigation(serverType);
	}
}
