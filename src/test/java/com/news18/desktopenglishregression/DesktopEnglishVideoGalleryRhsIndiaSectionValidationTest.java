package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsIndiaSectionValidationTest extends DesktopCommonConfig {
	
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneIndiaSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneIndiaSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneIndiaSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
