package com.news18.telugupages;

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
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for telugu sports Page
 */
public class DesktopTeluguSportsPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopTeluguSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of sports Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story_right')]//a")
	private List<WebElement> sportsArticlesLnk;

	/*live Blog First Article of sports Page*/
	@FindBy(xpath = "//div[contains(@class,'resLiftSideFull')]//a[contains(@title,'LIVE Updates')]")
	private List< WebElement> liveBlogtFirstArticleLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of telugu sports Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(sportsArticlesLnk.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Cricket Next Article Link", e);
		}
	}


	
	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(liveBlogtFirstArticleLnk.get(0)))
			{
				webDriverActions.clickJS(liveBlogtFirstArticleLnk.get(0));
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
}

