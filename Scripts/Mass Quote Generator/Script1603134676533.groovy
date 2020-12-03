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

WebUI.setText(findTestObject('null'), '0')

WebUI.setText(findTestObject('null'), 'jhughes')

WebUI.setEncryptedText(findTestObject('null'), '1w8xCCmEypU3q31XlL176w==')

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '614970')

'Continue'
WebUI.click(findTestObject('null'))

'EDIT button'
WebUI.click(findTestObject('null'))

WebUI.delay(5)

try {
    'Accpet 15 min alert'
    WebUI.acceptAlert()
}
catch (Exception e) {
    System.out.println('No alert')
} 

'How do you want to edit this quote?'
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'N', true)

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.selectOptionByValue(findTestObject('null'), 
    'Y', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.setText(findTestObject('null'), 'Mr. Cooper')

WebUI.setText(findTestObject('null'), '13661 CYGNUS DR')

WebUI.setText(findTestObject('null'), 'Orlando')

WebUI.selectOptionByValue(findTestObject('null'), 
    'FL', true)

WebUI.setText(findTestObject('null'), '32828')

WebUI.setText(findTestObject('null'), '1234567890')

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.selectOptionByValue(findTestObject('null'), 
    'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'SEMI', true)

WebUI.click(findTestObject('Object Repository/Mass Quote Generator/input_1'))

WebUI.click(findTestObject('null'))

WebUI.rightClick(findTestObject('null'))

WebUI.rightClick(findTestObject('null'))

WebUI.rightClick(findTestObject('null'))

WebUI.closeBrowser()

