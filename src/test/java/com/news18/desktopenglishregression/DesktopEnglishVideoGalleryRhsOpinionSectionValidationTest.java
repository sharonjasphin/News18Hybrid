package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsOpinionSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneOpinionSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneOpinionSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneOpinionSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
