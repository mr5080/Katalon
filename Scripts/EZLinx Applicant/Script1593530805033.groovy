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
import java.util.Random as Random
import java.time.LocalDate as LocalDate
import org.apache.commons.lang3.StringUtils as StringUtils
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

/*
for (int loop2 = 0; loop2 < 100; loop2++) 
{
	int randomTXaddressTemp = 2 + ((Math.random() * ((10 - 2) + 1)) as int)
	System.out.println(randomTXaddressTemp)
}
*/
int loopCounter = 1

for (int loop = 0; loop < loopCounter; loop++) {
    WebUI.openBrowser('')

    // First name from excel file
    Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 
        'FirstName', false)

    int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)

    System.out.println(randomFirstNameRow)

    String randomFirstName = firstNameData.getValue(1, randomFirstNameRow)

    randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

    System.out.println(randomFirstName)

    // Last name from excel file
    Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 
        'LastName', false)

    int randomLastNameRow = 1 + ((Math.random() * ((919 - 1) + 1)) as int)

    System.out.println(randomLastNameRow)

    //String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
    String randomLastName = lastNameData.getValue(1, randomLastNameRow)

    // removes any numbers from last name
    randomLastName = randomLastName.replaceAll('[\\d.]', '')

    System.out.println(randomLastName)

    // Read in TX address from excel file, true mean the first line consider as a header.
    Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 
        'TX Addresses', true)

    int randomTXaddress = 2 + ((Math.random() * ((522 - 2) + 1 // random num between 2 - 522 (first line in excel file is a header)
        )) as int)

    System.out.println(randomTXaddress)

    String addressTX = addressData.getValue(1, randomTXaddress - 1 // minus 1 because first line is header in excel file        
        )

    String cityTX = addressData.getValue(2, randomTXaddress - 1)

    String stateTX = addressData.getValue(3, randomTXaddress - 1)

    String zipTX = addressData.getValue(4, randomTXaddress - 1)

    //System.out.println(addressTX + " " + cityTX + " " + stateTX + " " + zipTX)
    /*
// dwelling coverage
for (int i = 0 ; i < 100; i++)
{
	//String dwellingCoverage = 1000 * (10 + (int)(Math.random() * ((300 - 100) + 1)))
	//String dwellingCoverage = 100000 + (int)(Math.random() * ((500000 - 100000) + 1))
	
	String dwellingCoverage = 100 * (1000 + (int)(Math.random() * ((5000 - 1000) + 1)))
	System.out.println(dwellingCoverage )
}*/
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

    //System.out.println("\nNext Friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    //System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
    WebUI.navigateToUrl('https://www2.webcetera.com/EZLynxWeb/login.aspx')

    WebUI.setText(findTestObject('Page_EZLynx Login/input_Username__ctl0MainContentPlaceHoldert_22ec08'), 'ahic_jhughes')

    WebUI.setEncryptedText(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHoldert_f095d5'), 'CF//N9c6Ljf6S/ILKaMCqg==')

    WebUI.click(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'))

    // check to see if user is logged in another browser
    if (WebUI.waitForElementPresent(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'), 
        2)) {
        WebUI.setEncryptedText(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHoldert_f095d5'), 'CF//N9c6Ljf6S/ILKaMCqg==')

        WebUI.click(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'))
    }
    
    WebUI.click(findTestObject('Page_EZLynx - Home Page/span_Directory_icon-applicants'))

    WebUI.click(findTestObject('Page_EZLynx - Home Page/span_Create New Applicant'))

    //WebUI.setText(findTestObject('Page_EZLynx - Create New Applicant/input_First Name_FirstName'), 'Granty')
    //WebUI.setText(findTestObject('Page_EZLynx - Create New Applicant/input_Last Name_LastName'), 'Clarky')/*
    /*
List<String> firstName = new ArrayList()

firstName.addAll(Arrays.asList('John', 'Joe', 'Paul', 'Steve', 'Mary', 'Scott', 'Michael', 'Samantha', 'Jennifer', 'Alecia', 
        'Nate', 'Tom', 'Sarah', 'Jacob', 'Greg', 'Tara', 'Daniel', 'Russ', 'Bunk', 'Roy', 'Woody', 'Debbie'))

List<String> lastName = new ArrayList()

lastName.addAll(Arrays.asList('Carson', 'Walker', 'Becker', 'Garcia', 'Smith', 'Scott', 'Michael', 'Avery', 'Stevens', 'McClean', 
        'Leon', 'Briggs', 'Craft', 'Olsen', 'Pike', 'Wall', 'Gilmore', 'Shields', 'Zilinski', 'Thomas', 'Farmer'))

Random rand = new Random()

int randFirst = rand.nextInt(firstName.size())

int randLast = rand.nextInt(lastName.size())
*/
    'First name'
    WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_First Name_FirstName'), randomFirstName)

    'Last name'
    WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_Last Name_LastName'), randomLastName)

    //WebUI.delay(1)
    // counts number of options in a dropdown
    String numStates = WebUI.getNumberOfTotalOption(findTestObject('Page_EZLynx - Create New Applicant/select_selectAKALARAZCACOCTDCDEFLGAHIIAIDIL_f6685d'))

    System.out.println('numStates = ' + numStates)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Create New Applicant/select_selectAKALARAZCACOCTDCDEFLGAHIIAIDIL_f6685d'), 
        'TX', true)

    int totalOptions2 = WebUI.getNumberOfTotalOption(findTestObject('Page_EZLynx - Create New Applicant/select_selectAd - Mailing CampaignAd - Othe_67b261'))

    System.out.println('totalOptions2 = ' + totalOptions2)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Create New Applicant/select_selectAd - Mailing CampaignAd - Othe_67b261'), 
        '7', true)

    WebUI.click(findTestObject('Page_EZLynx - Create New Applicant/input_Created On_submitCreateApplicant'))

    String sex = WebUI.getNumberOfTotalOption(findTestObject('Page_VU CHARLES - Details/select_selectFemaleMale'))

    //String numStates = WebUI.getNumberOfTotalOption(findTestObject('Page_EZLynx - Create New Applicant/select_selectAKALARAZCACOCTDCDEFLGAHIIAIDIL_f6685d'))
    System.out.println('number of sex dropdown = ' + sex)

    int randomSex = 1 + ((Math.random() * ((2 - 1) + 1)) as int)

    //System.out.println('random Sex = ' + randomSex);
    WebUI.selectOptionByIndex(findTestObject('Page_VU CHARLES - Details/select_selectFemaleMale'), randomSex // gets dropdown by index
        )

    //WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_selectFemaleMale'), 'Female',  true)
    // calculates a DOB that is at least 18 years old and fills in the DOB field
    int thisYear = Calendar.getInstance().get(Calendar.YEAR) - 19 // this year minus 19 to prevent under 18 year old DOB dates

    Random random = new Random()

    int minDay = ((LocalDate.of(1950, 1, 1).toEpochDay()) as int)

    int maxDay = ((LocalDate.of(thisYear, 1, 1).toEpochDay()) as int)

    //for(int x = 0; x < 100; x++)
    //{
    long randomDay = minDay + random.nextInt(maxDay - minDay)

    LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay)

    String year = randomBirthDate.toString().substring(0, 4 // year
        )

    String day = randomBirthDate.toString().substring(8, 10 // day
        )

    String month = randomBirthDate.toString().substring(5, 7 // month
        )

    String DOB = (((month + '/') + day) + '/') + year

    //System.out.println("users generated DOB = " + DOB)
    //System.out.println("Random Date = " + randomBirthDate);
    //}
    'DOB'
    WebUI.setText(findTestObject('Page_VU CHARLES - Details/input_DOB_ApplicantDOB'), DOB)

    WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_selectSingleMarriedDomestic PartnerW_46bdc1'), 
        'Single', true)

    'Industry'
    WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_selectHomemakerHouse personRetiredDi_9a0ba6'), 
        '14', true)

    'Occupation'
    WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_selectAdministrative AssistantAnalys_9c8629'), 
        '183', true)

    WebUI.click(findTestObject('Page_VU CHARLES - Details/input_SSN_ApplicantSSNMasked'))

    // Random number between 1000 and 9999
    String SSNlast4 = 1000 + ((Math.random() * ((10000 - 1000) + 1)) as int)

    'SSN'
    WebUI.setText(findTestObject('Page_VU CHARLES - Details/input_SSN_ApplicantSSNMasked'), '991-91-' + SSNlast4)

    System.out.println('991-91-' + SSNlast4)

    //WebUI.setText(findTestObject('Page_VU CHARLES - Details/input_Unit_ApplicantAddressLine1'), '4223 Gunter St')
    'Address'
    WebUI.setText(findTestObject('Page_VU CHARLES - Details/input_Unit_ApplicantAddressLine1'), addressTX)

    WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_TypeHomeWorkMobileExtension'), 'string:Mobile', 
        true)

    // Random number between 1000 and 9999
    String phoneLast4 = 1000 + ((Math.random() * ((10000 - 1000) + 1)) as int)

    'Phone'
    WebUI.setText(findTestObject('Page_VU CHARLES - Details/input_Phone_ApplicantCellPhone'), '(484) 919' + phoneLast4)

    'City'
    WebUI.setText(findTestObject('Cypress3/Page_/input_City_ApplicantCity'), cityTX)

    //WebUI.setText(findTestObject('Cypress3/Page_/input_City_ApplicantCity'), 'Houston')
    WebUI.click(findTestObject('Page_VU CHARLES - Details/a_Validate'))

    WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_select0123456789101112131415'), '8', true)

    WebUI.selectOptionByValue(findTestObject('Page_VU CHARLES - Details/select_select01234567891011'), '3', true)

    'Continue Popup?'
    WebUI.click(findTestObject('Page_VU CHARLES - Details/input_Contact Time_SubmitButton'))

    WebUI.click(findTestObject('Page_VU CHARLES - Details/input_Quote Template_ctl00ButtonBarPlaceHolderbtnCreate'))

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Rating/select_selectHO3 - DwellingHO4 - RentersHO5_fd57b0'), 
        'HO3', true)

    WebUI.click(findTestObject('Page_EZLynx - Rating/a_Next Policy Info'))

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo'), 'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1'), 'No', true)

    WebUI.setText(findTestObject('Page_EZLynx - Policy Info/input___ctl0_ctl0MainContentPlaceHolderCont_d0d45a'), thisFridayDate)

    WebUI.setText(findTestObject('Page_EZLynx - Policy Info/input___ctl0_ctl0MainContentPlaceHolderCont_e8ec18'), thisFridayDate)

    //WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectOther StandardOther Non-Standa_017f05'), 'NoPriorInsurance', true)
    WebUI.selectOptionByIndex(findTestObject('Page_EZLynx - Policy Info/select_selectOther StandardOther Non-Standa_017f05'), 
        3)

    //WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectFirst Time HomeownerHas Been R_3c5abe'),  'FirstTimeHomeowner', true)
    WebUI.selectOptionByIndex(findTestObject('Page_EZLynx - Policy Info/select_selectFirst Time HomeownerHas Been R_3c5abe'), 
        1)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1_2'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1_2_3'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4_5'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4_5_6'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4_5_6_7'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_YesNo'), 'N', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_NoYes'), '2', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Policy Info/select_No PriorFirst Time OwnerUp to 299999_55ddaa'), 
        'FIRSTTIMEOWNER', true)

    WebUI.click(findTestObject('Page_EZLynx - Policy Info/a_Next Dwelling Info'))

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_select12345678910'), 'Item1', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectYesNo'), 'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_select1-500501-600601-10001001-11001_7e18aa'), 
        'Item1500', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectYesNo_1'), 'Yes', true)

    WebUI.setText(findTestObject('Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_e7020b'), '4')

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectAdobeAluminumVinylBarn PlankBr_339e6c'), 
        'AluminumVinyl', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectARCHITECTURAL SHINGLESASBESTOS_ee58c6'), 
        'ARCHITECTURALSHINGLES', true)

    //WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectClass 1Class 2Class 3Class 4'), 'Class1', true)
    'Roof Class'
    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectOne FamilyTwo FamilyThree Fami_e62975'), 
        'OneFamily', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectApartmentBacksplitBi-LevelBi-L_201987'), 
        'Ranch', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectPrimarySecondarySeasonalFarmUn_fe96d1'), 
        'Primary', true)

    // random year built within the last 6 years 
    'Year built'
    String yearBuilt = Year.now().getValue() - (1 + ((Math.random() * ((6 - 1) + 1)) as int))

    WebUI.setText(findTestObject('Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_bfaf13'), yearBuilt)

    'Purchase Date'
    WebUI.setText(findTestObject('Page_EZLynx - Dwelling Info/input_Purchase Date__ctl0_ctl0MainContentPl_ff6a06'), thisFridayDate)

    //WebUI.setText(findTestObject('Page_EZLynx - Dwelling Info/input_Purchase Date__ctl0_ctl0MainContentPl_ff6a06'), '07/03/2020')
    //WebUI.setText(findTestObject('Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_bfaf13'), '2017')
    //WebUI.click(findTestObject('Page_EZLynx - Dwelling Info/input_Purchase Price__ctl0_ctl0MainContentP_fb23c2'))
    'Square Foot'
    String sqFoot = 100 * (10 + ((Math.random() * ((35 - 10) + 1)) as int))

    WebUI.setText(findTestObject('Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_6af51c'), sqFoot)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_select1152253354Bi-LevelTri-Level'), 'Item1', 
        true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectElectricGasGas - Forced AirGas_b47619'), 
        'Electric', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectYesNo_1_2'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectYesNo_1_2_3'), 'No', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe'), 
        'NOTUPDATED', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe_1'), 
        'NOTUPDATED', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe_1_2'), 
        'NOTUPDATED', true)

    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe_1_2_3'), 
        'NOTUPDATED', true)

    WebUI.click(findTestObject('Page_EZLynx - Dwelling Info/a_Next Coverage'))

    'Dwelling'
    String dwellingCoverage = 100 * (1000 + ((Math.random() * ((5000 - 1000) + 1)) as int))

    WebUI.setText(findTestObject('Page_EZLynx - Coverage/input___ctl0_ctl0MainContentPlaceHolderCont_8ad66e'), dwellingCoverage)

    //WebUI.setText(findTestObject('Page_EZLynx - Coverage/input___ctl0_ctl0MainContentPlaceHolderCont_8ad66e'), '100000')
    'Est Replacement Cost'
    WebUI.setText(findTestObject('Page_EZLynx - Coverage/input___ctl0_ctl0MainContentPlaceHolderCont_c6a6df'), dwellingCoverage)

    //WebUI.setText(findTestObject('Page_EZLynx - Coverage/input___ctl0_ctl0MainContentPlaceHolderCont_c6a6df'), '100000')
    'Personal Liability'
    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Coverage/select_select250005000010000020000030000040_8de23e'), 
        'Item25000', true)

    'Medical Payments'
    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Coverage/select_select10002000300040005000'), 'Item1000', true)

    'All Perils Deductible'
    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Coverage/select_select121100250500750100015002000250_a91b21'), 
        'Item1', true)

    'Deductible 1A Hurricane'
    WebUI.selectOptionByValue(findTestObject('Page_EZLynx - Coverage/select_123510'), '1', true)

    WebUI.click(findTestObject('Page_EZLynx - Coverage/a_Next Endorsements'))

    WebUI.delay(2 // page takes a sec to load sometimes?
        )

    WebUI.click(findTestObject('Page_EZLynx - Endorsements/input_Endorsements__ctl0_ctl0MainContentPla_7b0c60'))

    WebUI.setText(findTestObject('Page_EZLynx - Endorsements/input___ctl0_ctl0MainContentPlaceHolderCont_0a3036'), '15000')

    WebUI.click(findTestObject('Page_EZLynx - Endorsements/input___ctl0_ctl0MainContentPlaceHolderCont_77c8cc'))

    WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/input___ctl0_ctl0MainContentPlaceHolderCont_e7c43f'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Endorsements/select_select2500300040005000'), 
        'Item2500', true)

    WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/input___ctl0_ctl0MainContentPlaceHolderCont_2412c3'))

    WebUI.click(findTestObject('Page_EZLynx - Endorsements/input_State Specific - TX__ctl0_ctl0MainCon_1c5cff'))

    WebUI.click(findTestObject('Page_EZLynx - Endorsements/a_Next Loss Info'))

    WebUI.click(findTestObject('Page_EZLynx - Loss Info/a_Next Carriers'))

    'carriers'
	// 2 = 2% in the dropdown
    WebUI.selectOptionByIndex(findTestObject('Page_EZLynx - Carriers/select_125'), 2)
	//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Carriers/select_125'), '1', true)

    WebUI.click(findTestObject('Page_EZLynx - Carriers/a_Next Finish'))

    WebUI.click(findTestObject('Page_EZLynx - Finish/input_Finish__ctl0_ctl0MainContentPlaceHold_8dc92d'))

    WebUI.click(findTestObject('Page_Submit/input_Instructions__ctl0_ctl0MainContentPla_14bd40'))

    if (WebUI.waitForElementPresent(findTestObject('Object Repository/Page_VU CHARLES - Quote Details/span_Quoted by'), 
        30)) {
        //	WebUI.click(findTestObject('Page_Submit/a_John Hughes (ahic_jhughes)'))
        //	WebUI.click(findTestObject('Page_Submit/a_Logout'))
        String quoteBy = WebUI.getAttribute(findTestObject('Page_VU CHARLES - Quote Details/span_John Hughes of Access Home Insurance Company'), 
            'innerHTML')

        System.out.println('quoteBy = ' + quoteBy)

        String quoteNumber = WebUI.getAttribute(findTestObject('Page_VU CHARLES - Quote Details/div_Quote Number 610223'), 
            'innerHTML')

        System.out.println('quoteNumber = ' + quoteNumber)

        //Boolean textPresent = WebUI.verifyTextPresent('Quote Number', false))
        WebUI.click(findTestObject('Page_VU CHARLES - Quote Details/span_John Hughes (ahic_jhughes)'))

        WebUI.click(findTestObject('Page_VU CHARLES - Quote Details/a_Logout'))

        WebUI.closeBrowser()

        System.out.println('found element!')

        // write last name, first name to excel file
        FileInputStream file = new FileInputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\TestFile.xlsx'))

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

            sheet.getRow(rowCount).createCell(3).setCellValue(quoteNumber.replaceAll('[^\\d.]', '' // removes all chars from string		
                    ))
        }
        catch (Exception e) {
            //  Block of code to handle errors
            //sheet.createRow(rowCount);	//create new row
            //sheet.getRow(rowCount).createCell(0).setCellValue('catchRebecca')
            System.out.println(e)
        } 
        
        file.close()

        try {
            FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\TestFile.xlsx'))

            workbook.write(outFile)

            outFile.close()
        }
        catch (Exception e) {
            System.out.println(e)

            WebUI.delay(10)

            FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\TestFile.xlsx'))

            workbook.write(outFile)

            outFile.close()
        } 
    } else {
        System.out.println('failed to find element')
    }
    
    System.out.println('loopCounter = ' + loopCounter // end of the for loop
        )
}

