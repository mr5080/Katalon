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
myDate = new Date()
System.out.println('myDate = ' + myDate)
todaysDate = myDate.format('MM/dd/yyyy')
*/

if(effectiveDate == '')
{
	effectiveDate = myDate
	System.out.println('effectiveDate = ' + effectiveDate)
}
System.out.println('myDate = ' + myDate)


todaysTimeStamp = myDate //.format(('MMddyyyy' + '-') + 'HHmm')
System.out.println('todaysTimeStamp = ' + todaysTimeStamp)

//currentYear = Integer.parseInt(myDate.format('yyyy'))
currentYear = todaysDate.getYear()
System.out.println('currentYear = ' + currentYear)


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

//WebUI.setText(findTestObject('null'), '10100')
WebUI.setText(findTestObject('null'), 'jhughes')

WebUI.setEncryptedText(findTestObject('null'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

//WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), '42', true)

WebUI.selectOptionByValue(findTestObject('null'), 'HO6', true)

WebUI.setText(findTestObject('null'), Keys.chord(effectiveDate, Keys.TAB))

//WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), randomFirstName)

WebUI.setText(findTestObject('null'), 'p')

WebUI.setText(findTestObject('null'), randomLastName)

WebUI.setText(findTestObject('null'), 'sr')

WebUI.setText(findTestObject('null'), addressTX)

WebUI.setText(findTestObject('null'), '')

WebUI.setText(findTestObject('null'), cityTX)

WebUI.setText(findTestObject('null'), zipTX)

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.TAB))
WebUI.delay(5)

try {
	WebUI.click(findTestObject('null'))
	System.out.println('clicked GEOCODE button')
	WebUI.delay(6)
}
catch (Exception e) {
	System.out.println('Exception - ' + e)
}

WebUI.verifyElementVisible(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('null'), 10)

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

WebUI.setText(findTestObject('null'), '02/02/2019')


WebUI.setText(findTestObject('null'), '717-555-2255')



//WebUI.setText(findTestObject('null'), 'john@cog.com')
int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)
WebUI.setText(findTestObject('null'), 'john.hughes+'+randomEmail+'@cornerops.com')


WebUI.setText(findTestObject('null'),  Keys.chord('09/01/2000', Keys.TAB))

WebUI.selectOptionByValue(findTestObject('null'), 'M', true)


// prior mailing address stuff
// generates random number, either 0 or 1, used to randomize US/international
randomNumber = ((Math.random() * 2) as int)
int randomNumber = 1

System.out.println('need to fill in prior mailing address stuff')

if (randomNumber == 0) // fill out US prior mailing address
{
	WebUI.setText(findTestObject('null'), '850 Queen ST')

	WebUI.setText(findTestObject('null'), 'Harrisburg')

	WebUI.selectOptionByLabel(findTestObject('null'), 'PA', false)

	WebUI.setText(findTestObject('null'), '17113')
}
else
{
	WebUI.selectOptionByIndex(findTestObject('null'), 1)

	String selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 'value')

	System.out.println('selectedAddressType = ' + selectedAddressType)

	WebUI.setText(findTestObject('null'), '9584 saint international st')

	WebUI.setText(findTestObject('null'), 'Deiging, Beiengly, 10010001')

	WebUI.setText(findTestObject('null'), 'Germany')
}


WebUI.selectOptionByValue(findTestObject('null'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('null'), 'S', true)

WebUI.setText(findTestObject('null'), '2015')
//WebUI.setText(findTestObject('null'), YOC)		// this is year to use with YOC variable


try {
	WebUI.delay(1)

	// need to click Close on popup warning if differenceYears > 40
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Close button -Modal window'))

	System.out.println('Successfully closed the 40+ year old Construction year ---   currentYear - constructionYearInt ' + (currentYear - constructionYearInt))
}
catch (Exception e) {
	System.out.println(e)
}




//WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('null'), 'OWNER', true)
WebUI.selectOptionByValue(findTestObject('null'), 'PRIMARY', true)

//WebUI.setText(findTestObject('null'), '1988')


String squareFoot = WebUI.getAttribute(findTestObject('null'), 'value')
System.out.println("squareFoot = " + squareFoot)		// outputs default squareFoot value
if(squareFoot.length() < 3)
{
	WebUI.setText(findTestObject('null'), '1666')
	System.out.println("set squareFoot = 1666")
}



WebUI.setText(findTestObject('null'), '2015')

WebUI.selectOptionByValue(findTestObject('null'), 'ARCHITECTURAL', true)

WebUI.selectOptionByValue(findTestObject('null'), '1', true)

WebUI.setText(findTestObject('null'), 'houston')

WebUI.selectOptionByValue(findTestObject('null'), '1', true)

WebUI.selectOptionByValue(findTestObject('null'), '01', true)

WebUI.selectOptionByValue(findTestObject('null'), 'LT1000', true)

WebUI.selectOptionByValue(findTestObject('null'), '5', true)

WebUI.selectOptionByValue(findTestObject('null'), '5', true)

WebUI.selectOptionByValue(findTestObject('null'), '5', true)
//WebUI.delay(10)
//WebUI.doubleClick(findTestObject('null'))
WebUI.setText(findTestObject('null'), '96000')


WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '100000')

WebUI.selectOptionByValue(findTestObject('null'), '30', true)

WebUI.selectOptionByValue(findTestObject('null'), '300000', true)

WebUI.selectOptionByValue(findTestObject('null'), '3000', true)

//WebUI.selectOptionByValue(findTestObject('null'), 'CONDO', true)
// 0 = None, 1 = Edge, 2 = EdgePlus
// generates random number, either 0 or 1 
randomBundle = (((Math.random() * 2) as int) + 0)

System.out.println('randomBundle = ' + randomBundle)

WebUI.selectOptionByIndex(findTestObject('null'), randomBundle)


WebUI.setText(findTestObject('null'), '0')

WebUI.click(findTestObject('null'))


//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Phone Number_ApplicantHomePhonezzzz1'),  Keys.chord('7177625555',  Keys.TAB,, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
/*
if(Integer.parseInt(YOC) == 1982)
{
	WebUI.scrollToElement(findTestObject('null'), 5)
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
WebUI.click(findTestObject('null'))

WebUI.switchToWindowTitle('')
*/

WebUI.click(findTestObject('null'))



'new paperless buttons'
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_PaperlessDelivery'))
if(paperless == false)
{
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVE_Paperless'))
}


WebUI.setText(findTestObject('null'), 'travelers')

WebUI.setText(findTestObject('null'), effectiveDate)

WebUI.setText(findTestObject('null'), '1234560')

WebUI.selectOptionByValue(findTestObject('null'), 'N', true)




WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'COPPER', true)

//WebUI.click(findTestObject('null'))

//WebUI.setText(findTestObject('null'), 'johns acres')


if(isAgent == false)
{	
	String protectionClass = WebUI.getAttribute(findTestObject('null'), 'value') // gets dropdown value
	System.out.println("protectionClass = " + protectionClass)		// outputs dropdown value
	
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

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('null'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('null'), 'Applicant1', true)

//return;

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))


WebUI.callTestCase(findTestCase('TX Evergreen/selectPaymentType'),
	[('howPayDeposit') : howPayDeposit,
		('fullName') : fullName,
		('randomLastName') : randomLastName
		 ], FailureHandling.STOP_ON_FAILURE)
/*
WebUI.selectOptionByValue(findTestObject('null'), 'PR', true)

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 40)


WebUI.setText(findTestObject('null'), '4111 1111 1111 1111')

WebUI.setText(findTestObject('null'), '11/25')

WebUI.setText(findTestObject('null'), '111')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), randomLastName)
*/

//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))

String policyNumber = 'not bound with code'
if (shouldBind == true)
{
	WebUI.click(findTestObject('null'))
	policyNumber = WebUI.getAttribute(findTestObject('null'), 'innerHTML')
	System.out.println('policyNumber = ' + policyNumber) //WebUI.closeBrowser()
}
else
{
	WebUI.comment('shouldBind = ' + shouldBind)
	// forces last name to be saved for RCC
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	
}

// pass vars to write for TX  11.18.22
WebUI.callTestCase(findTestCase('TX Evergreen/writeFile'),
	[
//	('policyType') : policyType,
	('randomLastName') : randomLastName,
	('randomFirstName') : randomFirstName,
	('quoteNumber') : quoteNumber,
	('todaysDate') : todaysDate,
	('myDate') : myDate,
	('policyNumber') : policyNumber,
//	('totalPremium') : totalPremium,
	('policyType') : 'HO6',
	('shouldBind') : shouldBind,
	('stateTX') : stateTX,
	('isAgent') : isAgent,
	('environment') : environment
//	,('todaysTimeStamp') : todaysTimeStamp
		], FailureHandling.STOP_ON_FAILURE)


//WebUI.waitForElementPresent(findTestObject('null'), 10)

WebUI.closeBrowser()

System.out.println('quoteNumber = ' + quoteNumber )

/*
WebUI.selectOptionByValue(findTestObject('null'), 'MC', true)

WebUI.selectOptionByValue(findTestObject('null'), 'PR', true)

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'V', true)

WebUI.setText(findTestObject('null'), '4111 1111 1111 1111 ')

WebUI.setText(findTestObject('null'), '11/25')

WebUI.setText(findTestObject('null'), '111')

WebUI.setText(findTestObject('null'), 'smith')

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()
*/
