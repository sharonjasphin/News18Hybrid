package com.news18.gujaratipages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 *@author SanjeebKumarPati
 *This Class Contains Elements and Business Logics For Desktop Gujurati Article Consumption Page
 */
public class DesktopGujaratiArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	String metaTagTitleTxt;
	String metaTagTextcontentLnk;
	String metaTagdescriptionLnk;
	String metaTagdescriptioncontentTxt;
	String metaTagKeywordtLnk;
	String metaTagKeywordcontentLnk;

	public WebDriver driver;
	public DesktopGujaratiArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'videos'))]")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'artclbyeline')]//time)[1] | (//ul[contains(@class,'phtartcl-newbyeline-agency')]//time)[1]")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artclbyeline')]//ul[contains(@class,'share')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'artclbyeline')]//ul[contains(@class,'share')]")
	private WebElement allShareIcons;

	/*metatag title present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='title']")
	private WebElement  metaTagTitle;

	/*metatag text present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[contains(text(),'title')])")
	private WebElement  metaTagText;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[contains(text(),'title')]//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagTextContent;

	/*metatag description present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='description']")
	//	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='og:description']")
	private WebElement  metaTagDescription;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='og:description']//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagDescriptionContent;

	/*metatag keywords present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='keywords']")
	private WebElement  metaTagKeyword;

	/*Metatag keywords content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='keywords']//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagKeywordContent;

	/*Homepage artice headline1 Link*/
	@FindBy(xpath = "//* [contains(text(),'h1')]/parent::td")
	private WebElement  headline1Lnk;

	/*Homepage article headline2 text*/
	//		@FindBy(xpath = "//* [contains(text(),'h2')]/parent::td")
	@FindBy(xpath = "(//* [contains(text(),'<h2')]/parent::td)[2]")//td//span[contains(text(),'h2')]/parent::td
	private WebElement  headline2Lnk;


	public List<WebElement> getLatestArtcleLst() {
		return latestArtcleLst;
	}


	public WebElement getFirstPublishedDate() {
		return firstPublishedDate;
	}


	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}


	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

}
