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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration


def nameAddressData = WebUI.callTestCase(findTestCase('BuildersRisk/nameAddressSetup'), [('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)

String randomFirstName = nameAddressData['randomFirstName']

String randomLastName = nameAddressData['randomLastName']

String addressFL = nameAddressData['addressFL']

String cityFL = nameAddressData['cityFL']

String stateFL = nameAddressData['stateFL']

String zipFL = nameAddressData['zipFL']

String countyFL = nameAddressData['countyFL']

String yearOfConstFL = nameAddressData['yearOfConstFL']

System.out.println('yearOfConstFL = ' + yearOfConstFL)
String fullName = (randomFirstName + ' ') + randomLastName

/*
 // get todays date
 mydate = new Date()
 System.out.println('myDate = ' + mydate)
 todaysDate = mydate.format('MM/dd/yyyy')
 */
// get todays date
mydate = new Date()
System.out.println('myDate = ' + mydate)
todaysDate = mydate.format('MM/dd/yyyy')
if(effectiveDate == '')
{
	effectiveDate = todaysDate
	System.out.println('effectiveDate = ' + effectiveDate)
}
System.out.println('todaysDate = ' + todaysDate)

 
 todaysTimeStamp = mydate.format(('MMddyyyy' + '-') + 'HHmm')
 
 System.out.println('todaysTimeStamp = ' + todaysTimeStamp)
 
 currentYear = Integer.parseInt(mydate.format('yyyy'))
 
 System.out.println('currentYear = ' + currentYear)
 //return //System.exit(0)


RunConfiguration.setWebDriverPreferencesProperty('args', ['--incognito', '--start-maximized', '--disable-infobars', 'enable-automation'])		// takes place instead of Project - Settings - Desired Capabilityes - Web
WebUI.openBrowser('')

try
{
	

WebUI.navigateToUrl('https://buildersrisktest.cogisi.com/is/root/logon/index.cfm')
if (environment == 'TEST') {
	WebUI.navigateToUrl('https://buildersrisktest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
	WebUI.navigateToUrl('https://buildersriskstage.cogisi.com/is/root/logon/index.cfm')
}

//WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_AGENT CODE_userloginid'),   '0')
if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
} else {
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}


WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_USERNAME_userloginname'),    'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_password'),    'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/label_Start'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/a_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_FLORIDATEXAS'), 'FL', true)

WebUI.mouseOver(findTestObject('Object Repository/BR FL/Page_/select_One Shot'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/strong_Effective Date'))


WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Location Address_ApplicantAddress1'), addressFL)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Ext Address_ApplicantAddress2'), 'APT 008')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_City_ApplicantCity'), cityFL)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Location Zip Code_ApplicantZip'), zipFL)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Effective Date_EffectiveDate'), effectiveDate)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/div_Start a New Quote   Risk StateFLORIDATE_1cee94'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_button'))		//last button on Start a New Quote


quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/div_Quote Number'), 'innerHTML')
System.out.println('quoteNumber = ' + quoteNumber)

System.out.println('"$isAgent" = ' + isAgent)

'Agent Producer'
if (isAgent == false) {
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))
	// wait for dynamic table to populate?
	WebUI.delay(1)

	for (int x = 0; x < 5; x++)
	{
		try {
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '')

		//    WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'CORNERSTONE TEST ')
		 //   WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'AGENCY ')
		//	WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord('10102',  Keys.UP, Keys.TAB))
			//WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord('10100',  Keys.UP))

			WebUI.delay(1)

			if (WebUI.waitForElementVisible(findTestObject('Object Repository/BR FL/Page_/td_TEST AGENCY'), 2)) {
				WebUI.click(findTestObject('Object Repository/BR FL/Page_/td_TEST AGENCY'))
				break
			}
		}
		catch (def e) {
			System.out.println('didnt find it, trying again... ' + x)
		}
	}
}

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Effective Date_EffectiveDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_ProjectType'), projectType, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_3 Months12 Months'), '12', true)

if(projectType != 'NEW')
{
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_renovationDetails'), 'building a playhouse')	
}

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Coverage'))

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Phone Number_ApplicantPhonezzzz1'), '717-762-4658')

int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)
WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Email Address_ApplicantEmailzzzz1'), ('john.hughes+' + randomEmail) + '@cornerops.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_OwnerBuilderDeveloperRemodeler'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_OwnerBuilderDeveloperRemodeler'), 'OWNER', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Individual_NOSAVEApplicantAskzzzz1'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Please choose a name type_NOSAVEAppli_f4d688'))

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant First Name_NOSAVE-INDApplic_2cbe29'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant Middle Name_NOSAVE-INDAppli_24c841'), 'ann')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant Last Name_NOSAVE-INDApplica_c58ad8'), randomLastName)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Applicant Suffix_NOSAVE-INDApplicantS_d9ac27'), 'II')

//WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_United StatesUS TerritoryInternational'), 'international', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_United StatesUS TerritoryInternational'), 'domestic', true)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Address_ApplicantAddress1'), '1000 MARGHERITA CT')

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_City, State, Zip, Zip4_ApplicantCity'), 'RED LION')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/input_State'), 'PA', false)

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_City, State, Zip, Zip4_ApplicantZip'), '17356')


WebUI.selectOptionByIndex(findTestObject('Object Repository/BR FL/Page_/select_FireHydrant'), 1)



int randomCompleteValue = 2 + ((Math.random() * ((5) + 1)) as int)
//WebUI.delay(10)
//WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_CompletedValueLimit'), '300000')
//WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_CompletedValueLimit'), randomCompleteValue + '00000')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1,0002,5005,00010,000'), '', true)


int randomValue = 2 + ((Math.random() * ((5) + 1)) as int)
if(projectType != 'NEW')
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_coverageRequired'), '0', true)
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_workValue'), randomValue + '50800')
}
else
{
	//WebUI.delay(10)
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_CompletedValueLimit'), randomValue + '50800')
	//WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_CompletedValueLimit'), randomCompleteValue + '00000')
	
}




WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1,0002,5005,00010,000'), '5000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_2510Excluded'), '2', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Rating'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_General'))


WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_Single family residential dwellingTw_771401'), 'SINGLEFAMILYDWELLING', true)


if(projectType != 'NEW')
{
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_updatesElectric'), '2021')
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_updatesRoof') , '2022')
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_updatesPlumbing') , '2023')
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_updatesHVAC') , '2024')	
}

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/input_roofMaterial'), 'ARCHITECTURAL', true)
WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_Total Square Footage_SquareFootage_1'), '1589')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1234'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_1234'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_FrameJoisted MasonryNon-CombustibleM_f412cc'),  'B', true)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Add InterestInsured'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_History'))
WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Statements'))

WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_legalNameBuilder'), randomLastName + ' the builder')
WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_licensedContractor'))
WebUI.selectOptionByValue(findTestObject('Object Repository/BR FL/Page_/select_YesNo'), 'N', true)
if(projectType == 'NEW')
{
	
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Yes_NOSAVEHomeownerOccupancy_1'))
	
}	


// new questions here
if(projectType != 'NEW')
{
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_vacantBuilding'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_foreclosureNo'))	
}

WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_Yes_NOSAVEStiltsPilings_1'))



// need to check for the presense of questions  if the crime score question come up
try
{	// these need to be answered if highCrime, quote 7760 example
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Will the jobsite(s) have security fencing_NOSAVESecurityFence_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Will the jobsite(s) be lit at night_NOSAVENightLit_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Will security checks of the jobsite(s) be done at the end of the day_NOSAVESecurityChecks_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Will local law enforcement be notified to include the jobsite(s) on routine patrols_NOSAVERoutinePatrols_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Will building materials be secured at the jobsite(s)_NOSAVESecuredMaterials_1'))
	
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Will any type of alarm service or electronic surveillance be used at the jobsite(s)_NOSAVEAlarmService_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_No_NOSAVEWarningSigns_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_No_NOSAVESuspiciousActivity_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Is the jobsite in an established subdivision_NOSAVEEstSubdivision_1'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/securityQuestions/input_Is the jobsite in a gatedguarded subdivision_NOSAVEGatedSubdivision_1'))
}
catch(e)
{
	System.out.println('Exception - ' + e)
}

if(!isAgent)
{	// this button is not displayed for agents
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_Internal'))
}


if(projectType == 'STRUCTURAL')
	{
		WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_judgementRate'), '1.001')
		
		
		
	}
	
WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_DisplayQuote'))

totalPremium = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/div_TotalPremiumAndFees'), 'innerHTML')
System.out.println('totalPremium = ' + totalPremium)

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_BindSubmitApp'))

String policyNumberLink = '' // this is passed to writeFile
if(shouldBind)
{	
	System.out.println('in the if')
	
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_BindApplication'))
	
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_MORE'))
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/BR FL/Page_/policyID'), 10)
	String policyID = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/policyID'), 'textContent')
	//WebUI.comment('policyID = ' + policyID)
	System.out.println('policyID = ' + policyID)
	
	policyNumberLink = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/policyNumberLink'), 'innerHTML')
	WebUI.comment('policyNumberLink = ' + policyNumberLink)
	System.out.println('policyNumberLink = ' + policyNumberLink)
	
	
	String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/PolicyNumber'), 'innerHTML')
	WebUI.comment('policyNumber = ' + policyNumber)
	System.out.println('policyNumber = ' + policyNumber)
}
else
{
	System.out.println('in the else')
//	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_GoBackOnePage'))	
//	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_GoForwardOnePage'))
		
}	
	
// up next write to file
/*
System.out.println('randomLastName ' + randomLastName)
System.out.println('randomFirstName ' + randomFirstName)
System.out.println('quoteNumber ' + quoteNumber)
System.out.println('todaysDate ' + todaysDate)
System.out.println('shouldBind ' + shouldBind)
System.out.println('stateFL ' + stateFL)
System.out.println('isAgent ' + isAgent)
System.out.println('environment ' + environment)
System.out.println('todaysTimeStamp ' + todaysTimeStamp)
System.out.println('totalPremium ' + totalPremium)

System.out.println('policyNumberLink ' + policyNumberLink)
*/


// pass vars to write the file  9.16.21
WebUI.callTestCase(findTestCase('BuildersRisk/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, 
		('randomFirstName') : randomFirstName, 
		('quoteNumber') : quoteNumber, 
		('todaysDate') : todaysDate, 
		('totalPremium') : totalPremium, 
		//('policyType') : policyType, 
		('projectType') : projectType,		
		('shouldBind') : shouldBind, 
		('stateFL') : stateFL, 
		('isAgent') : isAgent, 
		('environment') : environment, 
//		('optionalCoverages') : optionalCoverages, 
//		('numInterests') : numInterests,  ('paperless') : paperless, 
		('policyNumberLink') : policyNumberLink,		
		('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)

System.out.println('quoteNumber = ' + quoteNumber)

}
catch(e)
{
	quoteNumber = quoteNumber.replace(':', '')
	System.out.println('quoteNumber failed to fully create = ' + quoteNumber)
	
	System.out.println('todaysTimeStamp = ' + todaysTimeStamp)
		
	//WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '-' + quoteNumber) + 'Failure.jpg')
	WebUI.takeScreenshot(('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '-' + quoteNumber) + 'Failure.jpg')
	
	//WebUI.takeScreenshot('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\Failure.jpg')
	
	/*
	WebUI.callTestCase(findTestCase('FL DP/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
		, ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment, ('optionalCoverages') : optionalCoverages, ('numInterests') : numInterests, ('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)
	*/
}
