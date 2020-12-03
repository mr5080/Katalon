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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accesshometest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_TEST DATA accesshometestcogisicom/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_TEST DATA accesshometestcogisicom/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/MQG-2/Page_TEST DATA accesshometestcogisicom/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/MQG-2/Page_TEST DATA accesshometestcogisicom/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/li_View Quotes'))

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_/input_or_QuoteNumber'), '614965')

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input'))

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_How would you like to edit this quote_ee0ffd'))

'General'
WebUI.click(findTestObject('MQG-2/Page_/General Button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_YesNo'), 'N', true)

'Applicant'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_YesNo I would like to proceed to get_6e3975'), 
    'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_Less than 1 year1 year2 years3 years_5fb7e4'), 
    '4', true)

'Additional Insured'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

'Property'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_1152253Bi-LevelTri-Level'), '1.5', true)

'Wind Mitigation'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

'Losses'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

'Coverage'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

'Optional Coverages'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

'Discounts and Surcharges'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

'Additional Interests'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_/input_Interest Name_InterestNamexxxx1_1'), 'Bob Barker')

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_Address_InterestAddress1xxxx1_1'))

WebUI.doubleClick(findTestObject('Object Repository/MQG-2/Page_/input_Address_InterestAddress1xxxx1_1'))

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_/input_Address_InterestAddress1xxxx1_1'), '13661 CYGNUS DR')

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_/input_City State Zip_InterestCityxxxx1_1'), 'Orlando')

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_StateAKALARAZCACOCTDCDEFLGAHIIAIDILI_28d72e'), 
    'FL', true)

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_/input_City State Zip_InterestZipxxxx1_1'), '32828')

WebUI.setText(findTestObject('Object Repository/MQG-2/Page_/input_Loan Number_LoanNumberxxxx1_1'), '12345689')

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_Please SelectSUMNER  LANDIS2F89C3 Bo_7150c0'), 
    'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG-2/Page_/select_Pay In FullSemi Annual - 55 Down4-Pa_2b5b12'), 
    'SEMI', true)

'Bind Submit application'
WebUI.click(findTestObject('Object Repository/MQG-2/Page_/input_1'))

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/div_91500'))

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/div_3550'))

WebUI.click(findTestObject('Object Repository/MQG-2/Page_/div_95050'))

