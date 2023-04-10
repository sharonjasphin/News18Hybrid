package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsVideoSectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to verify Video Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneVideoSectionRHSTrendingVideo() {
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyRhsVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Video Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneVideoSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyRhsVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Video Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneVideoSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyVideosArticleRHSTrendingVideoDownAdNavigation(serverType);
	}
}
