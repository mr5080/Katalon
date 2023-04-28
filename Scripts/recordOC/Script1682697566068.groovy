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

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '0')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/FL DP/Page_/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.sendKeys(findTestObject('Object Repository/FL DP/Page_/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Object Repository/FL DP/Page_/Page_/select_OptionalCoverage2'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/Page_/div_Optional Coverage List'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ACVROOF', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ACVLS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'MOLDFUNGI', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'LOSSLIAB', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ORDINANCELAW', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'INCIDENTALOCC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'PPRC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'INCIDENTALOCC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'PPRC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'REFRIGPROP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'SCREENENCL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'THEFT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'WATERDMG', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/Page_/h4_Loss Assessment - Property'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNoPermittedIncidentalOccupancy'), 'Y', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Permitted Incidental Occupancy - Limit'), '25456')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Description of Other Structures'), 'tall building')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Business Description_IncidentalOccupancy'), 'selling stuff')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNo_1PermittedIncidentalOccupancy'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNo_1PermittedIncidentalOccupancy'), 'Y', true)

