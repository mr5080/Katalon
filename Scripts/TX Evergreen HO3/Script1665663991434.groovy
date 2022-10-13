import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

//WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
if (environment == 'TEST') {
	WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
	WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')
}


if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '10100')
} else {
	WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '0')
}

//WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '10100')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/TX Evergreen HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Effective Date_EffectiveDate'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/form_Effective DateExpires one year from Ef_d2c8bd'))

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Effective Date_EffectiveDate'), '10/14/2022')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_FLORIDATEXAS'), '42', true)

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_First Name_ApplicantFirst'), 'rebecca')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Last Name_ApplicantLast'), 'white')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Address_ApplicantAddress1'), '24607 beach st')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_City_ApplicantCity'), 'monte alto')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Property Zip Code_ApplicantZip'), '78538')

WebUI.sendKeys(findTestObject('Object Repository/TX Evergreen HO/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Effective Date_EffectiveDate'))

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Purchase Date_PurchaseDate_1'), '10/14/2018')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-555-6950')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '02/02/1981')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_DivorcedMarriedSingleSeparated'), 'M', true)

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Purchase Date_PurchaseDate_1'), '10/14/2018')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Previous Carrier_PriorCarrier_1'), 'travelers')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), '10/14/2022')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Previous Policy_PriorPolicyNumber_1'), '1234560789')

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Coverage'))

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input__DwellingLimit_1'), '350689')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_1,0002,5005,000125'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_1,0002,5005,000125_1'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_125'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_NoneEvergreen Edge CoverageEvergreen_d28c8c'), 'EDGE', true)

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_FrameMasonryMasonry VeneerSuperior'), 'V', true)

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Square feet_SquareFootage_1'), '2569')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Year of Last Plumbing Update_LastPlum_481c1c'), '2015')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Construction Year_ConstructionYear_1'), '2015')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_PrimarySecondarySeasonal'), 'PRIMARY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Architectural ShinglesAsbestos3-tab _9deaa1'), 'ARCHITECTURAL', true)

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Year Water Heater was Installed_YearW_1b65d3'), '2015')

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEScreenedEnclosure_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_UnknownOtherVeneer BrickMasonryAlumi_f7e94c'), 'VENEER', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Slab - Closed FoundationCrawl Space _2f2f45'), 'FINISHED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Tier 1Tier 2Remainder'), 'TIER2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_CopperGalvanizedPVCPolybutylenePEX'), 'COPPER', true)

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Year of Last Electrical Update_LastEl_71b4ed'), '2015')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Responding Fire Department_Responding_eb6df6'), 'houston')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_7c5769'), '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Protection Class 1Protection Class 2_2c389b'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_History'))

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Interests'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Statements'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEUnrepairedDamage_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Yes_NOSAVEGQClaimAssist_1'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Full PaySemi Annual (55 down)Quarter_8dd4b0'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Please SelectREBECCA  WHITE'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Please SelectREBECCA  WHITE_1'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_BindSubmit Application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'PR', true)

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Enter Credit Card Information'))

WebUI.waitForElementVisible(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Evergreen HO3/Page_/select_American ExpressDiscoverMasterCardVisa'), 'V', true)

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Credit Card Number_NOSAVEACCT'), '4111 1111 1111 1111')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Card Expiration Date_NOSAVEEXPDATE'), '11/28')

WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Card Security Code_CVV2'), '111')

WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Authorize Credit Card'))


WebUI.setText(findTestObject('Object Repository/TX Evergreen HO3/Page_/input_Authorized User Agreement_RecurPayAuthorize'), 'white')


if (shouldBind == true) 
{
	WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Bind Application'))

	String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/TX Evergreen HO3/Page_/PolicyID'), 'innerHTML')

	System.out.println('policyNumber = ' + policyNumber) //WebUI.closeBrowser()
} 
else 
{
	WebUI.comment('shouldBind = ' + shouldBind)
}
/*
WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Bind Application'))

WebUI.waitForElementPresent(findTestObject('Object Repository/TX Evergreen HO/Page_/PolicyID'), 10)

WebUI.closeBrowser()
*/

