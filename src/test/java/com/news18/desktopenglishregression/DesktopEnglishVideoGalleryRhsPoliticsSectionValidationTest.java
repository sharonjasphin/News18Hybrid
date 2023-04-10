package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsPoliticsSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOnePoliticsSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOnePoliticsSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOnePoliticsSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
