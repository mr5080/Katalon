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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www2.webcetera.com/EZLynxWeb/login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_EZLynx Login/input_Username__ctl0MainContentPlaceHoldert_22ec08'), 
    'ahic_jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_EZLynx Login/input_Password__ctl0MainContentPlaceHoldert_f095d5'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'))

/*
// check for existing login message and tries to log them in again, having issues click the Continue button, commented out below
if (WebUI.getText(findTestObject('Object Repository/Page_EZLynx Login/span_We were unable to log you in because y_df955d'))) {
	WebUI.setEncryptedText(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHoldert_f095d5'), '1w8xCCmEypU3q31XlL176w==')
		
	//WebUI.click(findTestObject('Page_EZLynx Login/input_Password__ctl0MainContentPlaceHolderb_c3368c'))
}
*/
WebUI.click(findTestObject('Object Repository/Page_EZLynx - Home Page/span_Directory_icon-applicants'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Home Page/span_Create New Applicant'))

//WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_First Name_FirstName'), 'bob')
//WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_Last Name_LastName'), 'smith')
List<String> firstName = new ArrayList()

firstName.addAll(Arrays.asList('John', 'Joe', 'Paul', 'Steve', 'Mary', 'Scott', 'Michael', 'Samantha', 'Jennifer', 'Alecia', 
        'Nate', 'Tom'))

List<String> lastName = new ArrayList()

lastName.addAll(Arrays.asList('Carson', 'Walker', 'Becker', 'Garcia', 'Smith', 'Scott', 'Michael', 'Avery', 'Stevens', 'McClean', 
        'Leon', 'Briggs'))

Random rand = new Random()

int randFirst = rand.nextInt(firstName.size())

int randLast = rand.nextInt(lastName.size())

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_First Name_FirstName'), firstName.get(
        randFirst))

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_Last Name_LastName'), lastName.get(
        randLast))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/select_selectAKALARAZCACOCTDCDEFLGAHIIAIDIL_f6685d'), 
    'TX', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/select_selectAd - Mailing CampaignAd - Othe_67b261'), 
    '11', true)

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Create New Applicant/input_Created On_submitCreateApplicant'))
// deleted object bob smith
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_smith bob - Details/select_selectFemaleMale'), 'Female', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_smith bob - Details/input_DOB_ApplicantDOB'), '05/05/2000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_smith bob - Details/select_selectHomemakerHouse personRetiredDi_9a0ba6'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_smith bob - Details/select_selectActuaryAdministrative Assistan_ad483e'), 
    '140', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_smith bob - Details/select_selectSingleMarriedDomestic PartnerW_46bdc1'), 
    'Single', true)

//WebUI.click(findTestObject('Object Repository/Page_smith bob - Details/input_SSN_ApplicantSSNMasked'))
WebUI.click(findTestObject('Object Repository/Page_smith bob - Details/input_SSN_ApplicantSSNMasked'))

WebUI.setText(findTestObject('Object Repository/Page_smith bob - Details/input_SSN_ApplicantSSNMasked'), '991-91-0000')

WebUI.setText(findTestObject('Object Repository/Page_smith bob - Details/input_Unit_ApplicantAddressLine1'), '4223 Gunter St')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_smith bob - Details/select_TypeHomeWorkMobileExtension'), 
    'string:Mobile', true)

WebUI.setText(findTestObject('Object Repository/Page_smith bob - Details/input_Phone_ApplicantCellPhone'), '(717) 845-6547')

WebUI.setText(findTestObject('Object Repository/Page_smith bob - Details/input_City_ApplicantCity'), 'Houston')

WebUI.click(findTestObject('Object Repository/Page_smith bob - Details/a_Validate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_smith bob - Details/select_select0123456789101112131415'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_smith bob - Details/input_Contact Time_SubmitButton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Rating/select_selectHO3 - DwellingHO4 - RentersHO5_fd57b0'), 
    'HO3', true)

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Rating/a_Next Policy Info'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1'), 'No', true)

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Policy Info/input___ctl0_ctl0MainContentPlaceHolderCont_d0d45a'), 
    '07/03/2020')

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Policy Info/input___ctl0_ctl0MainContentPlaceHolderCont_e8ec18'), 
    '07/03/2020')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectOther StandardOther Non-Standa_017f05'),  'OtherStandard', true)
WebUI.selectOptionByIndex(findTestObject('Page_EZLynx - Policy Info/select_selectOther StandardOther Non-Standa_017f05'),  3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectFirst Time HomeownerHas Been R_3c5abe'), 'FirstTimeHomeowner', true)
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectFirst Time HomeownerHas Been R_3c5abe'),  1)


WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_select0123456789101112131415More than 15'), 
    'Item5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_select0123456789101112131415More than 15_1'), 
    'Item5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1_2'), 'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1_2_3'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4_5'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4_5_6'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_selectYesNo_1_2_3_4_5_6_7'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_YesNo'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Policy Info/select_No PriorFirst Time OwnerUp to 299999_55ddaa'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Policy Info/a_Next Dwelling Info'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_select12345678910'), 'Item1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectYesNo'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_select1-500501-600601-10001001-11001_7e18aa'), 
    'Item1500', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectYesNo_1'), 'Yes', true)

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_e7020b'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectAdobeAluminumVinylBarn PlankBr_339e6c'), 
    'AluminumVinyl', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectARCHITECTURAL SHINGLESASBESTOS_ee58c6'), 
    'ARCHITECTURALSHINGLES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectClass 1Class 2Class 3Class 4'), 
    'Class1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectOne FamilyTwo FamilyThree Fami_e62975'), 
    'OneFamily', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectApartmentBacksplitBi-LevelBi-L_201987'), 
    'Ranch', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectPrimarySecondarySeasonalFarmUn_fe96d1'), 
    'Primary', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_select0-55-11-22-5more than 5'), 
    'morethan5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_UnknownOtherFlat (Poured Concrete)Hi_c8afdb'), 
    'GABLE', true)

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_bfaf13'), 
    '2016')

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/input_Purchase Price__ctl0_ctl0MainContentP_fb23c2'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/input_Purchase Date__ctl0_ctl0MainContentPl_ff6a06'), 
    '07/03/2020')

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/input___ctl0_ctl0MainContentPlaceHolderCont_6af51c'), 
    '1900')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_select1152253354Bi-LevelTri-Level'), 
    'Item1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectElectricGasGas - Forced AirGas_b47619'), 
    'Electric', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectYesNo_1_2'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectYesNo_1_2_3'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe'), 
    'NOTUPDATED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe_1'), 
    'NOTUPDATED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe_1_2'), 
    'NOTUPDATED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/select_selectNOT UPDATEDPARTIAL UPDATECOMPL_d5a0fe_1_2_3'), 
    'NOTUPDATED', true)

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Dwelling Info/a_Next Coverage'))

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Coverage/input___ctl0_ctl0MainContentPlaceHolderCont_8ad66e'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Coverage/input___ctl0_ctl0MainContentPlaceHolderCont_c6a6df'), 
    '100000')

'Personal Liability'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Coverage/select_select250005000010000020000030000040_8de23e'), 
    'Item25000', true)

'Medical Payments'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Coverage/select_select10002000300040005000'), 
    'Item1000', true)

'All Perils Deductible'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Coverage/select_select121100250500750100015002000250_a91b21'), 
    'Item12', true)

'Theft Deductible'
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Coverage/select_select5001500'), 'Item500', true)

'Wind Hail Deductible'
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Coverage/select_select1002505001000150012345'), 'Item100', true)

'Deductible 1A Hurricane'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Coverage/select_123510'), '1', true)

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Coverage/a_Next Endorsements'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/input_Endorsements__ctl0_ctl0MainContentPla_7b0c60'))

WebUI.setText(findTestObject('Object Repository/Page_EZLynx - Endorsements/input___ctl0_ctl0MainContentPlaceHolderCont_0a3036'), 
    '20000')

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/input___ctl0_ctl0MainContentPlaceHolderCont_77c8cc'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/input_Identity Theft__ctl0_ctl0MainContentP_457558'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EZLynx - Endorsements/select_select100025005000750010000'), 
    'Item5000', true)

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/input_State Specific - TX__ctl0_ctl0MainCon_1c5cff'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Endorsements/a_Next Loss Info'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Loss Info/a_Next Carriers'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Carriers/a_Next Finish'))

WebUI.click(findTestObject('Object Repository/Page_EZLynx - Finish/input_Finish__ctl0_ctl0MainContentPlaceHold_8dc92d'))

WebUI.click(findTestObject('Object Repository/Page_Submit/input_Instructions__ctl0_ctl0MainContentPla_14bd40'))

