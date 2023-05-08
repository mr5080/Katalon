import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.google.common.collect.FilteredEntryMultimap.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys


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

 
 for(int interestCounter = 1; interestCounter <= numInterests; interestCounter++ )
 {
	 if (interestCounter == 1)
	 {
		 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))
	 
		 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/select_AdditionalIntrerestType'), 'M', true)	//mortgagee
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Interest Name_InterestNamexxxx1_1'), 'emily martin')
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Address_InterestAddress1xxxx1_1'), '904 WOODRIDGE DR')
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_City_InterestCityxxxx1_1'), 'MIDDLETOWN')
		 
		 
		 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/select_InterestState'), 'PA', true)
			 
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_InterestZipxxxx1_1'), '17057')
		 
		 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Loan Number_LoanNumberxxxx1_1'), '000000235')
	 }
	 
	 else if (interestCounter == 2)
	 {
		 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))
		 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/select_AdditionalIntrerestType2'), 'A', true)	// additional insured
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_Interest Name_InterestNamexxxx' + interestCounter + '_1'), 'jennifer bowman')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_Address_InterestAddress1xxxx' + interestCounter + '_1'), '900 WOODRIDGE DR')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_City_InterestCityxxxx' + interestCounter + '_1'), 'MIDDLETOWN')
						 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/select_InterestState' + interestCounter), 'PA', true)
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestTwo/input_InterestZipxxxx' + interestCounter + '_1'), '17057')
			 
			 //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestOne/input_Loan Number_LoanNumberxxxx1_1'), '000000235')
	 }
	 
	 else if (interestCounter == 3)
		 {
			 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))
		 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/select_AdditionalIntrerestType3'), 'O', true)	// additional interest
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_Interest Name_InterestNamexxxx3_1'), 'andrea matin')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_Address_InterestAddress1xxxx3_1'), '880 QueeN St')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_City_InterestCityxxxx3_1'), 'HarrISBurg')
			 			 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/select_InterestState3'), 'PA', true)
				 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_InterestZipxxxx3_1'), Keys.chord('17113', Keys.TAB, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
			 
			 //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestThree/input_Loan Number_LoanNumberxxxx3_1'), '5008050080')
		 }
		 
		else if (interestCounter == 4)
			 {
				 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))					
			 
				 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/select_AdditionalIntrerestType4'), 'S', true)	//second mortgagee
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/input_Interest Name_InterestNamexxxx4_1'), 'Anna Snooker')
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/input_Address_InterestAddress1xxxx4_1'), '850 QueeN St')
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/input_City_InterestCityxxxx4_1'), 'HarrISBurg')
							  
				 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/select_InterestState4'), 'PA', true)
					 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/input_InterestZipxxxx4_1'), '17113')
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFour/input_Loan Number_LoanNumberxxxx4_1'), Keys.chord('5008050080', Keys.TAB, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))		
								 
			 }
		 
		 else if (interestCounter == 5)
		 {
			 //WebUI.scrollToElement(WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton')), 10)
			 //WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))
			 // cant scroll up for some reason, so cant click the button
			 //WebUI.delay(15)
			// WebUI.scrollToElement(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'), 1)
			 
			 
			 //WebUI.delay(15)
			 //WebUI.scrollToElement(findTestObject('Object Repository/FL DP/Page_/div_Quote Number'), 1)
			 
			 
			 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))
			 
		 
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/select_AdditionalIntrerestType5'), 'A', true)	// Additional insured
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/input_Interest Name_InterestNamexxxx5_1'), 'Shaney Smiles')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/input_Address_InterestAddress1xxxx5_1'), '820 Queen St')
			 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/input_City_InterestCityxxxx5_1'), 'Harrisburg')
						  
			 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/select_InterestState5'), 'PA', true)
				 
			 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/input_InterestZipxxxx5_1'), Keys.chord('17113', Keys.TAB, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))
			 
			 //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestFive/input_Loan Number_LoanNumberxxxx5_1'), '10310300123')
		 }
		
		else if (interestCounter == 6)
			 {
				 WebUI.click(findTestObject('Object Repository/FL DP/Page_/addInterests/input_AdditionalIntrestButton'))
			 
				 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/select_AdditionalIntrerestType6'), 'O', true)	// additional interest
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/input_Interest Name_InterestNamexxxx6_1'), 'cansandra propps')
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/input_Address_InterestAddress1xxxx6_1'), '800 QueeN St')
				 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/input_City_InterestCityxxxx6_1'), 'HarrISBurg')
							  
				 WebUI.selectOptionByValue(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/select_InterestState6'), 'PA', true)
					 
				 WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/input_InterestZipxxxx6_1'), Keys.chord('17113', Keys.TAB, Keys.TAB, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP))				
				 
				 //WebUI.setText(findTestObject('Object Repository/FL DP/Page_/addInterests/interestSix/input_Loan Number_LoanNumberxxxx6_1'), '5008050080')
			 }
	
 }