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

import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import java.lang.Integer as Integer
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import org.openqa.selenium.JavascriptExecutor


//  pass vars to another test case
def nameAddressData = WebUI.callTestCase(findTestCase('Cannabis/nameAddressSetup'),	[('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)


String randomFirstName = nameAddressData['randomFirstName']
String randomLastName = nameAddressData['randomLastName']

String addressAZ = nameAddressData['addressAZ']
String cityAZ = nameAddressData['cityAZ']
String stateAZ = nameAddressData['stateAZ']
String zipAZ = nameAddressData['zipAZ']


String fullName = (randomFirstName + ' ') + randomLastName

// get todays date
mydate = new Date()
System.out.println('myDate = ' + mydate)
todaysDate = mydate.format('MM/dd/yyyy')



WebUI.openBrowser('')

//WebUI.navigateToUrl('https://alchemytest.cogisi.com/is/root/logon/index.cfm')
if (environment == 'TEST') {
	WebUI.navigateToUrl('https://alchemytest.cogisi.com/is/root/index.cfm')
} else if (environment == 'STAGE') {
	WebUI.navigateToUrl('https://alchemystage.cogisi.com/is/root/index.cfm')
}



if (isAgent == true) {
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
} else {
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}


WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_PASSWORD_LoginButton'))

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/label_Start'))

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/a_Start a New Quote'))

//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Effective Date_EffectiveDate'), effectiveDate)
WebUI.clearText(findTestObject('Object Repository/Cannabis/Page_/input_Effective Date_EffectiveDate'))
WebUI.sendKeys(findTestObject('Object Repository/Cannabis/Page_/input_Effective Date_EffectiveDate'), Keys.chord(effectiveDate, Keys.TAB))



//WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(Keys.TAB))
//WebUI.sendKeys(findTestObject('Object Repository/TX EG HO3/Page_/input_Effective Date_EffectiveDate'), Keys.chord(effectiveDate, Keys.TAB))

if(stopQQ)
	{
	//	System.exit(0)
	}


WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_ARIZONACOLORADOOKLAHOMA'), '2', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_PolicyType'), 'BOPA', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_PolicyType'), policyType, true)

//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Location BusinessName'), 'The Pot Shop')
//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_BUSApplicantLastzzzz1'), randomFirstName + '\'s' + ' Pot Shop')



WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Location Zip Code_ApplicantZip'), zipAZ)
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Location Address_ApplicantAddress1'), addressAZ)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Ext Address_ApplicantAddress2'), 'BLDG 1')

WebUI.sendKeys(findTestObject('Object Repository/Cannabis/Page_/input_City_ApplicantCity'), cityAZ)

// tab out of city, 
// deal with alert if presnt and accept
//WebUI.switchToDefaultContent()
// 
	//	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again)


// lightspeed button removed 3.27.23
//if(lightSpeed)
/*
if(manualAddress == 'lightspeed')
{
	System.out.print('manualAddress = lightspeed')
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/btn_Lightspeed'))
	try {
		WebUI.acceptAlert()
	
		System.out.println('Accept address validation has been validated')
	}
	catch (Exception e) {
		System.out.println('No addres validation alert')
	}
	
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_LightspeedLocation'))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Cannabis/Page_/input_LightspeedLocation'), 1)
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/btn_Lightspeed - SaveContinue'))	
}
else
{
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/btn_Application'))
}*/

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/btn_Application'))

try {
	WebUI.acceptAlert()

	System.out.println('Accept address validation has been validated')
}
catch (Exception e) {
	System.out.println('No addres validation alert')
}
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_LightspeedLocation'))
WebUI.click(findTestObject('Object Repository/Cannabis/Page_/btn_Lightspeed - SaveContinue'))
/*
try {
	WebUI.acceptAlert()

	System.out.println('Accept address validation has been validated')
}
catch (Exception e) {
	System.out.println('No addres validation alert')
}

WebUI.switchToDefaultContent()
*/
	


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
				WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '9942300')
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




WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVESetAll'))

//System.exit(0)
WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Coverages'))




//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_ALASKAALABAMAARKANSASARIZONACALIFORN_2138b2'), '2', true)

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/td_TEST AGENCY'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/div_Quote Number'))
quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/div_Quote Number'), 'innerHTML')
System.out.println('quoteNumber = ' + quoteNumber )


WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Phone Number_ApplicantPhonezzzz1'), '717-762-5080')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')

'new paperless button'
//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_PaperlessDelivery'))
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Website_Websitezzzz1'), 'www.google.com')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_IndividualPartnershipLimited Liabili_a20400'), 'LLC', true)
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Cannabis/Page_/select_IndividualPartnershipLimited Liabili_a20400'), 2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Cannabis/Page_/select_LegalEntity'), 1)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_BUSApplicantLastzzzz1'), randomFirstName + 'S ONE STOP SUPER POT SHOP')


//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Business Name_CorpApplicantLastzzzz1'), 'CBD JUICE')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_DBA Name_DBANamezzzz1'), 'CBD FOR YOU AND ME')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_FEIN_FEIN'), '123456789')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_IndividualPartnershipLimited Liabili_a20400'), 'PARTNERSHIP', true)
/*
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Applicant First Name_ApplicantFirstzzzz1'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Applicant Middle Name_ApplicantMiddlezzzz1'), 'Pat')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_BUSApplicantLastzzzz1'), randomLastName)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Applicant Suffix_ApplicantSuffixzzzz1'), 'jr')
*/
/*
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Partner First Name_CoApplicantFirstzzzz1'), 'TJ')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Partner Middle Name_CoApplicantMiddlezzzz1'), 'russ')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Partner Last Name_CoApplicantLastzzzz1'), randomLastName)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Partner Suffix_CoApplicantSuffixzzzz1'), 'sr')
*/

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_United StatesUS TerritoryInternational'), 'domestic', true)
/*
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Address_ApplicantAddress1'), addressAZ)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Address_ApplicantAddress2'), 'STE 007')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip, Zip4_ApplicantCity'), cityAZ)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_StateAKALARAZCACOCTDCDEFLGAHIIAIDILI_28d72e'), stateAZ, true)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip, Zip4_ApplicantZip'), zipAZ)
*/

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Location Address_LocationAddress1_1'))

/*
 // commented this block out when Address fields IDs changed. 
if(isAgent == false)
{
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Location Address_LocationAddress1_1'), addressAZ)
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Extended Location Address_LocationAddress2_1'), 'BLDG 1')
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip, Zip4_LocationCity_1'),  Keys.chord(cityAZ, Keys.TAB))
	try {
		WebUI.acceptAlert()
	
		System.out.println('Accept address validation has been validated')
	}
	catch (Exception e) {
		System.out.println('No addres validation alert')
	}
	
	WebUI.switchToDefaultContent()
}
*/
/*WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_StateAKALARAZCACOCTDCDEFLGAHIIAIDILI_28d72e_1'), stateAZ, true)

//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip, Zip4_LocationZip_1'), zipAZ)
WebUI.sendKeys(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip, Zip4_LocationZip_1'), Keys.chord(zipAZ, Keys.TAB))
try {
	WebUI.acceptAlert()

	System.out.println('Accept address validation has been validated')
}
catch (Exception e) {
	System.out.println('No addres validation alert')
}

WebUI.switchToDefaultContent()
*/

//WebUI.selectOptionByIndex(findTestObject('Object Repository/Cannabis/Page_/select_123456788B9101X2X3X4X5X6X7X8X1Y2Y3Y4Y5Y6Y'), 2)
//get PC
String protectionClass = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/select_123456788B9101X2X3X4X5X6X7X8X1Y2Y3Y4Y5Y6Y'), 'value')
System.out.println("protectionClass = " + protectionClass)
System.out.println("protectionClass.length() = " + protectionClass.length())
if(protectionClass.length() == 0)
{
	//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/select_123456788B9101X2X3X4X5X6X7X8X1Y2Y3Y4Y5Y6Y'), 3)
	WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_123456788B9101X2X3X4X5X6X7X8X1Y2Y3Y4Y5Y6Y'), '5', true)
}



 //get distance fire station
//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_DistanceFireStation'), '02', true)
 String fireStation = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/select_DistanceFireStation'), 'value')
 System.out.println("fireStation = " + fireStation)
 System.out.println("fireStation.length() = " + fireStation.length())
 if(fireStation.length() == 0)
 {
	 //WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/select_DistanceFireStation'), 3)
	 WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_DistanceFireStation'), '05', true)
	 
 }
 
 //get distance fire hydrant
 //WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_DistanceFireStation'), '02', true)
  String fireHydrant = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/select_fireHydrant'), 'value')
  System.out.println("fireHydrant = " + fireHydrant)
  System.out.println("fireHydrant.length() = " + fireHydrant.length())
  if(fireHydrant.length() == 0)
  {
	  WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_fireHydrant'), 'LT1000', true)
  }
 
  // get responding fire dept
  String respondingFireDept = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/input_Responding Fire Department'), 'value')
  System.out.println("respondingFireDept = " + respondingFireDept)
  System.out.println("respondingFireDept.length() = " + respondingFireDept.length())
  if(respondingFireDept.length() == 0)
  {
	  WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Responding Fire Department'), cityAZ + ' FD')
  }
 


  
  //WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Sprinkler'), 'COMPLETE', true)
  //get Sprinkler - blank is never an option, so dont need to set it with code, so i commented this out
 /* String sprinkler = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/select_Sprinkler'), 'value')
  System.out.println("sprinkler = " + sprinkler)
  System.out.println("sprinkler.length() = " + sprinkler.length())
  if(sprinkler.length() == 0)
  {
	  WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Sprinkler'), 'PARTIAL', true)
  }*/
  
  // BCEG is not required, so dont need to set it
  
  //WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Frame Joisted MasonryMasonry Non-Com_36cb0e'), 'MASONRY', true)
  String masonryType = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/select_Frame Joisted MasonryMasonry Non-Com_36cb0e'), 'value')
  //String sprinkler = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/select_Sprinkler'), 'value')
  System.out.println("masonryType = " + masonryType)
  System.out.println("sprinkler.length() = " + masonryType.length())
  if(masonryType.length() == 0)
  {
	  WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Frame Joisted MasonryMasonry Non-Com_36cb0e'), '3', true)
  }
  
// get construction year
String constructionYear = Integer.valueOf(WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/input_Year Built_ConstructionYear_1'), 'value'))
System.out.println("constructionYear = " + constructionYear)
//System.out.println("constructionYear.length() = " + constructionYear.length())
if(constructionYear.length() == 0)
{
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Year Built_ConstructionYear_1'), '2015')
}

// get Roofing Updates year
int roofingYear = Integer.valueOf(WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/input_Roofing Updates_LastRoofUpdate_1'), 'value'))
System.out.println("roofingYear = " + roofingYear)
//System.out.println("roofingYear.length() = " + roofingYear.length())

if(    roofingYear < Integer.valueOf(constructionYear)   )
{
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Roofing Updates_LastRoofUpdate_1'), constructionYear)
}

// get Total Square Footage of Building
//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Total Square Footage'), '3500')
String totalSquareFootage = WebUI.getAttribute(findTestObject('Object Repository/Cannabis/Page_/input_Total Square Footage'), 'value')
System.out.println("totalSquareFootage = " + totalSquareFootage)
System.out.println("totalSquareFootage.length() = " + totalSquareFootage.length())
if(totalSquareFootage.length() == 0)
{
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Total Square Footage'), '3210')
}





/*
WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_UngradedNot ApplicableNon-Participan_f398aa'), '1', true)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Electrical Updates_LastElectricalUpdate_1'), '2020')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Roofing Updates_LastRoofUpdate_1'), '2020')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Plumbing Updates_LastPlumbingUpdate_1'), '2020')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Heating Updates_LastHeatingUpdate_1'), '2020')
*/
WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_1234'), '1', true)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Total Occupied Square Footage_SqFoota_678e18'), '4500')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_CBP 40 01_ProductLimit_1'), '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_1,0002,5005,0007,50010,0001 Deductib_49f380'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Owner Tenant Lessor'), 'OWNER', true)


WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Building Limit_BuildingLimit_1'), '500000')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Business Personal Property_BPPLimit_1'), '500001')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Actual Loss Sustained25,00050,00075,_126677'), '175000', true)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Projected Annual Gross Receipts (Loca_05b23c'), '750000')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Prior Year Annual Gross Receipts (Loc_419881'), '650000')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_NumberEmployees'), '4')

/*
WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Money  Securities Inside the Premise_37be17'), 'MONEYINSIDE', true)

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Add Coverage'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Money  Securities Outside the Premis_563c61'), 'OUTDOORSIGN', true)

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Add Coverage'))

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input__OutdoorSignLmt_1'), '2000.00')
*/
if(isAgent == false)
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_System AppliedUW Override to No'), 'YM', true)

	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_P-2 Fire Alarm Clause_NOSAVEExclusionP2_1'))

	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_P-3 Cooking Protection Clause_NOSAVEE_32dffa'))

	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_P-4 Security Service_NOSAVEExclusionP4_1'))
}

/*move else where on page 1.17.23
//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Exclude Equipment Breakdown Protectio_4805de'))
//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Employee Dishonesty_NOSAVEDishonestyLmt'))
//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input__AcctReceivables'), '20000.00')
//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_NumberEmployees'), '5')
//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input__ValuableRecords'), '16000.00')
*/
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input__ElectronicDataLmt'), '15000.00')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_300,000500,0001,000,000'), '500000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_600,0001,000,0002,000,000'), '1000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_IncludedExcluded'), 'Included', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_600,0001,000,0002,000,000_1'), '1000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_300,000500,0001,000,000_1'), '500000', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_100,000250,000300,000500,0001,000,000'), '250000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Terrorism'), 'Y', true)

//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Additional Insureds  Waiver of Transf_66abe6'), '3') // question removed from page

              
WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_CBP 40 05_NOSAVEHiredAuto'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_CBP 40 05_NOSAVENonOwnedAuto'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVECommAutoPolicy'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEDeliveryService'))

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Loss History_PriorClaimCount'), '0')

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Rating'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_History'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Additional Insureds'))
/*
WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Additional Insureds_addDetailButtonAd_c8a715'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_Designated Person or Organization BP_4fb9a2'), 'BP 04 09', true)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Name_InterestNamexxxx1'), 'Bank of Banks')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_United StatesUS TerritoryInternational_1'), 'domestic', true)

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Mailing Address_InterestAddress1xxxx1'), '850 queen street')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip Code, Zip4_InterestC_30d986'), 'harrisburg ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_StateAKALARAZCACOCTDCDEFLGAHIIAIDILI_28d72e_1_2'), 'PA', true)

//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip Code, Zip4_InterestZipxxxx1'), '17113')
WebUI.sendKeys(findTestObject('Object Repository/Cannabis/Page_/input_City, State, Zip Code, Zip4_InterestZipxxxx1'), Keys.chord('17113', Keys.TAB))
WebUI.switchToDefaultContent()
*/

if(isAgent == false)
{
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Internal'))

	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/div_Scheduled ModificationIRPM 0 Management_9c37d3'))
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Management_Management'), '1')
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_IRPMLocation'), '1.11')
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Building Features_BuildingFeatures'), '1.13')
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Premises And Equipment_PremisesAndEquipment'), '0.29')
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Employees_Employees'), '1.25')
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Protection_Protection'), '1.05')
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_A. Description And Location of Premi_736a26'), 'A', true)
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Schedule_ExclusionSchedule'), 'Some Schedule')
	
	//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/div_'))
	
	WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input__FacultativeReinPrem'), '2500')
}

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Statements'))

//WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Date business started_BusinessStartDate'), '02/02/2022')
WebUI.sendKeys(findTestObject('Object Repository/Cannabis/Page_/input_Date business started_BusinessStartDate'), Keys.chord('02/02/2022', Keys.TAB))


WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEClaimOccurrence'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEFelonyConviction'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEPreviousJudgement'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEDeniedRenewal'))

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Inspection Contact Name_InspectionCon_c6b3b6'), 'HOwie Inspectore')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Inspection Contact Phone Number_TEXT10'), '484-919-5562')

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does the applicant run background che_992fe0'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEEmploysProfessionals'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEInCompliance'))

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_License Number (list all that apply)__e7cb7b'), 'CBD 4 ME')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Identify the Cannabis Track and Trace_a83420'), 'I SPY YOU')

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does applicant provide product traini_77c169'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEHasOnlineProducts'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEShipsCCProducts'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEShipsInterstateCCProducts'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEIsRelabelling'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVESyntheticSales'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Are all cannabis products the applica_e79dfe'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEHasCOAs'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEVapeSales'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Yes_NOSAVEHasGuards'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Do all locations have a Central Stati_ad8166'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Is it monitored by an alarm company a_1a8591'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_concat(Does the applicant, , s alarm _fd545d'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_concat(Does applicant, , s alarm syst_1153d6'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_concat(Is the alarm on at all times w_a50926'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEHasVideo'))


	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does surveillance provide 24-hour vid_53496d'))
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does the applicant video surveil the _1c6e7d'))
	
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does the applicant video surveil the _8f9714'))
	


WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEHas2InventoryCams'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does camera surveillance allow for fa_30ee49'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEUsesSafes'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Is the safe at least 2,000 lbs., or i_960222'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEHasSecureEmployees'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEHasEmployeeRequirements'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Are all exterior doors to the buildin_cf60fc'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_concat(Do all entry doors have a , , _49c4e8'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Do all entry doors have a steel door _3856c6'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_No_NOSAVEIsWindowFortified'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Is window fortification permanently a_740e72'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Are daily bank deposits made_NOSAVEHa_6a17f5'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Does the applicant vary their time an_708721'))


WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_BindSubmit Application'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_EFTInvoice'), 'S', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cannabis/Page_/select_CheckingSavings'), 'S', true)

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input_Name_ACHName'))

/*
WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Routing Number_ACHRoutingNumber'), '031318745')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Re-enter Routing Number_ACHRoutingNum_faa2b1'), '031318745')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Account Number_ACHAccountNumber'), '456456')

WebUI.setText(findTestObject('Object Repository/Cannabis/Page_/input_Re-enter Account Number_ACHAccountNum_eba26a'), '456456')
*/

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input__PremInclFees'))

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input__SurplusTax'))

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input__NetCommission'))

//WebUI.click(findTestObject('Object Repository/Cannabis/Page_/input__TotalPayment'))

if(shouldBind)
{	
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_Bind Application'))
	
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/div_Policy ID'))
	
	WebUI.rightClick(findTestObject('Object Repository/Cannabis/Page_/a_PolicyID'))
	
	WebUI.click(findTestObject('Object Repository/Cannabis/Page_/button_MORE'))
}

// pass vars to write for TX  11.18.22
WebUI.callTestCase(findTestCase('Cannabis/writeFile'),
	[
//	('policyType') : policyType,
	('randomLastName') : randomLastName,
	('randomFirstName') : randomFirstName,
	('quoteNumber') : quoteNumber,
	('todaysDate') : todaysDate,
//	('totalPremium') : totalPremium,
//	('policyType') : 'HO3',
	('manualAddress') : manualAddress,
	('stateAZ') : stateAZ,
	('isAgent') : isAgent,
	('environment') : environment
//	,('todaysTimeStamp') : todaysTimeStamp
		], FailureHandling.STOP_ON_FAILURE)


//WebUI.waitForElementPresent(findTestObject('Object Repository/TX EG HO3/Page_/button_Send to Company'), 10)

WebUI.closeBrowser()

System.out.println('quoteNumber = ' + quoteNumber )

