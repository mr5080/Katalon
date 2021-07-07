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

WebUI.navigateToUrl('https://www2.webcetera.com/auth/account/login?redirectUrl=https://www2.webcetera.com/EZLynxWeb/welcome.aspx')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx Login/input_Username_Username'), 'cyp_jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx Login/input_Username_Password'), 'CF//N9c6Ljf6S/ILKaMCqg==')

WebUI.sendKeys(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx Login/input_Username_Password'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx Login/input_Username_Password'), 'CF//N9c6Ljf6S/ILKaMCqg==')

WebUI.sendKeys(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx Login/input_Username_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx - Dashboard/span_folder_shared'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_EZLynx - Dashboard/a_Create New Applicant'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Prefix_firstName'), 'rebecca')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_First Name_middleName'), 'L')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Middle Initial_lastName'), 'Curring')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/div_FL_mat-select-arrow ng-tns-c176-18'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_FL'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Address State_postalCode'), '33771')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Nickname_mat-select-placeholder mat-se_2432d8'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Female'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Gender_dateOfBirth'), '09031970')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/div_DOB_mat-select-arrow ng-tns-c176-26'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Single'))

WebUI.sendKeys(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Marital Status_socialSecurityNumber'), '991-91-9991')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Education_mat-select-placeholder mat-s_0673a9'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_HomemakerHouse person'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Years_priorEmployerInYears'), '20')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Address Type_address1'), '1521 donegan road')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Address Line 2_addressCity'), 'largo')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/div_State_mat-select-arrow ng-tns-c176-57'))

///WebUI.sendKeys(, null)
WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Pinellas'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Postal Code Suffix_mat-select-placehol_d41d8e'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_4'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Phone Type_Home_PhoneType-number'), '(717) 565-9854')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Add Email'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/input_Email Type_applicant-email-0-email-address'), '5466464@gmail.com')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_Applicant - Details/span_Go to Home'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_Apply_mat-select-placeholder mat-selec_aa85f6'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_HO3 - Dwelling'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_HO3 - Dwelling_1'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_HO6 - Condo'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_HO6 - Condo_1'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_HO3 - Dwelling'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_Carrier Answers Prefill'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_Cypress Property  Casualty'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Rating/span_Policy Info'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/div_Policy Information_mat-select-arrow-wra_2d8de5'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_AAA'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/input_Prior Carrier_priorPolicyExpirationDate'), '06242021')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_Prior Policy Premium_mat-select-placeh_48ce8d'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_4'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/div_Months_mat-select-arrow ng-tns-c176-165'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_4'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/div_Credit Check and Other Underwriting Rep_fde0df'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/div_--Select--YesNo'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_Yes'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_New Policy Term - 12 Month_mat-select-_b8a0f1'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_No'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Policy Info/span_Dwelling Info'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Home Info_mat-select-placeholder mat-s_c16097'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Primary'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Dwelling Usage_mat-select-placeholder _858d51'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_One Family'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/div_Number of Occupants'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_4'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Number of Occupants_mat-select-placeho_2027ed'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_2'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/input_Number of Stories_squareFootage'), '3350')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/input_Square Footage_yearBuilt'), '2015')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Year Built_mat-select-placeholder mat-_95b973'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Cape Cod'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Construction Style_mat-select-placehol_fbc9e0'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Composition'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Roof Type (main material)_mat-select-p_a77eb9'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Hip'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Roof Shape_mat-select-placeholder mat-_1101f4'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_110'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Wind Speed_mat-select-placeholder mat-_3d6ded'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Basement'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Foundation Type_mat-select-placeholder_b192ac'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Stone Veneer'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/div_of Wood Burning Stoves'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_--Select--'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_of Wood Burning Stoves_mat-select-plac_49273f'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Oil'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/div_Burglar Alarm'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Direct'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Protective Devices_mat-select-placehol_c187e4'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Central'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/div_Sprinkler System'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Partial'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Sprinkler System_mat-select-placeholde_b3a4e6'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Central'))



WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/input_Purchase Price_purchaseDate'), '06242017')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/input_Purchase Date_distanceFromFireStation'), '4')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Distance From Fire Station(miles)_mat-_f50735'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_1-500'))




WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Hydrant Distance is required for ratin_ec0a8d'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_more than 1'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Distance To Brush(miles)_mat-select-pl_46da5d'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_more than 5'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Distance To Tidal Water(miles)_mat-sel_d20f13'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_3'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Coverage'))

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/input_General Coverages_dwelling'), '$255,000')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/input_Dwelling_estReplacementCost'), '$350,000')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/input_Est. Replacement Cost_personalProperty'), '$100,000')

WebUI.setText(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/input_Personal Property (default)_lossOfUse'), '$50,000')

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_Loss Of Use (default)_mat-select-place_c68e62'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_200000'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_Personal Liability_mat-select-placehol_f6c486'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_3000'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_Wind Deductible_mat-select-placeholder_6461a2'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_2500'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_Medical Payments_mat-select-placeholde_cdeceb'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_1'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_All Perils Deductible_mat-select-place_17da21'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_1500'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_Theft Deductible_mat-select-placeholde_3043f9'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_1500'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/div_2500'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_2500'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Coverage/span_Endorsements'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Endorsements/span_Carrier Questions'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Year Updated_mat-select-placeholder ma_35d0b5'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Dwelling Info/span_Not Updated'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Finish/span_Submit To Carriers'))

WebUI.click(findTestObject('Object Repository/EzlynxCypressFL/Page_rebecca L Curring - Finish/span_Submit'))

