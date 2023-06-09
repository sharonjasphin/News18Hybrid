package com.news18.lokmatpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AbhishekRaj
 *
 */
public class MobileLokmatPhotogalleryConsumptionPage {
	
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  MobileLokmatPhotogalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//ul[contains(@class,'listview-story')]/li/a")
	private List<WebElement> photogalleryArticleLnk ;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'share-icon')])/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share-icon')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}
	
	/**
	 * @author AbhishekRaj
	 * This method is used to click on First article link
	 */
	public void clickPhotogalleryFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(photogalleryArticleLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article of Photos gallery Page",e);
		}
	}
}



