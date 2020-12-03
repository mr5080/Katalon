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

WebUI.setText(findTestObject('Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '0')

WebUI.setText(findTestObject('Page_TEST DATA cypresstestcogisicom/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), '1w8xCCmEypU3q31XlL176w==')

WebUI.sendKeys(findTestObject('Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.rightClick(findTestObject('Page_/div_Quote Number 627'))

WebUI.rightClick(findTestObject('Page_/div_Quote Number 627'))

WebUI.click(findTestObject('Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Page_/button_Accept'))

WebUI.click(findTestObject('Page_/button_Accept'))

WebUI.closeBrowser()

