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

//WebUI.setText(findTestObject('null'), 'JHUGHES')
WebUI.setEncryptedText(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

//WebUI.setEncryptedText(findTestObject('null'), 'iJIOp32ulZH/iAm5HHInmA==')

//WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))


WebUI.clearText(findTestObject('null'))
WebUI.sendKeys(findTestObject('null'), Keys.chord(effectiveDate, Keys.TAB))


WebUI.selectOptionByValue(findTestObject('null'), '42', true)

WebUI.setText(findTestObject('null'), randomFirstName)

WebUI.setText(findTestObject('null'), 'a')

WebUI.setText(findTestObject('null'), randomLastName)

WebUI.setText(findTestObject('null'), 'jr')

WebUI.setText(findTestObject('null'), addressTX)

WebUI.setText(findTestObject('null'), '')

WebUI.setText(findTestObject('null'), cityTX)

WebUI.setText(findTestObject('null'), zipTX)

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.TAB))


//WebUI.waitForElementVisible(findTestObject('null'), 5)
//WebUI.click(findTestObject('null'))

/*
if(WebUI.waitForElementClickable(findTestObject('null'), 5))
{
	WebUI.click(findTestObject('null'))
	System.out.println('clicked GEOCODE button')
}
else
{
	System.out.println('NO GEOCODE button')
}*/


// uncommented try catch 8.5.24
try {
//	WebUI.waitForElementClickable(findTestObject('null'), 5)
	WebUI.click(findTestObject('null'))
	System.out.println('clicked GEOCODE button')
	WebUI.delay(6)
}
catch (Exception e) {
	System.out.println('Exception - ' + e)
}


WebUI.waitForElementVisible(findTestObject('null'), 30)

WebUI.click(findTestObject('null'))

quoteNumber = WebUI.getAttribute(findTestObject('null'), 'innerHTML')
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
WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '02/02/2019')



WebUI.setText(findTestObject('null'), '717-555-5555')

//WebUI.setText(findTestObject('null'), 'john.hughes@cornerops.com')
int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)
WebUI.setText(findTestObject('null'), 'john.hughes+'+randomEmail+'@cornerops.com')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '09/03/1980')

WebUI.selectOptionByValue(findTestObject('null'), 'M', true)

// prior mailing address stuff
// generates random number, either 0 or 1, used to randomize US/international
randomNumber = ((Math.random() * 2) as int)
int randomNumber = 0
System.out.println('need to fill in prior mailing address stuff')

if (randomNumber == 0) // fill out US prior mailing address
{
	WebUI.setText(findTestObject('null'), '850 QUEEN ST')

	WebUI.setText(findTestObject('null'), 'HARRISBURG')

	WebUI.selectOptionByLabel(findTestObject('null'), 'PA', false)

	WebUI.setText(findTestObject('null'), '17113')
} 
else 
{
	WebUI.selectOptionByIndex(findTestObject('null'), 1)

	String selectedAddressType = WebUI.getAttribute(findTestObject('null'), 'value')

	System.out.println('selectedAddressType = ' + selectedAddressType)

	WebUI.setText(findTestObject('null'), '9584 saint international st')

	WebUI.setText(findTestObject('null'), 'Deiging, Beiengly, 10010001')

	WebUI.setText(findTestObject('null'), 'Germany')
}

WebUI.selectOptionByValue(findTestObject('null'), 'Y', true)


WebUI.selectOptionByValue(findTestObject('null'), 'PRIMARY', true)

WebUI.selectOptionByValue(findTestObject('null'), 'ARCHITECTURAL', true)


WebUI.click(findTestObject('null'))
WebUI.clearText(findTestObject('null'))

if(WebUI.waitForElementVisible(findTestObject('null'), 2))

	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'))
WebUI.clearText(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'))

if(WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'), 2))
{

		WebUI.click(findTestObject('null'))
}
WebUI.setText(findTestObject('null'), '2015')
if(WebUI.waitForElementVisible(findTestObject('null'), 2))
{
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'))
}
WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'), '2015')
if(WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'), 2))
{
	WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_CloseModal'))
}




WebUI.selectOptionByValue(findTestObject('null'), 'VENEER', true)

WebUI.selectOptionByValue(findTestObject('null'), 'FINISHED', true)

WebUI.click(findTestObject('null'))

//WebUI.selectOptionByValue(findTestObject('null'), 'V', true)
WebUI.selectOptionByIndex(findTestObject('null'), 3)



String squareFoot = WebUI.getAttribute(findTestObject('null'), 'value') 
System.out.println("squareFoot = " + squareFoot)		// outputs default squareFoot value
if(squareFoot.length() < 3)
{
	WebUI.setText(findTestObject('null'), '1333')
	System.out.println("set squareFoot = 1333")
}


WebUI.doubleClick(findTestObject('null'))

WebUI.setText(findTestObject('null'), '2015')

WebUI.setText(findTestObject('null'), 'clearwater fd')

WebUI.selectOptionByValue(findTestObject('null'), '02', true)

//WebUI.selectOptionByValue(findTestObject('null'), '1', true)

WebUI.selectOptionByValue(findTestObject('null'), 'LT1000', true)

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('null'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('null'), 'SHUTTERS', true)

WebUI.selectOptionByValue(findTestObject('null'), '5', true)

WebUI.selectOptionByValue(findTestObject('null'), '5', true)

WebUI.selectOptionByValue(findTestObject('null'), '5', true)



//WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('null'), '201500')

// check this div for 0.00, if it contains 0.00 then populate dwellingLimit_1 with something


//System.out.println('before the IF  --- replacementCost360 = ' + WebUI.getAttribute(findTestObject('null'), 'innerHTML'))

String replacementCost360 = WebUI.getAttribute(findTestObject('null'), 'innerHTML')
if(replacementCost360.contains("\$0.00"))
{
	System.out.println("replacement cost is 0.00, need to manually set value")
	WebUI.setText(findTestObject('null'), '201500')
	//replacementCost360 = WebUI.getAttribute(findTestObject('null'), 'innerHTML' )
}
else {
	System.out.println("in the else")
	//replacementCost360 = WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)
}

//findTestObject('null')



WebUI.selectOptionByValue(findTestObject('null'), '45', true)

WebUI.selectOptionByValue(findTestObject('null'), '5000', true)



// opens 360 value modal
WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Recalculate' ))
	   
WebUI.delay(5)

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



WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'LOCAL', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))



//WebUI.selectOptionByValue(findTestObject('null'), 'NONE', true) //EDGE NONE EDGEPLUS
// 0 = None, 1 = Edge, 2 = EdgePlus
// generates random number, either 0 or 1 or 2,
randomBundle = (((Math.random() * 2) as int) + 1) 
randomBundle = 2
System.out.println('randomBundle = ' + randomBundle)

WebUI.selectOptionByIndex(findTestObject('null'), randomBundle)



WebUI.setText(findTestObject('null'), '0')

//WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))


//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Phone Number_ApplicantHomePhonezzzz1'),  Keys.chord('7177625555',  Keys.TAB,, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
//WebUI.scrollToElement(findTestObject('null'), 5)
//WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\TXzip\\TXzip-' + zipTX) + '.jpg')	// take first screenshot

if(stopQQ)
{
	
	//return	// closes window
	System.exit(0)  // keeps window open
}
	


WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
//WebUI.delay(6)



//'new paperless buttons'
//WebUI.click(findTestObject('null'))

'new paperless buttons'
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_PaperlessDelivery'))
if(paperless == false)
{
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVE_Paperless'))
}



WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'N', true)

WebUI.selectOptionByValue(findTestObject('null'), 'Y', true)

WebUI.setText(findTestObject('null'), 'travelers')

WebUI.setText(findTestObject('null'), effectiveDate)

WebUI.setText(findTestObject('null'), '123456123456')

WebUI.selectOptionByValue(findTestObject('null'), 'N', true)



'Click Prequalification button'
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
WebUI.comment("before clicking Coverage button")
'Click Coverage button'
WebUI.click(findTestObject('null'))
WebUI.comment("after clicking Coverage button")

'Click General button'
WebUI.click(findTestObject('null'))
WebUI.comment("after clicking General button")

WebUI.comment("before trying to click copper")
WebUI.selectOptionByValue(findTestObject('null'), 'COPPER', true)

//WebUI.selectOptionByValue(findTestObject('null'), '2', true)

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('null'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('null'), 'SHUTTERS', true)

/*
if (isAgent == false)
{
	String protectionClass = WebUI.getAttribute(findTestObject('null'), 'value') // gets dropdown value
	System.out.println("protectionClass = " + protectionClass)		// outputs dropdown value
	System.out.println("protectionClass.length() = " + protectionClass.length())		// outputs dropdown value
	
	if(protectionClass.length() > 0)
	{	
		if(Integer.valueOf(protectionClass) == 10)
		{
			//click yes to subdivision
			WebUI.click(findTestObject('null'))
			//add subdivision name
			WebUI.sendKeys(findTestObject('null'), "Terra Cotta Woods")
		}	
	}
}
*/

'Click History button'
WebUI.click(findTestObject('null'))

'Click Interests button'
WebUI.click(findTestObject('null'))

'Click Statements button'
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('null'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('null'), 'Applicant1', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

//new paperless radio button
if(paperless)
{	
	WebUI.click(findTestObject('null'))
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
	WebUI.click(findTestObject('null'))

	policyNumber = WebUI.getAttribute(findTestObject('null'), 'innerHTML')

	System.out.println('policyNumber = ' + policyNumber) //WebUI.closeBrowser()
}
else
{
	WebUI.comment('shouldBind = ' + shouldBind)
	policyNumber = 'not bound with code'
	// forces last name to be saved for Recurring payments
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	
	/*
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
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


//WebUI.waitForElementPresent(findTestObject('null'), 10)

WebUI.closeBrowser()
System.out.println('quoteNumber = ' + quoteNumber )
