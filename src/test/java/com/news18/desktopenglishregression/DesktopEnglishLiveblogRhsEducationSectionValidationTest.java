package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsEducationSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyEducationSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyEducationSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyEducationSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyEducationSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyEducationSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
	}
