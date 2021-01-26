import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LA-EvergreenData.xlsx', 'LA Addresses', true)

//WebUI.acceptAlert()
// random num between 2 - 120 (first line in excel file is a header)
int randomLAaddress = 2 + ((Math.random() * ((19 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomLAaddress = 105 // 105 causes address correction to pop		// this works for FL, need to find one for LA
System.out.println(randomLAaddress)

int randomLAaddressPrior = 2 + ((Math.random() * ((19 - 2) + 1)) as int)

System.out.println(randomLAaddressPrior)

// Risk Adddress
// minus 1 because first line is header in excel file
String addressLA = addressData.getValue(1, randomLAaddress - 1).toUpperCase()

String cityLA = addressData.getValue(2, randomLAaddress - 1).toUpperCase()

String stateLA = addressData.getValue(3, randomLAaddress - 1).toUpperCase()

String zipLA = addressData.getValue(4, randomLAaddress - 1)

System.out.println((((((addressLA + ' ') + cityLA) + ' ') + stateLA) + ' ') + zipLA)

// Prior Address, only used if Year Construction < 3 from current year
String addressLAPrior = addressData.getValue(1, randomLAaddressPrior - 1).toUpperCase()

String cityLAPrior = addressData.getValue(2, randomLAaddressPrior - 1).toUpperCase()

String stateLAPrior = addressData.getValue(3, randomLAaddressPrior - 1).toUpperCase()

String zipLAPrior = addressData.getValue(4, randomLAaddressPrior - 1)

System.out.println((((((addressLAPrior + ' ') + cityLAPrior) + ' ') + stateLAPrior) + ' ') + zipLAPrior)



Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LA-EvergreenData.xlsx',
	'FirstName', false)

int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)

System.out.println(randomFirstNameRow)

String randomFirstName = firstNameData.getValue(1, randomFirstNameRow)

randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

System.out.println(randomFirstName)

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LA-EvergreenData.xlsx', 'LastName', false)

int randomLastNameRow = 1 + ((Math.random() * ((900 - 1) + 1)) as int)

System.out.println(randomLastNameRow)

//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
String randomLastName = lastNameData.getValue(1, randomLastNameRow)

// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')

System.out.println(randomLastName)

String fullName = (randomFirstName + ' ') + randomLastName

// Gets this Fridays date
LocalDate dt = LocalDate.now()

String thisFridayDate = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))

String yearThisFriday = thisFridayDate.toString().substring(0, 4 // year
	)

String dayThisFriday = thisFridayDate.toString().substring(8, 10 // day
	)

String monthThisFriday = thisFridayDate.toString().substring(5, 7 // month
	)

//System.out.println("Fridays date this week = " + thisFridayDate)
thisFridayDate = ((((monthThisFriday + '/') + dayThisFriday) + '/') + yearThisFriday)

System.out.println('Fridays date this week = ' + thisFridayDate)

// get todays date
mydate = new Date()

System.out.println('myDate = ' + mydate)

todaysDate = mydate.format('MM/dd/yyyy')

System.out.println('todaysDate = ' + todaysDate)

todaysTimeStamp = mydate.format(('MMddyyyy' + '-') + 'HHmm')

System.out.println('todaysTimeStamp = ' + todaysTimeStamp)

currentYear = Integer.parseInt(mydate.format('yyyy'))

System.out.println('currentYear = ' + currentYear)

//WebUI.delay(10)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accesshometest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_USERNAME_userloginname'), 
    'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_DP3Dwelling Property CitizensDwellin_86c77a'), 'HOEG', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Property Zip Code_ApplicantZip'), zipLA)

// need to add logic for multiple cities in the zip, get it from cypress 4

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Name_ApplicantName'), fullName.toUpperCase())

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Address_ApplicantAddress1'), addressLA + Keys.chord(Keys.TAB))
//WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Address_ApplicantAddress1'), Keys.chord(Keys.TAB))




//WebUI.delay(10)

boolean elementPresent = WebUI.waitForAlert(10)

if (elementPresent == true) {
	alertText = WebUI.getAlertText()
	System.out.println('The title of the alert is: \n' + alertText)
	WebUI.delay(1)
	WebUI.acceptAlert()
	System.out.println('Accept address validation has been accepted' )
	WebUI.switchToDefaultContent()
//	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
}
		
String geoCodeStatus = ''
// in here need to check for successful geocode div
if (WebUI.waitForElementVisible(findTestObject('Object Repository/LA Evergreen/Page_/td_GeoCodeSuccessful'), 30)) {
	geoCodeStatus = WebUI.getAttribute(findTestObject('Object Repository/LA Evergreen/Page_/td_GeoCodeSuccessful'), 'innerHTML')

	System.out.println('geoCodeStatus = ' + geoCodeStatus)

	geoCodeStatusTest = WebUI.getAttribute(findTestObject('Object Repository/LA Evergreen/Page_/td_GeoCodeSuccessful'), 'baseURI')

	System.out.println('geoCodeStatusTest = ' + geoCodeStatusTest)
} else {
	System.out.println((('need to delete row ' + randomLAaddress) + ' and address = ') + addressLA)
}


WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input'))

/*
WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_X_GMAcceptButton'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/button_Accept'))
*/


//WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Effective Date_EffectiveDate'))

System.out.println('apparently need to record the quick quote again as a new test case, then copy into LA Evergreen?')



WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Effective Date_EffectiveDate'), '04/15/2021')
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_No Agents Found_form-control btn ISiA_12e04e'))

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 'test')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/td_LA TEST AGENT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Select optionGARBER 6546846846KIMMIC_112e16'),  '18210_JHUGHES', true)

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/div_Quote Number 621689'))

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-764-4568')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Cell Phone Number_ApplicantCellPhonezzzz1'), '717-555-1212')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_E-Policy_NOSAVEEDocsOptin'))

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Email Address_ApplicantEmailzzzz1'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Applicant Date of Birth_ApplicantBirt_cb25ad'),
	'01/02/1970')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEAnySmokers_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_MarriedSingle'), 'S', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_YesNo, I would like to proceed to ge_9be79a'),
	'Y', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Social Security Number_ApplicantSSNzzzz1'), '666524658')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEPropertyNewPurchase_1'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Is there prior insurance in the past _a714c5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_No Prior LiabilityFirst Time Owner10_9a006f'),
	'FIRSTTIMEOWNER', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Protection Class 1Protection Class 2_2c389b'),
	'6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_0-7 Road MilesOver 7 Road Miles'),
	'Under8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Less than 1000 feetOver 1000 feet'),
	'Under1000', true)

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEPlannedSubdivision_1'))

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Lot Size (sq. ft.)_LotSize_1'), '32000')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Year Built_ConstructionYear_1'), '2016')

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Frame (not aluminum or plastic sidin_6d4529'),
	'V', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Conventional  TraditionalCape Cod  C_7dda68'),
	'COLONIAL', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Year of Roof_RoofConstructionYear_1'), '2016')

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Architectural ShinglesComposition Sh_bb97a0'),
	'ARCHITECTURAL', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Building Area (sq. ft.)_SquareFootage_1'), '2500')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_First-Floor Living Area (sq. ft.)_Fir_c2b5a5'),
	'1250')

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown123'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown1234567891011'), '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown123456'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown0.511.522.533.544.55'), '1.5',
	true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_UnknownCentralForced AirElectricBase_e0f8af'),
	'FORCEDAIR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_UnknownYesNo'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_CarportNo GarageGarage - AttachedGar_52043c'),
	'1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_UnknownYesNo_1'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_UnknownYesNo_1_2'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_UnknownYesNo_1_2_3'), 'N', true)

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEHurrWMProof'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_HipOtherGable wBracing (Photo required)'),
	'HIP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Level A  UnknownLevel B - 8d nails  _c8ebbe'),
	'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown  OtherHurricane Ties'), 'HURRICANETIES',
	true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_Unknown  OtherBasic Impact (Class C)_b5ce68'),
	'BASIC', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Coverage A - Dwelling_DwellingLimit_1'), '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_NoneTheft Central AlarmTheft Local Alarm'),
	'Local', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_NoneCentral Station Monitored Fire A_cabea0'),
	'Local', true)

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEWoodStoveSurcharge_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_NoneLevel 1Level 2Level 3'), '1',
	true)

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEBookTransferDiscount_1'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Companion Policy Discount_NOSAVECompa_bd95cd'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Auto Policy_NOSAVEAutoPolicy_1'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Auto Policy_NOSAVEAutoPolicy_1'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVECompanionPolicyDiscount_1'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_Yes_NOSAVEAHICMultiPolicyDiscount_1'))

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Number of Paid Losses in the past 3 y_5ba1b6'),
	'0')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/button_Rating Results '))

WebUI.closeBrowser()


