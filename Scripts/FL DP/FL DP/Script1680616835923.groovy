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

//			policyNumber = WebUI.getAttribute( findTestObject('Object Repository/LA-Evergreen2/Page_/td_ PolicyNumber'), 'textContent')

//  pass vars to another test case
def nameAddressData = WebUI.callTestCase(findTestCase('FL DP/nameAddressSetup'), [('manualAddress') : manualAddress], FailureHandling.STOP_ON_FAILURE)

/*
 // this section is incase you want to loop through an excel file, line by line. need to specify what tab in the excel fill inside of nameAddressSetup
  counter is set in Create Multiple test case
//counter = 2	// this hard codes it to a line in the excel file
def nameAddressData = WebUI.callTestCase(findTestCase('FL DP/nameAddressSetup'),	[('manualAddress') : manualAddress, ('counter') : counter], FailureHandling.STOP_ON_FAILURE)
*/
String randomFirstName = nameAddressData['randomFirstName']

String randomLastName = nameAddressData['randomLastName']

String addressFL = nameAddressData['addressFL']

String cityFL = nameAddressData['cityFL']

String stateFL = nameAddressData['stateFL']

String zipFL = nameAddressData['zipFL']

String countyFL = nameAddressData['countyFL']

String yearOfConstFL = nameAddressData['yearOfConstFL']

System.out.println('yearOfConstFL = ' + yearOfConstFL)

/*
 	/ uncomment if testing capacity rules, looping through excel file that contain YOC
yearOfConstFLInt = Integer.parseInt(nameAddressData['yearOfConstFL'])
yearOfConstFLInt += 1
System.out.println('yearOfConstFLInt = ' + yearOfConstFLInt)
String updatedYOC = yearOfConstFLInt 
		//System.exit(0)
*/
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

WebUI.openBrowser('')

try 
{
if (environment == 'TEST') {
    WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
    WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')
}

//WebUI.setViewPortSize(1920, 1080) // set window size
//WebUI.setText(findTestObject('Object Repository/FL DP/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '0')
if (isAgent == true) {
    WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '10100')
} else {
    WebUI.setText(findTestObject('Object Repository/Cannabis/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '0')
}

//WebUI.sendKeys(findTestObject('Object Repository/FL DP/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), Keys.chord(Keys.CONTROL, '-'))	// send key combo example
WebUI.setText(findTestObject('Object Repository/FL DP/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/FL DP/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/FL DP/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Effective Date_EffectiveDate'), '04/09/2023')
WebUI.clearText(findTestObject('Object Repository/FL DP/Page_/input_Effective Date_EffectiveDate'))

WebUI.sendKeys(findTestObject('Object Repository/FL DP/Page_/input_Effective Date_EffectiveDate'), Keys.chord(effectiveDate, Keys.TAB))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_DwellingHomeownersHomeowners - Legac_cd4163'), 'DP3', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_First Name_ApplicantFirst'), randomFirstName)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Middle Name_ApplicantMiddle'), 'EMILEEE')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Last Name_ApplicantLast'), randomLastName)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Suffix_ApplicantSuffix'), 'jr')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Address_ApplicantAddress1'), addressFL)

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Address_ApplicantAddressExt'), 'SUITE 007')
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_City_ApplicantCity'), cityFL)

WebUI.sendKeys(findTestObject('Object Repository/FL DP/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(zipFL, Keys.TAB))

//WebUI.switchToDefaultContent()
//WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'), 5)
//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'))

try {
    WebUI.acceptAlert()

    System.out.println('Accept address validation')
}
catch (Exception e) {
    System.out.println('No address validation alert')
} 

/*
 boolean elementPresent = WebUI.waitForAlert(5)
 
 if (elementPresent == true) {
	 alertText = WebUI.getAlertText()
 
	 System.out.println('The title of the alert is: \n' + alertText)
 
	 WebUI.delay(1)
 
	 WebUI.acceptAlert()
 
	 System.out.println('Accept address validation has been accepted')
 
	 WebUI.switchToDefaultContent( //	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
		 )
 }
*/
WebUI.waitForElementVisible(findTestObject('Object Repository/FL DP/Page_/td_NOTE The address above has beensuccessfu_ffdc37'), 30)

'click Quick Quote button'
WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_button - Quick Quote'))

//WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_button - Full Quote'))
WebUI.delay(3)

//WebUI.sendKeys(findTestObject('FL DP/Page_/iframe_RTR Quotes_MainIS21test'), Keys.chord(Keys.F11))

/*
int viewport_width = WebUI.getViewportWidth()

System.out.println('viewport_width = ' + viewport_width)

if (viewport_width == 1536) {
    WebUI.executeJavaScript('document.body.style.zoom=\'80%\'', null)

    System.out.println('should have changed viewport')
}

WebUI.delay(3)
return 
*/
//WebUI.mouseOver(findTestObject('Object Repository/FL DP/Page_/div_Quote Number'))
'click Full Quote button'
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
            WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '')

            //	if(environment == "TEST")
            //	{
            //WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'CORNERSTONE TEST AGENCY')
            WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord('10100', Keys.ENTER))

            //	}
            //	else if(environment == "STAGE")
            //	{
            //	WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
            //	}
            // add key down/up here
            WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), Keys.chord(Keys.ENTER // was .TAB, trying soemthing new 11.17.22
                    ))

            //			WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '10100')
            //	WebUI.delay(1)
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

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Effective Date_EffectiveDate'))

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Purchase Date_PurchaseDate_1'), '09/03/2018')

//WebUI.sendKeys(findTestObject('Object Repository/FL DP/Page_/input_Purchase Date_PurchaseDate_1'), Keys.chord('09/03/2022', Keys.TAB))
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Phone Number_ApplicantHomePhonezzzz1'), '717-765-5091')

int randomEmail = 2 + ((Math.random() * ((99999999 - 2) + 1)) as int)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Email Address_ApplicantEmailzzzz1'), ('john.hughes+' + randomEmail) + '@cornerops.com')

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')
//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '02/02/1980')
WebUI.sendKeys(findTestObject('Object Repository/FL DP/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), Keys.chord('01/31/1969', Keys.TAB))

'Prior Insurance'
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PriorInsurance'), 'Y', true)

//WebUI.mouseOver(findTestObject('Object Repository/FL DP/Page_/select_NoBOBTransfer'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_NoBOBTransfer'), 'N', true)
//WebUI.selectOptionByIndex(findTestObject('Object Repository/FL DP/Page_/select_All areas West of the East bank of t_b58b59'), 1)
'BOB Transfer'
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_FrameFrame with HardiplankMasonryMas_3f1d9f'), 'V', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Construction Year_ConstructionYear_1'), '2015')

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Construction Year_ConstructionYear_1'), yearOfConstFL)
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_ResidencyType'), 'TENANT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_1234'), '2', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVERowHouse_1'))

//WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVERowHouse_1'))
// question missing as of 4.13.23
//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_CentralElectricCentralOilCentralGasC_83a204'), 'OIL', true)
//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_CentralElectricCentralOilCentralGasC_83a204'), 'ELECTRIC', true)
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Square Feet_SquareFootage_1'), '1946')

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Purchase Price_PurchasePrice_1'), '305080')
//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Number of Rooms_NumRooms_1'), '5')
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_InOut'), 'N', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/div_No'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVENearSinkhole_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_12'), '1', true)
//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Asbestos ClapboardConcrete BlockCoqu_f829bb'), 'CONCRETEBLOCK', true)
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Year of Roof_RoofConstructionYear_1'), yearOfConstFL)
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_3-Tab ShingleArchitectural ShinglesC_1b7158'), '3TAB', true)

if (!(isAgent)) {
    WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVENearBarrierIsland'))
}

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_ExcellentAbove AverageAveragePoor'), 'ABOVEAVERAGE', true)
//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_ClosedOpen'), 'CLOSED', true)
//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_BasementConcrete SlabMonolithic Slab_1e5bf3'), 'BASEMENT', true)
//WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Market Value_MarketValue_1'))
//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Market Value_MarketValue_1'), '300000')
if (isAgent == false) {
    WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Responding Fire Department_Responding_eb6df6'), 'clearwater')

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_12345678910'), '1', true // PC
        )

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not ApplicableNoneHurricane-Windows _4e2d22'), 'BASIC', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not Applicable100110 120'), '110', true)
}

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_ad3f5d'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Mitigation Premium_WindMitPremium_1'), '15000')

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Yes SWRNo SWR'), 'Y', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not ApplicableOther Roof ShapeHip Ro_0f14e0'), 'HIP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Yes SWRNo SWR'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not ApplicableFBC EquivalentNon-FBC _2d03d2'), 'FBC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not ApplicableA - 6d  612B - 8d  612_c831a0'), 'NA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not ApplicableClipsReinf Concrete Ro_7662b1'), 'CLIPS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Not ApplicablePart EnclosedEnclosed'), 'PARTIAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_2 Hurricane5 Hurricane10 Hurricane50_883f7d'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_5001,0002,5005,000'), '5000', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input__DwellingLimit_1'))

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input__DwellingLimit_1'), '300000')

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_1 of Cov A2 of Cov A5 of Cov A10 of _f74192'), '1', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_1 of Cov A2 of Cov A5 of Cov A10 of _f74192'), '2', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Personal Property - Cov C_ContentsLimit_1'), '25000')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_No Liability100,000 300,000'), '100000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_No Medical1,000 3,000 5,000'), '5000', true)

// 360 value
WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Recalculate' // opens 360 value modal
        ))

WebUI.delay(2)

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

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_NonePoliceCentral StationLocal'), 'CENTRAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_NoneCentral Station ReportingLocal F_34ac8d'), 'CENTRAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_NonePartialComplete'), 'PARTIAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_NoneSingle Entry24 Hour Security Pat_b9275c'), 'SINGLEENTRY', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVECoveredPorch_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEOpenWaterExposure_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNo'), 'N', true)

// add optional coverages
if (optionalCoverages) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ACVROOF', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ANIMAL', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'MOLDFUNGI', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    //WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'LOSSLIAB', true)
    //WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))
    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ORDINANCELAW', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'INCIDENTALOCC', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNoPermittedIncidentalOccupancy'), 'Y', true)

    //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Permitted Incidental Occupancy - Limit'), '25456')
    //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Description of Other Structures'), 'tall building')
    WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Business Description_IncidentalOccupancy'), 'selling stuff')

    //WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNo_1PermittedIncidentalOccupancy'), 'N', true)
    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_YesNo_1PermittedIncidentalOccupancy'), 'Y', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'PPRC', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'REFRIGPROP', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'SCREENENCL', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    //WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'THEFT', true)
    //WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))
    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'WATERDMG', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/checkbox_Sinkhole' //	WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'LOSSLIAB', true)
            ) //	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))
        ) //WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'ACVLS', true)
    //WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_OptionalCoverage'), 'THEFT', true)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Add Coverage'))
}

//WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Rate and Continue'))	// click Rate and Continue on QQ for first time
//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Phone Number_ApplicantHomePhonezzzz1'),  Keys.chord('7177625555',  Keys.TAB,, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
/*	// uncomment this section to take screenshots of validations displayed
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PriorInsurance'), 'N', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PriorInsurance'), 'Y', true)


WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\county-' + countyFL + "-YOC-" + yearOfConstFL) + '.jpg')	// take first screenshot
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Construction Year_ConstructionYear_1'), updatedYOC)	// update YOC to be one year newer
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Year of Roof_RoofConstructionYear_1'), updatedYOC)	// update roof year to be one year newer


WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Rate and Continue'))	// click Rate and Continue on QQ
WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\county-' + countyFL + "-YOC-" + updatedYOC) + '.jpg')	// take first screenshot
*/
if (stopQQ) {
    System.out.println('quoteNumber = ' + quoteNumber)

    return //System.exit(0)
}

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Rate and Continue' // click Rate and Continue on QQ for first time
        ))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Proceed to Application' // on QQ Rating page
        ))

//WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Proceed to Application'))
WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Paperless Document Delivery_NOSAVEPaperless'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Occupation'), 'EMPLOYED', true)

/*
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Address_PreviousAddress1'), '850 Queen St')

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Address_PreviousAddress2'), 'SUITE 007')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_PreviousCity'), 'Harrisburg')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PreviousState'), 'PA', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_PreviousZip'), '17113')
*/
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Carrier_PriorCarrier_1'), 'travelers')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Expiration Date'), '05/09/2023')

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Policy_PriorPolicyNumber_1'), Keys.chord('544818888', Keys.TAB, Keys.ENTER))
WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Previous Policy_PriorPolicyNumber_1'), '84881516888')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Prequalification'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVE_1' // set all to No
        ))

//WebUI.switchToFrame( findTestObject('Object Repository/FL DP/Page_/iframe_RTR Quotes_MainIS21test', ['index' : 2]), 10)
WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Coverage'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_FloodZone'), 'A', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Flood Insurance Carrier_FloodCarrier_1'), 'free water')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Flood Policy_FloodPolicyNum_1'), '651561651651')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_CentralElectricCentralOilCentralGasC_83a204'), 'ELECTRIC', true)

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Purchase Price_PurchasePrice_1'), '305080')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Number of Rooms_NumRooms_1'), '5')
WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Asbestos ClapboardConcrete BlockCoqu_f829bb'), 'CONCRETEBLOCK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_ExcellentAbove AverageAveragePoor'), 'ABOVEAVERAGE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_ClosedOpen'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_BasementConcrete SlabMonolithic Slab_1e5bf3'), 'BASEMENT', true)

//WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Market Value_MarketValue_1'), '300000')
// try to click subdivision NO, 4.14.23. should not be displaying always, but currently is 
try {
    WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_SubDivision'))
}
catch (def e) {
    System.out.println('error for some reason  ' + e)
} 

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Wiring Year Completed_LastElectricalUpdate_1'), '2018')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Roof Year Completed_LastRoofUpdate_1'), '2019')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Plumbing Year completed_LastPlumbingUpdate_1'), '2020')

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Heating system year completed_LastHea_8ccefb'), '2021')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_History'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/body_Policy Prequalification Coverage Gener_128a19'))

WebUI.setText(findTestObject('Object Repository/FL DP/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Interests'))

if (numInterests > 0) {
    WebUI.callTestCase(findTestCase('FL DP/addInterests'), [('numInterests') : numInterests //,
            //('fullName') : fullName,
            //('randomLastName') : randomLastName
        ], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Statements'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEAnyPets1_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVELeadPaint_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEAnyClaims_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEBuiltonStilts_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVEShortSale_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PaymentPlan'), '4PAY', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_PremiumBilledTo'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_RenewalBilledTo'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Display Quote'))

// get Total Premium and Fees
//div[@id='Wrapper-Right-TotalPremiumAndFees']
totalPremium = WebUI.getAttribute(findTestObject('Object Repository/FL DP/Page_/div_TotalPremiumAndFees'), 'innerHTML')
System.out.println('totalPremium = ' + totalPremium)

String premium = totalPremium.toString().substring(1, 10)
System.out.println('premium = ' + premium)
premium = premium.replace(',', '')
System.out.println('premium = ' + premium)
premium = premium.replace('.00', '')
System.out.println('premium = ' + premium)
premium = premium.trim()
System.out.println('premium = ' + premium)

premiumInt = Integer.valueOf(premium)
System.out.println('premiumInt = ' + premiumInt)

//exit(0)

WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_BindSubmitApplication'))

//new paperless radio button
WebUI.click(findTestObject('Object Repository/FL DP/Page_/input_PaperlessDeliveryAcknowledge'))

//select payment method logic
WebUI.callTestCase(findTestCase('FL DP/selectPaymentType'), [('howPayDeposit') : howPayDeposit, 
	('fullName') : fullName,
	('premiumInt') : premiumInt,
	('randomLastName') : randomLastName], 
	FailureHandling.STOP_ON_FAILURE)





if (shouldBind == true) {
    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Bind Application'))

    String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/TX EG HO3/Page_/PolicyID'), 'innerHTML')

    System.out.println('policyNumber = ' + policyNumber //WebUI.closeBrowser()
        // forces last name to be saved for Recurring payments
        )
} else {
    WebUI.comment('shouldBind = ' + shouldBind)

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_GoBackOnePage'))

    WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_GoForwardOnePage'))
}

// pass vars to write the file  9.16.21
WebUI.callTestCase(findTestCase('FL DP/writeFile'), [ //	('policyType') : policyType,
        ('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
        , ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment, ('optionalCoverages') : optionalCoverages, ('numInterests') : numInterests, ('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)

System.out.println('quoteNumber = ' + quoteNumber)

System.out.println('fullName = ' + fullName)

System.out.println('shouldBind = ' + shouldBind)

//WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/select_Credit CardCredit Card with Recurrin_fded8b'), 'MC', true)
/*
if(shouldBind)
{	
	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_Bind Application'))
	
	WebUI.click(findTestObject('Object Repository/FL DP/Page_/button_MORE'))
	
	WebUI.click(findTestObject('Object Repository/FL DP/Page_/div_PolicyID'))
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/FL DP/Page_/div_PolicyNumber'), 0)
}

*/
System.out.println('quoteNumber = ' + quoteNumber)

}
catch(e)
{
	System.out.println('quoteNumber = ' + quoteNumber)
	WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + '-' + quoteNumber) + 'Failure.jpg')
	WebUI.callTestCase(findTestCase('FL DP/writeFile'), [ //	('policyType') : policyType,
		('randomLastName') : randomLastName, ('randomFirstName') : randomFirstName, ('quoteNumber') : quoteNumber, ('todaysDate') : todaysDate, ('totalPremium') : totalPremium //	('policyType') : policyType,
		, ('shouldBind') : shouldBind, ('stateFL') : stateFL, ('isAgent') : isAgent, ('environment') : environment, ('optionalCoverages') : optionalCoverages, ('numInterests') : numInterests, ('todaysTimeStamp') : todaysTimeStamp], FailureHandling.STOP_ON_FAILURE)

}
