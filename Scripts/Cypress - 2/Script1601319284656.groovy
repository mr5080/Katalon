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

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_TEST DATA cypresstestcogisicom/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Cypress2/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_CondoHO3 (EG)Homeowners'), 'HO3', true)

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Property Zip Code_ApplicantZip'), '32254')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Name_ApplicantName'), 'Mike Smith')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Address_ApplicantAddress1'), '3519 Pinecrest St')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input__ApplicantAddress2'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input__UnifiedQuoteButton'))

//WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Agency_NOSAVEagentCode'), '10000')
//WebUI.click(findTestObject('Object Repository/Cypress2/Page_/div_FCRA Message                           _339b32'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_No producers foundLYNX comparative rater'),   '10000_EZLYNX', true)
//WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Agency_NOSAVEagentCode'), '10000')
//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_Select optionLYNX comparative rater'),     '10000_EZLYNX', true)
WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Effective Date_EffectiveDate'), '10/10/2020')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Expires one year from Effective Date__fea0c9'))

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '01/04/1999')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_EmployedHomemakerRetiredSelf Employe_88e90c'), 
    'EMPLOYED', true)

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Prior Insurance_NOSAVEPriorInsurance_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_FrameMasonryMasonry VeneerSuperior'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Purchase Date_PurchaseDate_1'), '01/02/2016')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Year of Roof_RoofConstructionYear_1'), '2017')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_Architectural ShinglesComposition Sh_144118'), 
    'ARCHITECTURAL', true)

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Responding Fire Department_Responding_eb6df6'), 'jacksonville FD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_ad3f5d'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_123456788B910'), '1', true)

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEBarrierIsland_1'))

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Cypress2/Page_/div_FCRA Message                           _339b32'))

WebUI.click(findTestObject('Page_/button_Accept'))

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-762-5555')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Previous Carrier_PriorCarrier_1'), 'Geico')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/div_Prior Insurance YesNo Previous Carrier _435b3a'))

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), '10/10/2020')

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Previous Policy _PriorPolicyNumber_1'), '1234567890')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEArsonConviction_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQRecVehicles_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEUnrepairedDamage_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEApplicationForeclosures_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEFarmOrRanch_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVENumberofAcres_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVERentedLT5Days_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEHaveWoodStoves_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_AttachedDetachedNone'), 'ATTACHED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_InOut'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_ClosedOpen'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_No Garage DoorUnbraceBracedUnknown'), 
    'UNBRACE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_BasementConcrete SlabMonolithic Slab_1e5bf3'), 
    'BASEMENT', true)

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input_Purchase Price_PurchasePrice_1'), '275000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_CentralElectricCentralOilCentralGasC_93816b'), 
    'ELECTRIC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_1152253354'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_AsbestosConcrete BlockCoquinaHardboa_c37596'), 
    'CONCRETEBLOCK', true)

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVETransferWithinAgency_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_No_NOSAVEAgentLiabilityExcl1_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_No_NOSAVEAgentLiabilityExcl2_1'))

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_Please SelectCYPRESS  PROBLEMS'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_Please SelectCYPRESS  PROBLEMS_1'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress2/Page_/select_CashCheckCredit CardEFTMoney Order'), 
    'H', true)

WebUI.setText(findTestObject('Object Repository/Cypress2/Page_/input__DepositAmount'), '1600')

WebUI.click(findTestObject('Object Repository/Cypress2/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

//if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress2/Page_/a_IFH6300032-00'),	30))			// works!
if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress2/Page_/a_IFH6300032-00'), 30)) // works!
{
    String quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress2/Page_/a_IFH6300032-00'), 'innerHTML')

    System.out.println('quoteNumber = ' + quoteNumber)
} else {
    System.out.println('in the else')
}

