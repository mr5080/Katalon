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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import java.util.Random as Random
import java.time.LocalDate as LocalDate
import org.apache.commons.lang3.StringUtils as StringUtils
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String
import java.lang.Integer as Integer

/*
String purchasePrice = "10.09"

//Double d = Double.parseDouble(quoteNumber)
//System.out.println("d = " + d)

int value = quoteNumber.length()
System.out.println("value = " + value)

if(purchasePrice.contains("."))
{
	
	}
*/
// Get random address
// Read in FL address from excel file, true mean the first line consider as a header.
Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 
    'FL Addresses', true)

// random num between 2 - 100 (first line in excel file is a header)
int randomFLaddress = 2 + ((Math.random() * ((126 - 2) + 1 // 100= number addresses in excel file
    )) as int)

System.out.println(randomFLaddress)

// minus 1 because first line is header in excel file
String addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()

String cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()

String stateFL = addressData.getValue(3, randomFLaddress - 1)

String zipFL = addressData.getValue(4, randomFLaddress - 1)

System.out.println((((((addressFL + ' ') + cityFL) + ' ') + stateFL) + ' ') + zipFL)

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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_TEST DATA cypresstestcogisicom/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_TEST DATA cypresstestcogisicom/input_USERNAME_userloginname'), 
    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Cypress3/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/Cypress3/Page_TEST DATA cypresstestcogisicom/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_CondoHO3 (EG)Homeowners'), 'HO3', true)

//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Property Zip Code_ApplicantZip'), '32254')
WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), zipFL)

WebUI.sendKeys(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Property Zip Code_ApplicantZip'), Keys.chord(
        'Text String', Keys.TAB))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress Obj Repo/Page_/select_ALAFAYAORLANDO'), 'ORLANDO', true)
//WebUI.selectOptionByValue(findTestObject('Cypress3/Page_/input_City_ApplicantCity'), cityFL, true)	// THIS USE TO WORK WHEN ZIP WAS ENTERED  //commented out when city population quit working
'JOHN WORKING HERE'
System.out.println('what is going on ' + cityFL)

//WebUI.setText(findTestObject('Cypress3/Page_/input_City_ApplicantCity'), cityFL)
//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Name_ApplicantName'), 'Eric Green')
WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Name_ApplicantName'), fullName.toUpperCase())

//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Address_ApplicantAddress1'), '3519 Pinecrest St')
WebUI.setText(findTestObject('Object Repository/Cypress Obj Repo/Page_/input_Address_ApplicantAddress1'), addressFL)

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input__ApplicantAddress2'))

//put in when city population quit working
//WebUI.delay(2)
//put in when city population quit working
try {
    'Accpet FDRC modal'
    WebUI.acceptAlert()
}
catch (Exception e) {
    System.out.println('no alert to accept')
} 

'Click Quick Quote'

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input'))

WebUI.delay(30)

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress3/Page_/div_Quote Number 630'), 30)) // works!
{
    quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress3/Page_/div_Quote Number 630'), 'innerHTML')

    System.out.println('quoteNumber = ' + quoteNumber)
}

//WebUI.rightClick(findTestObject('Object Repository/Cypress3/Page_/div_Quote Number 630'))
//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Agency_NOSAVEagentCode'), '10000')
//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_Select optionLYNX comparative rater'),    '10000_EZLYNX', true)
try {
    'Accpet FDRC modal'
    WebUI.click(findTestObject('Cypress3/Page_/button_Accept'))
}
catch (Exception e) {
    System.out.println('FDRC already accepted today')
} 

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/div_Effective Date      Expires one year fr_238ab4'))

//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Effective Date_EffectiveDate'), '10/10/2020')
WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Effective Date_EffectiveDate'), thisFridayDate)

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Expires one year from Effective Date__fea0c9'))

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
'DOB'
WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), DOB)

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Phone_ApplicantHomePhonezzzz1'), '717-555-' + year)

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Email Address_ApplicantEmailzzzz1'), ('testing' + year) + 
    '@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_EmployedHomemakerRetiredSelf Employe_88e90c'), 
    'EMPLOYED', true)

'Prior Insurance'
System.out.println('trying to click Yes to prior insurance')

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Prior Insurance_NOSAVEPriorInsurance_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_FrameMasonryMasonry VeneerSuperior'), 
    'F', true)

'Construction Year??? - set if blank?'
if (WebUI.getText(findTestObject('Object Repository/Testing Modal Accept/input_Construction Year_ConstructionYear_1')) == 
'') {
    WebUI.setText(findTestObject('Object Repository/Testing Modal Accept/input_Construction Year_ConstructionYear_1'), year // using year for random year
        )
}

'Square feet - set if blank?'
if (WebUI.getText(findTestObject('Object Repository/Testing Modal Accept/input_Square feet_SquareFootage_1')) == '') {
    WebUI.setText(findTestObject('Object Repository/Testing Modal Accept/input_Square feet_SquareFootage_1'), year // using DOB for random year
        )
}

'Dwelling Limit- set if blank?'
if (WebUI.getText(findTestObject('Object Repository/Cypress3/Page_/input_Dwelling - Cov A_DwellingLimit_1')) == '') {
    WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Dwelling - Cov A_DwellingLimit_1'), '300000')
}

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Purchase Date_PurchaseDate_1'), thisFridayDate)

// random roof year within the last 6 years
'Roof year'
String roofYear = Year.now().getValue() - (1 + ((Math.random() * ((6 - 1) + 1)) as int))

//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Year of Roof_RoofConstructionYear_1'), '2014')
WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Year of Roof_RoofConstructionYear_1'), roofYear)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_Architectural ShinglesComposition Sh_144118'), 
    'ARCHITECTURAL', true)

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Responding Fire Department_Responding_eb6df6'), cityFL + 
    ' FD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_ad3f5d'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_123456788B910'), '1', true)

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEBarrierIsland_1'))

WebUI.setText(findTestObject('Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

'Rate and continue on Quick quote screen'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

'Proceed to Application button on quote summary screen'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Cypress3/Page_/button_Accept'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress3/Page_/input_Previous Carrier_PriorCarrier_1'), 30)

System.out.println('found previous insurance carrier')

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Previous Carrier_PriorCarrier_1'), 'Geico')

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Previous Expiration Date_PriorExpirat_a5430d'), thisFridayDate)

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Previous Policy _PriorPolicyNumber_1'), '12348548')

'Prequalification button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVE_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEArsonConviction_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQRecVehicles_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEUnrepairedDamage_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEApplicationForeclosures_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEFarmOrRanch_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVENumberofAcres_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVERentedLT5Days_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEHaveWoodStoves_1'))

'Coverage button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

'General button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_CentralElectricCentralOilCentralGasC_93816b'), 
    'ELECTRIC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_AttachedDetachedNone'), 'ATTACHED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_No Garage DoorUnbraceBracedUnknown'), 
    'UNBRACE', true)

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/div_Garage Type AttachedDetachedNone Garage_e9741a'))

//WebUI.rightClick(findTestObject('Object Repository/Cypress3/Page_/div_Suggested Replacement Cost  27005867'))
//WebUI.rightClick(findTestObject('Object Repository/Cypress3/Page_/input_Purchase Price_PurchasePrice_1'))
'Need to get this value and use it to set Purcahse price '

//WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Purchase Price_PurchasePrice_1'), '270000')
// commented out below because 360Value is no longer on General tab, so hard coding for now
//String replacementCost360 = '250000'
//if(WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), 'innerHTML') == "")
//	WebUI.setText(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), replacementCost360)	
//else
//	replacementCost360 = WebUI.getAttribute(findTestObject('Cypress3/Page_/div_Suggested Replacement Cost  27005867'), 'innerHTML')
'replacement cost'
String replacementCost360 = '250000'

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Purchase Price_PurchasePrice_1'), replacementCost360)

//System.out.println("replacementCost360 = " + replacementCost360)
// remove everything but numbers and decimail
replacementCost360 = replacementCost360.replaceAll('[^\\d.]', '')

System.out.println('replacementCost360 = ' + replacementCost360)

// sets purchase price = 360Value price, currently 360Value is broken
WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Purchase Price_PurchasePrice_1'), replacementCost360)

'Bathrooms'
WebUI.selectOptionByValue(findTestObject('Cypress3/Page_/select_1152253354'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_AsbestosConcrete BlockCoquinaHardboa_c37596'), 
    'CONCRETEBLOCK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_ClosedOpen'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_BasementConcrete SlabMonolithic Slab_1e5bf3'), 
    'BASEMENT', true)

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVETransferWithinAgency_1'))

'History button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

'Interest button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/div_Number of Paid Losses in the Past 3 Years'))

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

'Interestes button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

'Statements button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEOccupiedComm_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQEmployees_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQOtherInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEAnyDogs_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEAnyPets3_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQRenovation_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQConverted_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVESwimmingPool_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQDeclineInsurance_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQOwnedByTrust_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQForeclosure_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEGQForSale_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVEOccupiedDayCare_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Yes_NOSAVETrampoline_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_No_NOSAVEAgentLiabilityExcl1_1'))

WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_No_NOSAVEAgentLiabilityExcl2_1'))

'Display Quote button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

'Bind/Submit Application button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_Please SelectERIC  BLUE'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_Please SelectERIC  BLUE_1'), 'Applicant1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress3/Page_/select_CashCheckCredit CardEFTMoney Order'), 
    'H', true)

WebUI.setText(findTestObject('Object Repository/Cypress3/Page_/input__DepositAmount'), '1750')

'Complete button'
WebUI.click(findTestObject('Object Repository/Cypress3/Page_/input_Number of Paid Losses in the Past 3 Y_2ae410'))

//WebUI.rightClick(findTestObject('Object Repository/Cypress3/Page_/a_IFH6300043-00'))
//if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress3/Page_/a_IFH6300043-00'),	30))			// works!
if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress3/Page_/a_IFH6300043-00'), 30)) // works!
{
    String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress3/Page_/a_IFH6300043-00'), 'innerHTML')

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

        sheet.getRow(rowCount).createCell(4).setCellValue(policyNumber // removes all chars from string
            //sheet.getRow(rowCount).createCell(4).setCellValue(quoteNumber.replaceAll('[^\\d.]', ''))
            )
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

        WebUI.delay(10)

        FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressAutoQuotes.xlsx'))

        workbook.write(outFile)

        outFile.close()
    } 
} else {
    System.out.println('in the else, FAILED to find policy number')
}

