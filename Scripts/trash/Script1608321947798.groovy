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

WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/Trash/Page_TEST DATA cypressstage.cogisi.com/input_AGENT CODE_userloginid'), '0')

WebUI.setText(findTestObject('Object Repository/Trash/Page_TEST DATA cypressstage.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Trash/Page_TEST DATA cypressstage.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/Trash/Page_TEST DATA cypressstage.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/Trash/Page_/label_Start'))

WebUI.click(findTestObject('Object Repository/Trash/Page_/a_Start a New Quote'))
WebUI.click(findTestObject('Object Repository/Trash/Page_/a_Start a New Quote'))
WebUI.click(findTestObject('Object Repository/Trash/Page_/a_Start a New Quote'))
WebUI.click(findTestObject('Object Repository/Trash/Page_/a_Start a New Quote'))
WebUI.click(findTestObject('Object Repository/Trash/Page_/a_Start a New Quote'))
