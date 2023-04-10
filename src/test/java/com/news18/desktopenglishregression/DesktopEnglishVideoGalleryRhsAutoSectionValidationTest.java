package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsAutoSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineTwoAutoSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineTwoAutoSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineTwoAutoSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
