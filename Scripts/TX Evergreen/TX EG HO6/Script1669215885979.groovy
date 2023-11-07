import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
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

//  pass vars to another test case
def nameAddressData = WebUI.callTestCase(findTestCase('TX Evergreen/nameAddressSetup'),	[('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)


String randomFirstName = nameAddressData['randomFirstName']
String randomLastName = nameAddressData['randomLastName']


String addressTX = nameAddressData['addressTX']
String cityTX = nameAddressData['cityTX']
String stateTX = nameAddressData['stateTX']
String zipTX = nameAddressData['zipTX']

String fullName = (randomFirstName + ' ') + randomLastName

// get todays date
mydate = new Date()
System.out.println('myDate = ' + mydate)
todaysDate = mydate.format('MM/dd/yyyy')

WebUI.openBrowser('')

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

//WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/TX EG HO6/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/li_Start a New Quote'))

//WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Effective Date_EffectiveDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_FLORIDATEXAS'), '42', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_HomeownersCondo'), 'HO6', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Effective Date_EffectiveDate'), Keys.chord(effectiveDate, Keys.TAB))

//WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/a_8'))

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_First Name_ApplicantFirst'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Middle Name_ApplicantMiddle'), 'p')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Last Name_ApplicantLast'), randomLastName)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Suffix_ApplicantSuffix'), 'sr')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Address_ApplicantAddress1'), addressTX)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Address_ApplicantAddress2'), '')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_City_ApplicantCity'), cityTX)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Property Zip Code_ApplicantZip'), zipTX)

WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(Keys.TAB))
WebUI.delay(5)

try {
	WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_X_GMAcceptButton'))
	System.out.println('clicked GEOCODE button')
	WebUI.delay(6)
}
catch (Exception e) {
	System.out.println('Exception - ' + e)
}

WebUI.verifyElementVisible(findTestObject('Object Repository/TX EG HO6/Page_/td_NOTE The address above has beensuccessfu_ffdc37'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TX EG HO6/Page_/div_Quote Number'), 10)

quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO6/Page_/div_Quote Number'), 'innerHTML')
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
				WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
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

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Purchase Date_PurchaseDate_1'), '02/02/2019')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-555-2255')



//WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john@cog.com')
int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)
WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes+'+randomEmail+'@cornerops.com')


WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'),  Keys.chord('09/01/2000', Keys.TAB))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_DivorcedMarriedSingleSeparated'), 'M', true)


// prior mailing address stuff
// generates random number, either 0 or 1, used to randomize US/international
randomNumber = ((Math.random() * 2) as int)
int randomNumber = 1

System.out.println('need to fill in prior mailing address stuff')

if (randomNumber == 0) // fill out US prior mailing address
{
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '850 Queen ST')

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_City_ApplicantCity - Prior Mailing Address'), 'Harrisburg')

	WebUI.selectOptionByLabel(findTestObject('Object Repository/TX EG HO3/Page_/select_State - Prior Mailing Address'), 'PA', false)

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Zip - Prior Mailing Address'), '17113')
}
else
{
	WebUI.selectOptionByIndex(findTestObject('Object Repository/TX EG HO3/Page_/Select_AddressType'), 1)

	String selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 'value')

	System.out.println('selectedAddressType = ' + selectedAddressType)

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '9584 saint international st')

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_CityProvinceZip - International'), 'Deiging, Beiengly, 10010001')

	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Country - International'), 'Germany')
}


WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Please SelectNoYes'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_FrameMasonryMasonry VeneerSuperior'), 'S', true)

//WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Construction Year_ConstructionYear_1'), '2015')
//WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Construction Year_ConstructionYear_1'), YOC)		// this is year to use with YOC variable
//WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Occupancy'), 'OWNER', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Usage'), 'PRIMARY', true)

//WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Square feet_SquareFootage_1'), '1988')


String squareFoot = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO6/Page_/input_Square feet_SquareFootage_1'), 'value')
System.out.println("squareFoot = " + squareFoot)		// outputs default squareFoot value
if(squareFoot.length() < 3)
{
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Square feet_SquareFootage_1'), '1666')
	System.out.println("set squareFoot = 1666")
}



WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Architectural ShinglesAsbestos3-tab _9deaa1'), 'ARCHITECTURAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_1 (Ground Floor)23456789101112131415_89fb3d'), '1', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Responding Fire Department_Responding_eb6df6'), 'houston')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Protection Class 1Protection Class 2_2c389b'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_7c5769'), '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_1,0002,5005,000125'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_1,0002,5005,000125_1'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_1,0002,5005,000125_1_2'), '5', true)

//WebUI.doubleClick(findTestObject('Object Repository/TX EG HO6/Page_/input__DwellingLimit_1'))
WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input__DwellingLimit_1'), '250000')


WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/div_Dwelling - Cov A  Personal Property - C_d7aaea'))

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Personal Property - Cov C_ContentsLimit_1'), '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_20 of Cov C30 of Cov C40 of Cov C'), '30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_100,000200,000300,000400,000500,000'), '300000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_1,0002,0003,0004,0005,000'), '3000', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_NoneEvergreen Edge Condo'), 'CONDO', true)
// 0 = None, 1 = Edge, 2 = EdgePlus
// generates random number, either 0 or 1 
randomBundle = (((Math.random() * 2) as int) + 0)

System.out.println('randomBundle = ' + randomBundle)

WebUI.selectOptionByIndex(findTestObject('Object Repository/TX EG HO6/Page_/select_NoneEvergreen Edge Condo'), randomBundle)


WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Rate and Continue'))


//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Phone Number_ApplicantHomePhonezzzz1'),  Keys.chord('7177625555',  Keys.TAB,, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
/*
if(Integer.parseInt(YOC) == 1982)
{
	WebUI.scrollToElement(findTestObject('Object Repository/TX EG HO6/Page_/input_Effective Date_EffectiveDate'), 5)
}

WebUI.takeScreenshot(('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\TXzip\\HO6 screenshots\\TXzip-' + zipTX + 'YOC-' + YOC) + '.jpg')	// take first screenshot
*/
if(stopQQ)
{
	WebUI.delay(10)
	return
	//System.exit(0)
}
	






/*
WebUI.switchToWindowTitle('')

'Click Print Quote button'
WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/a_Print Quote'))

WebUI.switchToWindowTitle('')
*/

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Proceed to Application'))

'new paperless buttons'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_PaperlessDelivery'))

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Previous Carrier_PriorCarrier_1'), 'travelers')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), effectiveDate)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Previous Policy_PriorPolicyNumber_1'), '1234560')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_BOB'), 'N', true)




WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Coverage'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_CopperGalvanizedPVCPolybutylenePEX'), 'COPPER', true)

//WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Is this a protected subdivision_NOSAV_0a5ef2'))

//WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Subdivision_Subdivision_1'), 'johns acres')


if(isAgent == false)
{	
	String protectionClass = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO6/Page_/select_ProtectionClass'), 'value') // gets dropdown value
	System.out.println("protectionClass = " + protectionClass)		// outputs dropdown value
	
	if(protectionClass.length() > 0)
	{
		if(Integer.valueOf(protectionClass) == 10)
		{
			//click yes to subdivision
			WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSubdivision'))
			//add subdivision name
			WebUI.sendKeys(findTestObject('Object Repository/TX EG HO6/Page_/input_SubdivisonName'), "Terra Cotta Woods")
		}
	}
}


WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_History'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Interests'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Statements'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEUnrepairedDamage_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEUnsettledClaim_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQCurrentLawSuit_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/input_Yes_NOSAVEGQClaimAssist_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Full PaySemi Annual (55 down)Quarter_8dd4b0'), '9PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Please SelectJOHN P SMITH SR'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Please SelectJOHN P SMITH SR_1'), 'Applicant1', true)

//return;

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_BindSubmit Application'))


WebUI.callTestCase(findTestCase('TX Evergreen/selectPaymentType'),
	[('howPayDeposit') : howPayDeposit,
		('fullName') : fullName,
		('randomLastName') : randomLastName
		 ], FailureHandling.STOP_ON_FAILURE)
/*
WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'PR', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Enter Credit Card Information'))

WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)


WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Credit Card Number_NOSAVEACCT'), '4111 1111 1111 1111')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Card Expiration Date_NOSAVEEXPDATE'), '11/25')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Card Security Code_CVV2'), '111')

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Authorize Credit Card'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Authorized User Agreement_RecurPayAuthorize'), randomLastName)
*/

//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Display Quote_1'))
//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_BindSubmit Application'))

if (shouldBind == true)
{
	WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Bind Application'))

	String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO6/Page_/PolicyID'), 'innerHTML')

	System.out.println('policyNumber = ' + policyNumber) //WebUI.closeBrowser()
}
else
{
	WebUI.comment('shouldBind = ' + shouldBind)
	// forces last name to be saved for RCC
	WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_GoBackOnePage'))
	WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_GoForwardOnePage'))
	
}
	
// pass vars to write for TX  11.18.22
WebUI.callTestCase(findTestCase('TX Evergreen/writeFile'),
	[
//	('policyType') : policyType,
	('randomLastName') : randomLastName,
	('randomFirstName') : randomFirstName,
	('quoteNumber') : quoteNumber,
	('todaysDate') : todaysDate,
//	('totalPremium') : totalPremium,
	('policyType') : 'HO6',
//	('shouldBind') : shouldBind,
	('stateTX') : stateTX,
	('isAgent') : isAgent,
	('environment') : environment
//	,('todaysTimeStamp') : todaysTimeStamp
		], FailureHandling.STOP_ON_FAILURE)


//WebUI.waitForElementPresent(findTestObject('Object Repository/TX EG HO3/Page_/button_Send to Company'), 10)

WebUI.closeBrowser()

System.out.println('quoteNumber = ' + quoteNumber )

/*
WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'MC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'PR', true)

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Enter Credit Card Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO6/Page_/select_American ExpressDiscoverMasterCardVisa'), 'V', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Credit Card Number_NOSAVEACCT'), '4111 1111 1111 1111 ')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Card Expiration Date_NOSAVEEXPDATE'), '11/25')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Card Security Code_CVV2'), '111')

WebUI.setText(findTestObject('Object Repository/TX EG HO6/Page_/input_Authorized User Agreement_RecurPayAuthorize'), 'smith')

WebUI.click(findTestObject('Object Repository/TX EG HO6/Page_/button_Bind Application'))

WebUI.closeBrowser()
*/
