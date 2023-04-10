package com.news18.urdupages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This Class Contains elements and business logics for Urdu Desktop Landing Page
 */
public class DesktopUrduLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopUrduLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*photo section Present in Line One navigation bar */
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionLineOneLnk;

	/*Homepage List of article Link for news18 urdu Page*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="//div[contains(@class,'nhtranding')]//a[contains(@href,'/tag/')]")
	private List<WebElement> trendingTopicsLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'container')]//a[contains(@href,'-live-')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Sports link present after clicking on line 4two*/
	@FindBy(xpath ="//ul[contains(@class,'nav_bar')]//a[@href='/sports/']")
	private WebElement sportsSectionLnk;

	/*video link present at Footer section*/
	@FindBy(xpath ="//ul[contains(@class,'nav_bar')]//a[@href='/videos/']")
	private WebElement videoSectionLnk;

	/*Section link present at line one section*/
	@FindBy(xpath ="(//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sports/')) and not(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))and not(contains(@href,'/games/'))])[3]")
	private WebElement sectionLnk;


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Home Page Article links", e);
		}
	}


	/**
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(photoSectionLineOneLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photo Section link", e);
		}
	}



	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Malayalam Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnk.get(0)))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnk.get(0));
			}
			else
			{
				Logs.error(getClass(), "Exception in Live blog in HomePage Link");
				throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
			}
		}
		catch(IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on sports link present on lineOne section
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sportsSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section link ", e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Video link present on Line one section
	 */
	public void clickOnVideoLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(videoSectionLnk, GlobalVariables.sec30);
			webDriverActions.click(videoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in first Live Blog Article Homepage ", e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(trendingTopicsLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Trending Topics link ", e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on entertainment link present on line one section
	 */
	public void clickOnFirstSectionLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section Link HomePage ", e);
		}	
	}
}
