package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsTechSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneTechSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneTechSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneTechSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
