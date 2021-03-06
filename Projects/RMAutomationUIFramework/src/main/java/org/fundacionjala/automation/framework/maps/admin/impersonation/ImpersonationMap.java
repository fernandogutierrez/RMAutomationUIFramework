package org.fundacionjala.automation.framework.maps.admin.impersonation;

/**
 * Impersonation Map Class
 * This class contains the xpath locators of Impersonation Page
 * 
 * @author SamuelSahonero
 *
 */
public class ImpersonationMap {

	public static final String ACCOUNT_TEXT_FIELD = "//input[@type='input'][@ng-disabled='true'][@ng-model='mailservers[0].credential.username']";
	public static final String USE_IMPERSONATION_CHECK_BOX = "//span[@class='checkbox-label'][text()='Use Impersonation']/parent::label[@class='control checkbox']";
	public static final String USER_AND_PASSWORD_RADIO_BUTTON = "//span[@class='radio-label'][text()='User and Password']/parent::label[@class='control radio']";
	public static final String RFID_RADIO_BUTTON = "//span[@class='radio-label'][text()='RFID']/parent::label[@class='control radio']";
	public static final String SAVE_BUTTON = "//span[text()='Save']/parent::button[@class='info pull-right'][@ng-click='setImpersonation()']";
	public static final String IMPERSONATION_MESSAGE = "//div[@class='ng-binding ng-scope'][contains(text(),'Impersonation')]";
}
