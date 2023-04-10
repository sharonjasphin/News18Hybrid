package com.news18.categorylinksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class validate URLs present on the Desktop Hindi HomePage 
 */
public class DesktopHindiMigrationCategoryPageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Hindi News18 Home Page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */

	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void hindiDesktopCategoryLinks() throws Throwable {
		pages.categoryPageLinksValidation.verifyAllLinksInCategoryPages(fileUtility.readDataFromPropertyFile("hindiRevampUsername"),fileUtility.readDataFromPropertyFile("hindiRevampPwd"),"live");
		pages.categoryPageLinksValidation.verifyAllLinksInCategoryPagesL2(fileUtility.readDataFromPropertyFile("hindiRevampUsername"),fileUtility.readDataFromPropertyFile("hindiRevampPwd"),"live");
		
	}
}

