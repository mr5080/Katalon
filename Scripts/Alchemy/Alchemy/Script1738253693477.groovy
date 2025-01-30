/*import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
*/

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import java.time.format.DateTimeFormatter
import java.time.LocalDate
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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

RunConfiguration.setWebDriverPreferencesProperty('args', ['--incognito', '--start-maximized', '--disable-infobars', 'enable-automation'])		// takes place instead of Project - Settings - Desired Capabilityes - Web
WebUI.openBrowser('')

WebUI.navigateToUrl('https://alchemytest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_TEST DATA alchemytest.cogisi.com/input_AGENT CODE_userloginid'), '0')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_TEST DATA alchemytest.cogisi.com/input_USERNAME_userloginname'),    'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/Alchemy/Page_TEST DATA alchemytest.cogisi.com/input_PASSWORD_password'), 'iJIOp32ulZH/iAm5HHInmA==')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_TEST DATA alchemytest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/label_Start'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/a_Start a New Quote'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Effective Date_EffectiveDate'), '01/31/2025')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_ALABAMAALASKAARIZONAARKANSASCOLORADO_85901c'), 'AZ', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Location Address_ApplicantAddress1'), '1158 S DORA Ave')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_City_ApplicantCity'), 'YUMA')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Location Zip Code_ApplicantZip'), '85364')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/div_Start a New Quote   Effective DateExpir_dc8146'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_button'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Address_NOSAVESELECTEDBUSINESS_1'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Business Website_BusinessWebsite_1'), 'www.google.com')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Address_ApplicantAddress1_1'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Address_ApplicantAddress2_1'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_City, State, Zip, Zip4_ApplicantCity_1'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_City, State, Zip, Zip4_ApplicantZip_1'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_City, State, Zip, Zip4_ApplicantZip4_1'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Save and Continue'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_SearchForAgent'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '10100')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/div_SelectAgent'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/td_TEST AGENCY'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVESetAll'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Coverages'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Phone Number_ApplicantPhonezzzz1'), '901-116-5145')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Email Address_ApplicantEmailzzzz1'), 'john.hughes@cornerops.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_Limited Liability CorporationCorporation'), 'LLC', true)

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Please choose a name type_NOSAVEAppli_f4d688'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Applicant First Name_NOSAVE-INDApplic_2cbe29'), 'Andrea')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Applicant Middle Name_NOSAVE-INDAppli_24c841'), 'Ann')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Applicant Last Name_NOSAVE-INDApplica_c58ad8'), 'Drivers')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Applicant Suffix_NOSAVE-INDApplicantS_d9ac27'), 'JR')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_United StatesUS TerritoryInternational'),  'domestic', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Location Address_ApplicantAddress1'), '1158 S DORA AVE')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_City_ApplicantCity'), 'YUMA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_StateAKALARAZCACOCTDCDEFLGAHIIAIDILI_28d72e'), 'AZ', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Location Zip Code_ApplicantZip'), '85364')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_DBA Name_DBANamezzzz1'), 'Pottys Pot Shop')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Lightspeed'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_ProtectionClass'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_ProtectionClass'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_7c5769'), 'NA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_1 Mile or LessGreater Than 1 to 2 Mi_7c5769'), 'Greater than 1 to 2 miles', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Responding Fire Department_Responding_eb6df6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_NonePartialComplete'), 'PARTIAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_UngradedNot ApplicableNon-Participan_f398aa'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_UngradedNot ApplicableNon-Participan_f398aa'), '99', true)

WebUI.doubleClick(findTestObject('Object Repository/Alchemy/Page_/input_Electrical Updates_LastElectricalUpdate_1'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Electrical Updates_LastElectricalUpdate_1'), '2021')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Roofing Updates_LastRoofUpdate_1'), '2022')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Plumbing Updates_LastPlumbingUpdate_1'), '2023')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Heating Updates_LastHeatingUpdate_1'), '2024')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_1234'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_Owner Tenant Lessor'), 'OWNER', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Total Square Footage of Building_SqFo_d74970'), '672')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Building Limit_BuildingLimit_1'), '350000')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Business Personal Property_BPPLimit_1'), '250000')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_CBP 40 01_ProductLimit_1'), '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_Actual Loss Sustained25,00050,00075,_540360'), '100000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_1,0002,5005,0007,50010,000'), '1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_1,0002,5005,0007,50010,0001 Deductib_49f380'), '2', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Projected Annual Gross Receipts (Loca_05b23c'), '1000000')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/div_Prior Year Annual Gross Receipts (Locat_858a85'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Prior Year Annual Gross Receipts (Loc_419881'), '250000')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Number of Employees (Location Specifi_54cae5'), '')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Number of Employees (Location Specifi_54cae5'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Number of Employees (Location Specifi_54cae5'), '6')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_IncludedExcluded'), 'Y', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Loss History_PriorClaimCount'), '0')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Rating'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Alchemy/Page_/div_QuoteNumber'), 10)
quoteNumber = WebUI.getAttribute(findTestObject('Object Repository/Alchemy/Page_/div_QuoteNumber'), 'innerHTML')
System.out.println('quoteNumber = ' + quoteNumber)

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_History'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_AdditionalInsureds'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Internal'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Management'), '1.01')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Location_IRPMLocation'), '1.01')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Building Features_BuildingFeatures'), '.99')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Premises And Equipment_PremisesAndEquipment'), '.99')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Employees_Employees'), '1.01')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Protection_Protection'), '1.01')

WebUI.selectOptionByValue(findTestObject('Object Repository/Alchemy/Page_/select_A. Description And Location of Premi_04ed73'),     'A', true)

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_BP 04 01_ExclusionSchedule'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Facultative Reinsurance Premium_Facul_ae8c61'), '0')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Statements'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Date business started_BusinessStartDate'), '01/01/2025')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/div_Date business started'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEClaimOccurrence'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVEAdminViolation'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEDeniedRenewal'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEAnyCooking'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Inspection Contact Name_InspectionCon_c6b3b6'), 'Inspector Special')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Inspection Contact Phone Number_Inspe_cdaca3'), '945-154-5684')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Does the applicant run background che_992fe0'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEEmploysProfessionals'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVEInCompliance'))

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_License Number (list all that apply)__e7cb7b'), '56465165185')

WebUI.setText(findTestObject('Object Repository/Alchemy/Page_/input_Identify the Cannabis Track and Trace_a83420'), '54818154')

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Does applicant provide product traini_77c169'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEHasOnlineProducts'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEShipsCCProducts'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEShipsInterstateCCProducts'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEConsumptionOnsite'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEDoesCultivation'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEExtractionOperations'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Are all cannabis products the applica_e79dfe'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVEHasCOAs'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Security and Protective Safeguards_NO_fd2846'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Yes_NOSAVEHasGuards'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVEHasAllLocAlarms'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVEHasVideo'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVESecureInventory'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_No_NOSAVEHasReinforcedSteel'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Are daily bank deposits made_NOSAVEHa_6a17f5'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/input_Does the applicant vary their time an_708721'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_BindSubmitApplication'))

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_Bind Application'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Alchemy/Page_/a_policyNumberLink'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Alchemy/Page_/div_PolicyNumberText'),10)

WebUI.click(findTestObject('Object Repository/Alchemy/Page_/button_MORE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Alchemy/Page_/policyID'), 10)

System.out.println('quoteNumber = ' + quoteNumber)
policyNumber = WebUI.getAttribute(findTestObject('Object Repository/Alchemy/Page_/div_PolicyNumberText'), 'innerHTML')
System.out.println('policyNumber = ' + policyNumber)

