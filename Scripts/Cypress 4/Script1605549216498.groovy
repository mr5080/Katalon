import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
for(int z = 0; z < 100; z++)
{
	randomNumber = ((Math.random() * 3) as int) // generates random number, either 0, 1, 2 used to randomize payment method
	System.out.println('randomNumber = ' + randomNumber )
}
*/
//import com.kms.katalon.core.webui.common.WebUiCommonHelper
//import com.sun.org.apache.bcel.internal.generic.Select
// Get random address
// Read in FL address from excel file, true mean the first line consider as a header.
Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'FL Addresses', true)

// random num between 2 - 120 (first line in excel file is a header)
int randomFLaddress = 2 + ((Math.random() * ((130 - 2) + 1 // 612 = number addresses in excel file
    )) as int)

int randomFLaddressPrior = 2 + ((Math.random() * ((130 - 2) + 1 // 612 = number addresses in excel file
    )) as int)

System.out.println(randomFLaddress)



// Risk Adddress
// minus 1 because first line is header in excel file
String addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()

String cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()

String stateFL = addressData.getValue(3, randomFLaddress - 1).toUpperCase()

String zipFL = addressData.getValue(4, randomFLaddress - 1)

System.out.println((((((addressFL + ' ') + cityFL) + ' ') + stateFL) + ' ') + zipFL)

// Prior Address, only used if Year Construction < 3 from current year
String addressFLPrior = addressData.getValue(1, randomFLaddressPrior - 1).toUpperCase()

String cityFLPrior = addressData.getValue(2, randomFLaddressPrior - 1).toUpperCase()

String stateFLPrior = addressData.getValue(3, randomFLaddressPrior - 1).toUpperCase()

String zipFLPrior = addressData.getValue(4, randomFLaddressPrior - 1)

System.out.println((((((addressFLPrior + ' ') + cityFLPrior) + ' ') + stateFLPrior) + ' ') + zipFLPrior)

Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'FirstName', false)

int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)

System.out.println(randomFirstNameRow)

String randomFirstName = firstNameData.getValue(1, randomFirstNameRow)

randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

System.out.println(randomFirstName)

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'LastName', false)

int randomLastNameRow = 1 + ((Math.random() * ((900 - 1) + 1)) as int)

System.out.println(randomLastNameRow)

//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
String randomLastName = lastNameData.getValue(1, randomLastNameRow)

// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')

System.out.println(randomLastName)

String fullName = (randomFirstName + ' ') + randomLastName

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

currentYear = Integer.parseInt(mydate.format('yyyy'))

System.out.println('currentYear = ' + currentYear)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_USERNAME_userloginname'), 
    'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.sendKeys(findTestObject('Object Repository/Cypress 4/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), Keys.chord(Keys.ENTER))


WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/li_Start a New Quote'))


'Internal vs Agent, agent = true, false = internal '
// Change to agent
Boolean agent = false
System.out.println('agent = ' + agent)
if(agent == true)
{
	WebUI.selectOptionByLabel( findTestObject('Object Repository/Cypress 4/Page_/select_Running As'), '10100 - JHUGHES', false)
	System.out.println('should have set to agent 10100 - JHUGHES' )
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_CondoHO3 (EG)Homeowners'), 'HO3', true)

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'))

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), '34698')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), zipFL)

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord('Text String', Keys.TAB))
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Name_ApplicantName'), 'Charles Manson')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Name_ApplicantName'), fullName.toUpperCase())

//check value of city dropdown with what is in cityFL
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

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1'), addressFL)

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input__ApplicantAddress2'))

// go back to try catch? even need this??? seems to be automatically accpeted?
try {
    WebUI.acceptAlert()

    System.out.println('Accept address validation has been accepted')
}
catch (Exception e) {
    System.out.println('No addres validation alert')
} 

/*
try{
	if(WebUI.verifyAlertPresent(10)) 	   
	
	{
		WebUI.acceptAlert()
		System.out.println('Accept address validation has been accepted' )
	}	
}
catch (Exception e) {
    System.out.println('No addres validation alert')
} */
//WebUI.delay(30)
//WebUI.click(findTestObject('Cypress 4/Page_/td_GeoCodeSuccessful'))
'Accept address validation'
String geoCodeStatus = ''

//  if( WebUI.waitForElementVisible(findTestObject('Cypress 4/Page_/td_GeoCodeSuccessful'), 30))
if (WebUI.waitForElementPresent(findTestObject('Cypress 4/Page_/td_GeoCodeSuccessful'), 30))  
{
    //quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress3/Page_/div_Quote Number 630'), 'innerHTML')
    geoCodeStatus = WebUI.getAttribute(findTestObject('Cypress 4/Page_/td_GeoCodeSuccessful'), 'innerHTML')

    System.out.println('geoCodeStatus = ' + geoCodeStatus)
} else {
    System.out.println('geoCodeStatus = ' + geoCodeStatus)

    System.out.println((('need to delete row ' + randomFLaddress) + ' and address = ') + addressFL)
}

'Quick Quote button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Quick Quote'))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/div_Quote Number 1687'), 40)) // works!
{
    quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/div_Quote Number 1687'), 'innerHTML')

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


'Agent Producer'
if(agent == false)
{
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Agent Lookup'))
	
	WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_SearchTerm'), 'test')
	
	// wait for dynamic table to populate?
	WebUI.delay(1)	
	WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/td_SearchForAgent'))
}
//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Producer'), '10100_JHUGHES', false) 	// Selecting a Producer no longer needed 12/2/20
// 
//need to click somewhere to get rid of the datepicker popup.
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), '11/16/2020')
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), thisFridayDate)	 // no longer needed since Effective date is now being set to todays date (11/16/20)
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

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Email Address_ApplicantEmailzzzz1'), ('testing' + 
    year) + '@gmail.com')

//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '01/08/1978')
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), DOB)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_EmployedHomemakerRetiredSelf Employe_88e90c'), 
    'EMPLOYED', true)

// set purcahse date = todays date
System.out.println('trying to set purcahse date to  = ' + todaysDate)

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Purchase Date_PurchaseDate_1'), todaysDate)

System.out.println('should have set purcahse date to  = ' + todaysDate)

//WebUI.delay(7)
//Construction Year - use DOB year if the input box is blank
//System.out.println("HERE ")
String constructionYear = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), 
    'value')

System.out.println('constructionYear  = ' + constructionYear)

System.out.println('constructionYear.length()  = ' + constructionYear.length())

int constructionYearInt = 0

System.out.println('constructionYear.length() SECOND  = ' + constructionYear.length())

if (constructionYear.length() > 1) {
    System.out.println('in the if')

    constructionYearInt = Integer.valueOf(constructionYear)

    System.out.println('constructionYearInt - IF == ' + constructionYearInt) // (constructionYearInt == '')
} else {
    System.out.println('in the else')

    constructionYearInt = Integer.valueOf(year)

    System.out.println('constructionYearInt  - ELSE == ' + constructionYearInt)
}

System.out.println('constructionYearInt == ' + constructionYearInt)

if ((currentYear - constructionYearInt) <= 3) //need to fill in Prior Mailing Address  300 force Prior mailing address, else should be 3
{
    int randomNumber = 0

    //for(x = 0; x<100; x++)
    //{
    randomNumber = ((Math.random() * 2) as int) // generates random number, either 0 or 1, used to randomize US/international

    //randomNumber = 1	// force International or not. 0 = US, 1 = International		
    System.out.println('randomNumber = ' + randomNumber)

    //randomNumber = 1 // force to be international
    //}
    System.out.println('need to fill in prior mailing address stuff')

    if (randomNumber == 0) // fill out US prior mailing address
    {
        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), 
            addressFLPrior)

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_City_ApplicantCity - Prior Mailing Address'), 
            cityFLPrior)

        WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_ALASKAALABAMAARKANSASARIZONACALIFORN_001ed4 - Prior Mailing Address'), 
            stateFLPrior, false)

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Zip - Prior Mailing Address'), zipFLPrior) //
        // outputs dropdown label
        // street adddress
        // city, province, zip,  PreviousAddress2
        // country name
    } 
	else 
	{
        WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 1)

        String selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'), 
            'value')

        System.out.println('selectedAddressType = ' + selectedAddressType)

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress1 - Prior Mailing Address'), 
            '9584 saint international st')

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CityProvinceZip - International'), 'Deiging, Beiengly, 100034')

        WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Country - International'), 'China')
    }
}

// need to click somewhere to get rid of the datepicker popup.
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Previous Carrier_PriorCarrier_1'))

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Prior Insurance_NOSAVEPriorInsurance_1'))

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Previous Carrier_PriorCarrier_1'), 'Geico')

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Previous Policy _PriorPolicyNumber_1'), '9876543210')

/* this was used for faking out the Construction Year logic to test the 40+ Construction Year, can probably be removed
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), Keys.chord('1900', Keys.TAB))  // delete it, not needed, just forces construction year
//WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input - Close button -Modal window'))

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), '')
year = 1905
constructionYearInt = 1950
*/
if (WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), 'value') == 
'') {
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Construction Year_ConstructionYear_1'), Keys.chord(
            year, Keys.TAB) /// this is good
        )

    System.out.println('set Construction Year')

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

            System.out.println('Successfully closed the 40+ year old Construction year ---   currentYear - constructionYearInt ' + 
                (currentYear - constructionYearInt))
        }
        catch (Exception e) {
            System.out.println(e)
        } 
    } // need to click off Construction Year input box , dont think i need this since tabbing off it?
    //WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Previous Carrier_PriorCarrier_1'))	
}

//Year of Roof, sets it incase it is blank
String roofYear = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), 
    'value')

System.out.println('roofYear = ' + roofYear)

if (WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), 'value') == 
'') {
    // using year for random year
    //WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), year)
    // changed to 2018 due to validation of 'Year of Roof cannot be earlier than Construction Year.'
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Year of Roof_RoofConstructionYear_1'), '2020')

    System.out.println('set year' // sets to same as construction year (which is also the same as dob year)
        )
}

// Square Feet, sets it incase it is blank
String squareFeet = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Square feet_SquareFootage_1'), 
    'value')

System.out.println('sqaureFeet = ' + squareFeet)

if (WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/input_Square feet_SquareFootage_1'), 'value') == 
'') {
    // using year for random year
    WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Square feet_SquareFootage_1'), year)

    System.out.println('set square footage' // sets to same as construction year (which is also the same as dob year)
        )
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_FrameMasonryMasonry VeneerSuperior'), 
    'F', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Architectural ShinglesComposition Sh_144118'), 
    'ARCHITECTURAL', true)

/* these fields are no longer mandatory
WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Responding Fire Department_Responding_eb6df6'), cityFL + 
    ' Fire Department')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_123456788B910'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_ad3f5d'), 
    '01', true)
*/
WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Less than 1000 feetOver 1000 feet'), 
    'LT1000', true)

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVEBarrierIsland_1'))

WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

//WebUI.click(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'))
//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')
WebUI.click(findTestObject('Cypress 4/Page_/input - Rate and Continue'))

'Proceed to Application button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Proceed to Application'))








'Set Current Mailing Address to international address on the Policy screen'


	randomNumber = ((Math.random() * 2) as int) // generates random number, either 0 or 1, used to randomize US/international

//	randomNumber = 0	// force International or not. 0 = US, 1 = International
	System.out.println('randomNumber = ' + randomNumber)

	if (randomNumber == 0) // fill out US prior mailing address
	{
	/*	//  dont think i need to update Current Mailing address, its automatically populated with Risk Address if its US address
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__ApplicantAddress1 - International'), addressFLPrior)
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__ApplicantAddress1City - International'), cityFLPrior)
		WebUI.selectOptionByValue( findTestObject('Object Repository/Cypress 4/Page_/select_StateCurrentMailingAddress') , stateFLPrior, false)		
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_ZipCurrentMailingAddress'), zipFLPrior) //
		WebUI.setText( findTestObject('Object Repository/Cypress 4/Page_/input__ApplicantAddress2') , '')  		// set this to blank - //input[@id='ApplicantAddress2']		 
	*/	
	}
	else  // fill out International Current Mailing Address
	{
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType - Policy')  , 1)
		selectedAddressType = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/Select_AddressType'),	'value')
		System.out.println('selectedAddressType = ' + selectedAddressType)
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__ApplicantAddress1 - International'), 'Piazza Guglielmo Pepe 114')
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__ApplicantAddress1City - International'), 'Villa A Roggio, Lucca, 55060')
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Country - International'), 'China')
		try {
			WebUI.acceptAlert()		
			System.out.println('Accept address validation has not been validated, international address')
		}
		catch (Exception e) {
			System.out.println('No addres validation alert')
		}
	}

'Prequalification button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Prequalification'))

'Set all to No on Prequalification page'
WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NOSAVE_1'))

'Coverage button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Coverage'))

String replacementCost360 = '250000'

if (WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'), 'innerHTML') != 
'') {
    System.out.println('replacementCost360 = ' + WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'), 
            'innerHTML'))

    replacementCost360 = WebUI.getAttribute(findTestObject('Cypress 4/Page_/div_Suggested Replacement Cost'), 
        'innerHTML' //WebUI.setText(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)
        )
}

//else		// dont think this is needed since its set above
//	replacementCost360 = WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), 'innerHTML')
'General button'
WebUI.click(findTestObject('Cypress 4/Page_/input - General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_AttachedDetachedNone'), 'ATTACHED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_No Garage DoorUnbraceBracedUnknown'), 
    'BRACED', true)

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_1152253354'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_CentralElectricCentralOilCentralGasC_93816b'), 
    'ELECTRIC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_123'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_ClosedOpen'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_BasementConcrete SlabMonolithic Slab_1e5bf3'), 
    'BASEMENT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_YesNo'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_AsbestosConcrete BlockCoquinaHardboa_c37596'), 
    'CONCRETEBLOCK', true)

'History button'
WebUI.click(findTestObject('Cypress 4/Page_/input - History'))

'Interests button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Interests'))

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

WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_No_NOSAVEAgentLiabilityExcl2_1'))

'Display Quote button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Display Quote'))

'Bind Submit Application button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Bind Submit Application'))

'Payment information'
WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Please SelectCHARLES  MANSON'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_Please SelectCHARLES  MANSON_1'), 'Applicant1', true)

//maybe randomize this?
// random number, 1-3 then selectOptionByIndex with random number
// if agent == true, they cant take a check
if(agent == false)
{
	//for(int z = 0; z < 100; z++){
		randomNumber2 = ((Math.random() * 3) as int) // generates random number, either 0, 1, 2 used to randomize payment method
		System.out.println('randomNumber2 = ' + randomNumber2 )
	//}
		
		
	String depositAmount = WebUI.getAttribute( findTestObject('Object Repository/Cypress 4/Page_/td_ExpectedDepositAmount') , 'innerHTML')
	System.out.println('depositAmount = ' + depositAmount)
	depositAmount = depositAmount.replaceAll('[^\\d.]', '')
	
	System.out.println('depositAmount = ' + depositAmount)
	randomNumber2 = 1 // credit card and eft have defects, cant bind with them currently, 12/3/20
	if(randomNumber2 == 0)
	{	
		'Check'
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'Check', false)
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__CheckNumber'), year)
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__DepositAmount'), depositAmount)
	}
	else if(randomNumber2 == 1)
	{
		'Credit Card'
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'Credit Card', false)
		
		WebUI.click(findTestObject('Cypress 4/Page_/input_Collect Credit Card Information'))	// click Enter Credit Card Information button
		WebUI.delay(5)  // CC window takes forever to open...
		//WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 'Visa', false)
		
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '4111 1111 1111 1111')
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Expiration date_NOSAVEEXPDATE'), '12/25')
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')
		WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_NOSAVEButton'))
		// clicking button above should work, but there is a defect in about enter cc info , defect 268
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__DepositAmount'), depositAmount)
	}
	else if(randomNumber2 == 2)
	{
		'EFT'
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'EFT', false)
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__EFT Name'), fullName)
		WebUI.setText(findTestObject('Cypress 4/Page_/input__RoutingNumber') , '031318745')	// york traditions routing number
		WebUI.setText(findTestObject('Cypress 4/Page_/input__RoutingNumberVerify'), '031318745')	// york traditions routing number
		WebUI.setText( findTestObject('Cypress 4/Page_/input__EFT Account Number'), '8032654815')
		WebUI.setText( findTestObject('Cypress 4/Page_/input__EFT Account NumberVerify'), '8032654815')
		//WebUI.setText( findTestObject('Object Repository/Cypress 4/Page_/input__DownPaymentAmount'), '1000')

		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__DepositAmount'), depositAmount)
		
		
		WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_Yes_NO_ActivateReocurringEFT'))
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input__EFT-LastName'), randomLastName)
	}
}
	
//WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/div_Quote Number 1687'))
'Bind Application button'
WebUI.click(findTestObject('Cypress 4/Page_/input - Bind Application'))

//WebUI.rightClick(findTestObject('Cypress 4/Page_/td_PolicyNumber'))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/td_PolicyNumber'), 45))
{
    String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_PolicyNumber'), 'innerHTML')

    System.out.println('policyNumber = ' + policyNumber)

    // write last name, first name to excel file
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
    try {
        //  Block of code to try to write to cell
        sheet.createRow(rowCount //create new row
            )

        sheet.getRow(rowCount).createCell(0).setCellValue((randomLastName + ', ') + randomFirstName)

        sheet.getRow(rowCount).createCell(1).setCellValue(randomFirstName)

        sheet.getRow(rowCount).createCell(2).setCellValue(randomLastName)

        sheet.getRow(rowCount).createCell(3).setCellValue(quoteNumber)

        sheet.getRow(rowCount).createCell(4).setCellValue(policyNumber)

        // removes all chars from string
        //sheet.getRow(rowCount).createCell(4).setCellValue(quoteNumber.replaceAll('[^\\d.]', ''))
        sheet.getRow(rowCount).createCell(5).setCellValue(todaysDate)

        policyCreated = new Date()

        System.out.println('myDate = ' + policyCreated)

        sheet.getRow(rowCount).createCell(6).setCellValue(policyCreated)
    }
    catch (Exception e) {
        //  Block of code to handle errors
        //sheet.createRow(rowCount);	//create new row
        //sheet.getRow(rowCount).createCell(0).setCellValue('catchRebecca')
        System.out.println(e)
    } 
    
    file.close()

    try {
        FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressAutoQuotes.xlsx'))

        workbook.write(outFile)

        outFile.close()
    }
    catch (Exception e) {
        System.out.println(e)

        WebUI.delay(20)

        FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressAutoQuotes.xlsx'))

        workbook.write(outFile)

        outFile.close()
    } 
} else {
    System.out.println('in the else, FAILED to find policy number')
}

WebUI.closeBrowser()