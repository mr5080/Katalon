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

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Proceed to Application'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Paperless Document Delivery_NOSAVEPaperless'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Occupation'), 'EMPLOYED', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Address_PreviousAddress1'), '850 Queen St')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_PreviousCity'), 'Harrisburg')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_PreviousZip'), '17113')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Carrier_PriorCarrier_1'), 'travelers')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Expiration Date'), '04/30/2023')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Policy_PriorPolicyNumber_1'), '2313564897')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Coverage'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Recalculate'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/a_Close'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_FloodZone'), 'A', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Flood Insurance Carrier_FloodCarrier_1'), 'free water')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Flood Policy_FloodPolicyNum_1'), '651561651651')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_General'))

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Wiring Year Completed_LastElectricalUpdate_1'), '2018')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Roof Year Completed_LastRoofUpdate_1'), '2019')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Plumbing Year completed_LastPlumbingUpdate_1'), '2020')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Heating system year completed_LastHea_8ccefb'), '2021')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_History'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/body_Policy Prequalification Coverage Gener_128a19'))

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Interests'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_AddAdditionalIntresttButton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_AdditionalIntrerestType'), 'M', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Interest Name_InterestNamexxxx1_1'), 'jennifer grimes')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Address_InterestAddress1xxxx1_1'), '904 Woodridge drive')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_City_InterestCityxxxx1_1'), 'middletown')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_InterestZipxxxx1_1'), '17257')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Loan Number_LoanNumberxxxx1_1'), '000000235')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Statements'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEAnyPets1_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVELeadPaint_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEAnyClaims_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEBuiltonStilts_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PaymentPlan'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PremiumBilledTo'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_RenewalBilledTo'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Display Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'MC', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Bind Application'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_MORE'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/div_PolicyID'))

WebUI.waitForElementVisible(findTestObject('Object Repository/FL DP/Page_/div_PolicyNumber'), 0)

