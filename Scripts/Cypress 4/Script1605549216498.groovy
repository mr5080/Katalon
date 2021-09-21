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

String fullName
String firstName
String lastName
String randomFirstName
String randomLastName

String addressFL
String cityFL
String stateFL
String zipFL

String addressFLPrior
String cityFLPrior 
String stateFLPrior
String zipFLPrior 

//String fullName

// xpath helpers 
//button[contains(text(),'Add')]
// not used, just playing
//System.out.println('testMap[1] = ' + (testMap[1]))
//System.out.println('testMap[2] = ' + (testMap[2]))
//WebUI.callTestCase(findTestCase('Cypress 4 - WriteFile'), [('policyType') : policyType], FailureHandling.STOP_ON_FAILURE)	// works

WebUI.openBrowser('')

//WebUI.executeJavaScript("document.body.style.zoom='80%'", null)
if (environment == 'TEST') {
    WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')
} else if (environment == 'STAGE') {
    WebUI.navigateToUrl('https://cypressstage.cogisi.com/is/root/logon/index.cfm')
}

System.out.println(realTransunionCreditReport)

System.out.println(realAPlusClaimReport)

System.out.println(manualNameAddress)

if(		realTransunionCreditReport == false  && 		realAPlusClaimReport == false   &&   		manualNameAddress == false)
{
// Read in FL address from excel file, true mean the first line consider as a header.
	Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
	
	// random num between 2 - 500 (first line in excel file is a header)
	int randomFLaddress = 2 + ((Math.random() * ((120 - 2) + 1)) as int)
	
	// override randomness to specifiy address in file to use
	//randomFLaddress = 510 // 105 causes address correction to pop, 130 WEST PALM BEACH CO
	System.out.println(randomFLaddress)

		
	int randomFLaddressPrior = 2 + ((Math.random() * ((120 - 2) + 1)) as int)
	
	System.out.println(randomFLaddressPrior)
	
	// Risk Adddress
	// minus 1 because first line is header in excel file
	addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()
	
	cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()
	
	stateFL = addressData.getValue(3, randomFLaddress - 1).toUpperCase()
	
	zipFL = addressData.getValue(4, randomFLaddress - 1)
	
	// Prior Address, only used if Year Construction < 3 from current year
	addressFLPrior = addressData.getValue(1, randomFLaddressPrior - 1).toUpperCase()
	
	cityFLPrior = addressData.getValue(2, randomFLaddressPrior - 1).toUpperCase()
	
	stateFLPrior = addressData.getValue(3, randomFLaddressPrior - 1).toUpperCase()
	
	zipFLPrior = addressData.getValue(4, randomFLaddressPrior - 1)
	
	Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
	
	int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
	
	System.out.println(randomFirstNameRow)
	
	 randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
	
	System.out.println('randomFirstName  =====    ' + randomFirstName)
	
	 randomFirstNameForInterest = firstNameData.getValue(1, randomFirstNameRow - 1)
	
	randomFirstName = randomFirstName.replaceAll('[\\d.]', '')
	
	randomFirstNameForInterest = randomFirstNameForInterest.replaceAll('[\\d.]', '')
	
	System.out.println((((((addressFLPrior + ' ') + cityFLPrior) + ' ') + stateFLPrior) + ' ') + zipFLPrior)
	
	// Last name from excel file
	Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
	
	int randomLastNameRow = 1 + ((Math.random() * ((800 - 1) + 1)) as int)
	
	//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
	 randomLastName = lastNameData.getValue(1, randomLastNameRow)
	
	// removes any numbers from last name
	randomLastName = randomLastName.replaceAll('[\\d.]', '')

} // end if
//System.out.println((((((addressFLPrior + ' ') + cityFLPrior) + ' ') + stateFLPrior) + ' ') + zipFLPrior)
else
{ 	// need to manually set these for the hardcoded data below
	addressFLPrior = '6035 W Last Chance Ln'.toUpperCase()
	cityFLPrior = 'Dunnellon'.toUpperCase()
	stateFLPrior = 'FL'
	zipFLPrior = 34433

}

// hardcode for claims
if (realAPlusClaimReport) {
    randomFirstName = 'Lillie'.toUpperCase()

    randomLastName = 'Green'.toUpperCase()

    addressFL = '1139 Riverscape St'.toUpperCase()

    cityFL = 'Bradenton'.toUpperCase()

    stateFL = 'FL'

    zipFL = 34208 /* second claim test case
	randomFirstName = ('Corine').toUpperCase()
	randomLastName = ('Green').toUpperCase()
	addressFL = ('1139 Riverscape St').toUpperCase()
	cityFL = ('Bradenton').toUpperCase()
	stateFL = 'FL'
	zipFL = 34208
	*/ 
}

//hardcode for Credit
if (realTransunionCreditReport) {
    randomLastName = 'Kim'.toUpperCase()

    randomFirstName = 'Mirian'.toUpperCase()

    addressFL = '1716 Cherry Ln'.toUpperCase()

    cityFL = 'Lakeland'.toUpperCase()

    stateFL = 'FL'

    zipFL = 33811
}

//hardcode for Address
if (manualNameAddress) {
    randomLastName = 'Sarah'.toUpperCase()

    randomFirstName = 'Critches'.toUpperCase()

    addressFL = '317 Whitehead St'.toUpperCase()

    cityFL = 'Key West'.toUpperCase( // Jacksonville allows sinkhole coverage
        )

    stateFL = 'FL'

    zipFL = 33040
}

//System.out.println((((((addressFLPrior + ' ') + cityFLPrior) + ' ') + stateFLPrior) + ' ') + zipFLPrior)

fullName = (randomFirstName + ' ') + randomLastName

// Gets this Fridays date
LocalDate dt = LocalDate.now()

String thisFridayDate = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))

String yearThisFriday = thisFridayDate.toString().substring(0, 4 // year
    )

String dayThisFriday = thisFridayDate.toString().substring(8, 10 // day
    )

String monthThisFriday = thisFridayDate.toString().substring(5, 7 // month
    )

//System.out.println("Fridays date this week = " + thisFridayDate)
thisFridayDate = ((((monthThisFriday + '/') + dayThisFriday) + '/') + yearThisFriday)

System.out.println('Fridays date this week = ' + thisFridayDate)

// get todays date
mydate = new Date()

System.out.println('myDate = ' + mydate)

todaysDate = mydate.format('MM/dd/yyyy')

System.out.println('todaysDate = ' + todaysDate)

todaysTimeStamp = mydate.format(('MMddyyyy' + '-') + 'HHmm')

System.out.println('todaysTimeStamp = ' + todaysTimeStamp)

currentYear = Integer.parseInt(mydate.format('yyyy'))

System.out.println('currentYear = ' + currentYear)

//WebUI.delay(5)
WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/button_PHPortal-Login'), 15)

// add wait for policy holder portal logic
if (isAgent == true) {
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '10100')
} else {
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), '0')
}

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_USERNAME_userloginname'), 'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), '1w8xCCmEypU3q31XlL176w==')

WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), Keys.chord(Keys.ENTER))

if (realTestUser == true) {
    WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/Select_Agent List'))

    WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/Select_Agent List'), '3184819' // Agent Code
        )
}

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/li_Start a New Quote'))

WebUI.selectOptionByLabel(findTestObject('Cypress 4/Page_/select_StateQQ'), 'FLORIDA', true)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_PolicyType'), policyType, true)

//WebUI.setText(findTestObject('Cypress 4/Page_/input_ApplicantFirstName'), 'JOHN SMITH')
WebUI.setText(findTestObject('Cypress 4/Page_/input_ApplicantFirstName'), randomFirstName.toUpperCase())

WebUI.setText(findTestObject('Cypress 4/Page_/input_ApplicantLastName'), randomLastName.toUpperCase())

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2'), 'what is going on?')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1'), addressFL)

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_ApplicantCity_StartQuote'), cityFL)

//WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1'), Keys.chord(Keys.TAB))
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'))

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), '34698')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), zipFL)

WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(Keys.TAB))

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord('Text String', Keys.TAB))
//check value of city dropdown with what is in cityFL
//WebUI.delay(5)
/*
int totalCitiesAvailable = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Cypress 4/Page_/select_City List'))

System.out.println('totalCitiesAvailable = ' + totalCitiesAvailable)

// if totalCitiesAvailable > 1, need to iterate through list to make sure it matches cityFL
//WebUI.delay(3)
int cityCount = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Cypress 4/Page_/select_City List'))

System.out.println('cityCount = ' + cityCount)

for (int i = 0; i < cityCount; i++) {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/select_City List'), i)

    String selectedOption = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/select_City List'), 'value').toUpperCase( // outputs dropdown label
        )

    if (selectedOption == cityFL) {
        System.out.println((('selectedOption = ' + selectedOption) + ' and cityFL = ') + cityFL)

        break
    }
    
    System.out.println('selectedOption  = ' + selectedOption)
}
*/
//WebUI.switchToFrame( findTestObject('Cypress 4/Page_/iframe_RTR Quotes_MainIS21test', ['index' : 2]), 10)
// go back to try catch? even need this??? seems to be automatically accpeted?
/*
try {
    // cant access any test object after accepting alert
	WebUI.delay(5)
	WebUI.acceptAlert()
    System.out.println('Accept address validation has been accepted')
}
catch (Exception e) {
    System.out.println('Exception - ' + e)
} 
*/
//WebUI.delay(5)
// seems to be working, if it is can remove the try/catch above - 12/18/20
// USPS validation removed from Start a new Quote screen 4/23/21
// geocode modal
//WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'), 5)
//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'))
//WebUI.waitForElementClickable(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'), 5)
if (WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'), 10)) {
    WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/button_Geocode Now'))
}

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

//WebUI.click(findTestObject('Cypress 4/Page_/td_GeoCodeSuccessful'))
'Accept address validation'
String geoCodeStatus = ''

/*
 // keep this for references, hard to figure this stuff out
junk  = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 'innerHTML')
junk2 = WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 'innerHTML', 15)
junk3 = WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 'id', 15)
junk4 = WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 15)
System.out.println('junk = ' + junk )
System.out.println('junk2 = ' + junk2 )
System.out.println('junk3 = ' + junk3 )
System.out.println('junk4 = ' + junk4 )
*/
//if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 30))
if (WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 30)) {
    //quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress3/Page_/div_Quote Number 630'), 'innerHTML')
    geoCodeStatus = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 'innerHTML')

    geoCodeStatusTest = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_GeoCodeSuccessful'), 'baseURI')

    System.out.println('geoCodeStatusTest = ' + geoCodeStatusTest)
} else {
    System.out.println((('need to delete row ' + randomFLaddress) + ' and address = ') + addressFL)
}

'Quick Quote button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Quick Quote'))

if (WebUI.waitForElementPresent(findTestObject('Cypress 4/Page_/div_Quote Number'), 40)) // works!
{
    quoteNumber = WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Quote Number'), 'innerHTML')

    System.out.println('quoteNumber = ' + quoteNumber)
}

'Accpet FDRC modal'
try {
    // need to figure this out    
    WebUI.click(findTestObject('Cypress 4/Page_/button_Accept'))
}
catch (Exception e) {
    System.out.println('FDRC already accepted today')
} 

System.out.println('"$isAgent" = ' + isAgent)

'Agent Producer'
if ((isAgent == false) && (realTestUser == false)) {
    WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))

    // wait for dynamic table to populate?
    WebUI.delay(1)

    for (int x = 0; x < 5; x++) {
        try {
            WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), '')

            WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'TEST ')

            WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'AGENCY ')

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

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Producer'), '10100_JHUGHES', false) 	// Selecting a Producer no longer needed 12/2/20
// 
//need to click somewhere to get rid of the datepicker popup.
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), '11/16/2020')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), thisFridayDate // no longer needed since Effective date is now being set to todays date (11/16/20)
    )

//WebUI.delay(10)
// calculates a DOB that is at least 18 years old and fills in the DOB field
int thisYear = Calendar.getInstance().get(Calendar.YEAR) - 19 // this year minus 19 to prevent under 18 year old DOB dates

Random random = new Random()

int minDay = ((LocalDate.of(1950, 1, 1).toEpochDay()) as int)

int maxDay = ((LocalDate.of(thisYear, 1, 1).toEpochDay()) as int)

//for(int x = 0; x < 100; x++)
//{
long randomDay = minDay + random.nextInt(maxDay - minDay)

LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay)

String year = randomBirthDate.toString().substring(0, 4)

String day = randomBirthDate.toString().substring(8, 10)

String month = randomBirthDate.toString().substring(5, 7)

String DOB = (((month + '/') + day) + '/') + year

//System.out.println("users generated DOB = " + DOB)
//System.out.println("Random Date = " + randomBirthDate);
//}
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-555-' + year)

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Email Address_ApplicantEmailzzzz1'), ('testing' + year) + '@gmail.com')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '01/08/1978')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), DOB)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Profession'), 'EMPLOYED', true)

// set purcahse date = todays date
System.out.println('trying to set purcahse date to  = ' + todaysDate)

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), todaysDate)
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), '01/01/2018')

System.out.println('should have set purcahse date to  = ' + todaysDate)

//WebUI.delay(7)
//Construction Year - use DOB year if the input box is blank
//System.out.println("HERE ")
String constructionYear = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), 'value')

System.out.println('constructionYear  = ' + constructionYear)

System.out.println('constructionYear.length()  = ' + constructionYear.length())

int constructionYearInt = 0

if (constructionYear.length() > 1) {
    System.out.println('in the if')

    constructionYearInt = Integer.valueOf(constructionYear)

    System.out.println('constructionYearInt - IF == ' + constructionYearInt // (constructionYearInt == '')
        )

    System.out.println('constructionYear.toInteger() = ' + constructionYear.toInteger())

    System.out.println(('constructionYear.toInteger() - 1= ' + constructionYear.toInteger()) - 1)

    //constructionYear.toInteger() < 2010
    if (constructionYear.toInteger() < 2015) {
        constructionYear = 2015

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), constructionYear)

        WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), Keys.chord(Keys.TAB))

        if (policyType == 'HO3') // maybe the popup is only for HO3
        {
            WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - ConstructionYearPopup'))
        }
        
        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), constructionYear)

        System.out.println('constructionYear and roof year reset to ' + constructionYear)
    }
}

// this logic changed week of 3/19/21 should probably update the prior address logic?
if ((currentYear - constructionYearInt) <= 300) //need to fill in Prior Mailing Address  300 force Prior mailing address, else should be 3
{
    int randomNumber = 0

    // generates random number, either 0 or 1, used to randomize US/international
    randomNumber = ((Math.random() * 2) as int)

    randomNumber = 1 // force International or not. 0 = US, 1 = International

    System.out.println('need to fill in prior mailing address stuff')

    if (randomNumber == 0) // fill out US prior mailing address
    {
        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), addressFLPrior)

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_City_ApplicantCity - Prior Mailing Address'), cityFLPrior)

        WebUI.selectOptionByLabel(findTestObject('Cypress 4/Page_/select_State - Prior Mailing Address'), stateFLPrior, false)

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Zip - Prior Mailing Address'), zipFLPrior //
            // outputs dropdown label
            // street adddress
            // city, province, zip,  PreviousAddress2
            // country name
            )
    } else {
        WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 1)

        String selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 'value')

        System.out.println('selectedAddressType = ' + selectedAddressType)

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), '9584 saint international st')

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CityProvinceZip - International'), 'Deiging, Beiengly, 8944851')

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Country - International'), 'China')
    }
}

// need to click somewhere to get rid of the datepicker popup.
//WebUI.click(findTestObject('Cypress 4/Page_/input_PriorInsurance'))
//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Prior Insurance_NOSAVEPriorInsurance_1'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/input_Prior Insurance_NOSAVEPriorInsurance_1'), 'Y', true)

//this line can be removed if 360 is working
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_DwellingLimit-Hack'), '250250')
if (policyType == 'HO6') {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/select_Floor Unit Located On'), 1)

    //WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CovC - HO6'), '245000')  // 360 now ordered on HO6
    WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/select_Usage'), 1)
}

if (WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), 'value') == '') {
    System.out.println('getting in here because construction year was not set, still blank at this point?')

    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), Keys.chord(year, Keys.TAB))

    System.out.println('just clicked into, tabbed out of Construction Year')

    System.out.println('currentYear = ' + currentYear)

    System.out.println('constructionYearInt = ' + constructionYearInt)

    int differenceYears = currentYear - constructionYearInt

    System.out.println('differenceYears = ' + differenceYears)

    // if Construction Year is more than 40 years old, need to dismiss the alert
    if (differenceYears >= 40) {
        try {
            WebUI.delay(1)

            // need to click Close on popup warning if differenceYears > 40
            WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Close button -Modal window'))

            System.out.println('Successfully closed the 40+ year old Construction year ---   currentYear - constructionYearInt ' + (currentYear - constructionYearInt))
        }
        catch (Exception e) {
            System.out.println(e)
        } 
    }
}

//Year of Roof, sets it incase it is blank
String roofYear = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), 'value')

System.out.println('roofYear = ' + roofYear)

if (WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), 'value') == '') {
    if (constructionYear == 2015) {
        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')
    }
    
    // using year for random year
    //WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), year)
    // changed to 2018 due to validation of 'Year of Roof cannot be earlier than Construction Year.'
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), '2020')

    // sets to same as construction year (which is also the same as dob year
    System.out.println('set year')
}

// Square Feet, sets it incase it is blank
String squareFeet = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Square feet_SquareFootage_1'), 'value')

System.out.println('sqaureFeet = ' + squareFeet)

if (WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Square feet_SquareFootage_1'), 'value') == '') {
    // using year for random year
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Square feet_SquareFootage_1'), year)

    System.out.println('set square footage' // sets to same as construction year (which is also the same as dob year)
        )
}

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Construction'), 'B', true)

//WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Roof Construction'), 'ARCHITECTURAL', true)
WebUI.selectOptionByIndex(findTestObject('Cypress 4/Page_/select_Roof Construction'), 2)

if ((isAgent == false) && (realTestUser == false)) {
    // these fields are no longer mandatory
    WebUI.setText(findTestObject('Cypress 4/Page_/input_Responding Fire Department_Responding'), cityFL + ' Fire Department')

    //WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_123456788B910'), '1', true)
    //WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Distance to Fire Hydrant'),    '01', true)
    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_ProtectionClass'), '1', true)
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEBarrierIsland_1'))

// 0 = None, 1 = Edge, 2 = EdgePlus
//for(int xx = 0; xx < 20; xx++)
//{
randomBundle = (((Math.random() * 2) as int) + 1 // generates random number, either 0 or 1 or 2,
)

if (policyType == 'HO6') {
    randomBundle = (randomBundle - 1 // because HO6 only has 1 bundle option
    )
}

System.out.println('randomBundle = ' + randomBundle)

//}
WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/select_Bundle'), randomBundle)

WebUI.setText(findTestObject('Cypress 4/Page_/input_Number of Paid Losses in the Past 3'), '0')

//WebUI.click(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'))
//WebUI.setText(findTestObject('Cypress 4/Page_/input_Number of Paid Losses in the Past 3'), '0')
'Click Rate and Continue button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Rate and Continue'))

'Proceed to Application button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Proceed to Application'))

'Set Current Mailing Address to international address on the Policy screen'
randomNumber = ((Math.random() * 2 // generates random number, either 0 or 1, used to randomize US/international
    ) as int)

randomNumber = 0 // force International or not. 0 = US, 1 = International

System.out.println('randomNumber = ' + randomNumber)

if (randomNumber == 0) // fill out US prior mailing address
{
    /*	//  dont think i need to update Current Mailing address, its automatically populated with Risk Address if its US address
		WebUI.setText(findTestObject('Cypress 4/Page_/input - ApplicantAddress1 - International'), addressFLPrior)
		WebUI.setText(findTestObject('Cypress 4/Page_/input - ApplicantAddress1City - International'), cityFLPrior)
		WebUI.selectOptionByValue( findTestObject('Object Repository/Cypress 4/Page_/select_StateCurrentMailingAddress') , stateFLPrior, false)		
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_ZipCurrentMailingAddress'), zipFLPrior) //
		WebUI.setText( findTestObject('Cypress 4/Page_/input - ApplicantAddress2') , '')  		// set this to blank - //input[@id='ApplicantAddress2']		 
	*/ // fill out International Current Mailing Address
} else {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType - Policy'), 1)

    selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 'value')

    System.out.println('selectedAddressType = ' + selectedAddressType)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - ApplicantAddress1 - International'), 'Piazza Guglielmo Pepe 114')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - ApplicantAddress1City - International'), 'Villa A Roggio, Lucca, 55060')

    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Country - International'), 'China')

    try {
        WebUI.acceptAlert()

        System.out.println('Accept address validation has not been validated, international address')
    }
    catch (Exception e) {
        System.out.println('No addres validation alert')
    } 
}

// needed till fix is implemented on Stage
WebUI.delay(10)

WebUI.setText(findTestObject('Cypress 4/Page_/input_PriorInsurance'), 'Geico')

String randomPolicy = ((Math.random() * 99999) as int)

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_PreviousCarrierExpDate'), todaysDate)

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Previous Policy _PriorPolicyNumber_1'), randomPolicy)

System.out.println('trying to click PreQUALIFICATION BUTTON')

'Prequalification button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Prequalification'))

'Set all to No on Prequalification page'
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVE_1'))

'Coverage button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Coverage'))

String replacementCost360 = '245000.00'

if (policyType == 'HO3') {
    if (WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'), 'innerHTML') != '') {
        System.out.println('replacementCost360 = ' + WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'), 'innerHTML'))

        replacementCost360 = WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'), 'innerHTML' //WebUI.setText(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)        
            // manually set Dwelling Cov A since replacement cost was not returned	        
            )
    } else {
        replacementCost360 = WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)
    }
}

'General button'
WebUI.click(findTestObject('Cypress 4/Page_/input - General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_AttachedDetachedNone'), 'ATTACHED', true)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Garage Door Type'), 'BRACED', true)

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Price_PurchasePrice_1'), '250000')
// divide by 100 to make it a whole number
replacementCost360 = replacementCost360.replaceAll('[^\\d.]', '')

System.out.println('replacementCost360 1 = ' + replacementCost360)

// find lenght of string
int stringLength = replacementCost360.length()

System.out.println('stringLength = ' + stringLength)

replacementCost360 = replacementCost360.substring(0, replacementCost360.indexOf('.'))

//replacementCost360 = replacementCost360.
System.out.println('replacementCost360 2 = ' + replacementCost360)

System.out.println('replacementCost360 = ' + replacementCost360)

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Price_PurchasePrice_1'), replacementCost360)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_NumBathrooms'), '2', true)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Primary Heat System'), 'ELECTRIC', true)

if (policyType == 'HO3') {
    WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_NumStories'), '2', true)

    WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Foundation Type'), 'BASEMENT', true)

    WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_RoofLayers'), '1', true)
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_ClosedOpen'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_YesNo'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Exterior Wall Finish'), 'CONCRETEBLOCK', true)

'History button'
WebUI.click(findTestObject('Cypress 4/Page_/input - History'))

'Interests button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Interests'))

'Add Interest info'
if (addInterest == true) {
    WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/button_InterestAdd'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_TypeOfAdditionalInterest'), 'M', true)

    //WebUI.delay(3)
    //WebUI.setText(findTestObject('Cypress 4/Page_/input - InterestName'), randomFirstNameForInterest + " " + randomLastName)
    WebUI.setText(findTestObject('Cypress 4/Page_/input - InterestName'), '121 FINANCIAL CREDIT UNION')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - InterestAddress'), 'PO BOX 16688')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - InterestCity'), 'Jacksonville')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_InterestState'), 'FL', true)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - InterestZip'), '32245')

    WebUI.sendKeys(findTestObject('Cypress 4/Page_/input - InterestZip'), Keys.chord(Keys.TAB))

    /*	elementPresent = WebUI.waitForAlert(5)
		if (elementPresent == true) {
		alertText = WebUI.getAlertText()
	
		System.out.println('The title of the alert is: \n' + alertText)
	
		WebUI.delay(1)
	
		WebUI.acceptAlert()
	
		System.out.println('Accept address validation has been accepted')
	
		WebUI.switchToDefaultContent()
		 //	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
			
	}
	*/
    /*
	try {
		// cant access any test object after accepting alert
		// WebUI.delay(1)  // not sure if i need this or not? 4/14/21
		WebUI.acceptAlert()
		System.out.println('Accept address validation has been accepted')
	}
	catch (Exception e) {
		System.out.println('Exception - ' + e)
	}
	*/
    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('Cypress 4/Page_/input - InterestLoanNumber'))

    WebUI.sendKeys(findTestObject('Cypress 4/Page_/input - InterestLoanNumber'), '465487894')
}

'Statements button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Statements'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_No_NOSAVEAgentLiabilityExcl1_1'))

'Billing button'
WebUI.click(findTestObject('Cypress 4/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentPlanOption'), payPlanOption, true)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Premium Billed To'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Cypress 4/Page_/select_Renewal Billed To'), 'Applicant1', true)

'Display Quote button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Display Quote'))

// get Total Premium and Fees
//div[@id='Wrapper-Right-TotalPremiumAndFees']
totalPremium = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/div_TotalPremiumAndFees'), 'innerHTML')

System.out.println('totalPremium = ' + totalPremium)

//WebUI.delay(1)
'Bind/Submit Application button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Bind Submit Application'))

//WebUI.delay(30)
//maybe randomize this?
// random number, 1-3 then selectOptionByIndex with random number
// if agent == true, they cant take a check
//if (isAgent == false) 
//{
// generates random number, either 0, 1, 2 used to randomize payment method
randomNumber2 = ((Math.random() * 3) as int)

randomNumber2 = 1		// 1= CC // 3 = recurring EFT

String depositAmount = WebUI.getAttribute(findTestObject('Cypress 4/Page_/td_RequiredDepositAmount'), 'innerHTML')

System.out.println('depositAmount = ' + depositAmount)

depositAmount = depositAmount.replaceAll('[^\\d.]', '')

System.out.println('depositAmount = ' + depositAmount)

if (Double.parseDouble(depositAmount) > 999) // force EFT Recurring since CC cant bind over 1000
{
    randomNumber2 = 3 // force EFT Recurring

    System.out.println('depositAmount to high, changing to EFT = ' + depositAmount)
}

if (randomNumber2 == 0) {
    'Mailed Check'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'MC', false //WebUI.setText(findTestObject('Cypress 4/Page_/input - CheckNumber'), year)
        //WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount )
        //WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), '105.58' )
        // CC window takes forever to open...
        ) //WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
    /*
		 * Can no longer bind over 1000 with CC		 
		//if(Integer.valueOf(depositAmount) > 1000)
		//if(depositAmount.length() >= 7 )
		//if(Integer.parseInt(depositAmount) > 999)
		System.out.println("depositAmount = " + depositAmount)
		//if(depositAmount.toInteger() > 999 )
		if(Double.parseDouble(depositAmount) > 999)
		{// CCC deposits cant be more than 1000
			depositAmount = 100.58
		}
		WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount)
		*/
    //WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NO_ActivateReocurringEFT')) // no longer used
    //WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT-LastName'), randomLastName)
    //WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NO_ActivateReocurringEFT')) // no longer used
    //WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT-LastName'), randomLastName)
} else if (randomNumber2 == 1) {
    'Credit Card'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'P', false)

    WebUI.click(findTestObject('Cypress 4/Page_/input_Collect Credit Card Information'))

    WebUI.delay(5)

    WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 'Visa', false)

    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '4111 1111 1111 1111')

    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Expiration date_NOSAVEEXPDATE'), '12/25')

    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')

    WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_NOSAVEButton'))

    WebUI.waitForElementNotVisible(findTestObject('Object Repository/Cypress 4/Page_/button_CC Modal Window'), 10)
} else if (randomNumber2 == 2) {
    'EFT'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'E', false)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Name'), fullName)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumber'), '031318745')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumberVerify'), '031318745')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account Number'), '8032654815')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account NumberVerify'), '8032654815')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount)
} 
else if (randomNumber2 == 3) {
    'EFT Recurring'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'ER', false)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Name'), fullName)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumber'), '031318745')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumberVerify'), '031318745')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account Number'), '8032654815')

    WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account NumberVerify'), '8032654815')

    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input - EFT RecurringVerifyLastName'), randomLastName)

    WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount)
}

//}
//WebUI.callTestCase(findTestCase('Cypress 4 - WriteFile'), [('policyType') : policyType,   ('payPlanOption') : payPlanOption     ], FailureHandling.STOP_ON_FAILURE)


// pass vars to write the file  9.16.21
WebUI.callTestCase(findTestCase('Cypress 4 - WriteFile'), 
	[('policyType') : policyType,   
	('randomLastName') : randomLastName,
	('randomFirstName') : randomFirstName,
	('quoteNumber') : quoteNumber,
	('todaysDate') : todaysDate,
	('totalPremium') : totalPremium,
	('policyType') : policyType,
	('shouldBind') : shouldBind,
	('todaysTimeStamp') : todaysTimeStamp	
	     ], FailureHandling.STOP_ON_FAILURE)
// vars to pass
/*
randomLastName
randomFirstName
quoteNumber
todaysDate
totalPremium
policyType

*/
// commented out very temporityily 9.16.21 PUT BACK IN ASAP -- heap size error
// write last name, first name to excel file
/*
	FileInputStream file = new FileInputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressAutoQuotes.xlsx'))

	XSSFWorkbook workbook = new XSSFWorkbook(file)

	XSSFSheet sheet = workbook.getSheet('Sheet1')

	//String Data_fromCell = sheet.getRow(0).getCell(0).getStringCellValue()
	//System.out.println(Data_fromCell)
	// count rows currently in the file
	'Read data from excel'
	int rowCount = sheet.getLastRowNum() + 1

	System.out.println('rowCount = ' + rowCount)

	'Write data to excel'
	try
	{
		//  Block of code to try to write to cell
		sheet.createRow(rowCount)

		sheet.getRow(rowCount).createCell(0).setCellValue((randomLastName + ', ') + randomFirstName)

		sheet.getRow(rowCount).createCell(1).setCellValue(randomFirstName)

		sheet.getRow(rowCount).createCell(2).setCellValue(randomLastName)

		sheet.getRow(rowCount).createCell(3).setCellValue(quoteNumber)

		if(shouldBind == false)
		{
			sheet.getRow(rowCount).createCell(4).setCellValue("policy not bound with script")
		}
		else if(shouldBind == true)
		{
			//WebUI.waitForElementNotPresent(findTestObject('Object Repository/Cypress 4/Page_/button_CC Modal Window'), 10)
			WebUI.waitForElementClickable(findTestObject('Cypress 4/Page_/input - Bind Application'), 10)
				
			'Bind Application > button'
			WebUI.click(findTestObject('Cypress 4/Page_/input - Bind Application'))
			
			if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/td_PolicyNumber'), 45)) 
			{
			    WebUI.takeScreenshot(('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp) + '.jpg')
			
			    String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_PolicyNumber'), 'innerHTML')
			
		        sheet.getRow(rowCount).createCell(4).setCellValue(policyNumber)
			}
		}	
	        // removes all chars from string
	        //sheet.getRow(rowCount).createCell(4).setCellValue(quoteNumber.replaceAll('[^\\d.]', ''))
	        sheet.getRow(rowCount).createCell(5).setCellValue(todaysDate)
	
	        policyCreated = new Date()
	
	        System.out.println('myDate = ' + policyCreated)
	
	        sheet.getRow(rowCount).createCell(6).setCellValue(policyCreated)
	
	        sheet.getRow(rowCount).createCell(7).setCellValue(totalPremium)
	
	        sheet.getRow(rowCount).createCell(8).setCellValue(policyType)		   
		    
		    file.close()
		
		    try {
		        FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressAutoQuotes.xlsx'))
		
		        workbook.write(outFile)
		
		        outFile.close()
		    }
		    catch (Exception e) {
		        System.out.println(e)
		
		        WebUI.delay(20)
				// try to write again, file is probably open...
		        FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressAutoQuotes.xlsx'))
		
		        workbook.write(outFile)
		
		        outFile.close()
		    } 
		}
		catch (Exception e) 
		{
			System.out.println(e)
		}
	/*
	 else {
		    System.out.println('in the else, FAILED to find policy number')
		}
	*/
System.out.println('quoteNumber = ' + quoteNumber)

System.out.println('fullName = ' + fullName)

System.out.println('shouldBind = ' + shouldBind)

