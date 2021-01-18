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

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_USERNAME_userloginname'), 
    'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_DP3Dwelling Property CitizensDwellin_86c77a'), 
    'HOEG', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Property Zip Code_ApplicantZip'), '70592')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Name_ApplicantName'), 'Sally Smith')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Address_ApplicantAddress1'), '105 3rd st')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input'))

boolean elementPresent = WebUI.waitForAlert(10)

if (elementPresent == true) {
	alertText = WebUI.getAlertText()
	System.out.println('The title of the alert is: \n' + alertText)
	WebUI.delay(1)
	WebUI.acceptAlert()
	System.out.println('Accept address validation has been accepted' )
	WebUI.switchToDefaultContent()
//	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
}
		
WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_X_GMAcceptButton'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/button_Accept'))

