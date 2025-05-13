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

WebUI.navigateToUrl('https://alchemytest.cogisi.com/is/root/logon/index.cfm')

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/button_Recalculate'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/button_Calculate'))

WebUI.switchToWindowTitle('360Value')

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_(including attached)_PRI-XT_COMMERCIA_dd4062'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Primary Building_PRI-XT_COMMERCIAL_SQ_d14417'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/span_Continue'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/div_Structural'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Exterior Wall Finish_PRI-XTOL_EWF-SELECT_0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/span_Painted Masonry'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Window Density_PRI-XTOL_WD-SELECT_0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/mat-option_10 - 20'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Roof Type_PRI-XTOL_RO-SELECT_0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/mat-option_Mansard'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Roof Structure_PRI-XTOL_RFS-SELECT_0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/span_Light Gauge Steel Frame'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Roof Material_PRI-XTOL_RC-SELECT_0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/span_Composition - Architectural'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/input_Store - Drugstore_PRI-XTOL_IWS-SELECT_0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/span_Drywall over Steel Studs'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/span_Calculate Now'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/button_Get Results'))

WebUI.click(findTestObject('Object Repository/Alchemy/Alchemy360/a_Close'))

WebUI.closeBrowser()

