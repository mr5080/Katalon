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

import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//  pass vars to another test case
def nameAddressData = WebUI.callTestCase(findTestCase('FL GL/nameAddressSetup'), [('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)

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
 
 System.out.println('todaysDate = ' + todaysDate)
 
 todaysTimeStamp = mydate.format(('MMddyyyy' + '-') + 'HHmm')
 
 System.out.println('todaysTimeStamp = ' + todaysTimeStamp)
 
 currentYear = Integer.parseInt(mydate.format('yyyy'))
 
 System.out.println('currentYear = ' + currentYear)
 //return //System.exit(0)
 
 RunConfiguration.setWebDriverPreferencesProperty('args', ['--incognito', '--start-maximized', '--disable-infobars'])		// takes place instead of Project - Settings - Desired Capabilityes - Web
 WebUI.openBrowser('')
 
 try
 {
	if (environment == 'TEST') 
	{
		WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
	} 
	else if (environment == 'STAGE') 
	{
		WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')
	}
 

//WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
} else {
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}

WebUI.setText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'),'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Effective Date_EffectiveDate'))
WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_Effective Date_EffectiveDate'))
WebUI.sendKeys(findTestObject('Object Repository/FL GL/Page_/input_Effective Date_EffectiveDate'), Keys.chord(effectiveDate, Keys.TAB))



WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_FLORIDATEXAS'), '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_DwellingGeneral LiabilityHomeownersH_1b6c19'), 'GL', true)



////////////////
WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Insured Name_ApplicantLast'), randomFirstName + " " + randomLastName)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_DBA_Name'), 'DBA ' + randomLastName)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Address_ApplicantAddress1'), Keys.chord(addressFL, Keys.TAB))




WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_City_ApplicantCity'), cityFL)
WebUI.sendKeys(findTestObject('Object Repository/FL GL/Page_/input_Business Zip Code_ApplicantZip'), Keys.chord(zipFL, Keys.TAB))
//WebUI.waitForElementVisible(findTestObject('Object Repository/FL DP/Page_/td_NOTE The address above has beensuccessfu_ffdc37'), 30)
///////////////




WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_button'))
//WebUI.delay(3)
quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/FL GL/Page_/div_Quote Number'), 'innerHTML')

WebUI.waitForElementPresent(findTestObject('Object Repository/FL GL/Page_/div_Quote Number'), 10)
quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/FL GL/Page_/div_Quote Number'), 'innerHTML')
System.out.println('quoteNumber = ' + quoteNumber)

'Internal'
if (isAgent == false) {
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))

	// wait for dynamic table to populate?
	WebUI.delay(1)

	/// update this to key down and then key up, can do the same thing for date pickers!
	for (int x = 0; x < 5; x++) {
		try {
			WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '')

			WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Search Term_NOSAVEagentSearchAgentCode'),  Keys.chord('10100', Keys.TAB))
			
			if (WebUI.waitForElementVisible(findTestObject('Object Repository/FL GL/Page_/td_TEST AGENCY'), 4)) 
			{
				WebUI.click(findTestObject('Object Repository/FL GL/Page_/td_TEST AGENCY'))
				break
			}
		}
		catch (def e) {
			System.out.println('didnt find it, trying again... ' + x)
		}
	}
}


//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_button'))
//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '10100')
//WebUI.click(findTestObject('Object Repository/FL GL/Page_/td_TEST AGENCY'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Please select a county.ALACHUABAKERB_b6b0bb'), '12043', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_ProofPriorInsurance'), 'N', true)


WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Years in Business_YearsInBusiness'), '5')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Years Experience_YearsExperience'), '6')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Prior Insurance within 10 days_NOSAVE_c34256'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Not Claim FreeClaim Free'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_100,000300,000500,0001,000,000'), '500000', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_1,000,000500,000'), '500000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Included500,000'), '500000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_2505001,0002,000'), '1000', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__GrossReceipts'), Keys.chord('267000', Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))
//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Search Term_NOSAVEagentSearchAgentCode'),  Keys.chord('10100', Keys.TAB))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Please select a class code'),  '91111', true)
//WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Payroll_ClassCodePayroll_1'), '16700')

if(addClassCodes)
{
	// NOTE adding class codes like this, will result in additional questions on UW Questions that have not been coded for
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_2'),  '91150', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_2'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '2')
	
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_3'),  '91315', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_3'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '3')

	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_4'),  '91341', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_4'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '4')
	
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_5'),  '91340', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_5'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '5')

	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_6'),  '91405', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_6'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '6')
	
	
	
	
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_7'),  '91436', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_7'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '7')

	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_8'),  '99952', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_8'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '8')
	
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_9'),  '91551', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_9'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '9')

	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AddClassCode'))
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/ClassCodes/select_Please select a class code_10'),  '91629', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/ClassCodes/input_Payroll_ClassCodePayroll_10'), '16700')
	//WebUI.clearText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'))
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_NumberOfPeople'), '10')

}


if (addInsured == true)
{	
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Additional Insureds_addDetailButtonNu_346875'))	
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_CG 2011 Additional Insured - Manager_784741'), 'CG2011', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Name Of Person or Organization_Applic_d17c67'), 'Frist Addi Ins')
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Mailing Address_ApplicantAddress1zzzz2'), '850 queen st')
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_City, State, Zip, Zip4_ApplicantCityzzzz2'), 'harrisburg')
	WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/input_City, State, Zip, Zip4_ApplicantStatezzzz2'),  'PA', true)
	WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_City, State, Zip, Zip4_ApplicantZipzzzz2'), '17113')
}
//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Payroll_ClassCodePayroll_1'), '16700')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVESetAll'))	// on PreQualiciction page

if (isAgent == false) 
{
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Internal'))
} 


WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_DisplayQuote'))
// get Total Premium and Fees
//div[@id='Wrapper-Right-TotalPremiumAndFees']
totalPremium = WebUI.getAttribute(findTestObject('Object Repository/FL GL/Page_/div_TotalPremiumAndFees'), 'innerHTML')
System.out.println('totalPremium = ' + totalPremium)

String premium = totalPremium.toString()
//String premium = totalPremium.toString().substring(1, 10)

int premiumLength = premium.length()
System.out.println('premiumLength = ' + premiumLength )
premium = premium.substring(1, premium.length())

System.out.println('premium = ' + premium)
premium = premium.replace(',', '')
System.out.println('premium = ' + premium)
premium = premium.replace('.00', '')
System.out.println('premium = ' + premium)
premium = premium.trim()
System.out.println('premium = ' + premium)

premiumInt = Integer.valueOf(premium)
System.out.println('premiumInt = ' + premiumInt)

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_UWQuestions'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEHasPremises'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEContractorHistory'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Type of jobs performed within last 12_9d93bf'), 'i do everything')

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEWrittenContract'))
WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEClaimOccurrence'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Do you perform work under written con_0f7e42'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPriorFelony'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPreviousJudgement'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPriorCypress'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDeniedRenewal'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesExcavationWork'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesGradingLand'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesUseHerbicides'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesContactUtility'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesSnowRemoval'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesRoads'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesUseCranes'))
WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEUsedEquipment'))


//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEClaimOccurrence'))
WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVECondoWork'))
WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVECOI'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesTreeRemoval'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesGardeningClass'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesNewConstruction'))

if(addClassCodes)
{
	WebUI.scrollToElement(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEWaterProofingRoofs'), 10)
	WebUI.sendKeys(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEWaterProofingRoofs'), Keys.chord(Keys.PAGE_UP))


	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEWaterProofingRoofs'))
	            
	
	
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEEmergencyMold'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEHazardDisposal'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEInstallComputers'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEProductsSold'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEResidential'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPoleToPole'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEAlarm'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVECommercialStores'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPools'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEBoats'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDumpster'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEJanitorial'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDrawPlans'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEHomeTheater'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVESellOrInstall'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEExteriorWork'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVERepairFurniture'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVESalvage'))
}




WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Residential_ResidentialPercent'), '100')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Repair or Service_RepairorService'), '0')

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_New Construction_NewConstruction'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Repair or Service_RepairorService'), '100')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_AdditionalInterest'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_GeneralInformation'))


//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Does the insured contact a utility lo_71e464'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Additional Interests'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-609-0450')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/div_FEIN'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_FEIN_FEINzzzz1'), '123456987')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_IndividualPartnershipLimited Liabili_a20400'),    'INDIVIDUAL', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Description_BusinessDescript_077434'), 'selling stuffies')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Inspection Contact_InspectionContactN_d3941f'), 'inspector specty')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_concat(Insured, , s Website)_Insureds_e6a5d5'), 'www.google.com')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_concat(Insured, , s Email)_ApplicantE_08aac7'), 'tester@cornerops.com')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_TypeOfLicense'), 'HVAC Liense')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_CurrentLicenseNumber'), '54564981561')



//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsPayroll'), '0.00')

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/div_Prior 12 Months Payroll'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsPayroll'), '50000')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsSubcontractCosts'), '60000')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsGrossReceipts'), '100000')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Prior Carrier_PriorCarrier'), 'geico')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__PriorPremium'), '1500')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Prior Policy_PriorPolicyNumber'), 'g939393')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Prior Expiration Date_PriorExpirationDate'), '10/11/2023')

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVELosses5years'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Full Pay4-Pay (25 down)'), payPlanOption, true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Remarks_Remarks'), 'remarks here')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_BindSubmit Application'))

if(paperless == true)
	{
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPaperlessYes'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPaperlessYesAcknowledge'))
	}
else
{
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPaperlessNo'))
}
	//select payment method logic
	WebUI.callTestCase(findTestCase('FL GL/selectPaymentType'), [('howPayDeposit') : howPayDeposit,
		('fullName') : fullName,
		('premiumInt') : premiumInt,
		('randomLastName') : randomLastName],
		FailureHandling.STOP_ON_FAILURE)
	

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Credit CardCredit Card with Recurrin_fded8b'),  'MC', true)
System.out.println('quoteNumber = ' + quoteNumber)

//System.exit(0)

if (shouldBind == true) {
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Bind Application'))

	String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/FL GL/Page_/policyNumber'), 'innerHTML')

	System.out.println('policyNumber = ' + policyNumber //WebUI.closeBrowser()
		// forces last name to be saved for Recurring payments
		)
} else {
	WebUI.comment('shouldBind = ' + shouldBind)
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_GoBackOnePage'))
	WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_GoForwardOnePage'))
}

// pass vars to write the file  9.16.21
WebUI.callTestCase(findTestCase('FL GL/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
		, ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment,  ('numInterests') : numInterests,  ('paperless') : paperless, ('todaysTimeStamp') : todaysTimeStamp, ('addClassCodes') : addClassCodes], FailureHandling.STOP_ON_FAILURE)

System.out.println('quoteNumber = ' + quoteNumber)

System.out.println('fullName = ' + fullName)

System.out.println('shouldBind = ' + shouldBind)
/*
WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Bind Application'))

WebUI.verifyElementText(findTestObject('Object Repository/FL GL/Page_/policyNumber'), 'IFG6000170-00')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_MORE'))

WebUI.verifyElementText(findTestObject('Object Repository/FL GL/Page_/div_Policy Number'), 'Policy Number: IFG6000170-00')

WebUI.verifyElementText(findTestObject('Object Repository/FL GL/Page_/b_Account ID 312114'), 'Account ID: 312114')

WebUI.closeBrowser()
*/
 }
 catch(e)
 {
	// quoteNumber = quoteNumber.replace(':', '')
	 System.out.println('quoteNumber failed to fully create = ' + quoteNumber)
	 System.out.println('todaysTimeStamp failed to fully create = ' + todaysTimeStamp)
	 quoteNumber = quoteNumber.replace(':', '')
	 
	 		 
	  WebUI.takeScreenshot('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '- GL - ' + quoteNumber + ' Failure.jpg')
		 
	 /*
	 WebUI.callTestCase(findTestCase('FL DP/writeFile'), [ //	('policyType') : policyType,
		 ('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
		 , ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment, ('optionalCoverages') : optionalCoverages, ('numInterests') : numInterests, ('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)
	 */
 }
 