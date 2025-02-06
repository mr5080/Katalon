import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


if (addInterest == true)
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'MB', false)
}	
else 
{

	if (howPayDeposit == 0) {
		'Setup random using logic above'
	//	for(g = 0; g<100; g++)
	//	{
				howPayDeposit = (((Math.random() * 5) as int) + 1)
				WebUI.comment("howPayDeposit = " + howPayDeposit)
				// might fail on CC and RCC due to 1000 limit
	//	}
		
		//WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'MC', false //WebUI.setText(findTestObject('Cypress 4/Page_/input - CheckNumber'), year)
			//WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount )
			//WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), '105.58' )
			// CC window takes forever to open...
			//) //WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
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
	} 
	
	if (howPayDeposit == 1) {
		'Credit Card'
		WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'P', false)
	
		WebUI.click(findTestObject('Cypress 4/Page_/input_Collect Credit Card Information'))
	
		//WebUI.delay(5)
	
		WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
	
		
		
		
		// random type of CC
		// for(int xy = 0; xy < 100; xy++)
		// {
			 randomCC = (((Math.random() * 4) as int) + 0)	// 0, 1, 2, 3
			 System.out.println('randomCC = ' + randomCC)
		 //}
		 
		//randomCC = 0
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), randomCC)
		if(randomCC == 0)	// american express
		{
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '378282246310005')
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '1234')		
		}
		else if(randomCC == 1)	// discover
		{
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '6011111111111117')
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')
			
		}
		else if(randomCC == 2)	// mastercard
		{
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '5555555555554444')
			WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')		
		}
		else if(randomCC == 3)	// visa
			{
				WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '4111111111111111')
				WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')			
			}
		//WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 'Visa', false)
		//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '4111 1111 1111 1111')
	
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Expiration date_NOSAVEEXPDATE'), '12/25')
	
		//WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')
	
		WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_NOSAVEButton'))
	
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/Cypress 4/Page_/button_CC Modal Window'), 10)
	}
	else if (howPayDeposit == 2) {
		'Recurring Credit Card'
		WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'PR', false)
	
		WebUI.click(findTestObject('Cypress 4/Page_/input_Collect Credit Card Information'))
	
		//WebUI.delay(5)
	
		WebUI.waitForElementVisible(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
	
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 'Visa', false)
	
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Credit card number_NOSAVEACCT'), '4111 1111 1111 1111')
	
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_Expiration date_NOSAVEEXPDATE'), '12/26')
	
		WebUI.setText(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_CVV2'), '123')
	
		WebUI.click(findTestObject('Object Repository/Cypress 4/Page_/input_CSC_NOSAVEButton'))
		WebUI.setText(findTestObject('Cypress 4/Page_/input - RecurringVerifyLastName'), randomLastName)
		
	
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/Cypress 4/Page_/button_CC Modal Window'), 10)
	}
	 else if (howPayDeposit == 3) {
		'EFT'
		WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'E', false)
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Name'), fullName)
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumber'), '031318745')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumberVerify'), '031318745')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account Number'), '8032654815')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account NumberVerify'), '8032654815')
	
	//	WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount)
		      
	}
	else if (howPayDeposit == 4) {
		'EFT Recurring'
		WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'ER', false)
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Name'), fullName)
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumber'), '031318745')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - RoutingNumberVerify'), '031318745')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account Number'), '8032654815')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - EFT Account NumberVerify'), '8032654815')
	
		WebUI.setText(findTestObject('Cypress 4/Page_/input - RecurringVerifyLastName'), randomLastName)
	
		//WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount)
	}
	else if (howPayDeposit == 5) {
		'Mailed Check'
		WebUI.selectOptionByValue(findTestObject('Object Repository/Cypress 4/Page_/select_PaymentMethod'), 'MC', false)
			//WebUI.setText(findTestObject('Cypress 4/Page_/input - CheckNumber'), year)
			//WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), depositAmount )
			//WebUI.setText(findTestObject('Cypress 4/Page_/input - DepositAmount'), '105.58' )
			// CC window takes forever to open...
			 //WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/select_American ExpressDiscoverMasterCardVisa'), 40)
	}
}



