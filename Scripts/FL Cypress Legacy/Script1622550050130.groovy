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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cypresstest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_TEST DATA cypresstest.cogisi.com/input_AGENT CODE_userloginid'), '0')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_TEST DATA cypresstest.cogisi.com/input_USERNAME_userloginname'), 'jhughes')

WebUI.setEncryptedText(findTestObject('Object Repository/FL Cypress Legacy/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_password'), '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_TEST DATA cypresstest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_HomeownersHomeowners - LegacyCondoCo_9d9717'), 'HO3L', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_First Name_ApplicantFirst'), 'sammy')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Last Name_ApplicantLast'), 'smith')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Address_ApplicantAddress1'), '406 e roseland ave')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_City_ApplicantCity'), 'plant city')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Property Zip Code_ApplicantZip'), '33563')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/input'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Accept'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/input'))

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '10100')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Search Term_NOSAVEagentSearchAgentCode'))

WebUI.doubleClick(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Search Term_NOSAVEagentSearchAgentCode'))

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Search Term_NOSAVEagentSearchAgentCode'), '10100')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/td_TEST AGENCY'))

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Phone_ApplicantHomePhonezzzz1'), '999-999-9999')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Email Address_ApplicantEmailzzzz1'), 'testing@gmail.com')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Date Of Birth_ApplicantBirthDatezzzz1'), '01/01/1975')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Occupation_OccupationTypezzzz1'), 'developer')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Previous Policy (Renewal of)_PriorPol_f9f078'), '999999')

'Click Coverage button'
WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Coverage'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_500 FLAT1000 FLAT23510Exclude Wind'), '1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_5001,0002,5005,000'), '1000', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Dwelling - Cov A_DwellingLimit_1'), '200000')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_2530354045505560657075Exclude Contents'), '30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_2 of Cov A5 of Cov A10 of Cov A'), '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_100,000 200,000 300,000 500,000'), '200000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_1,000 2,5005,000'), '2500', true)

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Recalculate'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Calculate'))

WebUI.switchToWindowTitle('360Value')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_360Value/span_Continue'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_360Value/span_Calculate Now'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Get Results'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/a_Close'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/div_Suggested Replacement Cost  328,446.31'))

WebUI.rightClick(findTestObject('Object Repository/FL Cypress Legacy/Page_/div_Suggested Replacement Cost  328,446.31'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_Animal LiabilityFungi, Wet or Dry or_444493'), 'ANIMAL', true)

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Add Coverage'))

'Click General button'
WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_General'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_FrameMasonryMasonry VeneerSuperior'), 'V', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Construction Year_ConstructionYear_1'), '2015')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Purchase Date_PurchaseDate_1'), '01/01/2018')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_CentralElectricCentralOilCentralGasC_93816b'), 'GAS', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Square feet_SquareFootage_1'), '1987')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_123'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_YN'), 'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_12'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_AsbestosConcrete BlockCoquinaHardboa_d842c5'), 'CONCRETEBLOCK', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Year of Roof_RoofConstructionYear_1'), '2015')

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_AluminumComposition ShingleCopperCor_8085bd'), 'COMP', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_ClosedOpenUnknown'), 'CLOSED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_BasementConcrete SlabMonolithic Slab_1cd95b'), 'BASEMENT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_Less than 1000 feetOver 1000 feet'), 'LT1000', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Terrain (Exposure)_Terrain_1'), 'none')

'Click History button'
WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_History'))

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Number of Paid Losses in the Past 3 Y_b45203'), '0')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Interests'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_Full PaySemi-AnnualQuarterly (40 Dow_948f30'), 'SEMI', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_Please SelectSAMMY  SMITH'), 'Applicant1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_Please SelectSAMMY  SMITH_1'), 'Applicant1', true)

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Display Quote'))

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_BindSubmit Application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_Amended Additional InterestInsuredAm_8f8dda'), 'PAYPLAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_CheckCredit CardCredit Card with Rec_023166'), 'P', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FL Cypress Legacy/Page_/select_American ExpressDiscoverMasterCardVisa'), 'V', true)

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Credit Card Number_NOSAVEACCT'), '4111 1111 1111 1111')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Card Expiration Date_NOSAVEEXPDATE'), '11/2023')

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input_Card Security Code_CVV2'), '111')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Authorize Credit Card'))

WebUI.setText(findTestObject('Object Repository/FL Cypress Legacy/Page_/input__DepositAmount'), '100.00')

WebUI.click(findTestObject('Object Repository/FL Cypress Legacy/Page_/button_Bind Application'))

