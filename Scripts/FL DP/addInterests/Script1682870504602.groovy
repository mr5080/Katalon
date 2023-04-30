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

/*
 if(addInterest)
 {
	 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AddAdditionalIntrestButton'))
	 
	 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/select_AdditionalIntrerestType'), 'M', true)
	 
	 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Interest Name_InterestNamexxxx1_1'), 'jennifer grimes')
	 
	 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Address_InterestAddress1xxxx1_1'), '904 WOODRIDGE DR')
	 
	 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_City_InterestCityxxxx1_1'), 'MIDDLETOWN')
	 
	 
	 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/select_InterestState'), 'PA', true)
		 
	 
	 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_InterestZipxxxx1_1'), '17057')
	 
	 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Loan Number_LoanNumberxxxx1_1'), '000000235')
 }
 */
 
 
 
 
 
 for(int interestCounter = 1; interestCounter <= numInterests; interestCounter++ )
 {
	 if (interestCounter == 1)
	 {
		 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AddAdditionalIntrestButton'))
	 
		 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/select_AdditionalIntrerestType'), 'M', true)
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Interest Name_InterestNamexxxx1_1'), 'jennifer grimes')
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Address_InterestAddress1xxxx1_1'), '904 WOODRIDGE DR')
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_City_InterestCityxxxx1_1'), 'MIDDLETOWN')
		 
		 
		 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/select_InterestState'), 'PA', true)
			 
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_InterestZipxxxx1_1'), '17057')
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Loan Number_LoanNumberxxxx1_1'), '000000235')
	 }
	 
	 if (interestCounter == 2)
	 {
		 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AddAdditionalIntrestButton'))
		 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/select_AdditionalIntrerestType2'), 'A', true)
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_Interest Name_InterestNamexxxx' + interestCounter + '_1'), 'andrea bowman')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_Address_InterestAddress1xxxx' + interestCounter + '_1'), '900 WOODRIDGE DR')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_City_InterestCityxxxx' + interestCounter + '_1'), 'MIDDLETOWN')
						 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/select_InterestState' + interestCounter), 'PA', true)
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_InterestZipxxxx' + interestCounter + '_1'), '17057')
			 
			 //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Loan Number_LoanNumberxxxx1_1'), '000000235')
	 }
	 
	 if (interestCounter == 3)
		 {
			 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AddAdditionalIntrestButton'))
		 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/select_AdditionalIntrerestType3'), 'O', true)
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_Interest Name_InterestNamexxxx3_1'), 'emilee matin')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_Address_InterestAddress1xxxx3_1'), '850 QueeN St')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_City_InterestCityxxxx3_1'), 'HarrISBurg')
			 			 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/select_InterestState3'), 'PA', true)
				 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_InterestZipxxxx3_1'), '17113')
			 
			 //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_Loan Number_LoanNumberxxxx3_1'), '5008050080')
		 }
		 
 }