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
def nameAddressData = WebUI.callTestCase(findTestCase('BuildersRisk/nameAddressSetupTX'),	[('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)


String randomFirstName = nameAddressData['randomFirstName']
String randomLastName = nameAddressData['randomLastName']


String addressTX = nameAddressData['addressTX']
String cityTX = nameAddressData['cityTX']
String state = nameAddressData['state']
String zipTX = nameAddressData['zipTX']

String fullName = (randomFirstName + ' ') + randomLastName

if(projectType == '')
{
	int randomProjectType = 1 + ((Math.random() * ((3 - 1) + 1)) as int)
	
	if(randomProjectType == 1)
		projectType = 'NEW'
	else if(randomProjectType == 2)
		projectType = 'NONSTRUCTURAL'
	else if(randomProjectType == 3)
		projectType = 'STRUCTURAL'
		
	System.out.println('projectType  = ' + projectType )
}
	
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

try
{
if (environment == 'TEST') {
	WebUI.navigateToUrl('https://buildersrisktest.cogisi.com/is/root/logon/index.cfm')
} 
else if (environment == 'STAGE') 
{
	WebUI.navigateToUrl('https://buildersriskstage.cogisi.com/is/root/logon/index.cfm')
}

if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_AGENT CODE_userloginid'), '10102')
} else {
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_TEST DATA buildersrisktest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}

WebUI.setText(findTestObject('Object Repository/BR TX/Page_TEST DATA buildersrisktest.cogisi.com/input_USERNAME_userloginname'),     'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/BR TX/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_password'),     'iJIOp32ulZH/iAm5HHInmA==')
//WebUI.sendKeys(findTestObject('Object Repository/BR TX/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_password'), 'goHome1!')
WebUI.click(findTestObject('Object Repository/BR TX/Page_TEST DATA buildersrisktest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_FLORIDATEXAS'), 'TX', true)

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Location Address_ApplicantAddress1'), addressTX)
//WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Ext Address_ApplicantAddress2'), 'APT 7007')

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_City_ApplicantCity'), cityTX)

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Location Zip Code_ApplicantZip'), zipTX)

//WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Effective Date'), effectiveDate)

WebUI.click(findTestObject('Object Repository/BR TX/Page_/div_Start a New Quote Risk StateTX_1cee94'))
WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_button'))
//WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_button'))

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


//WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '10100')

//WebUI.click(findTestObject('Object Repository/BR TX/Page_/td_TEST AGENCY'))

//WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Effective Date_EffectiveDate'), effectiveDate)
WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Effective Date'), effectiveDate)


WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_projectType'),   projectType, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_12 Months'), '12', true)
if(projectType != 'NEW')
{
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_renovationDetails'), 'building a playhouse texas sized')
}


WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Coverage'))

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Phone Number_ApplicantPhonezzzz1'), '717-500-8000')

int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)
WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Email Address_ApplicantEmailzzzz1'), ('john.hughes+' + randomEmail) + '@cornerops.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_OwnerBuilderDeveloperRemodeler'), 'OWNER',    true)

WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_Please choose a name type_NOSAVEAppli_f4d688'))

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Applicant First Name_NOSAVE-INDApplic_2cbe29'), randomFirstName + '\'' + 'D')

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Applicant Middle Name_NOSAVE-INDAppli_24c841'), 'bee')

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Applicant Last Name_NOSAVE-INDApplica_c58ad8'), randomLastName)

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Applicant Suffix_NOSAVE-INDApplicantS_d9ac27'), 'IV')

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Address_ApplicantAddress1'), '1001 margherita ct')

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_City, State, Zip, Zip4_ApplicantCity'), 'red lion')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_State'),     'PA', true)

WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_City, State, Zip, Zip4_ApplicantZip'), '17356')

//WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Completed Value Limit'), '479900')
WebUI.selectOptionByIndex(findTestObject('Object Repository/BR TX/Page_/select_FireHydrant'), 1)

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

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_1,0002,5005,00010,000'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_1,0002,5005,00010,000'), '5000', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_510'), '10', true)
WebUI.selectOptionByIndex(findTestObject('Object Repository/BR TX/Page_/select_510'), 1)

WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Rating'))

WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_dwellingType'),     'TWOFAMILYDWELLING', true)
if(projectType != 'NEW')
{
	// check for blank YOC and populate if needed
		
	WebUI.setText(findTestObject('Object Repository/BR FL/Page_/input_constructionYear') , '2018')
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_updatesElectric'), '2021')
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_updatesRoof') , '2022')
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_updatesPlumbing') , '2023')
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_updatesHVAC') , '2024')
	
}

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/input_roofMaterial'), 'SLATE', true)
WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Total Square Footage_SquareFootage_1'), '2446')

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_1234'), '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_1234'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_roofType'),     'CONCRETE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_constructionType'),     'B', true)

WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Add InterestInsured'))

WebUI.click(findTestObject('Object Repository/BR FL/Page_/button_History'))
WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Statements'))


WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Legal name of the builder performing _28237f'), randomLastName +  ' Crabby B Crabbins Shake Shop')

WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_Legal name of the builder performing _edc60c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BR TX/Page_/select_YesNo'), 'N', true)


if(projectType == 'NEW')
{
	
	WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_Yes_NOSAVEHomeownerOccupancy_1'))	
}

if(projectType != 'NEW')
{
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_vacantBuilding'))
	WebUI.click(findTestObject('Object Repository/BR FL/Page_/input_foreclosureNo'))
}
	

WebUI.click(findTestObject('Object Repository/BR TX/Page_/input_Yes_NOSAVEStiltsPilings_1'))

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
		WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Internal'))

		if(projectType == 'STRUCTURAL')
		{
			WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Judgement Rate'), '1.001')
			WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Judgement Reason_JudgementReason_1'), 'just because')
		}
}

if(projectType == 'STRUCTURAL' && isAgent == false)
{
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Judgement Rate'), '1.001')
	WebUI.setText(findTestObject('Object Repository/BR TX/Page_/input_Judgement Reason_JudgementReason_1'), 'just because')
}


WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Display Quote'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/BR TX/Page_/div_totalPremiumWithFees'), 0)

String totalPremium = ''
//if(isAgent == false)
//{
	totalPremium = WebUI.getAttribute(findTestObject('Object Repository/BR TX/Page_/div_totalPremiumWithFees'), 'innerHTML')
	System.out.println('totalPremium = ' + totalPremium)
//}

WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_BindSubmitApp'))

String policyNumberLink = '' // this is passed to writeFile
if(shouldBind)
{
	System.out.println('in the if')

	WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_Bind Application'))
	
	WebUI.click(findTestObject('Object Repository/BR TX/Page_/button_MORE'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/BR TX/Page_/policyNumberLink'), 0)
	WebUI.verifyElementPresent(findTestObject('Object Repository/BR TX/Page_/Policy Number'), 0)
		
	WebUI.waitForElementPresent(findTestObject('Object Repository/BR TX/Page_/policyID'), 10)
	String policyID = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/policyID'), 'textContent')
	//WebUI.comment('policyID = ' + policyID)
	System.out.println('policyID = ' + policyID)
	
	policyNumberLink = WebUI.getAttribute(findTestObject('Object Repository/BR TX/Page_/policyNumberLink'), 'innerHTML')
	WebUI.comment('policyNumberLink = ' + policyNumberLink)
	System.out.println('policyNumberLink = ' + policyNumberLink)
	
	
	String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/BR FL/Page_/PolicyNumber'), 'innerHTML')
	WebUI.comment('policyNumber = ' + policyNumber)
	System.out.println('policyNumber = ' + policyNumber)
}
/*else
{
	System.out.println('in the else, no payments, nothing to do')
//	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_GoBackOnePage'))
//	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_GoForwardOnePage'))
}*/
	
// up next write to file

System.out.println('randomLastName ' + randomLastName)
System.out.println('randomFirstName ' + randomFirstName)
System.out.println('quoteNumber ' + quoteNumber)
//System.out.println('todaysDate ' + todaysDate)
System.out.println('myDate ' + myDate)

System.out.println('shouldBind ' + shouldBind)
System.out.println('state ' + state)
System.out.println('isAgent ' + isAgent)
System.out.println('environment ' + environment)
System.out.println('todaysTimeStamp ' + todaysTimeStamp)
System.out.println('totalPremium ' + totalPremium)
System.out.println('policyNumberLink ' + policyNumberLink)


// pass vars to write the file  9.16.21
WebUI.callTestCase(findTestCase('BuildersRisk/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, 
		('randomFirstName') : randomFirstName, 
		('quoteNumber') : quoteNumber, 
		//('todaysDate') : todaysDate, 
		('myDate') : myDate,
		('totalPremium') : totalPremium, 
		//('policyType') : policyType, 
		('projectType') : projectType,		
		('shouldBind') : shouldBind, 
		('state') : state, 
		('isAgent') : isAgent, 
		('environment') : environment, 
//		('optionalCoverages') : optionalCoverages, 
//		('numInterests') : numInterests,  ('paperless') : paperless, 
		('policyNumberLink') : policyNumberLink,		
		//('todaysTimeStamp') : todaysTimeStamp
		], FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()

}
catch(e)
{
	quoteNumber = quoteNumber.replace(':', '')
	System.out.println('quoteNumber failed to fully create = ' + quoteNumber)
	
	System.out.println('todaysTimeStamp = ' + todaysTimeStamp)
		
	//WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '-' + quoteNumber) + 'Failure.jpg')
	WebUI.takeScreenshot(('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '-' + quoteNumber) + 'BR TX Failure.jpg')
	
	//WebUI.takeScreenshot('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\Failure.jpg')
	
	/*
	WebUI.callTestCase(findTestCase('FL DP/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
		, ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment, ('optionalCoverages') : optionalCoverages, ('numInterests') : numInterests, ('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)
	*/
}
