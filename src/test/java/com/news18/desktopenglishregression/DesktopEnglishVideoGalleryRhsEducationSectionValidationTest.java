package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsEducationSectionValidationTest extends DesktopCommonConfig {
	
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOneEducationSectionRHSTrendingVideos() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOneEducationSectionRHSTrendingPhotos() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOneEducationSectionRHSTrendingVideoDownAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(serverType);
	}
}
