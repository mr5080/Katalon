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

WebUI.navigateToUrl('https://www2.webcetera.com/EZLynxWeb/login.aspx')

WebUI.setText(findTestObject('Page_EZLynx Login/input_Username__ctl0MainContentPlaceHoldert_22ec08'), 'ahic_jhughes')

WebUI.setEncryptedText(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHoldert_f095d5'), 'CF//N9c6Ljf6S/ILKaMCqg==')

WebUI.click(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'))

WebUI.setEncryptedText(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHoldert_f095d5'), 'CF//N9c6Ljf6S/ILKaMCqg==')

WebUI.click(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'))

WebUI.click(findTestObject('Page_EZLynx - Home Page/span_Directory_icon-applicants'))

WebUI.click(findTestObject('Page_EZLynx - Home Page/span_VU CHARLES'))

WebUI.click(findTestObject('Page_VU CHARLES - Overview/span_Details'))

WebUI.click(findTestObject('Page_VU CHARLES - Details/input_Contact Time_SubmitButton'))

WebUI.click(findTestObject('Page_EZLynx - Rating/a_Finish'))

WebUI.click(findTestObject('Page_EZLynx - Finish/input_(edit)__ctl0_ctl0MainContentPlaceHold_c8646b'))

WebUI.click(findTestObject('Page_Submit/input_Instructions__ctl0_ctl0MainContentPla_14bd40'))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Page_VU CHARLES - Quote Details/span_Quoted by'), 30)) {
    String quoteNum = WebUI.getAttribute(findTestObject('Page_VU CHARLES - Quote Details/span_John Hughes of Access Home Insurance Company'), 
        'innerHTML')

    System.out.println('quoteNum = ' + quoteNum)

    String quoteNum2 = WebUI.getAttribute(findTestObject('Page_VU CHARLES - Quote Details/div_Quote Number 610223'), 'innerHTML')

    System.out.println('quoteNum2 = ' + quoteNum2) //Boolean textPresent = WebUI.verifyTextPresent('Quote Number', false))		  
}

WebUI.closeBrowser()

