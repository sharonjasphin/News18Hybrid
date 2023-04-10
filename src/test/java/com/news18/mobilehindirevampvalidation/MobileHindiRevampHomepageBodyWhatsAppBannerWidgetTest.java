package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomepageBodyWhatsAppBannerWidgetTest extends MobileCommonConfig{

	@Test
	public void whatsappBannerNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyWhatsappBannerNavigation(serverType);
	}
}
