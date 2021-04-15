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

WebUI.selectOptionByValue(findTestObject('Object Repository/Trash/Page_/select_Additional InsuredAdditional Interes_343c35'), 'M', true)

WebUI.setText(findTestObject('Object Repository/Trash/Page_/input_City, State, Zip, Zip4_InterestZipxxxx1_1'), '99999')

WebUI.setText(findTestObject('Object Repository/Trash/Page_/input_Interest Name_InterestNamexxxx1_1'), 'billy bon')

WebUI.setText(findTestObject('Object Repository/Trash/Page_/input_Address_InterestAddress1xxxx1_1'), '123 nowhere')

WebUI.setText(findTestObject('Object Repository/Trash/Page_/input_City, State, Zip, Zip4_InterestCityxxxx1_1'), 'orlando')

WebUI.selectOptionByValue(findTestObject('Object Repository/Trash/Page_/select_StateAKALARAZCACOCTDCDEFLGAHIIAIDILI_28d72e'), 'FL', true)

WebUI.setText(findTestObject('Object Repository/Trash/Page_/input_Loan Number_LoanNumberxxxx1_1'), '999999999')

WebUI.click(findTestObject('Object Repository/Trash/Page_/button_Statements'))

WebUI.closeBrowser()

