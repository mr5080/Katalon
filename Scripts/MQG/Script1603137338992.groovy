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

WebUI.setText(findTestObject('Object Repository/MQG/Page_TEST DATA accesshometestcogisicom/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/MQG/Page_TEST DATA accesshometestcogisicom/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/MQG/Page_TEST DATA accesshometestcogisicom/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/MQG/Page_TEST DATA accesshometestcogisicom/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/MQG/Page_/li_View Quotes'))

WebUI.setText(findTestObject('Page_/input_or_QuoteNumber'), '614965')

'Continue after entering quote number'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input'))

'EDIT button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

WebUI.click(findTestObject('Object Repository/MQG/Page_/input_How would you like to edit this quote_ee0ffd'))

'General > button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MQG/Page_/select_YesNo'), 'N', true)

'Applicant >  button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Additional Insured > button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Property > button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Wind Midigation'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Coverage > button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Losses  > button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Optional Coverages'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Discounts and Surcharges'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

WebUI.setText(findTestObject('Object Repository/MQG/Page_/input_Interest Name_InterestNamexxxx1_1'), 'No name ')

WebUI.setText(findTestObject('Object Repository/MQG/Page_/input_Address_InterestAddress1xxxx1_1'), '1322 BROOKGREEN WAY')

WebUI.setText(findTestObject('Object Repository/MQG/Page_/input_City State Zip_InterestCityxxxx1_1'), 'Fleming isle')

WebUI.setText(findTestObject('Object Repository/MQG/Page_/input_City State Zip_InterestZipxxxx1_1'), '32003')

WebUI.setText(findTestObject('Object Repository/MQG/Page_/input_Loan Number_LoanNumberxxxx1_1'), '1234567890')

'Billing >  button'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

'Bind Submit Application'
WebUI.click(findTestObject('Object Repository/MQG/Page_/input_1'))

WebUI.rightClick(findTestObject('Object Repository/MQG/Page_/div_169350'))

WebUI.doubleClick(findTestObject('Object Repository/MQG/Page_/div_3550'))

