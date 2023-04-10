package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsExplainersSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneExplainersSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneExplainersSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneExplainersSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
