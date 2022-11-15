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

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

//WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'), effectiveDate)	
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

WebUI.delay(5)

try {
	WebUI.click(findTestObject('Object Repository/TX Evergreen HO6/Page_/input_X_GMAcceptButton'))
	System.out.println('clicked GEOCODE button')
}
catch (Exception e) {
	System.out.println('Exception - ' + e)
}

WebUI.waitForElementVisible(findTestObject('Object Repository/TX EG HO3/Page_/td_NOTE The address above has beensuccessfu_ffdc37'), 10)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input'))

'Agent Producer'
if (isAgent == false) {
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))

	// wait for dynamic table to populate?
	WebUI.delay(1)

	
	/// update this to key down and then key up, can do the same thing for date pickers!
	for (int x = 0; x < 1; x++)
	{
		try {
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '')

			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'CORNERSTONE TEST AGENCY')
			//WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'AGENCY ')
			// add key down/up here
			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord(Keys.TAB))
//			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')

			WebUI.delay(1)

			if (WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/td_SearchForAgent'), 2)) {
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

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Purchase Date_PurchaseDate_1'), '02/02/2019')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-555-5555')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john@cog.com')

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant First Name_ApplicantFirstzzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant Middle Name_ApplicantMiddlezzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant Last Name_ApplicantLastzzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Applicant Suffix_ApplicantSuffixzzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '09/03/1980')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_DivorcedMarriedSingleSeparated'), 'M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectNoYes'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_FrameMasonryMasonry VeneerSuperior'), 'V', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_PrimarySecondarySeasonal'), 'PRIMARY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Architectural ShinglesAsbestos3-tab _9deaa1'), 'ARCHITECTURAL', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Construction Year_ConstructionYear_1'), '2015')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherVeneer BrickMasonryAlumi_f7e94c'), 'VENEER', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Slab - Closed FoundationCrawl Space _2f2f45'), 'FINISHED', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEScreenedEnclosure_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Square feet_SquareFootage_1'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Square feet_SquareFootage_1'), '2084')

WebUI.doubleClick(findTestObject('Object Repository/TX EG HO3/Page_/input_Year of Roof_RoofConstructionYear_1'))

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Responding Fire Department_Responding_eb6df6'), 'clearwater fd')

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_7c5769'), '02', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Protection Class 1Protection Class 2_2c389b'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEWindMitigationProof_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherFlatHipGable'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherClipsHurricane Ties'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownNo ProtectionWood ShuttersBas_8ed146'), 'SHUTTERS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_1,0002,5005,000125'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_1,0002,5005,000125_1'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_125'), '5', true)



//WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input__DwellingLimit_1'))
//WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input__DwellingLimit_1'), '201500')

// check this div for 0.00, if it contains 0.00 then populate dwellingLimit_1 with something


//System.out.println('before the IF  --- replacementCost360 = ' + WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost'), 'innerHTML'))

String replacementCost360 = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost'), 'innerHTML')
if(replacementCost360.contains("\$0.00"))
{
	System.out.println("replacement cost is 0.00, need to manually set value")
	WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input__DwellingLimit_1'), '201500')
	//replacementCost360 = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost'), 'innerHTML' )
}
else {
	System.out.println("in the else")
	//replacementCost360 = WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)
}

//findTestObject('Object Repository/TX EG HO3/Page_/div_Suggested Replacement Cost')



WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_2530354045505560657075'), '45', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_1,0002,0003,0004,0005,000'), '5000', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEBuildersRisk_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVECompanionPolicyDiscount_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_NoneLocalCentralFire Station'), 'LOCAL', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEMultiPolicyDiscount_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEPaidInFull_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_NoneEvergreen Edge CoverageEvergreen_d28c8c'), 'NONE', true) //EDGE NONE EDGEPLUS

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

if(stopQQ)
{	
	System.exit(0)
}

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Rate and Continue'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Proceed to Application'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Purchase Date_PurchaseDate_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Phone Number_ApplicantHomePhonezzzz1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Email Address_ApplicantEmailzzzz1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectNoYes'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectNoYes'), 'Y', true)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Previous Carrier_PriorCarrier_1'), 'travelers')

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), effectiveDate)

WebUI.setText(findTestObject('Object Repository/TX EG HO3/Page_/input_Previous Policy_PriorPolicyNumber_1'), '123456123456')

'Click Prequalification button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVE_1'))
WebUI.comment("before clicking Coverage button")
'Click Coverage button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Coverage'))
WebUI.comment("after clicking Coverage button")

'Click General button'
WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_General'))
WebUI.comment("after clicking General button")

WebUI.comment("before trying to click copper")
WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_CopperGalvanizedPVCPolybutylenePEX'), 'COPPER', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Protection Class 1Protection Class 2_2c389b'), '2', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/input_Yes_NOSAVEWindMitigationProof_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherFlatHipGable'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownOtherClipsHurricane Ties'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_UnknownNo ProtectionWood ShuttersBas_8ed146'), 'SHUTTERS', true)

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

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Full PaySemi Annual (55 down)Quarter_8dd4b0'), '9PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectSCARY A TERRY JR'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TX EG HO3/Page_/select_Please SelectSCARY A TERRY JR_1'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_BindSubmit Application'))

//select payment method logic
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

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_Display Quote_1'))

WebUI.click(findTestObject('Object Repository/TX EG HO3/Page_/button_BindSubmit Application'))

if (shouldBind == true)
	{
		WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_Bind Application'))
	
		String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/TX Evergreen HO3/Page_/PolicyID'), 'innerHTML')
	
		System.out.println('policyNumber = ' + policyNumber) //WebUI.closeBrowser()
	}
	else
	{
		WebUI.comment('shouldBind = ' + shouldBind)
		// forces last name to be saved for RCC
		WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_GoBackOnePage'))
		WebUI.click(findTestObject('Object Repository/TX Evergreen HO3/Page_/button_GoForwardOnePage'))
		
	}
	

WebUI.waitForElementPresent(findTestObject('Object Repository/TX EG HO3/Page_/button_Send to Company'), 10)

//WebUI.closeBrowser()

