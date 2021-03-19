/*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters

import org.openqa.selenium.Keys

import com.kms.katalon.core.testdata.reader.ExcelFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
*/

/*
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

*/

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper



System.out.println("dontBind = " + dontBind)
Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LA-EvergreenData.xlsx', 'LA Addresses', true)

int randomLAaddress = 2 + ((Math.random() * ((110 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomLAaddress = 105 // 105 causes address correction to pop		// this works for FL, need to find one for LA
System.out.println(randomLAaddress)

int randomLAaddressPrior = 2 + ((Math.random() * ((110 - 2) + 1)) as int)

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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://accesshometest.cogisi.com/is/root/logon/index.cfm')
//WebUI.navigateToUrl('https://accesshomestage.cogisi.com/is/root/logon/index.cfm')

// agent 18210
if(isAgent == true)
{	
	WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_AGENT CODE_userloginid'), '18210')
}
else
{
	WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}


WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/li_Start a New Quote'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/LA-Evergreen2/Page_/select_StateCodeNewQuote'), 'LOUISIANA', true)


//WebUI.selectOptionByLabel(findTestObject('LA-Evergreen2/Page_/select_DP3Dwelling Property CitizensDwelling'), 'LOUISIANA', true)

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_DP3Dwelling Property CitizensDwelling'), 'HOEG', true)


WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Property Zip Code_ApplicantZip'), zipLA)

WebUI.setText( findTestObject('Object Repository/LA-Evergreen2/Page_/input_Name_ApplicantName')  , fullName.toUpperCase())


//WebUI.delay(5)


//check value of city dropdown with what is in city
int totalCitiesAvailable = WebUI.getNumberOfTotalOption(  findTestObject('LA-Evergreen2/Page_/select_City List'))

System.out.println('totalCitiesAvailable = ' + totalCitiesAvailable)

// if totalCitiesAvailable > 1, need to iterate through list to make sure it matches cityFL
//WebUI.delay(3)
int cityCount = WebUI.getNumberOfTotalOption(findTestObject('LA-Evergreen2/Page_/select_City List'))

System.out.println('cityCount = ' + cityCount)

for (int i = 0; i < cityCount; i++) {
	WebUI.selectOptionByIndex(findTestObject('LA-Evergreen2/Page_/select_City List'), i)

	// outputs dropdown label
	String selectedOption = WebUI.getAttribute(findTestObject('LA-Evergreen2/Page_/select_City List'), 'value').toUpperCase()
		

	if (selectedOption == cityLA) {
		System.out.println((('selectedOption = ' + selectedOption) + ' and cityLA = ') + cityLA)
		break
	}
	
	System.out.println('selectedOption  = ' + selectedOption)
}






WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress1'), addressLA + Keys.chord(Keys.TAB))
//WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress1'), '7321 Juno Dr')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress2'))

//WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Address_ApplicantAddress1'), Keys.chord(Keys.TAB))
boolean elementPresent = WebUI.waitForAlert(2)

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

WebUI.click(findTestObject('LA-Evergreen2/Page_/button_Quick Quote'))




if (WebUI.waitForElementVisible(findTestObject('Object Repository/LA-Evergreen2/Page_/div_QuoteNumber'), 20)) // works!
{
	quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/LA-Evergreen2/Page_/div_QuoteNumber'), 'innerHTML')
	System.out.println('quoteNumber = ' + quoteNumber)
}
	
'Accpet FDRC modal'
try {
	// need to figure this out
	WebUI.click(  findTestObject('Object Repository/LA-Evergreen2/Page_/button_Accept')  )
}
catch (Exception e) {
	System.out.println('FDRC already accepted today')
}

if(isAgent != true)
{
	WebUI.click(findTestObject('LA-Evergreen2/Page_/button_Agent Lookup'))
	
	// wait for dynamic table to populate?
	//WebUI.delay(3)
	for(int x = 0; x < 20; x++)
	{
		try 
		{
		    WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_SearchAgentCode'), '')
			WebUI.sendKeys(findTestObject('Object Repository/LA-Evergreen2/Page_/input_SearchAgentCode'), 'LA ')
			WebUI.sendKeys(findTestObject('Object Repository/LA-Evergreen2/Page_/input_SearchAgentCode'), 'TEST')  // not sure why, but have to do it 2 steps for the result to be found
		    //WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_SearchAgentCode'), Keys.chord(Keys.TAB))
			//WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_SearchAgentCode'), Keys.chord(Keys.ENTER))
		    // wait for dynamic table to populate?
		    WebUI.delay(3)
			if(WebUI.waitForElementVisible(findTestObject('Object Repository/LA-Evergreen2/Page_/td_LA TEST AGENT'), 2))
			{
				WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/td_LA TEST AGENT'))
				break
			}
		}
		catch (def e) 
		{
		    System.out.println('didnt find it, trying again... ' + x )	    
		} 
		
	}
	
	WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Select Agent'), '18210_JHUGHES', true)
}	
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

//WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_Protection Class 1Protection Class 2'), '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_0-7 Road MilesOver 7 Road Miles'), 
    'Under8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Less than 1000 feetOver 1000 feet'), 
    'Under1000', true)

//only required if Protection class is 10
//WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEPlannedSubdivision_1'))

//WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Lot Size (sq. ft.)_LotSize_1'), '42000')

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

WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_NoneAutomatic Sprinklers (Partial)Au'), 'NONE', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_NoneLevel 1Level 2Level 3'), 'NONE', 
    true)

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEHaveWoodStoves_1'))

if(isAgent != true)
{
	WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Yes_NOSAVEBookTransferDiscount_1'))
}

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

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_AdditionalInterest'), 'INDIVIDUAL',  true)


'click Billing button - uses CSS to locate since no name or ID'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA-Evergreen2/Page_/select_Premiums Should be Billed To'), 'Applicant1',  true)

'click Bind button'
if(dontBind == true)
{
	WebUI.closeBrowser()
}

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_BindSubmit Application'))
System.out.println("before clicking select")
WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_On Renewal Bill Policy to'), 'Applicant1',  true)

System.out.println("after clicking select")
WebUI.selectOptionByValue(findTestObject('LA-Evergreen2/Page_/select_CHECKMONEY ORDERCASHCREDIT CARDEFTAG'), 'C', true)

WebUI.setText(findTestObject('Object Repository/LA-Evergreen2/Page_/input_Check or Money Order Number_CheckNumber'), '1000')

WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/input__DepositAmount'))

WebUI.doubleClick(findTestObject('Object Repository/LA-Evergreen2/Page_/input__DepositAmount'))



'click Bind button'
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/button_Bind'))


//WebUI.rightClick(findTestObject('LA-Evergreen2/Page_/a_PolicyNumber'))
WebUI.click(findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'))




if (WebUI.waitForElementPresent( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber')  , 45)) {
	WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LAEvergreenScreenShots\\' + todaysTimeStamp) + '.jpg')

	try 
	{
		policyNumber = WebUI.getAttribute( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'), 'textContent')
		System.out.println('policyNumber = ' + policyNumber)
	}catch(e) {}
	   
/*	String policyNumber = WebUI.getAttribute( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'), 'innerHTML')
	System.out.println('policyNumber = ' + policyNumber)
	
	 policyNumber = WebUI.getAttribute( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'), 'innerTEXT')
	System.out.println('policyNumber = ' + policyNumber)
	
	try {
	 policyNumber = WebUI.getAttribute( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'), 'outerHTML')
	System.out.println('policyNumber = ' + policyNumber)
	}catch(e) {}
	
	try {
	policyNumber = WebUI.getAttribute( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'), 'outerTEXT')
	System.out.println('policyNumber = ' + policyNumber)
	}catch(e) {}	
	*/
	 

	// write last name, first name to excel file
	FileInputStream file = new FileInputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LAEvergreenAutoQuotes.xlsx'))

	XSSFWorkbook workbook = new XSSFWorkbook(file)

	XSSFSheet sheet = workbook.getSheet('Sheet1')

	//String Data_fromCell = sheet.getRow(0).getCell(0).getStringCellValue()
	//System.out.println(Data_fromCell)
	// count rows currently in the file
	'Read data from excel'
	int rowCount = sheet.getLastRowNum() + 1

	System.out.println('rowCount = ' + rowCount)

	'Write data to excel'
	try {
		//  Block of code to try to write to cell
		sheet.createRow(rowCount //create new row
			)

		sheet.getRow(rowCount).createCell(0).setCellValue((randomLastName + ', ') + randomFirstName)

		sheet.getRow(rowCount).createCell(1).setCellValue(randomFirstName)

		sheet.getRow(rowCount).createCell(2).setCellValue(randomLastName)

		sheet.getRow(rowCount).createCell(3).setCellValue(quoteNumber)

		sheet.getRow(rowCount).createCell(4).setCellValue(policyNumber)

		// removes all chars from string
		//sheet.getRow(rowCount).createCell(4).setCellValue(quoteNumber.replaceAll('[^\\d.]', ''))
		sheet.getRow(rowCount).createCell(5).setCellValue(todaysDate)

		policyCreated = new Date()

		System.out.println('myDate = ' + policyCreated)

		sheet.getRow(rowCount).createCell(6).setCellValue(policyCreated)

		//sheet.getRow(rowCount).createCell(7).setCellValue(totalPremium)

		//sheet.getRow(rowCount).createCell(8).setCellValue(policyType)
	}
	catch (Exception e) {
		//  Block of code to handle errors
		//sheet.createRow(rowCount);	//create new row
		//sheet.getRow(rowCount).createCell(0).setCellValue('catchRebecca')
		System.out.println(e)
	}
	
	file.close()

	try {
		FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LAEvergreenAutoQuotes.xlsx'))

		workbook.write(outFile)

		outFile.close()
	}
	catch (Exception e) {
		System.out.println(e)

		WebUI.delay(20)

		FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LAEvergreenAutoQuotes.xlsx'))

		workbook.write(outFile)

		outFile.close()
	}
} else {
	System.out.println('in the else, FAILED to find policy number')
}

WebUI.delay(3)

WebUI.closeBrowser()


