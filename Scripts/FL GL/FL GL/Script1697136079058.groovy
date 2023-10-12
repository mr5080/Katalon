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

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
} else {
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'),   '0')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 
    'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/FL GL/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

//WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Effective Date_EffectiveDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_FLORIDATEXAS'), '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_DwellingGeneral LiabilityHomeownersH_1b6c19'), 'GL', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Insured Name_ApplicantLast'), 'Tester Name')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Doing Business As_ApplicantFirst'), 'dba me')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Address_ApplicantAddress1'), '1020 SUNSET POINT RD')
WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Address_ApplicantAddress1'), Keys.chord('1108 Commodore st', Keys.TAB))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_City_ApplicantCity'), 'clearwater')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Zip Code_ApplicantZip'), Keys.chord('33755', Keys.TAB))
//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Zip Code_ApplicantZip')).click()
//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Zip Code_ApplicantZip'), Keys.chord('33755', Keys.TAB))
//WebUI.waitForElementVisible(findTestObject('Object Repository/FL DP/Page_/td_NOTE The address above has beensuccessfu_ffdc37'), 30)

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_button'))
//WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/FL DP/Page_/div_Quote Number'), 10)
quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/FL DP/Page_/div_Quote Number'), 'innerHTML')
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

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_ProofPriorInsurance'), 'Y', true)


WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Years in Business_YearsInBusiness'), '5')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Years Experience_YearsExperience'), '6')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Prior Insurance within 10 days_NOSAVE_c34256'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Not Claim FreeClaim Free'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_100,000300,000500,0001,000,000'), '500000', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_1,000,000500,000'), '500000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Included500,000'), '500000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_2505001,0002,000'), '1000', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__GrossReceipts'), Keys.chord('67000', Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))
//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Search Term_NOSAVEagentSearchAgentCode'),  Keys.chord('10100', Keys.TAB))

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Please select a class codeAIR CONDIT_e5d300'),  'Please select a class code', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Please select a class codeAIR CONDIT_e5d300'),  '91111', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Payroll_ClassCodePayroll_1'), '16700')



WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Additional Insureds_addDetailButtonNu_346875'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_CG 2011 Additional Insured - Manager_784741'), 
    'CG2011', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Name Of Person or Organization_Applic_d17c67'), 'Frist Addi Ins')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Mailing Address_ApplicantAddress1zzzz2'), '850 queen st')



WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_City, State, Zip, Zip4_ApplicantCityzzzz2'), 'harrisburg')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/input_City, State, Zip, Zip4_ApplicantStatezzzz2'),  'PA', true)



WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_City, State, Zip, Zip4_ApplicantZipzzzz2'), '17113')

//WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Payroll_ClassCodePayroll_1'), '16700')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVESetAll'))	// on PreQualiciction page

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Internal'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_DisplayQuote'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_UWQuestions'))



WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEHasPremises'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEContractorHistory'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Type of jobs performed within last 12_9d93bf'), 'i do everything')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEWrittenContract'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Do you perform work under written con_0f7e42'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPriorFelony'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPreviousJudgement'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPriorCypress'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDeniedRenewal'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesExcavationWork'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesGradingLand'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesUseHerbicides'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesContactUtility'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesSnowRemoval'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesRoads'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesUseCranes'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesTreeRemoval'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesGardeningClass'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEDoesNewConstruction'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Residential_ResidentialPercent'), '100')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Repair or Service_RepairorService'), '0')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_New Construction_NewConstruction'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Repair or Service_RepairorService'), '100')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Does the insured contact a utility lo_71e464'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Additional Interests'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-609-0450')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/div_FEIN'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_FEIN_FEINzzzz1'), '123456987')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_IndividualPartnershipLimited Liabili_a20400'), 
    'INDIVIDUAL', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Business Description_BusinessDescript_077434'), 'selling stuffies')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Inspection Contact_InspectionContactN_d3941f'), 'inspector specty')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_concat(Insured, , s Website)_Insureds_e6a5d5'), 'www.google.com')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_concat(Insured, , s Email)_ApplicantE_08aac7'), 'tester@cornerops.com')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsPayroll'), '0.00')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/div_Prior 12 Months Payroll'))

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsPayroll'), '50000')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsSubcontractCosts'), '60000')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__Prior12MonthsGrossReceipts'), '100000')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Prior Carrier_PriorCarrier'), 'geico')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input__PriorPremium'), '1500')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Prior Policy_PriorPolicyNumber'), 'g939393')

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Prior Expiration Date_PriorExpirationDate'), '10/11/2023')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVELosses5years'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Full Pay4-Pay (25 down)'), '4PAY', true)

WebUI.setText(findTestObject('Object Repository/FL GL/Page_/input_Remarks_Remarks'), 'remarks here')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_BindSubmit Application'))

WebUI.click(findTestObject('Object Repository/FL GL/Page_/input_Yes_NOSAVEPaperless'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL GL/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 
    'MC', true)

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_Bind Application'))

WebUI.verifyElementText(findTestObject('Object Repository/FL GL/Page_/a_IFG6000170-00'), 'IFG6000170-00')

WebUI.click(findTestObject('Object Repository/FL GL/Page_/button_MORE'))

WebUI.verifyElementText(findTestObject('Object Repository/FL GL/Page_/div_Policy Number IFG6000170-00'), 'Policy Number: IFG6000170-00')

WebUI.verifyElementText(findTestObject('Object Repository/FL GL/Page_/b_Account ID 312114'), 'Account ID: 312114')

WebUI.closeBrowser()

