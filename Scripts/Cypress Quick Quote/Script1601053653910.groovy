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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

// Get random address
// Read in FL address from excel file, true mean the first line consider as a header.
Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'FL Addresses', true)

// random num between 2 - 12 (first line in excel file is a header)
int randomFLaddress = 2 + ((Math.random() * ((135 - 2) + 1 // 135 = number addresses in excel file
    )) as int)

System.out.println(randomFLaddress)

// minus 1 because first line is header in excel file
String addressFL = addressData.getValue(1, randomFLaddress - 1).toLowerCase()

String cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()

String stateFL = addressData.getValue(3, randomFLaddress - 1)

String zipFL = addressData.getValue(4, randomFLaddress - 1)

System.out.println((((((addressFL + ' ') + cityFL) + ' ') + stateFL) + ' ') + zipFL)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_TEST DATA cypresstestcogisicom/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Cypress Obj Repo/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_CondoHO3 (EG)Homeowners'), 'HO3', 
    true)

//WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), '32828')
WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), zipFL)

WebUI.sendKeys(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(
        'Text String', Keys.TAB))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_ALAFAYAORLANDO'), 'ORLANDO', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_ALAFAYAORLANDO'), cityFL, true)

//WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Name_ApplicantName'), 'john john')
// First name from excel file
Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'FirstName', false)

int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)

System.out.println(randomFirstNameRow)

String randomFirstName = firstNameData.getValue(1, randomFirstNameRow)

randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

System.out.println(randomFirstName)

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'LastName', false)

int randomLastNameRow = 1 + ((Math.random() * ((919 - 1) + 1)) as int)

System.out.println(randomLastNameRow)

//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
String randomLastName = lastNameData.getValue(1, randomLastNameRow)

// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')

System.out.println(randomLastName)

String fullName = (randomFirstName + ' ') + randomLastName

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Name_ApplicantName'), fullName.toUpperCase())

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Address_ApplicantAddress1'), '1')

//WebUI.doubleClick(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Address_ApplicantAddress1'))
//WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Address_ApplicantAddress1'), '13669 CYGNUS DR')
WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Address_ApplicantAddress1'), addressFL)

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input__ApplicantAddress2'))

//WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), zipFL)
//WebUI.sendKeys(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord('Text String',Keys.TAB))
// need to handle potential popup
// put this in an if
//if(WebUI.verifyAlertPresent(10))
if (WebUI.waitForAlert(4)) {
    //Get text alert on the alert when it\'s shown'
    String alertText = WebUI.getAlertText()

    System.out.println('alertText = ' + alertText)

    //WebUI.delay(2) // page takes a sec to load sometimes?)
    WebUI.acceptAlert()
} else {
}

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input__UnifiedQuoteButton'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Agency_NOSAVEagentCode'), '10000')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/div_Effective Date      Expires one year fr_238ab4'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Effective Date_EffectiveDate'), '10/10/2020')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Expires one year from Effective Date__fea0c9'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-762-4562')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Email Address_ApplicantEmailzzzz1'), 'none@gmail.com')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '01/05/1975')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_EmployedHomemakerRetiredSelf Employe_88e90c'), 
    'EMPLOYED', true)

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Prior Insurance_NOSAVEPriorInsurance_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_FrameMasonryMasonry VeneerSuperior'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Purchase Date_PurchaseDate_1'), '01/01/2015')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_Architectural ShinglesComposition Sh_144118'), 
    'ARCHITECTURAL', true)

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Responding Fire Department_Responding_eb6df6'), 
    'Jacksonville')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_ad3f5d'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_Less than 1000 feetOver 1000 feet'), 
    'LT1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_123456788B910'), '1', true)

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEBarrierIsland_1'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), 
    '0')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Expires one year from Effective Date__fea0c9'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Agency_NOSAVEagentCode'), '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_Select optionLYNX comparative rater'), 
    '10000_EZLYNX', true)

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Previous Carrier_PriorCarrier_1'), 'Geico')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), 
    '10/10/2020')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Previous Policy _PriorPolicyNumber_1'), '1234567890')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEArsonConviction_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQRecVehicles_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEUnrepairedDamage_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEApplicationForeclosures_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEFarmOrRanch_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVENumberofAcres_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVERentedLT5Days_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEHaveWoodStoves_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_AttachedDetachedNone'), 'ATTACHED', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_No Garage DoorUnbraceBracedUnknown'), 
    'UNBRACE', true)

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Purchase Price_PurchasePrice_1'), '375000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_CentralElectricCentralOilCentralGasC_93816b'), 
    'ELECTRIC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_1152253354'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_AsbestosConcrete BlockCoquinaHardboa_c37596'), 
    'CONCRETEBLOCK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_InOut'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_ClosedOpen'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_BasementConcrete SlabMonolithic Slab_1e5bf3'), 
    'BASEMENT', true)

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/div_No'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVETransferWithinAgency_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_No_NOSAVEAgentLiabilityExcl1_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_No_NOSAVEAgentLiabilityExcl2_1'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_Please SelectSAMMY  IAM'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_Please SelectSAMMY  IAM_1'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_CashCheckCredit CardEFTMoney Order'), 
    'H', true)

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input__DepositAmount'), '2000')

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Date Paid_DepositDate'), '09/29/2020')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input__UnifiedQuoteButton_1'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Agency_NOSAVEagentCode'), '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_Select optionLYNX comparative rater'), 
    '10000_EZLYNX', true)

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/div_Effective Date      Expires one year fr_238ab4'))

WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Effective Date_EffectiveDate'), '10/10/2020')

WebUI.click(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Expires one year from Effective Date__fea0c9'))

