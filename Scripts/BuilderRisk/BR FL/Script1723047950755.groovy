import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import java.lang.Integer as Integer
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

RunConfiguration.setWebDriverPreferencesProperty('args', ['--incognito', '--start-maximized', '--disable-infobars', 'enable-automation'])		// takes place instead of Project - Settings - Desired Capabilityes - Web
WebUI.openBrowser('')

WebUI.navigateToUrl('https://buildersrisktest.cogisi.com/is/root/logon/index.cfm')
if (environment == 'TEST') {
	WebUI.navigateToUrl('https://buildersrisktest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
	WebUI.navigateToUrl('https://buildersriskstage.cogisi.com/is/root/logon/index.cfm')
}

WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_USERNAME_userloginname'), 
    'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_password'), 
    'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/label_Start'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/a_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_FLORIDATEXAS'), 'FL', true)

WebUI.mouseOver(findTestObject('Object Repository/BR FL/Page_/select_One Shot'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/strong_Effective Date'))




// randomize name and address
// up next write to file
WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Location Address_ApplicantAddress1'), '505 MAGNOLIA AVE')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Ext Address_ApplicantAddress2'), 'APT 008')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_City_ApplicantCity'), 'PALM HARBOR')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Location Zip Code_ApplicantZip'), '34683')






WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Effective Date_EffectiveDate'), '08/10/2024')

WebUI.click(findTestObject('Object Repository/BR FL/Page_/div_Start a New Quote   Risk StateFLORIDATE_1cee94'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_button'))		//last button on Start a New Quote

/*
WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_button'))
WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '10100')

WebUI.click(findTestObject('Object Repository/BR FL/Page_/td_TEST AGENCY'))
*/

System.out.println('"$isAgent" = ' + isAgent)

'Agent Producer'
if (isAgent == false) {
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))
	// wait for dynamic table to populate?
	WebUI.delay(1)

	for (int x = 0; x < 5; x++)
	{
		try {
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '')

		//    WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'CORNERSTONE TEST ')
		 //   WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'AGENCY ')
		//	WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord('10100',  Keys.UP, Keys.TAB))
			//WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord('10100',  Keys.UP))

			WebUI.delay(1)

			if (WebUI.waitForElementVisible(findTestObject('Object Repository/BR FL/Page_/td_TEST AGENCY'), 2)) {
				WebUI.click(findTestObject('Object Repository/BR FL/Page_/td_TEST AGENCY'))
				break
			}
		}
		catch (def e) {
			System.out.println('didnt find it, trying again... ' + x)
		}
	}
}

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Effective Date_EffectiveDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_New ConstructionNon-Structural Renov_d441a3'), 
    'NEW', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_3 Months12 Months'), '12', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Coverage'))

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Phone Number_ApplicantPhonezzzz1'), '717-762-4658')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john@cog.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_OwnerBuilderDeveloperRemodeler'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_OwnerBuilderDeveloperRemodeler'), 'OWNER', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Individual_NOSAVEApplicantAskzzzz1'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Please choose a name type_NOSAVEAppli_f4d688'))

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant First Name_NOSAVE-INDApplic_2cbe29'), 'SHEILA')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant Middle Name_NOSAVE-INDAppli_24c841'), 'ann')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant Last Name_NOSAVE-INDApplica_c58ad8'), 'TIGGERS')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant Suffix_NOSAVE-INDApplicantS_d9ac27'), 'II')

//WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_United StatesUS TerritoryInternational'), 'international', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_United StatesUS TerritoryInternational'), 'domestic', true)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Address_ApplicantAddress1'), '1000 MARGHERITA CT')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_City, State, Zip, Zip4_ApplicantCity'), 'RED LION')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/input_State'), 'PA', false)




WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_City, State, Zip, Zip4_ApplicantZip'), '17356')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Completed Value Limit_CompletedValueLimit_1'), '300000')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1,0002,5005,00010,000'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1,0002,5005,00010,000'), '5000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_2510Excluded'), '5', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Rating'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_General'))


WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_Single family residential dwellingTw_771401'), 'SINGLEFAMILYDWELLING', true)


WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Total Square Footage_SquareFootage_1'), '1589')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1234'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1234'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_FrameJoisted MasonryNon-CombustibleM_f412cc'), 
    'B', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Add InterestInsured'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_History'))
WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Statements'))

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Legal name of the builder performing _28237f'), 'Bob the builder')

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Legal name of the builder performing _edc60c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_YesNo'), 'N', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Yes_NOSAVEHomeownerOccupancy_1'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Yes_NOSAVEStiltsPilings_1'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Internal'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_DisplayQuote'))
WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_BindSubmitApp'))
WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_BindApplication'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_MORE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/BR FL/Page_/policyID'), 10)
String policyID = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/policyID'), 'textContent')
//WebUI.comment('policyID = ' + policyID)
System.out.println('policyID = ' + policyID)

String policyNumberLink = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/policyNumberLink'), 'innerHTML')
WebUI.comment('policyNumberLink = ' + policyNumberLink)
System.out.println('policyNumberLink = ' + policyNumberLink)


String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/PolicyNumber'), 'innerHTML')
WebUI.comment('policyNumber = ' + policyNumber)
System.out.println('policyNumber = ' + policyNumber)


