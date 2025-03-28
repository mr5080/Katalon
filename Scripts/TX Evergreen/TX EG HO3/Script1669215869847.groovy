import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import java.time.format.DateTimeFormatter
import java.time.LocalDate

import java.lang.Integer as Integer
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration




//  pass vars to another test case
def nameAddressData = WebUI.callTestCase(findTestCase('TX Evergreen/nameAddressSetup'),	[('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)


String randomFirstName = nameAddressData['randomFirstName']
String randomLastName = nameAddressData['randomLastName']


String addressTX = nameAddressData['addressTX']
String cityTX = nameAddressData['cityTX']
String stateTX = nameAddressData['stateTX']
String zipTX = nameAddressData['zipTX']

String fullName = (randomFirstName + ' ') + randomLastName

// get todays date - after katalon update 9.23.24
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
LocalDate todaysDate = LocalDate.now();
def myDate = todaysDate.format(formatter)
def yesterdayDate = todaysDate.minusDays(1).format(formatter)
def  tomorrowDate = todaysDate.plusDays(1).format(formatter)

System.out.println('myDate = ' + myDate)
System.out.println('yesterdayDate = ' + yesterdayDate)
System.out.println('tomorrowDate = ' + tomorrowDate)


/*
// get todays date
mydate = new Date()
System.out.println('myDate = ' + mydate)
todaysDate = mydate.format('MM/dd/yyyy')
*/

if(effectiveDate == '')
{
	effectiveDate = myDate
	System.out.println('effectiveDate = ' + effectiveDate)
}
System.out.println('myDate = ' + myDate)


todaysTimeStamp = myDate //.format(('MMddyyyy' + '-') + 'HHmm')
System.out.println('todaysTimeStamp = ' + todaysTimeStamp)

//currentYear = Integer.parseInt(mydate.format('yyyy'))
currentYear = todaysDate.getYear()
System.out.println('currentYear = ' + currentYear)



//WebUI.openBrowser('')
RunConfiguration.setWebDriverPreferencesProperty('args', ['--incognito', '--start-maximized', '--disable-infobars', 'enable-automation'])		// takes place instead of Project - Settings - Desired Capabilityes - Web
WebUI.openBrowser('')

try {
	
//WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
if (environment == 'TEST') {
	WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
	WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')
}


if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '10100')
} else {
	WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '0')
}

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.clearText(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'))
WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'), Keys.chord(effectiveDate, Keys.TAB))


WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_FLORIDATEXAS'), '42', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_First Name_ApplicantFirst'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Middle Name_ApplicantMiddle'), 'a')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Last Name_ApplicantLast'), randomLastName)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Suffix_ApplicantSuffix'), 'jr')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1'), addressTX)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress2'), '')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_City_ApplicantCity'), cityTX)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Property Zip Code_ApplicantZip'), zipTX)

WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(Keys.TAB))


boolean elementPresent = WebUI.waitForAlert(3)
if (elementPresent == true) {
	alertText = WebUI.getAlertText()
	 System.out.println('The title of the alert is: \n' + alertText)
	WebUI.delay(1)
	WebUI.acceptAlert()
	System.out.println('Accept address validation has been accepted')
	//WebUI.switchToDefaultContent()
//	WebUI.switchToFrame(findTestObject('Object Repository/TX EG HO3/Page_/input_Property Zip Code_ApplicantZip'), 0)
//	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
}

WebUI.delay(2)

// this works for FL EG Geocode button 3.8.25!!! UPDATE TX EG AND OTHER MANUALS
if(WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'), 10))
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'))
	System.out.println('clicked GEOCODE button')
}
// end of this works for Geocode button 3.8.25!!!



/*
try {
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'))
	//WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_X_GMAcceptButton'))
	System.out.println('clicked GEOCODE button')
	WebUI.delay(6)
}
catch (Exception e) {
	System.out.println('Exception - ' + e)
}*/



// try catch this? look at other code?, added code above 2.14.25, maybe that works???
//WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'), 5)
//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'))

/*
if(WebUI.waitForElementClickable(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'), 5))
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'))
	System.out.println('clicked GEOCODE button')
}
else
{
	System.out.println('NO GEOCODE button')
}
*/
/*
// uncommented try catch 8.5.24
try {
//	WebUI.waitForElementClickable(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'), 5)
	//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_X_GMAcceptButton'))
	WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_X_GMAcceptButton'))
	System.out.println('clicked GEOCODE button')
	WebUI.delay(6)
}
catch (Exception e) {
	System.out.println('Exception - ' + e)
}
*/

WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/td_geocodeSuccessful'), 40)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input'))

quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Quote Number'), 'innerHTML')
System.out.println('quoteNumber = ' + quoteNumber )

'Agent Producer'
if (isAgent == false) {
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))

	// wait for dynamic table to populate?
	WebUI.delay(1)

	
	/// update this to key down and then key up, can do the same thing for date pickers!
	for (int x = 0; x < 5; x++)
	{
		try {
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '')
		//	if(environment == "TEST")
		//	{
				//WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'CORNERSTONE TEST AGENCY')
				//WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
				WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord('10100',  Keys.UP, Keys.TAB))
		//	}
		//	else if(environment == "STAGE")
		//	{
			//	WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
		//	}

			// add key down/up here
			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord(Keys.ENTER))  // was .TAB, trying soemthing new 11.17.22
//			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
			
		//	WebUI.delay(1)

			if (WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/td_SearchForAgent'), 2))
			{
				WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/td_SearchForAgent'))
				break
			}
		}
		catch (def e) {
			System.out.println('didnt find it, trying again... ' + x)
		}
	}
}
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Purchase Date_PurchaseDate_1'), '02/02/2022')



WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-555-5555')

//WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')
int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)
WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes+'+randomEmail+'@cornerops.com')

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant First Name_ApplicantFirstzzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant Middle Name_ApplicantMiddlezzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant Last Name_ApplicantLastzzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant Suffix_ApplicantSuffixzzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '08/01/1987')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_DivorcedMarriedSingleSeparated'), 'X', true)

// prior mailing address stuff
// generates random number, either 0 or 1, used to randomize US/international
randomNumber = ((Math.random() * 2) as int)
//int randomNumber = 0

if (randomNumber == 0) // fill out US prior mailing address
{
	
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '850 QUEEN ST')

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_City_ApplicantCity - Prior Mailing Address'), 'HARRISBURG')

	WebUI.selectOptionByLabel(findTestObject('Object Repository/TX EG HO3/Page_/select_State - Prior Mailing Address'), 'PA', false)

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Zip - Prior Mailing Address'), '17113')
	
// Prior Address credit data pulled	
/*	
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '1716 Cherry Ln')
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_City_ApplicantCity - Prior Mailing Address'), 'LAKELAND')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/TX EG HO3/Page_/select_State - Prior Mailing Address'), 'FL', false)
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Zip - Prior Mailing Address'), '33811')
*/
/*	
	//hard coding prior address as Transunion credit report
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '817 Pipers Cay Dr')
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_City_ApplicantCity - Prior Mailing Address'), 'West Palm Beach')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/TX EG HO3/Page_/select_State - Prior Mailing Address'), 'FL', false)
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Zip - Prior Mailing Address'), '33425')
*/	
	
	
			
}
else
{
	WebUI.selectOptionByIndex(findTestObject('Object Repository/TX EG HO3/Page_/Select_AddressType'), 1)

	String selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/Select_AddressType'), 'value')

	System.out.println('selectedAddressType = ' + selectedAddressType)

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '9587 saint international st')

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_CityProvinceZip - International'), 'Deiging, Beiengly, 10010001')

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Country - International'), 'China')
}

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectNoYes'), 'Y', true)  // make Y


WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_PrimarySecondarySeasonal'), 'PRIMARY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Architectural ShinglesAsbestos3-tab _9deaa1'), 'ARCHITECTURAL', true)


WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'))
WebUI.clearText(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'))

/* This modal was removed with COG06785	
if(WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'), 2))
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'))
}
*/

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'), '2021')
if(WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'), 2))
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'))
}



WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherVeneer BrickMasonryAlumi_f7e94c'), 'VENEER', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Slab - Closed FoundationCrawl Space _2f2f45'), 'PARTIAL', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEScreenedEnclosure_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_ConstructionType'), 'V', true)
WebUI.selectOptionByIndex(findTestObject('Object Repository/TX EG HO3/Page_/select_ConstructionType'), 4)



String squareFoot = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/input_Square feet_SquareFootage_1'), 'value')
System.out.println("squareFoot = " + squareFoot)		// outputs default squareFoot value
if(squareFoot.length() < 3)
{
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Square feet_SquareFootage_1'), '1243')
	System.out.println("set squareFoot = 1333")
}


WebUI.doubleClick(findTestObject('Object Repository/TX EG HO3/Page_/input_Year of Roof_RoofConstructionYear_1'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Year of Roof_RoofConstructionYear_1'), '2022')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Responding Fire Department_Responding_eb6df6'), 'clearwater fd')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_7c5769'), '02', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Protection Class 1Protection Class 2_2c389b'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEWindMitigationProof_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherFlatHipGable'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherClipsHurricane Ties'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownNo ProtectionWood ShuttersBas_8ed146'), 'SHUTTERS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_AOP'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_WindstormHail'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Hurricane'), '5', true)



//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input__DwellingLimit_1'))
WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input__DwellingLimit_1'), '401500')

// check this div for 0.00, if it contains 0.00 then populate dwellingLimit_1 with something


//System.out.println('before the IF  --- replacementCost360 = ' + WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost'), 'innerHTML'))

String replacementCost360 = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost'), 'innerHTML')
if(replacementCost360.contains("\$0.00"))
{
	System.out.println("replacement cost is 0.00, need to manually set value")
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input__DwellingLimit_1'), '401500')
	//replacementCost360 = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost'), 'innerHTML' )
}
else {
	System.out.println("in the else")
	//replacementCost360 = WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)
}

//findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost')



WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_2530354045505560657075'), '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_1,0002,0003,0004,0005,000'), '5000', true)



// opens 360 value modal
WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Recalculate' ))
	   
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Calculate'))

WebUI.delay(2)

WebUI.switchToWindowTitle('360Value')

WebUI.click(findTestObject('Object Repository/FL DP/Page_360Value/span_General Shape Style'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_360Value/span_Exterior'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_360Value/span_Interior'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_360Value/span_Cabinets'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_360Value/span_Continue'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_360Value/span_Calculate Now'))

WebUI.closeWindowTitle('360Value')

//WebUI.delay(2)
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Get Results'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/a_Close'))

WebUI.waitForElementVisible(findTestObject('Object Repository/FL DP/Page_/div_Suggested Replacement Cost'), 5)
// end 360 code



WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEBuildersRisk_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVECompanionPolicyDiscount_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_NoneLocalCentralFire Station'), 'CENTRAL', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEMultiPolicyDiscount_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEPaidInFull_1'))



//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_NoneEvergreen Edge CoverageEvergreen_d28c8c'), 'NONE', true) //EDGE NONE EDGEPLUS
// 0 = None, 1 = Edge, 2 = EdgePlus
// generates random number, either 0 or 1 or 2,
randomBundle = (((Math.random() * 2) as int) + 1)
//randomBundle = 2
System.out.println('randomBundle = ' + randomBundle)

WebUI.selectOptionByIndex(findTestObject('Object Repository/TX EG HO3/Page_/select_Bundle'), randomBundle)



WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

//force stop
//System.exit(0)  // keeps window open

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Rate and Continue'))


//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Phone Number_ApplicantHomePhonezzzz1'),  Keys.chord('7177625555',  Keys.TAB,, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
//WebUI.scrollToElement(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'), 5)
//WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\TXzip\\TXzip-' + zipTX) + '.jpg')	// take first screenshot

if(stopQQ)
{
	
	//return	// closes window
	System.exit(0)  // keeps window open
}
	


WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Proceed to Application'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Purchase Date_PurchaseDate_1'))
//WebUI.delay(6)



//'new paperless buttons'
//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_PaperlessDelivery'))

'new paperless buttons'
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_PaperlessDelivery'))
if(paperless == false)
{
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVE_Paperless'))
}



WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Phone Number_ApplicantHomePhonezzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Email Address_ApplicantEmailzzzz1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectNoYes'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectNoYes'), 'Y', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Previous Carrier_PriorCarrier_1'), 'travelers')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), effectiveDate)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Previous Policy_PriorPolicyNumber_1'), '123456123456')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Bundle - BobTransfer'), 'N', true)



'Click Prequalification button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVE_1'))

'Click Coverage button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Coverage'))


// add override tier button, select random from dropdown

if(overrideTier && !isAgent)	// only internal can override tier score
{	
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOOverrideTier'))  // click yes
	//WebUI.delay(1)
	
	
	
	// Locate the dropdown TestObject
	TestObject dropdown = findTestObject('Object Repository/TX EG HO3/Page_/select_CreditTierOverride')
	
	// Get the total number of options in the dropdown
	int totalOptions = WebUI.getNumberOfTotalOption(dropdown)
	
	// Generate a random index (between 1 and totalOptions)
	Random rand = new Random()
	int randomIndex = rand.nextInt(totalOptions) + 1  // Index starts from 1 in Katalon
	//randomIndex = 10  // always use the same override option...
	
	
	// Select a random option using the generated index
	WebUI.selectOptionByIndex(dropdown, randomIndex)  // use this for random values
	//WebUI.selectOptionByIndex(dropdown, totalOptions-1)	// use this to set manual selection
	
	
//println "Random option selected: " + WebUI.getText(dropdown)
	
//	WebUI.delay(10)
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/TX EG HO3/Page_/select_CreditTierOverride'), 5)
}




'Click General button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_CopperGalvanizedPVCPolybutylenePEX'), 'PEX', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Protection Class 1Protection Class 2_2c389b'), '2', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEWindMitigationProof_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherFlatHipGable'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherClipsHurricane Ties'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownNo ProtectionWood ShuttersBas_8ed146'), 'SHUTTERS', true)

/*
if (isAgent == false)
{
	String protectionClass = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/select_ProtectionClass'), 'value') // gets dropdown value
	System.out.println("protectionClass = " + protectionClass)		// outputs dropdown value
	System.out.println("protectionClass.length() = " + protectionClass.length())		// outputs dropdown value
	
	if(protectionClass.length() > 0)
	{
		if(Integer.valueOf(protectionClass) == 10)
		{
			//click yes to subdivision
			WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSubdivision'))
			//add subdivision name
			WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_SubdivisonName'), "Terra Cotta Woods")
		}
	}
}
*/

'Click History button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_History'))

'Click Interests button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Interests'))

'Click Statements button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Statements'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEUnrepairedDamage_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEUnsettledClaim_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQCurrentLawSuit_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEGQClaimAssist_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Full PaySemi Annual (55 down)Quarter_8dd4b0'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectSCARY A TERRY JR'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectSCARY A TERRY JR_1'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_BindSubmit Application'))

//new paperless radio button
if(paperless)
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_PaperlessDeliveryAcknowledge'))
}

//select payment method logic
WebUI.callTestCase(findTestCase('TX Evergreen/selectPaymentType'),
	[('howPayDeposit') : howPayDeposit,
		('fullName') : fullName,
		('randomLastName') : randomLastName
		 ], FailureHandling.STOP_ON_FAILURE)

String policyNumber = ''
if (shouldBind == true)
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Bind Application'))

	policyNumber = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/PolicyID'), 'innerHTML')

	System.out.println('policyNumber = ' + policyNumber) //WebUI.closeBrowser()
}
else
{
	WebUI.comment('shouldBind = ' + shouldBind)
	policyNumber = 'not bound with code'
	// forces last name to be saved for Recurring payments
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_GoBackOnePage'))
	//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_GoForwardOnePage'))
	
	/*
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Display Quote_1'))
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_BindSubmit Application'))
	*/
	
}
	
// pass vars to write for TX  11.18.22
WebUI.callTestCase(findTestCase('TX Evergreen/writeFile'),
	[
//	('policyType') : policyType,
	('randomLastName') : randomLastName,
	('randomFirstName') : randomFirstName,
	('quoteNumber') : quoteNumber,
	('policyNumber') : policyNumber,
	('todaysDate') : todaysDate,
	('myDate') : myDate,
//	('totalPremium') : totalPremium,
	('policyType') : 'HO3',
	('shouldBind') : shouldBind,
	('stateTX') : stateTX,
	('isAgent') : isAgent,
	('environment') : environment
//	,('todaysTimeStamp') : todaysTimeStamp
		], FailureHandling.STOP_ON_FAILURE)


//WebUI.waitForElementPresent(findTestObject('Object Repository/TX EG HO3/Page_/button_Send to Company'), 10)

WebUI.closeBrowser()
System.out.println('quoteNumber = ' + quoteNumber )

}
catch(e)
{
	quoteNumber = quoteNumber.replace(':', '')
	System.out.println('quoteNumber failed to fully create = ' + quoteNumber)
	System.out.println('todaysTimeStamp = ' + todaysTimeStamp)
		
	WebUI.takeScreenshot(('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '-' + quoteNumber) + 'TX EG HO3 Failure.jpg')
	
	/*
	WebUI.callTestCase(findTestCase('FL DP/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
		, ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment, ('optionalCoverages') : optionalCoverages, ('numInterests') : numInterests, ('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)
	*/
}