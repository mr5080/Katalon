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


if (environment == 'TEST') {
    WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
    WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')
}


if( isAgent == true)
{
	WebUI.setText(findTestObject('null'), '10100')
}
else
{
	WebUI.setText(findTestObject('null'), '0')
}


// pass vars to write the file  9.16.21
def nameAddressData = WebUI.callTestCase(findTestCase('TX Coastal/nameAddressSetup-TX'),
	[('realTransunionCreditReport') : realTransunionCreditReport,
	('realAPlusClaimReport') : realAPlusClaimReport,
	('manualNameAddress') : manualNameAddress,
	('closedZip') : closedZip
		 ], FailureHandling.STOP_ON_FAILURE)


String randomFirstName = nameAddressData['randomFirstName']
String randomLastName = nameAddressData['randomLastName']


String addressTX = nameAddressData['addressTX']
String cityTX = nameAddressData['cityTX']
String stateTX = nameAddressData['stateTX']
String zipTX = nameAddressData['zipTX']

String fullName = (randomFirstName + ' ') + randomLastName

/*
String addressTXPrior = nameAddressData['addressTXPrior']
String cityTXPrior = nameAddressData['cityTXPrior']
String stateTXPrior = nameAddressData['stateTXPrior']
String zipTXPrior = nameAddressData['zipTXPrior']
*/
System.out.println('randomFirstName = ' + randomFirstName)

// get todays date
mydate = new Date()
System.out.println('myDate = ' + mydate)
todaysDate = mydate.format('MM/dd/yyyy')
System.out.println('todaysDate = ' + todaysDate)

todaysTimeStamp = mydate.format(('MMddyyyy' + '-') + 'HHmm')
System.out.println('todaysTimeStamp = ' + todaysTimeStamp)

WebUI.setText(findTestObject('null'), 'JHUGHES')

'goHome1!'
WebUI.setEncryptedText(findTestObject('null'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('null'))

//WebUI.waitForElementPresent(findTestObject('null'), 10)
//WebUI.comment('FOUND START NEW QUOTE BUTTON')




if(environment == 'TEST')
{
	WebUI.click(findTestObject('null'))
}
else if (environment == 'STAGE')
{
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))

}

//WebUI.setText(findTestObject('null'), '04/03/2022')

WebUI.selectOptionByValue(findTestObject('null'), '42', true)

WebUI.setText(findTestObject('null'), randomFirstName)

//WebUI.setText(findTestObject('null'), 'Ann')

WebUI.setText(findTestObject('null'), randomLastName)

WebUI.setText(findTestObject('null'), '')

WebUI.setText(findTestObject('null'), addressTX)

WebUI.setText(findTestObject('null'), cityTX)

'need to add a TAB'
WebUI.setText(findTestObject('null'), zipTX)

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.TAB))

//WebUI.sendKeys(findTestObject('Cypress 4/Page_/input - InterestZip'), Keys.chord(Keys.TAB))
WebUI.waitForElementPresent(findTestObject('null'), 20)

'Click QQ button'
WebUI.click(findTestObject('null'))
quoteNumber = WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Quote Number'), 'innerHTML')


'Testing Rate and Continue button Click Rate and Continue button'
//WebUI.click(findTestObject('null')) // clicks the top Rate and Continue button

//WebUI.delay(10)


if(isAgent == false)
{	
	WebUI.click(findTestObject('null'))
	
	// change to sendkeys!
	//WebUI.sendKeys(findTestObject('null'), 'cornerstone ')
	//WebUI.sendKeys(findTestObject('null'), 'test')
	
	
	for (int x = 0; x < 5; x++)
	{
			try {
				WebUI.setText(findTestObject('null'), '')
	
				WebUI.sendKeys(findTestObject('null'), 'cornerstone ')
				WebUI.sendKeys(findTestObject('null'), 'test')
	
				WebUI.delay(1)
	
				if (WebUI.waitForElementVisible(findTestObject('null'), 2)) 
				{
					//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/td_SearchForAgent'))
					WebUI.click(findTestObject('null'))				
					break
				}
			}
			catch (def e) {
				System.out.println('didnt find it, trying again... ' + x)
			}
	}
}
//WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '01/01/2018')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '717-555-1234')

WebUI.setText(findTestObject('null'), '01/01/1970')

if(realAPlusClaimReport)
{
	// TestData Folder - AplusProperty_Matchtype_FL- Claims.xls
	WebUI.setText(findTestObject('null'), '04/13/1982')
	WebUI.setText(findTestObject('null'), '7999 Macinnes Dr')
	WebUI.setText(findTestObject('null'), 'Jacksonville')
	WebUI.selectOptionByValue(findTestObject('null'), 'FL', true)
	WebUI.setText(findTestObject('null'), '32244')
}	




WebUI.selectOptionByValue(findTestObject('null'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('null'), '1', true)

WebUI.selectOptionByValue(findTestObject('null'), '2', true)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '2015')

WebUI.selectOptionByValue(findTestObject('null'), 'V', true)

WebUI.setText(findTestObject('null'), '1555')

WebUI.selectOptionByIndex(findTestObject('null'), 1)



//WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('null'), '2015')
WebUI.selectOptionByIndex(findTestObject('null'), 1)

//WebUI.selectOptionByValue(findTestObject('null'), 'ARCHITECTURAL', true)
WebUI.click(findTestObject('null'))

if(isAgent ==  false)
{
	WebUI.setText(findTestObject('null'), 'Fire Dept')
}

WebUI.selectOptionByValue(findTestObject('null'), '1', true)

WebUI.selectOptionByValue(findTestObject('null'), '01', true)

WebUI.selectOptionByValue(findTestObject('null'), 'LT1000', true)

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), '2', true)

WebUI.selectOptionByValue(findTestObject('null'), '2', true)

WebUI.selectOptionByValue(findTestObject('null'), '2500', true)

//WebUI.setText(findTestObject('null'), '299999')

WebUI.selectOptionByValue(findTestObject('null'), '10', true)

WebUI.selectOptionByValue(findTestObject('null'), '45', true)

WebUI.selectOptionByValue(findTestObject('null'), '1000', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '0')

WebUI.scrollToElement(findTestObject('null'), 1)

//WebUI.click(findTestObject('null'))

'Click Rate and Continue button'
WebUI.click(findTestObject('null'))



WebUI.click(findTestObject('null'))

//exit(0);

//WebUI.rightClick(findTestObject('null'))
WebUI.setText(findTestObject('null'), 'john.hughes@cornerops.com')

WebUI.setText(findTestObject('null'), 'geico')

WebUI.setText(findTestObject('null'), todaysDate)

WebUI.setText(findTestObject('null'), '555666888')

WebUI.scrollToElement(findTestObject('null'), 1)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

'General button'
WebUI.click(findTestObject('null'))

//WebUI.delay(1)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))


/*
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'NO')
*/

WebUI.click(findTestObject('null'))
WebUI.selectOptionByIndex(findTestObject('null'), 1)
WebUI.selectOptionByValue(findTestObject('null'), 'Gas', true)

WebUI.setText(findTestObject('null'), '2015')

//WebUI.selectOptionByValue(findTestObject('null'), 'BASEMENTUNFIN', true)





WebUI.setText(findTestObject('null'), '2015')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'COPPER', true)

WebUI.setText(findTestObject('null'), '2015')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), '1', true)

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

totalPremium = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/div_TotalPremiumAndFees'), 'innerHTML')

WebUI.click(findTestObject('null'))


WebUI.callTestCase(findTestCase('Cypress FL/selectPaymentType'),
	[('howPayDeposit') : howPayDeposit,
		('fullName') : fullName,
	 ('randomLastName') : randomLastName
		 ], FailureHandling.STOP_ON_FAILURE)


WebUI.callTestCase(findTestCase('Cypress FL/writeFile'),
	[('policyType') : policyType,
	('randomLastName') : randomLastName,
	('randomFirstName') : randomFirstName,
	('quoteNumber') : quoteNumber,
	('todaysDate') : todaysDate,
	('totalPremium') : totalPremium,
	('policyType') : policyType,
	('shouldBind') : shouldBind,
	('stateFL') : stateTX,
	('environment') : environment,
	('isAgent') : isAgent,
	('todaysTimeStamp') : todaysTimeStamp
		], FailureHandling.STOP_ON_FAILURE)

System.out.println('quoteNumber = ' + quoteNumber)

System.out.println('fullName = ' + fullName)

System.out.println('shouldBind = ' + shouldBind)

//WebUI.selectOptionByValue(findTestObject('null'), 'MC', true)

//WebUI.setText(findTestObject('null'), '100.00')
/*
if(shouldBind == true)
{
	WebUI.click(findTestObject('null'))
	
	WebUI.click(findTestObject('null'))
	
	WebUI.waitForElementVisible(findTestObject('null'), 0)
	
	WebUI.click(findTestObject('null'))
	
	WebUI.click(findTestObject('null'))
}
	
*/