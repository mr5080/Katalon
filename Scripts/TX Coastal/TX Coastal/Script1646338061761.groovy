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
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
}
else
{
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '0')
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

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'JHUGHES')

'goHome1!'
WebUI.setEncryptedText(findTestObject('Object Repository/TX Coastal/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/TX Coastal/Page_/li_Start a New Quote'), 10)
//WebUI.comment('FOUND START NEW QUOTE BUTTON')




if(environment == 'TEST')
{
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/li_Start a New Quote'))
}
else if (environment == 'STAGE')
{
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/label_Start'))
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/a_Start a New Quote'))

}

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Effective Date_EffectiveDate'), '04/03/2022')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_FLORIDATEXAS'), '42', true)

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_First Name_ApplicantFirst'), randomFirstName)

//WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Middle Name_ApplicantMiddle'), 'Ann')

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Last Name_ApplicantLast'), randomLastName)

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Suffix_ApplicantSuffix'), '')

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Address_ApplicantAddress1'), addressTX)

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_City_ApplicantCity'), cityTX)

'need to add a TAB'
WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Property Zip Code_ApplicantZip'), zipTX)

WebUI.sendKeys(findTestObject('Object Repository/TX Coastal/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(Keys.TAB))

//WebUI.sendKeys(findTestObject('Cypress 4/Page_/input - InterestZip'), Keys.chord(Keys.TAB))
WebUI.waitForElementPresent(findTestObject('Object Repository/TX Coastal/Page_/td_NOTE The address above has beensuccessfu_ffdc37'), 20)

'Click QQ button'
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input'))
quoteNumber = WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Quote Number'), 'innerHTML')


'Testing Rate and Continue button Click Rate and Continue button'
//WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Rate and Continue')) // clicks the top Rate and Continue button

//WebUI.delay(10)


if(isAgent == false)
{	
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input - Agent Lookup'))
	
	// change to sendkeys!
	//WebUI.sendKeys(findTestObject('Object Repository/TX Coastal/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 'cornerstone ')
	//WebUI.sendKeys(findTestObject('Object Repository/TX Coastal/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 'test')
	
	
	for (int x = 0; x < 5; x++)
	{
			try {
				WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '')
	
				WebUI.sendKeys(findTestObject('Object Repository/TX Coastal/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 'cornerstone ')
				WebUI.sendKeys(findTestObject('Object Repository/TX Coastal/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), 'test')
	
				WebUI.delay(1)
	
				if (WebUI.waitForElementVisible(findTestObject('Object Repository/TX Coastal/Page_/td_TEST AGENCY'), 2)) 
				{
					//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/td_SearchForAgent'))
					WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/td_TEST AGENCY'))				
					break
				}
			}
			catch (def e) {
				System.out.println('didnt find it, trying again... ' + x)
			}
	}
}
//WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/td_TEST AGENCY'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Effective Date_EffectiveDate'))

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Purchase Date_PurchaseDate_1'), '01/01/2018')

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Purchase Date_NOSAVEAUTHORIZECREDIT'))

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-555-1234')

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '01/01/1970')

if(realAPlusClaimReport)
{
	// TestData Folder - AplusProperty_Matchtype_FL- Claims.xls
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '04/13/1982')
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_PriorMailingAddress'), '7999 Macinnes Dr')
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_PriorMailingAddressCity'), 'Jacksonville')
	WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/input_PriorMailingAddressState'), 'FL', true)
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_PriorMailingAddressZip'), '32244')
}	




WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Please SelectNoYes'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_1 Family2 Family'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_123'), '2', true)

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/div_Number of Families 1 Family2 Family Num_b61b69'))

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Year of Construction_ConstructionYear_1'), '2015')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_FrameMasonryMasonry VeneerSuperior'), 'V', true)

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Square Footage_SquareFootage_1'), '1555')

WebUI.selectOptionByIndex(findTestObject('Object Repository/TX Coastal/Page_/select_Slab - RoofCovering'), 1)



//WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/div_Square Footage  Year of Roof   Roof Con_47c515'))
WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')
WebUI.selectOptionByIndex(findTestObject('Object Repository/TX Coastal/Page_/select_Slab - Closed FoundationCrawl Space _2f2f45'), 1)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Architectural Shingles3-tab ShingleC_cebd15'), 'ARCHITECTURAL', true)
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Census Block_GMFIPS_1'))

if(isAgent ==  false)
{
	WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Responding Fire Department_Responding_eb6df6'), 'Fire Dept')
}

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Protection Class 1Protection Class 2_2c389b'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_5 road miles or lessOver 5 miles'), '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEWindMitigationProof_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_125'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_123510'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_1,0002,500125'), '2500', true)

//WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Coverage A - Dwelling Limit_DwellingLimit_1'), '299999')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_2101520'), '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_40455055606570'), '45', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_5001,0002,5005,000'), '1000', true)

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVESecuredBuildingCredit_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVECompanionPolicyDiscount_1'))

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.scrollToElement(findTestObject('Object Repository/TX Coastal/Page_/button_Rate and Continue'), 1)

//WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Rate and Continue'))

'Click Rate and Continue button'
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Rate and Continue'))



WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Proceed to Application'))

//exit(0);

//WebUI.rightClick(findTestObject('Object Repository/TX Coastal/Page_/div_Quote Number 945028'))
WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Previous Carrier_PriorCarrier_1'), 'geico')

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), '03/03/2022')

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Previous Policy_PriorPolicyNumber_1'), '555666888')

WebUI.scrollToElement(findTestObject('Object Repository/TX Coastal/Page_/button_Eligibility'), 1)
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Eligibility'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVE_1'))

'General button'
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_General'))

//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEAnyDogs_1No'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEAnyPets3_1No'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQRenovation_1No'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQForeclosure_1'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQUnsettledClaim_1'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQBurglarBars_1'))


/*
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQDogOwnership_1'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_If yes, provide further details_GQDog_d35011'))
WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQFarmAnimal_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQExoticAnimal_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEGQConstruction_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Property'))

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_If yes, provide further details_GQDog_d35011'), 'NO')
*/

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Property'))
WebUI.selectOptionByIndex(findTestObject('Object Repository/TX Coastal/Page_/select_Slab - Closed FoundationCrawl Space _2f2f45'), 1)
WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_ElectricCentralGasCentralOilCentralS_a19282'), 'Gas', true)

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Enter year water heater was installed_fa7ad3'), '2015')

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Slab - Closed FoundationCrawl Space _2f2f45'), 'BASEMENTUNFIN', true)





WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Year Primary Heat Type Installed_Year_8d530f'), '2015')

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Square Footage_SquareFootage_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_CopperGalvanizedPVCPolybutylenePEX'), 'COPPER', true)

WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input_Enter year of last electrical update__603a6b'), '2015')

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Year of Construction_ConstructionYear_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_NoneGarage AttachedGarage DetachedCa_f366a9'), '1', true)

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Enter year of last plumbing update_La_b385dd'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Year of Roof_RoofConstructionYear_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Census Block_GMFIPS_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Responding Fire Department_Responding_eb6df6'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/input_Yes_NOSAVEWindMitigationProof_1'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Coverage'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Losses'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Interests'))

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Full PaySemi-AnnualQuarterly (40 Dow_948f30'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Please SelectTEST TESTER TESTING JR'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Please SelectTEST TESTER TESTING JR_1'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Display Quote'))

totalPremium = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/div_TotalPremiumAndFees'), 'innerHTML')

WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_BindSubmit Application'))


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

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX Coastal/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'MC', true)

//WebUI.setText(findTestObject('Object Repository/TX Coastal/Page_/input__DepositAmount'), '100.00')
/*
if(shouldBind == true)
{
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_Bind Application'))
	
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/div_Policy Number ITC2000002-00'))
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/TX Coastal/Page_/a_ITC2000002-00'), 0)
	
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/button_MORE'))
	
	WebUI.click(findTestObject('Object Repository/TX Coastal/Page_/b_Account ID 116044'))
}
	
*/