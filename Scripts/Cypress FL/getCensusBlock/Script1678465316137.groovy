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


/*	to do
 * put loop inside of this file so dont have to open/close browser and logout/in every time
 * read sequentially from a file
 * write to a file 
 * 
 */
WebUI.openBrowser('')

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '0')

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/CensusBlockTest/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/label_Start'))

WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/a_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CensusBlockTest/Page_/select_DwellingHomeownersHomeowners - LegacyCondoCondo - Legacy'), 'HO3', true)

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_/input_First Name_ApplicantFirst'), 'johnny')

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_/input_Last Name_ApplicantLast'), 'Jones')

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_/input_Address_ApplicantAddress1'), '1775 6th st')

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_/input_City_ApplicantCity'), 'sarasota')

WebUI.setText(findTestObject('Object Repository/CensusBlockTest/Page_/input_Property Zip Code_ApplicantZip'), '34236')

WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/input'))
WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/input'))

//WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/div_Quote Number 3104122'))

//WebUI.rightClick(findTestObject('Object Repository/CensusBlockTest/Page_/div_--Select Layout--NoBannerLeftMenuOneAre_d786c9'))

//WebUI.delay(3)
WebUI.mouseOver(findTestObject('Object Repository/CensusBlockTest/Page_/div_testToolsMenu'))

WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/TestingTools'))  // click Testing Tools button

WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/a_WDDX'))

//WebUI.click(findTestObject('Object Repository/CensusBlockTest/Page_/td_GMFIPS_1'))

//String censusBlock = WebUI.getText(findTestObject('Object Repository/CensusBlockTest/Page_/td_GMFIPS_1 - Value'))
String censusBlock = WebUI.getAttribute(findTestObject('Object Repository/CensusBlockTest/Page_/td_GMFIPS_1 - Value'), 'innerHTML')

System.out.println('censusBlock = ' + censusBlock )


WebUI.closeBrowser()

