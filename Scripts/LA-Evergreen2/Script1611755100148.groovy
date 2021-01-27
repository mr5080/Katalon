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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://accesshometest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_DP3Dwelling Property CitizensDwelling'), 'HOEG', true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Property Zip Code_ApplicantZip'), '70714')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Name_ApplicantName'), 'john smith')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress1'), '7309 Juno Dr')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress2'))

//WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress1'), Keys.chord(Keys.TAB))
boolean elementPresent = WebUI.waitForAlert(10)

if (elementPresent == true) {
    alertText = WebUI.getAlertText()

    System.out.println('The title of the alert is: \n' + alertText)

    WebUI.delay(1)

    WebUI.acceptAlert()

    System.out.println('Accept address validation has been accepted')

    WebUI.switchToDefaultContent( //	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
        )
}

String geoCodeStatus = ''

// in here need to check for successful geocode div
if (WebUI.waitForElementVisible(findTestObject('LA-Evergreen2/Page_/td_Geocode successful'), 30)) {
    geoCodeStatus = WebUI.getAttribute(findTestObject('Object Repository/LA Evergreen/Page_/td_GeoCodeSuccessful'), 'innerHTML')

    System.out.println('geoCodeStatus = ' + geoCodeStatus)

    geoCodeStatusTest = WebUI.getAttribute(findTestObject('Object Repository/LA Evergreen/Page_/td_GeoCodeSuccessful'), 
        'baseURI')

    System.out.println('geoCodeStatusTest = ' + geoCodeStatusTest)
} else {
    System.out.println((('need to delete row ' + randomLAaddress) + ' and address = ') + addressLA)
}

//WebUI.rightClick(findTestObject('LA-Evergreen2/Page_/td_Geocode successful'))
WebUI.click(findTestObject('LA-Evergreen2/Page_/td_Geocode successful'))

WebUI.click(findTestObject('LA-Evergreen2/Page_/input_Quick Quote'))


WebUI.click(findTestObject('LA-Evergreen2/Page_/button_Agent Lookup'))

WebUI.clearText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 'hughes')

// wait for dynamic table to populate?
WebUI.delay(3)

try {
    WebUI.clearText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 
        'test')

    WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 
        Keys.chord(Keys.TAB))

    // wait for dynamic table to populate?
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/td_LA TEST AGENT'))
}
catch (def e) {
    System.out.println('didnt find it, trying again...')

    WebUI.clearText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 
        'test')

    WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 
        Keys.chord(Keys.TAB))

    // wait for dynamic table to populate?
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/td_LA TEST AGENT'))
} 

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Select Agent'), '18210_JHUGHES', true)

//WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/div_Effective Date'))

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Effective Date_EffectiveDate'), '04/15/2021')


WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-762-4564')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Cell Phone Number_ApplicantCellPhonezzzz1'), '484-942-5555')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_E-Policy_NOSAVEEDocsOptin'))

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Email Address_ApplicantEmailzzzz1'), 'asdf@gmail.com')

WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_Applicant Date of Birth_ApplicantBirth'), '07/27/1984')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEAnySmokers_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_MarriedSingle'), 'S', true)

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEAnyChildren'))

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_YesNo, I would like to proceed to ge'), 'Y', true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Social Security Number_ApplicantSSNzzzz1'), '666567894')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEPropertyNewPurchase_1'))

WebUI.click(findTestObject('LA-Evergreen2/Page_/input_Is there prior insurance in the past'))

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_No Prior LiabilityFirst Time Owner'), 'FIRSTTIMEOWNER', 
    true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Protection Class 1Protection Class 2'), '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_0-7 Road MilesOver 7 Road Miles'), 
    'Under8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Less than 1000 feetOver 1000 feet'), 
    'Under1000', true)

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEPlannedSubdivision_1'))

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Lot Size (sq. ft.)_LotSize_1'), '42000')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Year Built_ConstructionYear_1'), '2016')

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Frame (not aluminum or plastic sidin'), 'V', true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Conventional TraditionalCape Cod C'), 'COLONIAL', true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Year of Roof_RoofConstructionYear_1'), '2016')

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Architectural ShinglesComposition Sh'), 'ARCHITECTURAL', 
    true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Building Area (sq. ft.)_SquareFootage_1'), '2500')

WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_First-Floor Living Area (sq. ft.)'), '1250')

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Unknown123'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Unknown12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Unknown1234567891011'), '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Unknown123456'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Unknown0.511.522.533.544.55'), '1.5', 
    true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_UnknownCentralForced AirElectricBase'), 'HEATPUMP', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_UnknownYesNo'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_CarportNo GarageGarage - AttachedGar'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_UnknownYesNo_1'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_UnknownYesNo_1_2'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_UnknownYesNo_1_2_3'), 'N', true)

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEHurrWMProof'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_HipOtherGable wBracing (Photo required)'), 
    'HIP', true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Level A UnknownLevel B - 8d nails'), 'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Unknown  OtherHurricane Ties'), 'HURRICANETIES', 
    true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Unknown OtherBasic Impact (Class C)'), 'BASIC', true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Coverage A - Dwelling_DwellingLimit_1'), '250000')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/div_Coverage A - Dwelling'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_NoneTheft Central AlarmTheft Local Alarm'), 
    'Central', true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_NoneCentral Station Monitored Fire'), 'Local', true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_NoneAutomatic Sprinklers (Partial)Au'), 'PARTIAL', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_NoneLevel 1Level 2Level 3'), '1', 
    true)

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEHaveWoodStoves_1'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEBookTransferDiscount_1'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVECompanionPolicyDiscount_1'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEAHICMultiPolicyDiscount_1'))

WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_Number of Paid Losses in the past 3y'), '0')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Rating Results'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Proceed to Application'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEEligible'))

'Eligibility page'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_General'))

'Click Applicant button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Applicant'))


WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_MaleFemale'), 'M', true)


WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_AdminOfficeBusinessFinancialConstruc'), 'Service', 
    true)


WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_-- Please Select --Not EmployedRetire'), 'ONE', true)

'Click Co Applicant button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Co-Applicant'))

'Click Property button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Property'))

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Prior Carrier_PriorCarrier_1'), 'geico')

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Prior Policy Number_PriorPolicyNumber_1'), '123456789')


WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Protection Class 1Protection Class 2_2c389b_1'), 
    '6', true)


WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_Year Heating System Installed'), '2016')


WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Closed Foundation up to 6Open Founda_1'), 'CLOSEDF', 
    true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Cast IronCopperGalvanizedPEXPolybuty'), 'COPPER', true)



WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_Enter year of last plumbing update'), '2016')

WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_Enter year water heater was installed'), '2016')


WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_CopperAluminumClothKnob and TubeOther'), 
    'COPPER', true)

WebUI.setText(findTestObject('LA-Evergreen2/Page_/input_Enter year of last electrical update'), '2016')

'click Wind Mitigation button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Wind Mitigation'))

'click Coverages button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Coverages'))

'click Losses button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Losses'))

'click Optional Coverages button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Optional Coverages'))

'click Discounts & Surcharges button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Discounts  Surcharges'))

'click Additional Interest button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Additional Interests'))

'click Billing button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Please SelectJOHN  SMITH'), 'Applicant1', 
    true)

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_BindSubmit Application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Please SelectJOHN  SMITH_1'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_CHECKMONEY ORDERCASHCREDIT CARDEFTAG'), 'C', true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Check or Money Order Number_CheckNumber'), '1000')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input__DepositAmount'))

WebUI.doubleClick(findTestObject('Object Repository/LA-Evergreen2/Page_/input__DepositAmount'))

'click Bind button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Bind'))

//WebUI.rightClick(findTestObject('LA-Evergreen2/Page_/a_PolicyNumber'))
WebUI.click(findTestObject('LA-Evergreen2/Page_/td_ PolicyNumber'))

