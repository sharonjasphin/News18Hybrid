package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsShowshaSectionValidationTest extends DesktopCommonConfig {
	
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneShowshaSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneShowshaSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneShowshaSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
