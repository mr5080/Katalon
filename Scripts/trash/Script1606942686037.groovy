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

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/PolicyNum/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/PolicyNum/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/PolicyNum/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.sendKeys(findTestObject('Object Repository/PolicyNum/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/li_View Quotes'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/form_Select from a list of relevant QuotesR_8c7a30'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/span_Select from a list of relevant Quotes'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/a_3651'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/input_Quote Number 3651_form-control btn IS_6c2f8b'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/input_Quote Number 3651_form-control btn IS_6c2f8b'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/a_9. BindSubmit Application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyNum/Page_/select_CheckCredit CardEFT'), '', true)

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/input_Quote Number 3651_form-control btn IS_6c2f8b'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/td_PROPERTY LOCATION 1023 CALUMET ST CLEARW_86bbed'))

WebUI.click(findTestObject('Object Repository/PolicyNum/Page_/td_PolicyNumber'))

